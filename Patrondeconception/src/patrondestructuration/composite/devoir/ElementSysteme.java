package patrondestructuration.composite.devoir;

import java.util.ArrayList;
import java.util.List;


abstract class ElementSysteme {
    protected String nom;
    protected String type;

    public ElementSysteme(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    // Méthodes communes
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    // Méthode abstraite à implémenter par les sous-classes
    public abstract void decrire(int niveau);

    // Méthodes par défaut pour la gestion des enfants
    // (lancent des exceptions pour les feuilles)
    public void ajouter(ElementSysteme element) {
        throw new UnsupportedOperationException(
                "Impossible d'ajouter un élément à " + this.getClass().getSimpleName());
    }

    public void supprimer(ElementSysteme element) {
        throw new UnsupportedOperationException(
                "Impossible de supprimer un élément de " + this.getClass().getSimpleName());
    }

    public ElementSysteme obtenir(int index) {
        throw new UnsupportedOperationException(
                "Impossible d'obtenir un élément de " + this.getClass().getSimpleName());
    }

    // Méthode utilitaire pour l'indentation
    protected String getIndentation(int niveau) {
        return "  ".repeat(niveau);
    }
}