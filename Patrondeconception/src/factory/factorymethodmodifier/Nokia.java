package factory.factorymethodmodifier;

public class Nokia implements Phone {
    @Override
    public void make() {
        System.out.println("Nokia making");
    }
}
