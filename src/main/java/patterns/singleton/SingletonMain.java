package patterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        LazySingletonLogger logger1 = LazySingletonLogger.getInstance();
        logger1.logInfo("STRING", "Hello");
        LazySingletonLogger logger2 = LazySingletonLogger.getInstance();
        System.out.println(logger2 == logger1);

        SyncSingletonLogger logger3 = SyncSingletonLogger.getInstance();
        logger3.logInfo(1.2, "World");
        SyncSingletonLogger logger4 = SyncSingletonLogger.getInstance();
        System.out.println(logger4 == logger3);
    }
}
