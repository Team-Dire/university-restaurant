package com.teamdire.university_restaurant.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerAssist implements java.io.Serializable {
    private ArrayList<Usuario> usuarios;
    //private ArrayList<Refeicao> refeicoes;
    public SerAssist(ArrayList<Usuario> usuarios/*, ArrayList<Refeicao> refeicoes*/) {
        this.usuarios = usuarios;
        //this.refeicoes = refeicoes;
    }

    // Getters
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void salvar() {
        try {
            // Salvando usuários
            FileOutputStream stream = new FileOutputStream("ru_arquivo.ser");
            ObjectOutputStream out = new ObjectOutputStream(stream);
            out.writeObject(this);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
