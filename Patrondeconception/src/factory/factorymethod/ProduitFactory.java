package factory.factorymethod;

public abstract class ProduitFactory {
  public Produit getProduit() {
	  return createProduit();
	  
  }
  protected abstract Produit createProduit();
  
}
