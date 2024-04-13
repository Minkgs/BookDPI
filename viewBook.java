package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Book;
import repositoris.RepositorisBook;

public class viewBook extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    RepositorisBook rp = new RepositorisBook();

    public viewBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        model = (DefaultTableModel) tblBangBook.getModel();
        loadTableSa(rp.welcomSa());
        loadTableAn(rp.welcomAn());
        loadTableNam(rp.welcomNam());
    }

    void loadTableSa(List<Book> listSa) {
        model.setRowCount(0);
        for (Book b : listSa) {
            model.addRow(new Object[]{b.getBook_id(), b.getTitle(),
                b.getPub(), b.getAu(), b.getNotes()});
        }
            lbWelCome.setText("Welcome Sa");
    }

    void loadTableAn(List<Book> listAn) {
        model.setRowCount(0);
        for (Book b : listAn) {
            model.addRow(new Object[]{b.getBook_id(), b.getTitle(),
                b.getPub(), b.getAu(), b.getNotes()});
        }
            lbWelCome.setText("Welcome An");
    }

    void loadTableNam(List<Book> listNam) {
        model.setRowCount(0);
        for (Book b : listNam) {
            model.addRow(new Object[]{b.getBook_id(), b.getTitle(),
                b.getPub(), b.getAu(), b.getNotes()});
        }
            lbWelCome.setText("Welcome Nam");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboSearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtEnterKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangBook = new javax.swing.JTable();
        btnAddnew = new javax.swing.JButton();
        lbWelCome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search");

        cboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Title", "Book ID", "Authors" }));
        cboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter keyword");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblBangBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Publishers", "Authors", "Note"
            }
        ));
        tblBangBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangBook);

        btnAddnew.setText("Add new");
        btnAddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddnewActionPerformed(evt);
            }
        });

        lbWelCome.setText("Welcome SA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnterKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddnew)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtEnterKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddnew)
                    .addComponent(lbWelCome))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnewActionPerformed
        viewAddBook add = new viewAddBook();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddnewActionPerformed

    private void cboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtEnterKeyword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Click the character you want to find!",
                        "Messenger", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String searchType = cboSearch.getSelectedItem().toString();
        String keyword = txtEnterKeyword.getText();
        if (searchType.equals("Book Title")) {
            loadTableSa(rp.searchBookSa(keyword));
        } else if (searchType.equals("Book ID")) {
            loadTableSa(rp.searchBookSa(keyword));
        } else if (searchType.equals("Authors")) {
            loadTableSa(rp.searchBookSa(keyword));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid search type selected!",
                        "Messenger", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (searchType.equals("Book Title")) {
            loadTableAn(rp.searchBookSa(keyword));
        } else if (searchType.equals("Book ID")) {
            loadTableAn(rp.searchBookSa(keyword));
        } else if (searchType.equals("Authors")) {
            loadTableAn(rp.searchBookSa(keyword));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid search type selected!",
                        "Messenger", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (searchType.equals("Book Title")) {
            loadTableNam(rp.searchBookSa(keyword));
        } else if (searchType.equals("Book ID")) {
            loadTableNam(rp.searchBookSa(keyword));
        } else if (searchType.equals("Authors")) {
            loadTableNam(rp.searchBookSa(keyword));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid search type selected!",
                        "Messenger", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblBangBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangBookMouseClicked
//        viewDetailBook detailBook = new viewDetailBook();
//        detailBook.setVisible(true);
    }//GEN-LAST:event_tblBangBookMouseClicked

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
            java.util.logging.Logger.getLogger(viewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddnew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbWelCome;
    private javax.swing.JTable tblBangBook;
    private javax.swing.JTextField txtEnterKeyword;
    // End of variables declaration//GEN-END:variables
}
