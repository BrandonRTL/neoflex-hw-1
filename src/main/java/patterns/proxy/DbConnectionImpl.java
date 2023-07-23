package patterns.proxy;

public class DbConnectionImpl implements DbConnection {

    private String name;

    public DbConnectionImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect(String url) {
        System.out.println("Connected to : " + url + "/" + name);
    }
}
