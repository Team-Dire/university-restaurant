package com.teamdire.university_restaurant;

import com.teamdire.university_restaurant.view.IUAutenticaUsuario;

public class Main {
    public static void main(String[] args) {
        // TODO: carregar dados da persistência
        // Carrega a UI de autenticação
        IUAutenticaUsuario ui = new IUAutenticaUsuario();
        ui.setVisible(true);
    }
}
