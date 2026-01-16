package patrondestructuration.composite;

class Parent extends MembreFamille {
    private List<MembreFamille> enfants;
    private String conjoint; // Optionnel

    public Parent(String nom, String prenom, int anneeNaissance, String genre) {
        super(nom, prenom, anneeNaissance, genre);
        this.enfants = new ArrayList<>();
    }

    public void setConjoint(String conjoint) {
        this.conjoint = conjoint;
    }

    @Override
    public void ajouterEnfant(MembreFamille enfant) {
        enfants.add(enfant);
        System.out.println("✅ " + enfant.getNomComplet() +
                " ajouté(e) comme enfant de " + getNomComplet());
    }

    @Override
    public void supprimerEnfant(MembreFamille enfant) {
        if (enfants.remove(enfant)) {
            System.out.println("✅ " + enfant.getNomComplet() +
                    " retiré(e) des enfants de " + getNomComplet());
        } else {
            System.out.println("❌ " + enfant.getNomComplet() +
                    " n'est pas un enfant de " + getNomComplet());
        }
    }

    @Override
    public void afficher(int niveau) {
        String conjointInfo = conjoint != null ? " ❤️ " + conjoint : "";
        System.out.println(getIndentation(niveau) + "├── " + getIcone() + " " +
                getNomComplet() + conjointInfo +
                " (" + anneeNaissance + ", " + getAge() + " ans)");

        if (!enfants.isEmpty()) {
            System.out.println(getIndentation(niveau + 1) + "Enfants:");
            for (MembreFamille enfant : enfants) {
                enfant.afficher(niveau + 1);
            }
        }
    }

    @Override
    public MembreFamille rechercher(String nomComplet) {
        // Recherche dans ce nœud
        if (getNomComplet().equalsIgnoreCase(nomComplet)) {
            return this;
        }

        // Recherche récursive dans les enfants
        for (MembreFamille enfant : enfants) {
            MembreFamille resultat = enfant.rechercher(nomComplet);
            if (resultat != null) {
                return resultat;
            }
        }

        return null;
    }

    @Override
    public int compterDescendants() {
        int total = enfants.size(); // Enfants directs

        // Ajouter les descendants de chaque enfant
        for (MembreFamille enfant : enfants) {
            total += enfant.compterDescendants();
        }

        return total;
    }

    public List<MembreFamille> getEnfants() {
        return new ArrayList<>(enfants); // Copie pour protection
    }
}