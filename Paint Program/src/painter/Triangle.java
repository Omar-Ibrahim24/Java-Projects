package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangle extends General implements Cloneable, Drawer, ShapeModfier {

    private Point ptemp;
    private boolean first = true;
    Triangle tr = null;
    private Point p3;

    public Triangle(Point p3, Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
        super(p1, p2, color, fill, undoRedoType);
        this.p3 = p3;
    }

    public int getUndoRedoType() {
        return undoRedoType;
    }

    public void setUndoRedoType(int undoRedoType) {
        this.undoRedoType = undoRedoType;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
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
        int[] xs = {p1.getX(), p2.getX(), p3.getX()};
        int[] ys = {p1.getY(), p2.getY(), p3.getY()};
        m.setColor(color);
        if (!fill) {
            m.drawPolygon(xs, ys, 3);
        } else {
            m.fillPolygon(xs, ys, 3);
        }
    }

    @Override
    public boolean selecter(Point p) {
        int[] xs = {p1.getX(), p2.getX(), p3.getX()};
        int[] ys = {p1.getY(), p2.getY(), p3.getY()};
        Polygon tri = new Polygon(xs, ys, 3);
        if (tri.contains(new java.awt.Point(p.getX(), p.getY()))) {
            System.out.println("tr");
            return true;

        }
        return false;
    }

    @Override
    public void adjust(Graphics m, Point pd, Point pf, int type) {
        switch (type) {
            case (1):
                if (first) {
                    Triangle tr2 = new Triangle(p1, p2, p3, color, fill, undoRedoType);
                    Painter.type2.add(tr2);

                    tr = (Triangle) Painter.main.get(Painter.index);
                    tr.setP2(pd);
                    tr.setUndoRedoType(2);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(tr);
                    first = false;
                } else {
                    tr = (Triangle) Painter.main.get(Painter.main.size() - 1);
                    tr.setP2(pd);
                    tr.setUndoRedoType(2);
                }
                break;
            case (2):
                if (first) {
                    Triangle tr2 = new Triangle(p1, p2, p3, color, fill, undoRedoType);
                    Painter.type3.add(tr2);
                    ptemp = pf;
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    Point pzz = new Point(pxx.getX(), pyy.getY());
                    tr = (Triangle) Painter.main.get(Painter.index);
                    tr.setP1(pxx);
                    tr.setP2(pyy);
                    tr.setP3(pzz);
                    tr.setUndoRedoType(3);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(tr);
                    ptemp = pd;
                    first = false;
                } else {
                    tr = (Triangle) Painter.main.get(Painter.main.size() - 1);
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    Point pzz = new Point(pxx.getX(), pyy.getY());
                    tr.setP1(pxx);
                    tr.setP2(pyy);
                    tr.setP3(pzz);
                    ptemp = pd;
                }
                break;
        }
    }

    @Override
    public void copy(Point p, General selected) {
        int xDiff = Math.abs(p1.getX() - p2.getX()), yDiff = Math.abs(p1.getY() - p2.getY());
        Triangle ttemp = (Triangle) selected;
        Triangle t = null;
        try {
            t = (Triangle) ttemp.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
        Point pp = new Point(p.getX() + xDiff, p.getY() + yDiff);
        Point ppp = new Point(p.getX(), pp.getY());
        t.setP1(p);
        t.setP2(pp);
        t.setP3(ppp);
        t.setUndoRedoType(6);
        Painter.main.add(t);
    }

    @Override
    public void reset() {
        first = true;
        tr = null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Triangle tr = (Triangle) super.clone();
        tr.p1 = (Point) p1.clone();
        tr.p2 = (Point) p2.clone();
        return tr;
    }
    @Override
    public void decorater(Graphics m) {
        int[] xs = {p1.getX(), p2.getX(), p3.getX()};
        int[] ys = {p1.getY(), p2.getY(), p3.getY()};
        m.setColor(Color.RED);
        m.drawPolygon(xs, ys, 3);
    }
}
