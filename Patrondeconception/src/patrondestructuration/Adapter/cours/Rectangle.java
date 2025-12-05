package patrondestructuration.Adapter.cours;

public class Rectangle {
    public float longueur;
    public float largeur;
    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public float perimetre() {
        return (largeur+longueur)*2;
    }
    public float area() {
        return largeur*longueur;
    }
}
