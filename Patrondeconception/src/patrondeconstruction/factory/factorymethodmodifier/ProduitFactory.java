package patrondeconstruction.factory.factorymethodmodifier;

public abstract class ProduitFactory {
  public Produit getProduit() {
	  return createProduit();
	  
  }
  protected abstract Produit createProduit();
  
}
