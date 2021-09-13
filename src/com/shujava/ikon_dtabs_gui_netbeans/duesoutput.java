/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujava.ikon_dtabs_gui_netbeans;

import com.shujava.ikon_dtabs_gui_netbeans.showdues;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author shubh
 */
public class duesoutput extends javax.swing.JFrame {

    /**
     * Creates new form duesoutput
     */
    public duesoutput() {
        initComponents();
        showdue();
    }

    public void showdue() {

        String duesstr = "";
        int duesint = 0;
        int duesvalue = showdues.duesvalue;

        txtarea.setText("\n");
        int check = 0;
        try {
            for (int i = 0; i < students.a; i++) {
                if (!(Objects.equals(students.dues[i], "null"))) {
                    for (int j = 0; j < students.dues[i].length(); j++) {
                        if (students.dues[i].charAt(j) == ' ' || students.dues[i].charAt(j) == '|' || students.dues[i].charAt(j) == '-') {
                            duesstr = "";
                            if (duesint >= duesvalue) {
                                txtarea.append("  Name              : " + students.name[i] + "\n"
                                        + ("  Fathers Name      : " + students.fname[i] + "\n")
                                        + ("  Registration No.  : " + students.roll[i] + "\n")
                                        + ("  Contact No.       : " + students.phno[i] + "\n")
                                        //+ ("  DOB               : " + students.dob[i] + "\n")
                                        //+ ("  Gender            : " + students.gender[i] + "\n")
                                        //+ ("  Category          : " + students.category[i] + "\n")
                                        //+ ("  Address           : " + students.address[i] + "\n")
                                        + ("  Courses           : " + students.course[i] + "\n")
                                        + ("  Course Fee        : " + students.fee[i] + "\n")
                                        + ("  Fee Paid          : " + students.paid[i] + "\n")
                                        + ("  Fee Dues          : " + students.dues[i] + "\n")
                                        + ("  Date of Admission : " + students.dateofaddmission[i] + "\n")
                                        + "  Course Duration   : " + students.duration[i] + "\n"
                                        + "  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------"
                                        + "\n");
                                check = 1;
                                j = students.a;
                            }
                        } else {
                            duesstr += students.dues[i].charAt(j);
                            duesint = Integer.parseInt(duesstr);
                        }
                    }

                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Exception found");
        }

        if (check == 0) {
            txtarea.append("No dues Found ...!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        closebutt = new com.k33ptoo.components.KButton();

        setTitle("Dues output");

        jPanel1.setBackground(new java.awt.Color(2, 45, 145));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtarea.setRows(5);
        jScrollPane2.setViewportView(txtarea);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Dueses are shown below :");

        closebutt.setBorder(null);
        closebutt.setText("Close");
        closebutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closebutt.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        closebutt.setkEndColor(new java.awt.Color(255, 51, 51));
        closebutt.setkFillButton(false);
        closebutt.setkForeGround(new java.awt.Color(255, 102, 102));
        closebutt.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        closebutt.setkHoverStartColor(new java.awt.Color(204, 0, 0));
        closebutt.setkStartColor(new java.awt.Color(204, 0, 0));
        closebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(633, 633, 633)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(605, 605, 605))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2)))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttActionPerformed
        duesoutput.this.hide();
    }//GEN-LAST:event_closebuttActionPerformed

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
            java.util.logging.Logger.getLogger(duesoutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(duesoutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(duesoutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(duesoutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new duesoutput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton closebutt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
