package decorator;
// ConcreteComponent: Basic coffee (black coffee)
public class SimpleCoffee implements Coffee {

    @Override
    public double cost() {
        return 5.0; // Basic cost of black coffee
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
