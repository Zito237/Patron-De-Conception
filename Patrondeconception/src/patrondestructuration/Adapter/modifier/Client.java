package patrondestructuration.Adapter.modifier;


import patrondestructuration.Adapter.modifier.AdaptRectangle;
import patrondestructuration.Adapter.modifier.AdaptTrapeze;
import patrondestructuration.Adapter.modifier.Carre;

public class Client {
    public static void main(String[] args) {

        //carre
        Carre c = new Carre(10);
       System.out.println(c.aire()) ;
        System.out.println(c.perimetre());

        //rectangle
        AdaptRectangle adapt = new AdaptRectangle(new Rectangle(12,3));
        System.out.println(adapt.aire());
        System.out.println(adapt.perimetre());

        // trapeze
        AdaptTrapeze adapt1 = new AdaptTrapeze(new Trapeze(2,4,5,6,7));
        System.out.println(adapt1.aire());
        System.out.println(adapt1.perimetre());

        //paralelogramme
        AdaptParallelogram adapt2 = new AdaptParallelogram(new Paralelogram(3,5,6));
        System.out.println(adapt2.aire());
        System.out.println(adapt2.perimetre());
    }
}
