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
            UniversityRestaurant.addUsuario(usuario);
        }
    }

    public boolean autenticarUsuario(String cpf, String senha) {
        return UniversityRestaurant.autenticarUsuario(cpf, senha);
    }

    public void adicionarNovoUsuario(String cpf, String senha) {
        Usuario usuario = new Usuario(cpf, senha, false);
        UniversityRestaurant.addUsuario(usuario);
    }

    public void adicionarNovoUsuarioAdministrador(String cpf, String senha) {
        Usuario usuario = new Usuario(cpf, senha, true);
        UniversityRestaurant.addUsuario(usuario);
    }

    public Boolean autenticaUsuario(String cpf, String senha) {
        UniversityRestaurant.autenticarUsuario(cpf, senha);
        return UniversityRestaurant.getUsuarioAutenticado() != null;
    }
}
