package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rectangle extends General implements Cloneable, Drawer, ShapeModfier {

    private Point ptemp;
    private boolean first = true;
    Rectangle rec = null;

    public Rectangle(Point p1, Point p2, Color color, boolean fill, int undoRedoType) {
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
        int xDiff = Math.abs(p1.getX() - p2.getX());
        int yDiff = Math.abs(p1.getY() - p2.getY());
        m.setColor(color);
        if (!fill) {
            if (p1.getX() < p2.getX() && p1.getY() < p2.getY()) {
                m.drawRect(p1.getX(), p1.getY(), xDiff, yDiff);
            } else if (p1.getX() > p2.getX() && p1.getY() > p2.getY()) {
                m.drawRect(p2.getX(), p2.getY(), xDiff, yDiff);
            } else if (p1.getX() < p2.getX() && p1.getY() > p2.getY()) {
                m.drawRect(p1.getX(), p2.getY(), xDiff, yDiff);
            } else {
                m.drawRect(p2.getX(), p1.getY(), xDiff, yDiff);
            }
        } else {
            if (p1.getX() < p2.getX() && p1.getY() < p2.getY()) {
                m.fillRect(p1.getX(), p1.getY(), xDiff, yDiff);
            } else if (p1.getX() > p2.getX() && p1.getY() > p2.getY()) {
                m.fillRect(p2.getX(), p2.getY(), xDiff, yDiff);
            } else if (p1.getX() < p2.getX() && p1.getY() > p2.getY()) {
                m.fillRect(p1.getX(), p2.getY(), xDiff, yDiff);
            } else {
                m.fillRect(p2.getX(), p1.getY(), xDiff, yDiff);
            }
        }
    }

    @Override
    public boolean selecter(Point p) {

        int xDiff = Math.abs(p1.getX() - p2.getX());
        int yDiff = Math.abs(p1.getY() - p2.getY());
        java.awt.Rectangle rec;

        if (p1.getX() < p2.getX() && p1.getY() < p2.getY()) {
            rec = new java.awt.Rectangle(p1.getX(), p1.getY(), xDiff, yDiff);
        } else if (p1.getX() > p2.getX() && p1.getY() > p2.getY()) {
            rec = new java.awt.Rectangle(p2.getX(), p2.getY(), xDiff, yDiff);
        } else if (p1.getX() < p2.getX() && p1.getY() > p2.getY()) {
            rec = new java.awt.Rectangle(p1.getX(), p2.getY(), xDiff, yDiff);
        } else {
            rec = new java.awt.Rectangle(p2.getX(), p1.getY(), xDiff, yDiff);
        }
        return rec.contains(new java.awt.Point(p.getX(), p.getY()));
    }

    @Override
    public void adjust(Graphics m, Point pd, Point pf, int type) {
        switch (type) {
            case (1):
                if (first) {
                    Rectangle rec2 = new Rectangle(p1, p2, color, fill, undoRedoType);
                    Painter.type2.add(rec2);

                    rec = (Rectangle) Painter.main.get(Painter.index);
                    rec.setP2(pd);
                    rec.setUndoRedoType(2);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(rec);
                    first = false;
                } else {
                    rec = (Rectangle) Painter.main.get(Painter.main.size() - 1);
                    rec.setP2(pd);
                    rec.setUndoRedoType(2);
                }
                break;
            case (2):
                if (first) {
                    Rectangle rec2 = new Rectangle(p1, p2, color, fill, undoRedoType);
                    Painter.type3.add(rec2);
                    ptemp = pf;
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    rec = (Rectangle) Painter.main.get(Painter.index);
                    rec.setP1(pxx);
                    rec.setP2(pyy);
                    rec.setUndoRedoType(3);
                    Painter.main.remove(Painter.index);
                    Painter.main.add(rec);
                    ptemp = pd;
                    first = false;
                } else {
                    rec = (Rectangle) Painter.main.get(Painter.main.size() - 1);
                    Point pxx = new Point(p1.getX() + (pd.getX() - ptemp.getX()), p1.getY() + (pd.getY() - ptemp.getY()));
                    Point pyy = new Point(p2.getX() + (pd.getX() - ptemp.getX()), p2.getY() + (pd.getY() - ptemp.getY()));
                    rec.setP1(pxx);
                    rec.setP2(pyy);
                    ptemp = pd;
                }
                break;
        }
    }

    @Override
    public void copy(Point p, General selected) {
        int xDiff = Math.abs(p1.getX() - p2.getX());
        int yDiff = Math.abs(p1.getY() - p2.getY());
        Rectangle rtemp = (Rectangle) selected;
        Rectangle r = null;
        try {
            r = (Rectangle) rtemp.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
        Point pp = new Point(p.getX() + xDiff, p.getY() + yDiff);
        r.setP1(p);
        r.setP2(pp);
        r.setUndoRedoType(6);
        Painter.main.add(r);
    }

    @Override
    public void reset() {
        first = true;
        rec = null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle rec = (Rectangle) super.clone();
        rec.p1 = (Point) p1.clone();
        rec.p2 = (Point) p2.clone();
        return rec; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decorater(Graphics m) {
        int xDiff = Math.abs(p1.getX() - p2.getX());
        int yDiff = Math.abs(p1.getY() - p2.getY());
        m.setColor(Color.RED);
        if (p1.getX() < p2.getX() && p1.getY() < p2.getY()) {
            m.drawRect(p1.getX(), p1.getY(), xDiff, yDiff);
        } else if (p1.getX() > p2.getX() && p1.getY() > p2.getY()) {
            m.drawRect(p2.getX(), p2.getY(), xDiff, yDiff);
        } else if (p1.getX() < p2.getX() && p1.getY() > p2.getY()) {
            m.drawRect(p1.getX(), p2.getY(), xDiff, yDiff);
        } else {
            m.drawRect(p2.getX(), p1.getY(), xDiff, yDiff);
        }
    }

}
