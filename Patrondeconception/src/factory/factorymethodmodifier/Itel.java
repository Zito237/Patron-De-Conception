package factory.factorymethodmodifier;

public class Itel implements Phone {
    @Override
    public void make() {
        System.out.println("It is a Itel");
    }
}
