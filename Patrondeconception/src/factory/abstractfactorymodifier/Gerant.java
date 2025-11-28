package factory.abstractfactorymodifier;

public class Gerant {
    public static void main(String[] args) {
        AbtractFactory samsungFactory = new SamsungFactory();
        AbtractFactory appleFactory = new AppleFactory();
        samsungFactory.makePhone();
        appleFactory.makePhone();
        samsungFactory.makeLaptop();
        appleFactory.makeLaptop();
    }
}
