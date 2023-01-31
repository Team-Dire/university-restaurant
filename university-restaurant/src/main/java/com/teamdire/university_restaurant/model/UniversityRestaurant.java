package com.teamdire.university_restaurant.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Daniel Serezane (Salies)
 */

/*
* Equivalente ao UniRestaurant do projeto.
* Preferi a escrita por extenso.
*/
public class UniversityRestaurant {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Refeicao> refeicoes = new ArrayList<>();
    private static ArrayList<LogCreditos> logsCreditos = new ArrayList<>();
    private static Usuario usuarioAutenticado = null;

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public static void addRefeicao(Refeicao refeicao) {
        refeicoes.add(refeicao);
    }
    public static void addLogCreditos(LogCreditos log) {
        logsCreditos.add(log);
    }

    // Getters
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public static ArrayList<Refeicao> getRefeicoes() {
        return refeicoes;
    }
    public static ArrayList<LogCreditos> getLogsCreditos() {
        return logsCreditos;
    }

    public static Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    // Setters
    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        UniversityRestaurant.usuarios = usuarios;
    }
    public static void setRefeicoes(ArrayList<Refeicao> refeicoes) {
        UniversityRestaurant.refeicoes = refeicoes;
    }
    public static void setLogsCreditos(ArrayList<LogCreditos> logsCreditos) {
        UniversityRestaurant.logsCreditos = logsCreditos;
    }
    public static void setUsuarioAutenticado(Usuario usuario) {
        usuarioAutenticado = usuario;
    }

    /**
     * Abordagem um pouco diferente da sugerida pelos diagramas de colaboração
     * do projeto. Separei a recuperação da autenticação.
     */
    public static Usuario recuperarUsuario(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    public static boolean autenticarUsuario(String cpf, String senha) {
        Usuario usuario = recuperarUsuario(cpf);
        if (usuario == null || !usuario.getSenha().equals(senha)) return false;
        usuarioAutenticado = usuario;
        return true;
    }

    public static void salvar() {
        SerAssist serAssist = new SerAssist(usuarios, refeicoes, logsCreditos);
        serAssist.salvar();
    }
}
