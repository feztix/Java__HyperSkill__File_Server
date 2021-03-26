package server;

import java.io.IOException;

public class Service {
    /**
     * Adding files ./files/
     * @return - String, formatted output data
     * @param fileName, Name of the file to add
     */
    public static String addFile(String fileName) {
        return Executor.addFile(fileName);
    }

    /**
     * get files ./files/
     * @return - String, formatted output data
     * @param fileName, name of the file we'll get
     */
    public static String getFile(String fileName) {
        return Executor.getFile(fileName);
    }

    /**
     * Deleting files ./files/
     * @param fileName, name of the file to delete
     * @return String, formatted output data
     */
    public static String delFile(String fileName){
        return Executor.delFile(fileName);
    }
}
