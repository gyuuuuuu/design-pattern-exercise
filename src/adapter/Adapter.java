package adapter;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specialRequest();
    }
}
