package factory.abstractfactorymodifier;

public class AppleFactory implements AbtractFactory {
    @Override
    public Phone makePhone() {
        return new Iphone();

    }
    @Override
    public Laptop makeLaptop() {
            return new MacLaptop();
    }
}
