package factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bonjour le monde");
		
		FabriqueProduit fabriqueproduit = new FabriqueProduit();
		Produit produit = null;
		
		//affiche produit de type A
		produit = fabriqueproduit.createProduit(fabriqueproduit.typeA);
		produit.methodeproduit();
		
		//affiche produit de type B
		produit = fabriqueproduit.createProduit(fabriqueproduit.typeB);
		produit.methodeproduit();
		
//		//affiche produit de type C
		produit = fabriqueproduit.createProduit(fabriqueproduit.typeC);
		produit.methodeproduit();
		
		//produit inexistant
		
//		String d = "D";
//		produit = fabriqueproduit.createProduit(d);
//		produit.methodeproduit();
		  
		
		//
		//mehode 2
		System.out.println("...................metode2.........");
		
		ProduitFactory produitfactoryA = new ProduitFactoryA();
		ProduitFactory produitfactoryB = new ProduitFactoryB();
		ProduitFactory produitfactoryC = new ProduitFactoryC();
		
		
		//afiche produit de type A
		produit = produitfactoryA.getProduit();
		produit.methodeproduit();
		
		//afiche produit de type B
				produit = produitfactoryB.getProduit();
				produit.methodeproduit();
		//afiche produit de type C
				produit = produitfactoryC.getProduit();
				produit.methodeproduit();

	}

}
