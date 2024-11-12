package decorator;
// ConcreteDecorator: Adds Milk
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);  // Pass the base coffee object to the decorator
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;  // Add the cost of milk
    }

    @Override
    public String description() {
        return coffee.description() + ", Milk";  // Add milk to the description
    }
}

// ConcreteDecorator: Adds Sugar
