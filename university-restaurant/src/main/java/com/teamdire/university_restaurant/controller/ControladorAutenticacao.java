package com.teamdire.university_restaurant.controller;

import com.teamdire.university_restaurant.model.UniversityRestaurant;
import com.teamdire.university_restaurant.model.Usuario;

public class ControladorAutenticacao {
    public ControladorAutenticacao() {
        // Caso não haja usuários, cria um "admin admin"
        // Lembrando que quando isso rodar os dados da persistência
        // já estarão carregados.
        if (UniversityRestaurant.getUsuarios().isEmpty()) {
            Usuario usuario = new Usuario("admin", "admin", true);
            Usuario usuario2 = new Usuario("teste", "teste", false);
            UniversityRestaurant.addUsuario(usuario);
            UniversityRestaurant.addUsuario(usuario2);
        }
    }

    public Boolean adicionarNovoUsuario(String cpf, String senha, Boolean admin) {
        // Verifica se o usuário já existe
        if (UniversityRestaurant.recuperarUsuario(cpf) != null) {
            return false;
        }
        Usuario usuario = new Usuario(cpf, senha, admin);
        UniversityRestaurant.addUsuario(usuario);
        // Persiste os dados
        UniversityRestaurant.salvar();
        return true;
    }

    public Boolean autenticaUsuario(String cpf, String senha) {
        UniversityRestaurant.autenticarUsuario(cpf, senha);
        return UniversityRestaurant.getUsuarioAutenticado() != null;
    }

    public void deslogarUsuario() {
        UniversityRestaurant.setUsuarioAutenticado(null);
    }

    public Usuario buscarUsuario(String cpf) {
        return UniversityRestaurant.recuperarUsuario(cpf);
    }

    public Usuario getUsuarioAutenticado() {
        return UniversityRestaurant.getUsuarioAutenticado();
    }
}
