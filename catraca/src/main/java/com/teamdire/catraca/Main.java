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
    public static void main(String[] args) {
        SocketManager socketManager = new SocketManager();
        socketManager.escutaCliente();
        Catraca catraca = socketManager.getCatraca();
        catraca.setVisible(true);
    }
    
}
