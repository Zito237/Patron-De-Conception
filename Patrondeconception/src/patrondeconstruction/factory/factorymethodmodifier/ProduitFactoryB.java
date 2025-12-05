package patrondeconstruction.factory.factorymethodmodifier;

public class ProduitFactoryB extends ProduitFactory {
	protected Produit createProduit() {
		Produit produit = null;
		produit =  new ProduitB();
		return produit;
		
	}

}
