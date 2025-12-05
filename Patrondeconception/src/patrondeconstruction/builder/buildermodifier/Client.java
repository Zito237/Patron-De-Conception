package patrondeconstruction.builder.buildermodifier;

import patrondeconstruction.builder.buildermodifier.Directeur;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();
        System.out.println("pizza reine fabrique");
        directeur.construirePizzaReine().print();
        System.out.println("pizza piquante fabrique");
        directeur.construirePizzaPiquante().print();
        System.out.println("pizza piquante roi");
        directeur.construirePizzaRoi().print();

    }
}
