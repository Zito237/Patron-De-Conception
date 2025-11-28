package factory.factorymethodmodifier;

public class Itelfactory implements AbstractFactory {
    public Phone makePhone() {
        return new Itel();
    }
}
