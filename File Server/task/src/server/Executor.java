package server;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Executor {
    /**
     *
     * @param fileName Name of the file to add
     * @return String, formatted output data
     */
    public static String addFile(String fileName){
        File file = new File("File Server/task/src/server/files/"+fileName);
        try {
            boolean createdNew = file.createNewFile();
            if (createdNew) {
                return  "The file was successfully created.";
            } else {
                return "The file already exists.";
            }
        } catch (IOException e) {
            return "Cannot create the file: " + file.getPath();
        }
    }

    /**
     * Adding files ./files/
     * @return - String, formatted output data
     * @param fileName, name of the file we'll get
     */
    public static String getFile(String fileName){
        File file = new File("File Server/task/src/server/files/"+fileName);

        try (Scanner scanner = new Scanner(file)) { // it throws FileNotFoundException
            // ЧТЕНИЕ ФАЙЛА
//            while (scanner.hasNext()) {
//                return scanner.nextLine() + " ";
//            }
            return "The file" + fileName + " was sent";
        } catch (java.io.FileNotFoundException e) {
            return "The file" + fileName + " not found";
        }
    }
}
