package patterns.factory;

public class FactoryMain {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee americano = coffeeFactory.getCoffee(CoffeeType.AMERICANO);
        System.out.println(americano);
        Coffee espresso = coffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(espresso);
    }
}
