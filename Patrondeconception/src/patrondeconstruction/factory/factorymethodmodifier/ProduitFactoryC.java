package patrondeconstruction.factory.factorymethodmodifier;

public class ProduitFactoryC extends ProduitFactory {
	protected Produit createProduit() {
		Produit produit = null;
		produit =  new ProduitC();
		return produit;
		
	}

}
