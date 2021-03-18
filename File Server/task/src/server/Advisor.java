package server;

import java.util.Scanner;

public class Advisor {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        String[] query = scanner.nextLine().split(" ");

        while (!query[0].equals("exit")) {
            switch (query[0]) {
                case "add":
                    PrintService.print(Service.addFile());
                    break;
                case "get":
                    //TODO - random number code generation goes here
                    break;
                case "delete":
                    //TODO - random number code generation goes here
                    break;
                default:
                    //                throw new NumberFormatException("Invalid random type");
                    System.out.println("Cannot Execute The Query");
            }
            query = scanner.nextLine().split(" ");
        }

    }
}
