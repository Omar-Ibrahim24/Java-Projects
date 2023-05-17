package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Line extends General implements Cloneable, Drawer, ShapeModfier {

    private Point ptemp;
    private boolean first = true;
    Line l = null;

    public Line(Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
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
        m.setColor(color);
        m.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    @Override
    public boolean selecter(Point p) {
        Point p11, p12, p21, p22;
        p11 = new Point(p1.getX() - 3, p1.getY() + 5);
        p12 = new Point(p1.getX() + 3, p1.getY() - 5);
        p21 = new Point(p2.getX() + 3, p2.getY() - 5);
        p22 = new Point(p2.getX() - 3, p2.getY() + 5);
        int[] xs = {p11.getX(), p12.getX(), p21.getX(), p22.getX()};
        int[] ys = {p11.getY(), p12.getY(), p21.getY(), p22.getY()};
        Polygon l = new Polygon(xs, ys, 4);
        if (l.contains(new java.awt.Point(p.getX(), p.getY()))) {
            return true;
        }
        return false;
    }

    @Override
    public void adjust(Graphics m, Point pd, Point pf, int type) {
        switch (type) {
            case (1):
                if (first) {
                    Line l2 = new Line(p1, p2, color, fill, undoRedoType);
                    Painter.type2.add(l2);

                    l = (Line) Painter.main.get(Painter.index);
                    l.setP2(pd);
                    l.setUndoRedoType(2);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(l);
                    first = false;
                } else {
                    l = (Line) Painter.main.get(Painter.main.size() - 1);
                    l.setP2(pd);
                    l.setUndoRedoType(2);
                }
                break;
            case (2):
                if (first) {
                    Line l2 = new Line(p1, p2, color, fill, undoRedoType);
                    Painter.type3.add(l2);
                    ptemp = pf;
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    l = (Line) Painter.main.get(Painter.index);
                    l.setP1(pxx);
                    l.setP2(pyy);
                    l.setUndoRedoType(3);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(l);
                    ptemp = pd;
                    first = false;
                } else {
                    l = (Line) Painter.main.get(Painter.main.size() - 1);
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    l.setP1(pxx);
                    l.setP2(pyy);
                    ptemp = pd;
                }
                break;
        }
    }

    @Override
    public void copy(Point p, General selected) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY());
        Line ltemp = (Line) selected;
        Line l = null;
        try {
            l = (Line) ltemp.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
        Point pp = new Point(p.getX() + xDiff, p.getY() + yDiff);
        l.setP1(p);
        l.setP2(pp);
        l.setUndoRedoType(6);
        Painter.main.add(l);
    }

    @Override
    public void reset() {
        first = true;
        l = null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Line l = (Line) super.clone();
        l.p1 = (Point) p1.clone();
        l.p2 = (Point) p2.clone();
        return l;
    }

    @Override
    public void decorater(Graphics m) {

        m.setColor(Color.RED);
        m.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

}
