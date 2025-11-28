package factory.factorymethodmodifier;

public class Gerant {
    public static void main(String[] args) {
        AbstractFactory nokia = new NokiaFactory();
        AbstractFactory itel = new Itelfactory();


        nokia.makePhone();
        itel.makePhone();
    }
}
