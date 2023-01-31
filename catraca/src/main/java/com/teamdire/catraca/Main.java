/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.teamdire.catraca;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Main {
    private static Catraca catraca = new Catraca();
    public static void escutaCliente() {
        try {
            final ServerSocket server = new ServerSocket(6661);
            new Thread(() -> {
                while (true) {
                    try {
                        Socket socket = server.accept();
                        Scanner scanner = new Scanner(socket.getInputStream());
                        new Thread(() -> {
                            while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                if (line.equals("LIBERA")) {
                                    catraca.liberar();
                                } else if (line.equals("TRAVA")) {
                                    catraca.travar();
                                }
                            }
                        }).start();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        escutaCliente();
        catraca.setVisible(true);
    }
    
}
