package patrondestructuration.composite.devoir;

class FichierPDF extends ElementSysteme {

    public FichierPDF(String nom) {
        super(nom, "pdf");
    }

    @Override
    public void decrire(int niveau) {
        System.out.println(getIndentation(niveau) +
                "📕 Fichier: " + nom + " | Type: " + type);
    }
}
