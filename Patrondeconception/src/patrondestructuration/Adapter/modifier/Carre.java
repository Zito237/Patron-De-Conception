package patrondestructuration.Adapter.modifier;

import patrondestructuration.Adapter.modifier.Icarre;

public class Carre implements Icarre {
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
