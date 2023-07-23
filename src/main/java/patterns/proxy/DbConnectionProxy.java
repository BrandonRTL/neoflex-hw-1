package patterns.proxy;

public class DbConnectionProxy implements DbConnection {


    private final DbConnection dbConnection;


    public DbConnectionProxy(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }


    @Override
    public void connect(String url) {
        System.out.println("I'm proxy");
        dbConnection.connect(url);
    }
}
