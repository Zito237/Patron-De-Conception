package patrondeconstruction.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduitFactory produitfactory1 = new ProduitFactory1();
		IProduitFactory produitfactory2 = new ProduitFactory2();
		
		ProduitA produitA = null;
		ProduitB produitB = null;
		
		System.out.println("utilisation de la premiere fabrique");
		
		produitA = produitfactory1.getProduitA();
		produitB = produitfactory1.getProduitB();
		
		produitA.methodeA();
		produitB.methodeB();
		
		
      System.out.println("utilisation de la deuxieme fabrique");
		
		produitA = produitfactory2.getProduitA();
		produitB = produitfactory2.getProduitB();
		
		produitA.methodeA();
		produitB.methodeB();

	}

}
