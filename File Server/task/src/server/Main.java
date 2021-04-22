package server;

public class Main {

    public static void main(String[] args) {
        // Stage 2/4 Потом удалить
        Server server = new Server();
        server.start();

        Advisor advisor = new Advisor();
        advisor.start();

    }
}