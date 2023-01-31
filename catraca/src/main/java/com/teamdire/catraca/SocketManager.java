package com.teamdire.catraca;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketManager {
    private Catraca catraca = new Catraca(this);
    private Socket socket;

    public Catraca getCatraca() {
        return catraca;
    }

    public void escutaCliente() {
        try {
            final ServerSocket server = new ServerSocket(6661);
            new Thread(() -> {
                while (true) {
                    try {
                        socket = server.accept();
                        Scanner scanner = new Scanner(socket.getInputStream());
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            if (line.equals("LIBERA")) {
                                catraca.liberar();
                            } else if (line.equals("TRAVA")) {
                                catraca.travar();
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void validaCpf(String cpf) {
        try {
            socket.getOutputStream().write(cpf.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(SocketManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
