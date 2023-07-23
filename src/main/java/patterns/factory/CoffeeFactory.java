package patterns.factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default: throw new IllegalArgumentException("This type of coffee is not supported");
        }
        return coffee;
    }
}
