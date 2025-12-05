package patrondestructuration.Adapter.modifier;

public class Paralelogram {
    public float Dbase;
    public float Ebase;

    public float hauteur;

    public Paralelogram(float Dbase, float Ebase, float hauteur) {
        this.Dbase = Dbase;
        this.Ebase = Ebase;

        this.hauteur = hauteur;
    }
    public float perimetre(){
        return 2*(Dbase+Ebase);
    }
    public float area(){
        return Ebase *hauteur;
    }


}
