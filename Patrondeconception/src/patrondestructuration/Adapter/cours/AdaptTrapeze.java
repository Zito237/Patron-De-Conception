package patrondestructuration.Adapter.cours;

public class AdaptTrapeze implements  Icarre {
    Trapeze trap;
    public AdaptTrapeze(Trapeze trap) {
        this.trap = trap;
    }
    public float perimetre() {
        return trap.perimetre();
    }
    public float aire() {
        return trap.area();
    }
}
