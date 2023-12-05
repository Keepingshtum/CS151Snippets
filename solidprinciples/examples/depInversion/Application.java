package solidprinciples.examples.depInversion;

public class Application {
    private Logger logger;

    // Constructor injection for dependency
    public Application(Logger logger) {
        this.logger = logger;
    }

    public void process(String data) {
        // Some processing logic
        logger.log("Data processed: " + data);
    }

    public static void main(String[] args) {
        // Dependency is being injected from outside
        Application app1 = new Application(new ConsoleLogger());
        app1.process("Some data for ConsoleLogger");

        Application app2 = new Application(new FileLogger());
        app2.process("Some data for FileLogger");
    }
}
