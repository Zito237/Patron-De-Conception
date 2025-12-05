package patrondestructuration.Adapter.cours;

public class Client {
    public static void main(String[] args) {
        Carre c = new Carre(10);
       System.out.println(c.aire()) ;
        System.out.println(c.perimetre());
        AdaptRectangle adapt = new AdaptRectangle(new Rectangle(12,3));
        System.out.println(adapt.aire());
        System.out.println(adapt.aire());
        AdaptTrapeze adapt1 = new AdaptTrapeze(new Trapeze(2,4,5,6,7));
        System.out.println(adapt1.aire());
        System.out.println(adapt1.aire());
    }
}
