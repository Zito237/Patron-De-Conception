package patrondeconstruction.builder.buidercours;

public class MonteurPizzaPiquante extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("feuillete");

    }
    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");

    }
    @Override
    public void monterGarniture() {
        pizza.setGarniture("peperoni+salami");

    }
}
