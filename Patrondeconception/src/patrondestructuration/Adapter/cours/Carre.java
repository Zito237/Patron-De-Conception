package patrondestructuration.Adapter.cours;

public class Carre implements Icarre{
    public float cote;
    public Carre(float cote){
        this.cote=cote;
    }

    @Override
    public float aire() {
        return cote * cote;
    }

    @Override
    public float perimetre() {
        return cote*4;
    }
}
