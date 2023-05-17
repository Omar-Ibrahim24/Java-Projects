package painter;

import java.awt.Graphics;

public class ShaperDecorator implements Drawer {

    private Drawer drawer;
    General general;
    public ShaperDecorator(General general) {
        drawer = (Drawer) general;
    }
    @Override
    public void draw(Graphics m) {
        drawer.draw(m);
        decorater(m);
    }
    @Override
    public void decorater(Graphics m) {
        drawer.decorater(m);
    }
}
