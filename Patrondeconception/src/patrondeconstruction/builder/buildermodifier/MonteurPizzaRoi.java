package patrondeconstruction.builder.buildermodifier;
import patrondeconstruction.builder.buildermodifier.MonteurPizza;

public class MonteurPizzaRoi extends MonteurPizza {

    @Override
    public void monterPate() {
        pizza.setPate("ronde");



    }
    @Override
    public void monterSauce() {
        pizza.setSauce("piquante,cube et sale");

    }
    @Override
    public void monterGarniture() {
        pizza.setGarniture("boeuf,porc,chevre et poulet");

    }
}
