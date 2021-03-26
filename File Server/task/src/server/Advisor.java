package server;

import java.io.IOException;
import java.util.Scanner;

public class Advisor {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String[] query = scanner.nextLine().split(" ");

        while (!query[0].equals("exit")) {
            switch (query[0]) {
                case "add":
                    PrintService.print(Service.addFile(query[1]));
                    break;
                case "get":
                    PrintService.print(Service.getFile(query[1]));
                    break;
                case "delete":
                    PrintService.print(Service.delFile(query[1]));
                    break;
                default:
                    // throw new NumberFormatException("Invalid random type");
                    System.out.println("Cannot Execute The Query");
            }
            query = scanner.nextLine().split(" ");
        }

    }
}
