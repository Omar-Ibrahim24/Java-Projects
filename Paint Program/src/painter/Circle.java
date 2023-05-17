package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle extends General implements Cloneable, Drawer, ShapeModfier {

    private Point ptemp;
    private boolean first = true;
    private Circle circ = null;

    public Circle(Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
        super(p1, p2, color, fill, undoRedoType);
    }

    public int getUndoRedoType() {
        return undoRedoType;
    }

    public void setUndoRedoType(int undoRedoType) {
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

    @Override
    public void draw(Graphics m) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY()), avg = (xDiff + yDiff) / 2, x = p1.getX() - (avg / 2), y = p1.getY() - (avg / 2);
        m.setColor(color);
        if (!fill) {
            m.drawOval(x, y, avg, avg);
        } else {
            m.fillOval(x, y, avg, avg);
        }
    }

    @Override
    public boolean selecter(Point p) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY()), avg = (xDiff + yDiff) / 2, x = p1.getX() - (avg / 2), y = p1.getY() - (avg / 2);
        java.awt.Rectangle rec = new java.awt.Rectangle(p1.getX() - (avg / 2), p1.getY() - (avg / 2), avg, avg);
        if (rec.contains(new java.awt.Point(p.getX(), p.getY()))) {
            return true;
        }
        return false;
    }

    @Override
    public void adjust(Graphics m, Point pd, Point pf, int type) {
        switch (type) {
            case (1):
                if (first) {
                    Circle circ2 = new Circle(p1, p2, color, fill, undoRedoType);
                    Painter.type2.add(circ2);
                    circ = (Circle) Painter.main.get(Painter.index);
                    circ.setP2(pd);
                    circ.setUndoRedoType(2);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(circ);
                    first = false;
                } else {
                    circ = (Circle) Painter.main.get(Painter.main.size() - 1);
                    circ.setP2(pd);
                    circ.setUndoRedoType(2);
                }
                break;
            case (2):
                if (first) {
                    Circle circ2 = new Circle(p1, p2, color, fill, undoRedoType);
                    Painter.type3.add(circ2);
                    ptemp = pf;
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    circ = (Circle) Painter.main.get(Painter.index);
                    circ.setP1(pxx);
                    circ.setP2(pyy);
                    circ.setUndoRedoType(3);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(circ);
                    ptemp = pd;
                    first = false;
                } else {
                    circ = (Circle) Painter.main.get(Painter.main.size() - 1);
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    circ.setP1(pxx);
                    circ.setP2(pyy);
                    ptemp = pd;
                }
                break;
        }
    }

    @Override
    public void copy(Point p, General selected) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY());
        Circle ctemp = (Circle) selected;
        Circle c = null;
        try {
            c = (Circle) ctemp.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
        Point pp = new Point(p.getX() + xDiff, p.getY() + yDiff);
        c.setP1(p);
        c.setP2(pp);
        c.setUndoRedoType(6);
        Painter.main.add(c);
    }

    @Override
    public void reset() {
        first = true;
        circ = null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle c = (Circle) super.clone();
        c.p1 = (Point) p1.clone();
        c.p2 = (Point) p2.clone();
        return c;
    }

    @Override
    public void decorater(Graphics m) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY()), avg = (xDiff + yDiff) / 2, x = p1.getX() - (avg / 2), y = p1.getY() - (avg / 2);
        m.setColor(Color.RED);
        m.drawOval(x, y, avg , avg );
    }

}
