package painter;

import java.awt.Color;

public class ThreeSidedFactory extends ShapesFactory {

    @Override
    public General createGeneral(int detector, Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
        if (detector == 5) {
            return new Triangle(p1, p1, p1, color, fill, undoRedoType);
        }
        if (detector == 6) {
            Point p = new Point(p1.getX(), p2.getY());
            return new Triangle(p1, p2, p, color, fill, undoRedoType);
        }

        return null;
    }

}
