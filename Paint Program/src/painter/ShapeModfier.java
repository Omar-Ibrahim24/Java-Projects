package painter;

import java.awt.Graphics;

public interface ShapeModfier {

    void adjust(Graphics m, Point pd, Point pf, int type);

    boolean selecter(Point p);

    void copy(Point p, General selected);

    void reset();

}
