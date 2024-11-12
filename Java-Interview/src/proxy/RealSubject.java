package proxy;
// RealSubject class which performs the actual operation
public class RealSubject implements Subject {

    public RealSubject() {
        // Simulate heavy initialization (e.g., loading a large file)
        System.out.println("RealSubject: Loading heavy resource...");
    }

    @Override
    public void request() {
        System.out.println("RealSubject: Requesting operation...");
    }
}
