package patrondestructuration.composite.devoir;
import java.util.ArrayList;
import java.util.List;
class Dossier extends ElementSysteme {
    private List<ElementSysteme> elements;

    public Dossier(String nom) {
        super(nom, "dossier");
        this.elements = new ArrayList<>();
    }

    @Override
    public void ajouter(ElementSysteme element) {
        elements.add(element);
        System.out.println("✅ Ajouté: " + element.getNom() +
                " dans le dossier " + this.nom);
    }

    @Override
    public void supprimer(ElementSysteme element) {
        if (elements.remove(element)) {
            System.out.println("✅ Supprimé: " + element.getNom() +
                    " du dossier " + this.nom);
        } else {
            System.out.println("❌ Élément " + element.getNom() +
                    " introuvable dans " + this.nom);
        }
    }

    @Override
    public ElementSysteme obtenir(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        throw new IndexOutOfBoundsException(
                "Index " + index + " invalide. Le dossier contient " +
                        elements.size() + " éléments.");
    }

    @Override
    public void decrire(int niveau) {
        System.out.println(getIndentation(niveau) +
                "📁 Dossier: " + nom + " | Type: " + type);

        // Description récursive de tous les éléments contenus
        if (elements.isEmpty()) {
            System.out.println(getIndentation(niveau + 1) + "(vide)");
        } else {
            for (ElementSysteme element : elements) {
                element.decrire(niveau + 1);
            }
        }
    }

    // Méthodes additionnelles utiles
    public int getNombreElements() {
        return elements.size();
    }

    public boolean estVide() {
        return elements.isEmpty();
    }

    public List<ElementSysteme> getElements() {
        return new ArrayList<>(elements); // Retourne une copie
    }
}