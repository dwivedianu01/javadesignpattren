import com.learn.pattern.AbstractLogger;
import com.learn.pattern.ConsoleLogger;
import com.learn.pattern.ErrorLogger;
import com.learn.pattern.FileLogger;

/*
This is part of behavioural design pattern. This allow handle request by multiple handlers.
Best example is logging.
In chain of responsibility, sender sends a request to a chain of objects. The request can be handled by any object in the chain.
Other example: ATM machine process money giving request.

 */
public class PatternTest {
    public static void main(String[] s) {
        AbstractLogger abstractLogger = getChainOfLoggers();

        abstractLogger.logMessage(3,"Error 3");
        abstractLogger.logMessage(2,"Error 2");
        abstractLogger.logMessage(1,"Error 1");
    }

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

}
