package patrondeconstruction.factory.factorymethod;

public class ProduitFactoryB extends ProduitFactory {
	protected Produit createProduit() {
		Produit produit = null;
		produit =  new ProduitB();
		return produit;
		
	}

}
