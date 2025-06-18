
public class Logger {
	  // Private static instance of the same class
    private static Logger singleInstance;

    // Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Private constructor Logger");
    }

    // Public static method to get the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
