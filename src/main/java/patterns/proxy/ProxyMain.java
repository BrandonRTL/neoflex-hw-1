package patterns.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        DbConnection connection = new DbConnectionImpl("postgres0");
        DbConnection proxy = new DbConnectionProxy(connection);
        proxy.connect("localhost:5432");

    }
}
