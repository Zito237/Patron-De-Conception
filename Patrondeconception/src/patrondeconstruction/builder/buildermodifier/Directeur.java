package patrondeconstruction.builder.buildermodifier;

public class Directeur {
    //construire pizza reine
    public Pizza construirePizzaPiquante(){
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }
    //construire pizza piquante
    public Pizza construirePizzaReine(){
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }
    public Pizza construirePizzaRoi(){
        MonteurPizza pizzaRoi = new MonteurPizzaRoi();
        return pizzaRoi.getPizza();
    }
}
