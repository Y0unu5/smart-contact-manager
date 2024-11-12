package decorator;
// Decorator Class
public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;  // The component to decorate

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();  // Delegate the cost calculation to the wrapped object
    }

    @Override
    public String description() {
        return coffee.description();  // Delegate the description to the wrapped object
    }
}
