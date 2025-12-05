package patrondestructuration.Adapter.modifier;

import patrondestructuration.Adapter.modifier.Icarre;
import patrondestructuration.Adapter.modifier.Trapeze;

public class AdaptTrapeze implements Icarre {
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
