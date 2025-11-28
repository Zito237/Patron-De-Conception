package factory.abstractfactorymodifier;

public class SamsungFactory implements AbtractFactory {
    @Override
    public Phone makePhone() {
        return new Samsung();
    }
    public Laptop makeLaptop() {
        return new SamsungLaptop();
    }
}
