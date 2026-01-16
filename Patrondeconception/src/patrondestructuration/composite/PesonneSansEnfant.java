package patrondestructuration.composite;

class PersonneSansEnfant extends MembreFamille {

    public PersonneSansEnfant(String nom, String prenom, int anneeNaissance, String genre) {
        super(nom, prenom, anneeNaissance, genre);
    }

    @Override
    public void afficher(int niveau) {
        System.out.println(getIndentation(niveau) + "├── " + getIcone() + " " +
                getNomComplet() + " (" + anneeNaissance + ", " + getAge() + " ans)");
    }

    @Override
    public MembreFamille rechercher(String nomComplet) {
        if (getNomComplet().equalsIgnoreCase(nomComplet)) {
            return this;
        }
        return null;
    }

    @Override
    public int compterDescendants() {
        return 0; // Pas de descendants
    }
}