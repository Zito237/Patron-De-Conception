package patrondestructuration.Adapter.cours;

public class Trapeze {
    public float Abase;
    public float Bbase;

    public float hauteur;
    public float Ccote;
    public float Dcote;
    public Trapeze(float Abase, float Bbase, float hauteur ,float Ccote, float Dcote) {
        this.Abase = Abase;
        this.Bbase = Bbase;
        this.Ccote = Ccote;
        this.Dcote = Dcote;
        this.hauteur = hauteur;
    }
    public float perimetre(){
        return Abase+Bbase+Ccote+Dcote;
    }
    public float area(){
        return (1/2) * (Abase +Bbase) + hauteur;
    }


}
