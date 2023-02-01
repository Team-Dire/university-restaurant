package com.teamdire.university_restaurant.controller;

import com.teamdire.university_restaurant.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.stream.Collectors;

public class ControladorRefeicao {
    public ControladorRefeicao() {}

    public boolean inserirNovaRefeicao(byte tipoRefeicao, Calendar dataServentia, int quantidadeTiquetes,
                                       String nomeRefeicao, String pratoPrincipal, ArrayList<String> alimentosBase, String guarnicao,
                                       String salada, String bebida, String sobremesa)
    {
        Refeicao refeicao = new Refeicao(tipoRefeicao, dataServentia, quantidadeTiquetes,
                                         nomeRefeicao, pratoPrincipal, alimentosBase, guarnicao, salada, bebida, sobremesa);
        UniversityRestaurant.addRefeicao(refeicao);
        // Persistindo os dados
        UniversityRestaurant.salvar();
        return true;
    }

    public void adicionarCreditos(String cpfBeneficiado, Float valorInserido) {
        // Preparando os dados
        Usuario usuario = UniversityRestaurant.recuperarUsuario(cpfBeneficiado);
        Usuario usuarioResponsavel = UniversityRestaurant.getUsuarioAutenticado();
        Calendar dataInsercao = Calendar.getInstance();
        // Adicionando os crédtios
        assert usuario != null;
        usuario.setSaldo(usuario.getSaldo() + valorInserido);
        // Adicionando a transação no log
        LogCreditos log = new LogCreditos(usuario, usuarioResponsavel, valorInserido, dataInsercao);
        UniversityRestaurant.addLogCreditos(log);
        // Persistindo os dados
        UniversityRestaurant.salvar();
    }

    public Float buscarSaldo(String cpf) {
        return Objects.requireNonNull(UniversityRestaurant.recuperarUsuario(cpf)).getSaldo();
    }

    public ArrayList<Refeicao> getRefeicoesSemanaAtual() {
        ArrayList<Refeicao> refeicoes = UniversityRestaurant.getRefeicoes();
        Calendar dataAtual = Calendar.getInstance();
        // Create a new array, filtering out the refeicoes that are not from the current week
        return refeicoes.stream()
                .filter(refeicao -> refeicao.getDataServentia().get(Calendar.WEEK_OF_YEAR) == dataAtual.get(Calendar.WEEK_OF_YEAR))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Refeicao> getRefeicoesSemanaSeguinte() {
        ArrayList<Refeicao> refeicoes = UniversityRestaurant.getRefeicoes();
        Calendar dataAtual = Calendar.getInstance();
        // Create a new array, filtering out the refeicoes that are not from the next week
        return refeicoes.stream()
                .filter(refeicao -> refeicao.getDataServentia().get(Calendar.WEEK_OF_YEAR) == dataAtual.get(Calendar.WEEK_OF_YEAR) + 1)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public String adicionarTiquete(Usuario usuario, Refeicao refeicao) {
        // Verificando se o usuário tem saldo suficiente
        // TODO: fix - usando preço fixo de R$ 3.00
        if (usuario.getSaldo() < 3.00f) {
            return "Usuário não possui saldo suficiente para adquirir o tiquete.";
        }
        // Verificando se o usuário já possui um tiquete para a refeição
        if(usuario.getTiquetes() != null) {
            if (usuario.getTiquetes().containsKey(refeicao)) {
                return "Usuário já possui um tiquete para esta refeição.";
            }
        }
        // Se hoje for a data de serventia da refeição, não é possível adquirir o tiquete
        if (refeicao.getDataServentia().get(Calendar.DAY_OF_YEAR) == Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) {
            return "Não é possível adquirir tiquetes para refeições que serão servidas hoje.";
        }
        // Igualmente, se a refeição já foi servida, não é possível adquirir o tiquete
        if (refeicao.getDataServentia().get(Calendar.DAY_OF_YEAR) < Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) {
            return "Não é possível adquirir tiquetes para refeições que já foram servidas.";
        }
        // Verificando se ainda há tiquetes disponíveis
        if (refeicao.getQuantidadeTiquetes() <= 0) {
            return "Não há tiquetes disponíveis para esta refeição.";
        }

        // Se não cair em nenhum desses casos, venda o tiquete
        usuario.adicionaTiquete(refeicao);
        refeicao.descontaTiquete();
        // Persistindo os dados
        UniversityRestaurant.salvar();

        return null;
    }

    public Boolean destrancarCatraca(String cpf) {
        Usuario usuario = UniversityRestaurant.recuperarUsuario(cpf);
        if (usuario == null) return false;

        // Pega as refeições
        ArrayList<Refeicao> refeicoes = UniversityRestaurant.getRefeicoes();
        TipoRefeicao tipo;
        // Decide o tipo de refeição pelo horário
        Calendar hoje = Calendar.getInstance();
        int horaAtual = hoje.get(Calendar.HOUR_OF_DAY);
        if(horaAtual < 8) {
            tipo = TipoRefeicao.CAFE_DA_MANHA;
        } else if(horaAtual < 16) {
            tipo = TipoRefeicao.ALMOCO;
        } else {
            tipo = TipoRefeicao.JANTA;
        }
        // Filtra as refeições que serão servidas hoje, do tipo correto
        ArrayList<Refeicao> refeicoesHoje = refeicoes.stream()
                .filter(refeicao -> refeicao.getDataServentia().get(Calendar.DAY_OF_YEAR) == hoje.get(Calendar.DAY_OF_YEAR))
                .filter(refeicao -> refeicao.getTipoRefeicao() == tipo)
                .collect(Collectors.toCollection(ArrayList::new));
        // Se não houver refeições, não destranca a catraca
        if (refeicoesHoje.isEmpty()) return false;
        // Se o usuário não tiver tiquete para a refeição, não destranca a catraca
        if (!usuario.getTiquetes().containsKey(refeicoesHoje.get(0))) return false;
        // Se o tiquete estiver usado, não destranca a catraca
        if (usuario.getTicketByRefeicao(refeicoesHoje.get(0)).getFoiUtilizado()) return false;
        // Se ele tiver, usa o tiquete
        usuario.getTicketByRefeicao(refeicoesHoje.get(0)).usar();
        // Persistindo os dados
        UniversityRestaurant.salvar();
        // E, por fim, libera a catraca
        return true;
    }
}
