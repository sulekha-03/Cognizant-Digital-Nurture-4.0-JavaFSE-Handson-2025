import java.util.*;
public class LoggerTest {
	 
	public static void main(String[] args) {
	        // Try to get two instances
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Use the logger
	        logger1.log("This is the first log message.");
	        logger2.log("This is the second log message.");

	        // Check if both instances are same
	        if (logger1 == logger2) {
	            System.out.println("Both loggers are the same instance.");
	        } else {
	            System.out.println("Different instances exist (Singleton failed).");
	        }
	    }
    
}
