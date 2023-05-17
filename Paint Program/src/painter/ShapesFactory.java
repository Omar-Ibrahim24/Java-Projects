package painter;

import java.awt.Color;

public abstract class ShapesFactory {

    public abstract General createGeneral(int detector, Point p1, Point p2, Color color, boolean fill, int undoRedoType);
}
