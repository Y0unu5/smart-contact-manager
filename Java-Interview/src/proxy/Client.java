package proxy;
public class Client {
    public static void main(String[] args) {
        // Proxy is used instead of RealSubject
        Subject proxy = new Proxy();
        
        // Request is made via the Proxy, but the RealSubject is not created yet
        System.out.println("Client: Making a request through Proxy...");
        proxy.request();

        // The Proxy will initialize the RealSubject only when the request is made
        System.out.println("Client: Making another request...");
        proxy.request();
    }
}
