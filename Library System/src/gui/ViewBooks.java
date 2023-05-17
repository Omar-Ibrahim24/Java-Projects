package gui;

import static gui.ReadFiles.ReadBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ViewBooks extends javax.swing.JFrame {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    AddNewBook n[] = new AddNewBook[200];
    private int count = 0;

    public ViewBooks() throws FileNotFoundException {
        initComponents();
        DateTF.setText(dateFormat.format(date));
        n = ReadBook();
        count = ReadFiles.ReadBookCount();
         BookTableF();
    }

    private int issue(String x) throws FileNotFoundException {
        int issued = 0;
        File F = new File("IssueBooks.txt");
        Scanner myReader;
        myReader = new Scanner(F);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            StringTokenizer st = new StringTokenizer(data, ",");
            if (st.nextToken().equals(x)) {
                issued++;
            }
        }

        myReader.close();
        return issued;
    }

    private void BookTableF() throws FileNotFoundException {
        int i;
        int issued;

        DefaultTableModel model = (DefaultTableModel) BookTable.getModel();
         for (i=0 ; i < count; i++) {
            issued = issue(n[i].getCallNo());
            model.insertRow(model.getRowCount(), new Object[]{
                (i + 1),
                n[i].getCallNo(),
                n[i].getName(),
                n[i].getAuthor(),
                n[i].getPublisher(),
                n[i].getQuantity(),
                issued,
                n[i].getDate()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        DateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookTable.setAutoCreateRowSorter(true);
        BookTable.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Call No.", "Name", "Author", "Publisher", "Quantity", "Issued", "AddedDate"
            }
        ));
        BookTable.setToolTipText("");
        BookTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        BookTable.setColumnSelectionAllowed(true);
        BookTable.setFillsViewportHeight(true);
        BookTable.setPreferredSize(new java.awt.Dimension(525, 100));
        BookTable.setRowHeight(50);
        jScrollPane1.setViewportView(BookTable);
        BookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (BookTable.getColumnModel().getColumnCount() > 0) {
            BookTable.getColumnModel().getColumn(1).setResizable(false);
            BookTable.getColumnModel().getColumn(7).setMinWidth(300);
            BookTable.getColumnModel().getColumn(7).setPreferredWidth(300);
            BookTable.getColumnModel().getColumn(7).setMaxWidth(300);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DateTF.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 895, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LibrarianSection lib = new LibrarianSection();
        lib.setVisible(true);
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTFActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ViewBooks().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ViewBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookTable;
    private javax.swing.JTextField DateTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
