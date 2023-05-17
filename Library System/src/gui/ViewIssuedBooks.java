package gui;

import static gui.ReadFiles.ReadIssuedBook;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

class ViewIssuedBooks extends javax.swing.JFrame {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    AddNewIssuedBook n[] = new AddNewIssuedBook[200];
    private int count = 0;

    public ViewIssuedBooks() throws FileNotFoundException {
        initComponents();
        DateTF.setText(dateFormat.format(date));
        n = ReadIssuedBook();
        count = ReadFiles.ReadIssuedBookCount();
        IssueTableF();
    }

    private void IssueTableF() {
        int i;
        DefaultTableModel model = (DefaultTableModel) IssueTable.getModel();
        for (i = 0; i < count; i++) {
            model.insertRow(model.getRowCount(), new Object[]{(i + 1),
                n[i].getBookCallNo(),
                n[i].getStudID(),
                n[i].getStudName(),
                n[i].getStudContact(),
                n[i].getDate(),
                n[i].getReturnDate()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        IssueTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        DateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IssueTable.setAutoCreateRowSorter(true);
        IssueTable.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        IssueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Book Call No.", "Student ID", "Student Name", "Student Contact", "Issue Date", "Return Date"
            }
        ));
        IssueTable.setColumnSelectionAllowed(true);
        IssueTable.setFillsViewportHeight(true);
        IssueTable.setPreferredSize(new java.awt.Dimension(525, 100));
        IssueTable.setRowHeight(50);
        jScrollPane1.setViewportView(IssueTable);
        IssueTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (IssueTable.getColumnModel().getColumnCount() > 0) {
            IssueTable.getColumnModel().getColumn(0).setMinWidth(100);
            IssueTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            IssueTable.getColumnModel().getColumn(0).setMaxWidth(100);
            IssueTable.getColumnModel().getColumn(4).setMinWidth(300);
            IssueTable.getColumnModel().getColumn(4).setPreferredWidth(300);
            IssueTable.getColumnModel().getColumn(4).setMaxWidth(300);
        }

        Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        DateTF.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1634, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(Back)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        LibrarianSection lib = new LibrarianSection();
        lib.setVisible(true);
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewIssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewIssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewIssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ViewIssuedBooks().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ViewIssuedBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField DateTF;
    private javax.swing.JTable IssueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
