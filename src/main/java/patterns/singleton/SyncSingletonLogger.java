package patterns.singleton;

import java.time.LocalDate;

public class SyncSingletonLogger  {

    private static volatile SyncSingletonLogger logger;

    private SyncSingletonLogger() {};

    public static SyncSingletonLogger getInstance() {
        if (logger == null) {
            synchronized (SyncSingletonLogger.class) {
                if (logger == null) {
                    logger = new SyncSingletonLogger();
                }
            }
        }
        return logger;
    }

    public void logInfo(Object object, String message) {
        System.out.println("Concurrent Logger Log info: "  + LocalDate.now() + " - " + object.getClass() + " - " + message);
    }
}
