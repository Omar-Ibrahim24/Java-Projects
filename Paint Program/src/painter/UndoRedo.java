package painter;

public class UndoRedo {

    public static void undo() {
        if (!Painter.main.isEmpty()) {
            int x = Painter.main.get(Painter.main.size() - 1).undoRedoType;
            if (x == 1 || x == 6) {
                Painter.type1.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
            } else if (x == 2 && !Painter.type2.isEmpty()) {
                Painter.type1.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type2.get(Painter.type2.size() - 1));
                Painter.type2.remove(Painter.type2.size() - 1);
            } else if (x == 3 && !Painter.type3.isEmpty()) {
                Painter.type1.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type3.get(Painter.type3.size() - 1));
                Painter.type3.remove(Painter.type3.size() - 1);
            } else if (x == 4 && !Painter.type4.isEmpty()) {
                Painter.type1.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type4.get(Painter.type4.size() - 1));
                Painter.type4.remove(Painter.type4.size() - 1);
            }
        } else {
            if (Painter.iscleared) {
                for (int i = Painter.type5.size() - 1; i >= 0; i--) {
                    Painter.main.add(Painter.type5.get(i));
                    Painter.type5.remove(i);
                }
                Painter.iscleared = false;
            }
        }
    }

    public static void redo() {
        if (!Painter.type1.isEmpty()) {
            int x = Painter.type1.get(Painter.type1.size() - 1).undoRedoType;
            System.out.println(Painter.type1.size());
            if (x == 1 || x == 6) {
                Painter.main.add(Painter.type1.get(Painter.type1.size() - 1));
                Painter.type1.remove(Painter.type1.size() - 1);
            } else if (x == 2) {
                Painter.type2.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type1.get(Painter.type1.size() - 1));
                Painter.type1.remove(Painter.type1.size() - 1);
            } else if (x == 3) {
                Painter.type3.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type1.get(Painter.type1.size() - 1));
                Painter.type1.remove(Painter.type1.size() - 1);
            } else if (x == 4) {
                Painter.type4.add(Painter.main.get(Painter.main.size() - 1));
                Painter.main.remove(Painter.main.size() - 1);
                Painter.main.add(Painter.type1.get(Painter.type1.size() - 1));
                Painter.type1.remove(Painter.type1.size() - 1);
            }
        }
    }
}
