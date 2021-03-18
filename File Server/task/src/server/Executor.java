package server;

import java.io.File;
import java.io.IOException;

public class Executor {
    public static String addFile(){
        File file = new File("File Server/task/src/server/files/file1.txt");
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
}
