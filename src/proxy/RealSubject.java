package proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject send a request");
    }
}
