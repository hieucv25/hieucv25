/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btvnb1;

import Sevices.SinhVien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class ViewSinhVien extends javax.swing.JFrame {

    private DefaultTableModel tbmodel;
    private List<SinhVien> listSV;

    /**
     * Creates new form ViewSinhVien
     */
    public ViewSinhVien() {
        initComponents();
        setLocationRelativeTo(null);
        listSV = new ArrayList<>();
        jTable1.setModel(tbmodel = new DefaultTableModel());
        String title[] = {"Name", "Age", "Gender", "Department", "Favorite"};
        tbmodel.setColumnIdentifiers(title);
        loadData();
        fillData(2);
        showData(listSV);
        //test sourcetree

    }

    public void loadData() {
        listSV.add(new SinhVien("Hieu", 20, true, "JS", "Do ABC"));
        listSV.add(new SinhVien("Hieu2", 20, false, "JS", "Sport,Music"));
        listSV.add(new SinhVien("Hieu3", 20, false, "SE", "Music"));
        listSV.add(new SinhVien("Hieu4", 20, true, "EE", "Sport,Music,Do ABC"));
        listSV.add(new SinhVien("Hieu5", 20, true, "SE", "Do ABC"));
    }

    public void fillData(int index) {
        SinhVien sv = listSV.get(index);
        txtName.setText(sv.getName());
        txtAge.setText(String.valueOf(sv.getAge()));
        if (sv.isGender() == true) {
            rb1.setSelected(true);
            rb2.setSelected(false);
        } else {
            rb1.setSelected(false);
            rb2.setSelected(true);
        }
        cbbDepart.setSelectedItem(sv.getDepartment());
        if (sv.getFavourite().equalsIgnoreCase("Music")) {
            cb2.setSelected(true);
            cb1.setSelected(false);
            cb3.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Sport")) {
            cb1.setSelected(true);
            cb2.setSelected(false);
            cb3.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Do ABC")) {
            cb3.setSelected(true);
            cb2.setSelected(false);
            cb1.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Sport,Music")) {
            cb2.setSelected(true);
            cb1.setSelected(true);
            cb3.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Sport,Do ABC")) {
            cb3.setSelected(true);
            cb1.setSelected(true);
            cb2.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Music,Do ABC")) {
            cb3.setSelected(true);
            cb2.setSelected(true);
            cb1.setSelected(false);
        } else if (sv.getFavourite().equalsIgnoreCase("Sport,Music,Do ABC")) {
            cb3.setSelected(true);
            cb2.setSelected(true);
            cb1.setSelected(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        cbbDepart = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        btAdd = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        jLabel4.setText("Department");

        jLabel5.setText("Favourite");

        buttonGroup1.add(rb1);
        rb1.setText("Male");

        buttonGroup1.add(rb2);
        rb2.setText("Female");

        cbbDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "JS", "EE", " " }));

        cb1.setText("Sport");

        cb2.setText("Music");

        cb3.setText("Do ABC");

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Student List");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Information");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btExit)
                                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btAdd)
                        .addGap(71, 71, 71)
                        .addComponent(btClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btClear)
                    .addComponent(btExit))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtAge.setText("");
        buttonGroup1.clearSelection();
        cbbDepart.setSelectedIndex(0);
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
    }//GEN-LAST:event_btClearActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String age = txtAge.getText();
        boolean isGender = rb1.isSelected();
        String depart = (String) cbbDepart.getSelectedItem();
        String fav = "";
        if (isGender == true) {
            rb1.setSelected(true);
            rb2.setSelected(false);
        } else {
            rb2.setSelected(true);
            rb1.setSelected(false);
        }
        if (cb1.isSelected()&&cb2.isSelected()==false && cb3.isSelected()==false) {
            fav += "Sport";
        }
        if (cb2.isSelected()&&cb1.isSelected()==false && cb3.isSelected()==false) {
            fav += "Music";
        }
        if (cb3.isSelected()&&cb1.isSelected()==false && cb2.isSelected()==false) {
            fav += "Do ABC";
        }
        if (cb1.isSelected() && cb2.isSelected() && cb3.isSelected()==false) {
            fav += "Sport,Music";
        }
        if (cb1.isSelected() && cb3.isSelected() && cb2.isSelected()==false) {
            fav += "Sport,Do ABC";
        }
        if (cb2.isSelected() && cb3.isSelected() && cb1.isSelected()==false) {
            fav += "Music,Do ABC";
        }
        if (cb1.isSelected() && cb2.isSelected() && cb3.isSelected()) {
            fav += "Sport,Music,Do ABC";
        }
        SinhVien sv = new SinhVien(name, Integer.valueOf(age), isGender, depart, fav);
        listSV.add(sv);
        showData(listSV);
    }//GEN-LAST:event_btAddActionPerformed
    public void showData(List<SinhVien> list) {
        tbmodel.setRowCount(0);
        for (SinhVien sv : list) {
            tbmodel.addRow(sv.toDataRow());
        }
    }

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
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JComboBox<String> cbbDepart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
