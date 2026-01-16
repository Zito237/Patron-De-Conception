package patrondestructuration.composite.devoir;

public class Client {

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  SYSTÈME DE GESTION DE FICHIERS (COMPOSITE) ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        // ====== CRÉATION DE LA STRUCTURE ======
        System.out.println("=== 1. CRÉATION DE LA STRUCTURE ===\n");

        // Racine du système
        Dossier racine = new Dossier("MonOrdinateur");

        // Dossiers principaux
        Dossier documents = new Dossier("Documents");
        Dossier images = new Dossier("Images");
        Dossier projets = new Dossier("Projets");

        // Fichiers dans Documents
        FichierTXT readme = new FichierTXT("README.txt");
        FichierPDF rapport = new FichierPDF("Rapport2024.pdf");
        FichierTXT notes = new FichierTXT("notes.txt");

        documents.ajouter(readme);
        documents.ajouter(rapport);
        documents.ajouter(notes);

        System.out.println();

        // Fichiers dans Images
        FichierPDF photo1 = new FichierPDF("vacances.pdf");
        FichierTXT description = new FichierTXT("description.txt");

        images.ajouter(photo1);
        images.ajouter(description);

        System.out.println();

        // Sous-dossiers dans Projets
        Dossier projetJava = new Dossier("ProjetJava");
        FichierTXT mainJava = new FichierTXT("Main.java.txt");
        FichierPDF documentation = new FichierPDF("Documentation.pdf");

        projetJava.ajouter(mainJava);
        projetJava.ajouter(documentation);

        Dossier projetPython = new Dossier("ProjetPython");
        FichierTXT script = new FichierTXT("script.py.txt");
        projetPython.ajouter(script);

        projets.ajouter(projetJava);
        projets.ajouter(projetPython);

        System.out.println();

        // Ajout à la racine
        racine.ajouter(documents);
        racine.ajouter(images);
        racine.ajouter(projets);

        // ====== AFFICHAGE DE LA STRUCTURE ======
        System.out.println("\n=== 2. DESCRIPTION COMPLÈTE DU SYSTÈME ===\n");
        racine.decrire(0);

        // ====== OPÉRATION OBTENIR ======
        System.out.println("\n=== 3. OBTENTION D'ÉLÉMENTS ===\n");

        try {
            ElementSysteme premierElement = racine.obtenir(0);
            System.out.println("Premier élément de la racine: " +
                    premierElement.getNom() + " (" +
                    premierElement.getType() + ")");

            ElementSysteme deuxiemeElementDocuments = documents.obtenir(1);
            System.out.println("Deuxième élément de Documents: " +
                    deuxiemeElementDocuments.getNom() + " (" +
                    deuxiemeElementDocuments.getType() + ")");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("❌ Erreur: " + e.getMessage());
        }

        // ====== OPÉRATION SUPPRIMER ======
        System.out.println("\n=== 4. SUPPRESSION D'ÉLÉMENTS ===\n");

        documents.supprimer(notes);

        System.out.println("\nStructure après suppression:");
        documents.decrire(0);

        // ====== AJOUT D'UN NOUVEAU FICHIER ======
        System.out.println("\n=== 5. AJOUT D'UN NOUVEAU FICHIER ===\n");

        FichierPDF nouveauRapport = new FichierPDF("RapportFinal.pdf");
        documents.ajouter(nouveauRapport);

        System.out.println("\nStructure après ajout:");
        documents.decrire(0);

//        // ====== TEST D'EXCEPTION ======
//        System.out.println("\n=== 6. TEST D'OPÉRATIONS INVALIDES ===\n");
//
//        try {
//            readme.ajouter(new FichierTXT("test.txt"));
//        } catch (UnsupportedOperationException e) {
//            System.out.println("❌ Exception attendue: " + e.getMessage());
//        }
//
//        try {
//            rapport.obtenir(0);
//        } catch (UnsupportedOperationException e) {
//            System.out.println("❌ Exception attendue: " + e.getMessage());
//        }
//
//        // ====== STATISTIQUES ======
//        System.out.println("\n=== 7. STATISTIQUES ===\n");
//
//        System.out.println("Nombre d'éléments dans Documents: " +
//                documents.getNombreElements());
//        System.out.println("Nombre d'éléments dans Projets: " +
//                projets.getNombreElements());
//        System.out.println("Le dossier Images est vide? " + images.estVide());
//
//        // ====== STRUCTURE FINALE ======
//        System.out.println("\n=== 8. STRUCTURE FINALE COMPLÈTE ===\n");
//        racine.decrire(0);
//
//
//        System.out.println("          DÉMONSTRATION TERMINÉE            ");

    }
}
