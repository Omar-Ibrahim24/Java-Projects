package painter;

import java.awt.Color;

public abstract class General implements Cloneable, ShapeModfier {

    Point p1, p2;
    Color color;
    boolean fill;
    int undoRedoType;
    public static int index;

    public General(Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
        this.fill = fill;
        this.undoRedoType = undoRedoType;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int getUndoRedoType() {
        return undoRedoType;
    }

    public void setUndoRedoType(int undoRedoType) {
        this.undoRedoType = undoRedoType;
    }
}
