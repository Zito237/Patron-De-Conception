package patrondeconstruction.factory.factorymethod;

public class ProduitFactoryA extends ProduitFactory {
	protected Produit createProduit() {
		Produit produit = null;
		produit =  new ProduitA();
		return produit;
		
	}

}
