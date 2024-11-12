package decorator;
public class CoffeeShop {

    public static void main(String[] args) {
        // Simple coffee without any additions
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Description: " + myCoffee.description());
        System.out.println("Cost: $" + myCoffee.cost());

        // Add milk to the coffee
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("\nAfter adding milk:");
        System.out.println("Description: " + myCoffee.description());
        System.out.println("Cost: $" + myCoffee.cost());

        // Add sugar to the coffee
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println("\nAfter adding sugar:");
        System.out.println("Description: " + myCoffee.description());
        System.out.println("Cost: $" + myCoffee.cost());
        
        /*
         * Component Interface: The Coffee interface defines the cost() and description() methods.
ConcreteComponent: SimpleCoffee is the base implementation that provides a basic coffee without any additions.
Decorator Class: CoffeeDecorator implements the Coffee interface and delegates the actual work to the wrapped Coffee object. It allows us to extend functionality by adding more decorators.
ConcreteDecorators: MilkDecorator and SugarDecorator add specific behavior (cost and description) to the base coffee.
Client: In the CoffeeShop class, the client code can add milk and sugar to the coffee dynamically. The decorators can be chained together, and the base SimpleCoffee object is never modified.
         */
    }
}
