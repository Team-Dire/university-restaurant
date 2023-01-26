package com.teamdire.university_restaurant.controller;

import com.teamdire.university_restaurant.model.UniversityRestaurant;
import com.teamdire.university_restaurant.model.Usuario;

public class ControladorAutenticacao {
    public ControladorAutenticacao() {}

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

    public Usuario autenticaUsuario(String cpf, String senha) {
        UniversityRestaurant.autenticarUsuario(cpf, senha);
        return UniversityRestaurant.getUsuarioAutenticado();
    }
}
