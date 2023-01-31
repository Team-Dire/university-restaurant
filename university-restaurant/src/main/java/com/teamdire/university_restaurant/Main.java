package com.teamdire.university_restaurant;

import com.teamdire.university_restaurant.model.SerAssist;
import com.teamdire.university_restaurant.view.IUAutenticaUsuario;
import com.teamdire.university_restaurant.model.UniversityRestaurant;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        if(new File("ru_arquivo.ser").isFile()) {
            try {
                FileInputStream stream = new FileInputStream("ru_arquivo.ser");
                ObjectInputStream in = new ObjectInputStream(stream);
                SerAssist serAssist = (SerAssist) in.readObject();
                in.close();
                stream.close();
                // Carrega os usuários
                UniversityRestaurant.setUsuarios(serAssist.getUsuarios());
                // Carrega as refeições
                UniversityRestaurant.setRefeicoes(serAssist.getRefeicoes());
                // Carrega os logs de créditos
                UniversityRestaurant.setLogsCreditos(serAssist.getLogsCreditos());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // Carrega a UI de autenticação
        IUAutenticaUsuario ui = new IUAutenticaUsuario();
        ui.setVisible(true);
    }
}
