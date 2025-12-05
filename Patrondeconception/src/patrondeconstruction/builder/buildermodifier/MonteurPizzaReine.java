package patrondeconstruction.builder.buildermodifier;

import patrondeconstruction.builder.buildermodifier.MonteurPizza;

public class MonteurPizzaReine extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("croisee");



    }
    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");

    }
    @Override
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignion");

    }

}
