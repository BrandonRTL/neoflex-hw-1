package patterns.singleton;

import java.time.LocalDate;

public class LazySingletonLogger {

    private static LazySingletonLogger logger;

    private LazySingletonLogger() {};

    public static LazySingletonLogger getInstance() {
        if (logger == null) {
            logger = new LazySingletonLogger();
        }
        return logger;
    }

    public void logInfo(Object object, String message) {
        System.out.println("Lazy Logger Log info: "  + LocalDate.now() + " - " + object.getClass() + " - " + message);
    }
}
