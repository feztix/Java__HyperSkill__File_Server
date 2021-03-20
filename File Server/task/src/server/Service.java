package server;

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
     * Adding files ./files/
     * @return - String, formatted output data
     * @param fileName, name of the file we'll get
     */
    public static String getFile(String fileName) {
        return Executor.getFile(fileName);
    }
}
