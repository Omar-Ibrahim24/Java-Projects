package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

public class Painter extends JPanel implements MouseListener, MouseMotionListener, Cloneable {

    private TwoSidedFactory xx = new TwoSidedFactory();
    private ThreeSidedFactory xxx = new ThreeSidedFactory();
    private boolean adjusting;
    private General selectedTemp;
    private ShapeMaker maker;
    private ShaperDecorator dec;
    public static ArrayList<General> main = new ArrayList<General>();//drawing array
    public static ArrayList<General> type1 = new ArrayList<General>();//normal removed drawn shapes and copied ones
    public static ArrayList<General> type2 = new ArrayList<General>();//shapes resized
    public static ArrayList<General> type3 = new ArrayList<General>();//shapes moved
    public static ArrayList<General> type4 = new ArrayList<General>();//shapes deleted
    public static ArrayList<General> type5 = new ArrayList<General>();//shapes clear
    public static int detector, index, type;
    public static boolean clrfill, iscleared;
    public static General selected, gDraw, decor;
    public static Color color = Color.WHITE;
    public static Point p1, p2, p3;

    public Painter() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics m) {
        super.paintComponent(m);
        if (adjusting && selected != null) {
            selected.adjust(m, p2, p1, type);
            adjusting = false;
            selectedTemp = selected;
            repaint();
        } else {
            Iterator mainx = main.iterator();
            while (mainx.hasNext()) {
                gDraw = (General) mainx.next();
                if (selected == gDraw && selected != selectedTemp) {
                    dec = new ShaperDecorator(decor);
                    dec.draw(m);
                } else {
                    maker = new ShapeMaker(gDraw);
                    maker.draw(m);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        p1 = new Point(me.getX(), me.getY());
        General g = xx.createGeneral(detector, p1, p1, color, clrfill, 1);
        switch (detector) {
            case 1:
                Line l = (Line) g;
                main.add(l);
                rereSet();
                break;
            case 2:
                Rectangle rec = (Rectangle) g;
                main.add(rec);
                rereSet();
                break;
            case 3:
                Circle circ = (Circle) g;
                main.add(circ);
                rereSet();
                break;
            case 4:
                Square sq = (Square) g;
                main.add(sq);
                rereSet();
                break;
            case 5:
                p1 = new Point(me.getX(), me.getY());
                Triangle tr = (Triangle) xxx.createGeneral(detector, p1, p2, color, clrfill, 1);
                main.add(tr);
                rereSet();
                break;
            case 6:
                for (int i = main.size() - 1; i >= 0; i--) {
                    if (main.get(i).selecter(p1)) {
                        index = i;
                        selected = main.get(i);
                        if (selected instanceof Line) {
                            decor = xx.createGeneral(1, selected.p1, selected.p2, selected.color, selected.fill, selected.undoRedoType);
                        } else if (selected instanceof Rectangle) {
                            decor = xx.createGeneral(2, selected.p1, selected.p2, selected.color, selected.fill, selected.undoRedoType);
                        } else if (selected instanceof Circle) {
                            decor = xx.createGeneral(3, selected.p1, selected.p2, selected.color, selected.fill, selected.undoRedoType);
                        } else if (selected instanceof Square) {
                            decor = xx.createGeneral(4, selected.p1, selected.p2, selected.color, selected.fill, selected.undoRedoType);
                        } else if (selected instanceof Triangle) {
                            decor = xxx.createGeneral(6, selected.p1, selected.p2, selected.color, selected.fill, selected.undoRedoType);
                        }
                        System.out.println("hi");
                        repaint();
                        break;
                    }
                }
                break;
            case 9:
                if (selected != null) {
                    selected.copy(p1, selected);
                    repaint();
                }
                break;
        }

    }

    @Override
    public void mouseDragged(MouseEvent me
    ) {
        p2 = new Point(me.getX(), me.getY());
        General g = main.get(main.size() - 1);
        switch (detector) {
            case 1:
                Line l = (Line) g;
                l.setP2(p2);
                repaint();
                break;
            case 2:
                Rectangle rec = (Rectangle) g;
                rec.setP2(p2);
                repaint();
                break;
            case 3:
                Circle circ = (Circle) g;
                circ.setP2(p2);
                repaint();
                break;
            case 4:
                Square sq = (Square) g;
                sq.setP2(p2);
                repaint();
                break;
            case 5:
                Triangle tr = (Triangle) g;
                p3 = new Point(p1.getX(), p2.getY());
                tr.setP2(p2);
                tr.setP3(p3);
                repaint();
                break;
            case (7):
                if (selected != null) {
                    type = 1;
                    adjusting = true;
                    repaint();
                }
                break;
            case (8):
                if (selected != null) {
                    type = 2;
                    adjusting = true;
                    repaint();
                }
                break;

        }
    }

    @Override
    public void mouseReleased(MouseEvent me
    ) {

        switch (detector) {
            case 7:
                if (selected != null) {
                    selected.reset();
                    rereSet();
                }
                break;
            case 8:
                if (selected != null) {
                    selected.reset();
                    rereSet();
                }
                break;
            case 9:
                if (selected != null) {
                    selected.reset();
                    rereSet();
                }
                break;
            case 10:
                if (selected != null) {
                    rereSet();
                }
                break;
        }

    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    private void rereSet() {
        decor = null;
        selected = null;
        selectedTemp = null;
        repaint();
    }
}
