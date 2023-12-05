package solidprinciples.examples.depInversion;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Logic to write the message to a file
        System.out.println("FileLogger: " + message);
    }
}
