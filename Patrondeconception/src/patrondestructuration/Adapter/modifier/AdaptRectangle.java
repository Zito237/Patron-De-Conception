package patrondestructuration.Adapter.modifier;

import patrondestructuration.Adapter.modifier.Icarre;
import patrondestructuration.Adapter.modifier.Rectangle;

public class AdaptRectangle implements Icarre {
    Rectangle rect;
    public AdaptRectangle(Rectangle rect) {
        this.rect = rect;
    }
    public float perimetre() {
        return rect.perimetre();
    }
    public float aire() {
        return rect.area();
    }
}
