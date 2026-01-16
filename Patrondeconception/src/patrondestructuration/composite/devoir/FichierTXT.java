package patrondestructuration.composite.devoir;

class FichierTXT extends ElementSysteme {

    public FichierTXT(String nom) {
        super(nom, "txt");
    }

    @Override
    public void decrire(int niveau) {
        System.out.println(getIndentation(niveau) +
                "📄 Fichier: " + nom + " | Type: " + type);
    }
}
