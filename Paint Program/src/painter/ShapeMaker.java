package painter;

import java.awt.Graphics;

public class ShapeMaker implements Drawer {
    private Drawer x;
    public ShapeMaker(General g) {
        x = (Drawer) g;
    }
    @Override
    public void draw(Graphics m) {
        x.draw(m);
    }

    @Override
    public void decorater(Graphics m) {
    }
    
}
