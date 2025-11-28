package factory.factorymethodmodifier;

public class NokiaFactory implements AbstractFactory {
    public Phone makePhone(){
        return new Nokia();
    }
}
