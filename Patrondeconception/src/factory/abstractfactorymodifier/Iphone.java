package factory.abstractfactorymodifier;

public class Iphone implements Phone {
    @Override
    public void make() {
        System.out.println("iam Iphone phone");
    }
}
