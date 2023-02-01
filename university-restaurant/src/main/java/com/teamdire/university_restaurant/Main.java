package com.teamdire.university_restaurant;

import com.teamdire.university_restaurant.controller.ControladorRefeicao;
import com.teamdire.university_restaurant.model.SerAssist;
import com.teamdire.university_restaurant.view.IUAutenticaUsuario;
import com.teamdire.university_restaurant.model.UniversityRestaurant;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

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

        // Tenta concectar com a catraca
        // Server em localhost:6661
        try {
            Socket socket = new Socket("127.0.0.1", 6661);
            // Se conectou, cria uma thread pra ficar escutando
            new Thread(() -> {
                try{
                    Scanner scanner = new Scanner(socket.getInputStream());
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        // Essa linha é pra ser um CPF
                        // Tenta desbloquear a catraca
                        ControladorRefeicao controladorRefeicao = new ControladorRefeicao();
                        Boolean sucesso = controladorRefeicao.destrancarCatraca(line);
                        if(!sucesso) continue;
                        // Se destrancou, envia a mensagem de destrancar
                        String enviar = "LIBERA" + "\n";
                        socket.getOutputStream().write(enviar.getBytes());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar com a catraca");
        }

        // Carrega a UI de autenticação
        IUAutenticaUsuario ui = new IUAutenticaUsuario();
        ui.setVisible(true);
    }
}
