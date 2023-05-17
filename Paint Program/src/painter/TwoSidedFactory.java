package painter;

import java.awt.Color;

public class TwoSidedFactory extends ShapesFactory {

    @Override
    public General createGeneral(int detector, Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
        switch (detector) {
            case 1:
                return new Line(p1, p2, color, fill, undoRedoType);
            case 2:
                return new Rectangle(p1, p2, color, fill, undoRedoType);
            case (3):
                return new Circle(p1, p2, color, fill, undoRedoType);
            case (4):
                return new Square(p1, p2, color, fill, undoRedoType);
        }
        return null;
    }
}
