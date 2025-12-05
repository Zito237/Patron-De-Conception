package patrondestructuration.Adapter.modifier;

import patrondestructuration.Adapter.modifier.Icarre;
import patrondestructuration.Adapter.cours.Trapeze;

public class AdaptParallelogram implements Icarre {
    Paralelogram param;
    public AdaptParallelogram(Paralelogram param) {
        this.param = param;
    }
    public float perimetre() {
        return param.perimetre();
    }
    public float aire() {
        return param.area();
    }
}
