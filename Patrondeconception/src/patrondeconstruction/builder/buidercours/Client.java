package patrondeconstruction.builder.buidercours;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();
        System.out.println("pizza reine fabrique");
        directeur.construirePizzaReine().print();
        System.out.println("pizza piquante fabrique");
        directeur.construirePizzaPiquante().print();

    }
}
