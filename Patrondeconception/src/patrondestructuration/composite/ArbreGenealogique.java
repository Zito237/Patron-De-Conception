package patrondestructuration.composite;

public class ArbreGenealogique {

    public static void main(String[] args) {
        System.out.println("=== CRÉATION DE L'ARBRE GÉNÉALOGIQUE ===\n");

        // Création de l'ancêtre (racine)
        Parent grandPere = new Parent("Dupont", "Jean", 1945, "M");
        grandPere.setConjoint("Marie Dupont");

        // Première génération (enfants des grands-parents)
        Parent pere = new Parent("Dupont", "Pierre", 1970, "M");
        pere.setConjoint("Sophie Martin");

        Parent tante = new Parent("Dupont", "Anne", 1972, "F");
        tante.setConjoint("Luc Bernard");

        PersonneSansEnfant oncle = new PersonneSansEnfant("Dupont", "Marc", 1975, "M");

        // Ajout des enfants au grand-père
        grandPere.ajouterEnfant(pere);
        grandPere.ajouterEnfant(tante);
        grandPere.ajouterEnfant(oncle);

        System.out.println();

        // Deuxième génération (petits-enfants)
        PersonneSansEnfant fils1 = new PersonneSansEnfant("Dupont", "Thomas", 2000, "M");
        PersonneSansEnfant fille1 = new PersonneSansEnfant("Dupont", "Emma", 2003, "F");
        PersonneSansEnfant fils2 = new PersonneSansEnfant("Dupont", "Lucas", 2005, "M");

        pere.ajouterEnfant(fils1);
        pere.ajouterEnfant(fille1);
        pere.ajouterEnfant(fils2);

        System.out.println();

        PersonneSansEnfant cousin1 = new PersonneSansEnfant("Bernard", "Julie", 2002, "F");
        PersonneSansEnfant cousin2 = new PersonneSansEnfant("Bernard", "Alex", 2007, "M");

        tante.ajouterEnfant(cousin1);
        tante.ajouterEnfant(cousin2);

        System.out.println("\n=== AFFICHAGE DE L'ARBRE GÉNÉALOGIQUE ===\n");
        System.out.println("🌳 Famille Dupont");
        grandPere.afficher(0);

        // Statistiques
        System.out.println("\n=== STATISTIQUES ===");
        System.out.println("👥 Nombre total de descendants de " + grandPere.getNomComplet() +
                ": " + grandPere.compterDescendants());
        System.out.println("👥 Nombre de descendants de " + pere.getNomComplet() +
                ": " + pere.compterDescendants());

        // Recherche
        System.out.println("\n=== RECHERCHE DANS L'ARBRE ===");
        String recherche = "Emma Dupont";
        MembreFamille trouve = grandPere.rechercher(recherche);

        if (trouve != null) {
            System.out.println("✅ Trouvé: " + trouve.getNomComplet() +
                    " (" + trouve.getAge() + " ans)");
        } else {
            System.out.println("❌ " + recherche + " n'a pas été trouvé(e)");
        }

        recherche = "Sophie Dupont";
        trouve = grandPere.rechercher(recherche);
        if (trouve != null) {
            System.out.println("✅ Trouvé: " + trouve.getNomComplet());
        } else {
            System.out.println("❌ " + recherche + " n'a pas été trouvé(e)");
        }

        // Suppression
        System.out.println("\n=== SUPPRESSION D'UN MEMBRE ===");
        pere.supprimerEnfant(fils2);

        System.out.println("\n=== ARBRE APRÈS SUPPRESSION ===\n");
        System.out.println("🌳 Famille Dupont");
        grandPere.afficher(0);

        // Tentative de suppression invalide
        System.out.println("\n=== TENTATIVE DE SUPPRESSION INVALIDE ===");
        pere.supprimerEnfant(cousin1); // cousin1 n'est pas enfant de pere

        // Ajout d'une nouvelle personne
        System.out.println("\n=== AJOUT D'UN NOUVEAU MEMBRE ===");
        PersonneSansEnfant nouvelleFille = new PersonneSansEnfant("Dupont", "Léa", 2010, "F");
        pere.ajouterEnfant(nouvelleFille);

        System.out.println("\n=== ARBRE FINAL ===\n");
        System.out.println("🌳 Famille Dupont");
        grandPere.afficher(0);

        System.out.println("\n👥 Nombre final de descendants: " +
                grandPere.compterDescendants());
    }
}