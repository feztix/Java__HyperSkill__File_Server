package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 23456;

    public void start() {
        System.out.println("Client started!");

        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output  = new DataOutputStream(socket.getOutputStream())
        ) {
            String msg = "Give me everything you have!";
            output.writeUTF(msg);
            System.out.println("Sent: Give me everything you have!");

            String msg_rec = input.readUTF(); // reading a message
            System.out.println("Received: All files were sent!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
