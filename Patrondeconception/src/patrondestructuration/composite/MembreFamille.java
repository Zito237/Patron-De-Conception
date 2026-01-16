package patrondestructuration.composite;
import java.util.ArrayList;
import java.util.List;

// Composant abstrait - Membre de la famille
abstract class MembreFamille {
    protected String nom;
    protected String prenom;
    protected int anneeNaissance;
    protected String genre; // "M" ou "F"

    public MembreFamille(String nom, String prenom, int anneeNaissance, String genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.genre = genre;
    }

    // Méthodes abstraites
    public abstract void afficher(int niveau);
    public abstract MembreFamille rechercher(String nomComplet);
    public abstract int compterDescendants();

    // Méthodes par défaut (optionnelles pour les feuilles)
    public void ajouterEnfant(MembreFamille enfant) {
        throw new UnsupportedOperationException(
                "Cette personne ne peut pas avoir d'enfants dans cette structure");
    }

    public void supprimerEnfant(MembreFamille enfant) {
        throw new UnsupportedOperationException(
                "Cette personne n'a pas d'enfants à supprimer");
    }

    // Méthodes utilitaires
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public int getAge() {
        return 2026 - anneeNaissance;
    }

    protected String getIndentation(int niveau) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            sb.append("│   ");
        }
        return sb.toString();
    }

    protected String getIcone() {
        return genre.equals("M") ? "👨" : "👩";
    }
}