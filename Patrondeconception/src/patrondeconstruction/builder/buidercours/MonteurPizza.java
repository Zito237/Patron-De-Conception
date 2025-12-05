package patrondeconstruction.builder.buidercours;

public abstract class MonteurPizza {
    protected Pizza pizza = new Pizza();

    public Pizza getPizza() {
        monterPate();
        monterSauce();
        monterGarniture();
        return pizza;
    }
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
