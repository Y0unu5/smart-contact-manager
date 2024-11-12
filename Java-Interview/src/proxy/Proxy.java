package proxy;
// Proxy class which controls access to the RealSubject
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        // Lazy initialization: RealSubject is only created when needed
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
