package server;

import java.io.*;
import java.net.*;


public class Server {
    private static final int PORT = 23456;
    private static final String address = "127.0.0.1";

    public void start() {
        System.out.println("Server started!");

        try (ServerSocket server = new ServerSocket(PORT, 50, InetAddress.getByName(address));) {
                try (
                        Socket socket = server.accept(); // accepting a new client
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    // Receive msg from client
                    String msg_rec = input.readUTF(); // reading a message
                    System.out.println("Received: Give me everything you have!");
                    String msg_resp = "All files were sent!";
                    output.writeUTF(msg_resp); // respond msg to the client
                    System.out.println("Sent: All files were sent!");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
