package decorator;
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;  // Add the cost of sugar
    }

    @Override
    public String description() {
        return coffee.description() + ", Sugar";  // Add sugar to the description
    }
}
