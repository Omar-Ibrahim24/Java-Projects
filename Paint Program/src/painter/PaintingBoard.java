package painter;

import java.awt.Color;
import javax.swing.JColorChooser;
import static painter.UndoRedo.redo;
import static painter.UndoRedo.undo;

public class PaintingBoard extends javax.swing.JFrame {

    private static PaintingBoard pBoard = null;
    private Color c1;

    private PaintingBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painter1 = new painter.Painter();
        jPanel1 = new javax.swing.JPanel();
        triangle = new javax.swing.JButton();
        rect = new javax.swing.JButton();
        circle = new javax.swing.JButton();
        Line = new javax.swing.JButton();
        square = new javax.swing.JButton();
        move = new javax.swing.JButton();
        resize = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        copy = new javax.swing.JButton();
        select = new javax.swing.JButton();
        setcolor = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painter1.setBackground(new java.awt.Color(0, 0, 0));
        painter1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));

        javax.swing.GroupLayout painter1Layout = new javax.swing.GroupLayout(painter1);
        painter1.setLayout(painter1Layout);
        painter1Layout.setHorizontalGroup(
            painter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painter1Layout.setVerticalGroup(
            painter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        triangle.setBackground(new java.awt.Color(255, 204, 204));
        triangle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        triangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/tr.png"))); // NOI18N
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });

        rect.setBackground(new java.awt.Color(255, 204, 204));
        rect.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rec.png"))); // NOI18N
        rect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectActionPerformed(evt);
            }
        });

        circle.setBackground(new java.awt.Color(255, 204, 204));
        circle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        circle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/cc.gif"))); // NOI18N
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        Line.setBackground(new java.awt.Color(255, 204, 204));
        Line.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/line.png"))); // NOI18N
        Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineActionPerformed(evt);
            }
        });

        square.setBackground(new java.awt.Color(255, 204, 204));
        square.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        square.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/sq.jpg"))); // NOI18N
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        move.setBackground(new java.awt.Color(255, 204, 204));
        move.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        move.setText("move");
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        resize.setBackground(new java.awt.Color(255, 204, 204));
        resize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        resize.setText("resize");
        resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 204, 204));
        delete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rubbish.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        copy.setBackground(new java.awt.Color(255, 204, 204));
        copy.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        copy.setText("copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        select.setBackground(new java.awt.Color(255, 204, 204));
        select.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        select.setText("select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        setcolor.setBackground(new java.awt.Color(255, 204, 204));
        setcolor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        setcolor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clr.png"))); // NOI18N
        setcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setcolorActionPerformed(evt);
            }
        });

        undo.setBackground(new java.awt.Color(255, 204, 204));
        undo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setBackground(new java.awt.Color(255, 204, 204));
        redo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        redo.setText("Redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jRadioButton1.setText("Fill");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Welcome To Paint ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(triangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rect, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(square)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(move)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(undo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setcolor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(setcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redo)
                            .addComponent(undo))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resize)
                        .addComponent(move)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(copy)))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(jRadioButton1))
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static PaintingBoard getObject() {
        if (pBoard == null) {
            pBoard = new PaintingBoard();
        }
        return pBoard;
    }
    private void LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineActionPerformed
        painter1.detector = 1;
    }//GEN-LAST:event_LineActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        painter1.detector = 3;
    }//GEN-LAST:event_circleActionPerformed

    private void rectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectActionPerformed
        painter1.detector = 2;
    }//GEN-LAST:event_rectActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        painter1.detector = 4;
    }//GEN-LAST:event_squareActionPerformed

    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
        painter1.detector = 5;
    }//GEN-LAST:event_triangleActionPerformed

    private void setcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setcolorActionPerformed
        c1 = Color.BLACK;
        c1 = JColorChooser.showDialog(this, "select a colour", c1);
        if (c1 == null) {
            painter1.color = Color.BLACK;
        } else {
            painter1.color = c1;
        }
    }//GEN-LAST:event_setcolorActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed

        undo();
        repaint();
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed

        redo();
        repaint();
     }//GEN-LAST:event_redoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        painter1.clrfill = jRadioButton1.isSelected();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        painter1.detector = 6;
    }//GEN-LAST:event_selectActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        for (int i = Painter.main.size() - 1; i >= 0; i--) {
            Painter.type5.add(Painter.main.get(i));
            Painter.main.remove(i);
        }
        Painter.iscleared = true;
        repaint();
    }//GEN-LAST:event_clearActionPerformed

    private void resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeActionPerformed
        painter1.detector = 7;
    }//GEN-LAST:event_resizeActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        painter1.detector = 8;
    }//GEN-LAST:event_moveActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        painter1.detector = 9;
    }//GEN-LAST:event_copyActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        painter1.detector = 10;
        if (Painter.selected != null) {
            Painter.type4.add(Painter.selected);
            Painter.main.remove(Painter.selected);
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 0);
            Painter.main.add(new Circle(p1, p2, Color.BLACK, true, 4));
            repaint();
        }
    }//GEN-LAST:event_deleteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaintingBoard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintingBoard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintingBoard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintingBoard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintingBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Line;
    private javax.swing.JButton circle;
    private javax.swing.JButton clear;
    private javax.swing.JButton copy;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton move;
    private painter.Painter painter1;
    private javax.swing.JButton rect;
    private javax.swing.JButton redo;
    private javax.swing.JButton resize;
    private javax.swing.JButton select;
    private javax.swing.JButton setcolor;
    private javax.swing.JButton square;
    private javax.swing.JButton triangle;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
