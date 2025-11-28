package factory.abstractfactory;

public class ProduitFactory1 implements IProduitFactory {

	@Override
	public ProduitA getProduitA() {
		// TODO Auto-generated method stub
		return new ProduitA1();
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB1();
	}

}
