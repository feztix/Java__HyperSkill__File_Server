package server;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Executor {

    public static boolean checkValidName(String fileName){
        final String regex = "file(10|[1-9])";
        final String string = fileName;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // matches return true if all string matches to pattern
        return matcher.matches();
    }

    /**
     *
     * @param fileName Name of the file to add
     * @return String, formatted output data
     */
    public static String addFile(String fileName){
        // Check if name of file is valid
        if (! checkValidName(fileName)){
            return "Cannot add the file " + fileName;
        };

        File file = new File("File Server/task/src/server/"+fileName);
        try {
            boolean createdNew = file.createNewFile();
            if (createdNew) {
                return  "The file " + fileName + " added successfully";
            } else {
                return "Cannot add the file 123" + fileName;
            }
        } catch (Exception e) {
            return e.toString() + "999";
//            return "Cannot add the file " + fileName;
        }
    }

    /**
     * Adding files ./files/
     * @return - String, formatted output data
     * @param fileName, name of the file we'll get
     */
    public static String getFile(String fileName){
        File file = new File("File Server/task/src/server/"+fileName);

        try (Scanner scanner = new Scanner(file)) { // it throws FileNotFoundException
            // ЧТЕНИЕ ФАЙЛА
//            while (scanner.hasNext()) {
//                return scanner.nextLine() + " ";
//            }
            return "The file " + fileName + " was sent";
        } catch (java.io.FileNotFoundException e) {
            return "The file " + fileName + " not found";
        }
    }

    public static String delFile(String fileName){
        File file = new File("File Server/task/src/server/"+fileName);

        if (file.delete()) {
            return "The file " + fileName + " was deleted";
        } else {
            return "The file " + fileName + " not found";
        }
    }
}
