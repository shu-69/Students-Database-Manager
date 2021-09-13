/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujava.ikon_dtabs_gui_netbeans;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.time.LocalDate.from;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author shubh
 */
public class rangesearch extends javax.swing.JFrame {

    /**
     * Creates new form rangesearch
     */
    public rangesearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        srclbl = new javax.swing.JLabel();
        fromtxt = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        totxt = new javax.swing.JTextField();
        closebutt = new com.k33ptoo.components.KButton();

        setTitle("Search in Range");

        jPanel3.setBackground(new java.awt.Color(2, 45, 145));
        jPanel3.setPreferredSize(new java.awt.Dimension(1330, 635));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Enter Registration No. ");

        srclbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        fromtxt.setBackground(new Color(0,0,0,0));
        fromtxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fromtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fromtxt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        fromtxt.setOpaque(false);
        fromtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromtxtActionPerformed(evt);
            }
        });
        fromtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromtxtKeyPressed(evt);
            }
        });

        kButton2.setBorder(null);
        kButton2.setText("Search");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(2, 45, 145));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(102, 102, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtarea.setRows(5);
        jScrollPane2.setViewportView(txtarea);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("from :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("to :");

        totxt.setBackground(new Color(0,0,0,0));
        totxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        totxt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        totxt.setOpaque(false);
        totxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totxtActionPerformed(evt);
            }
        });
        totxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totxtKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(srclbl, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(srclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(closebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totxtActionPerformed

    private void lesse4() {

        try {
            int check = 0;
            int from;
            from = Integer.parseInt(fromtxt.getText());
            //String newfrom = toString(from) ;
            int to;
            to = Integer.parseInt(totxt.getText());
            txtarea.setText("\n");
            for (int i = 0; i < students.a; i++) {
                if (Objects.equals(String.valueOf(from), students.roll[i])) {
                    if (from <= to) {
                        srclbl.setForeground(Color.green);
                        srclbl.setText("Match Found");
                        txtarea.append("  Name              : " + students.name[i] + "\n"
                                + ("  Fathers Name      : " + students.fname[i] + "\n")
                                + ("  Registration No.  : " + students.roll[i] + "\n")
                                + ("  Contact No.       : " + students.phno[i] + "\n")
                                + ("  DOB               : " + students.dob[i] + "\n")
                                + ("  Gender            : " + students.gender[i] + "\n")
                                + ("  Category          : " + students.category[i] + "\n")
                                + ("  Address           : " + students.address[i] + "\n")
                                + ("  Courses           : " + students.course[i] + "\n")
                                + ("  Course Fee        : " + students.fee[i] + "\n")
                                + ("  Fee Paid          : " + students.paid[i] + "\n")
                                + ("  Fee Dues          : " + students.dues[i] + "\n")
                                + ("  Date of Admission : " + students.dateofaddmission[i] + "\n")
                                + "  Course Duration   : " + students.duration[i] + "\n"
                                + "  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------"
                                + "\n");
                        check = 1;
                        from++;
                        i = 0;
                    } else {
                        break;
                    }
                }

            }
            if (check == 0) {
                srclbl.setForeground(Color.red);
                srclbl.setText("Reg No. did't match to our database");
            }

        } catch (NumberFormatException e) {
            srclbl.setForeground(Color.red);
            srclbl.setText("Integer values only");
        }

    }

    private void greate4() {

        try {
            txtarea.setText("\n");
            int check = 0;
            String strfrom = fromtxt.getText();
            String from = "";
            for (int i = strfrom.length() - 1; i >= strfrom.length() - 3; i--) {
                from += strfrom.charAt(i);
            }
            strfrom = strfrom.substring(0, strfrom.length() - 3);
            StringBuffer tempfrom = new StringBuffer(from);
            tempfrom = tempfrom.reverse();
            from = new String(tempfrom);
            int intfrom = Integer.parseInt(from);
            String strto = totxt.getText();
            String to = "";
            for (int i = strto.length() - 1; i >= strto.length() - 3; i--) {
                to += strto.charAt(i);
            }
            StringBuffer tempto = new StringBuffer(to);
            tempto = tempto.reverse();
            to = new String(tempto);
            int intto = Integer.parseInt(to);
            for (int i = 0; i < students.a; i++) {
                if (Objects.equals(strfrom + String.valueOf(intfrom), students.roll[i])) {
                    if (intfrom <= intto) {
                        srclbl.setForeground(Color.green);
                        srclbl.setText("Match Found");
                        txtarea.append("  Name              : " + students.name[i] + "\n"
                                + ("  Father's Name     : " + students.fname[i] + "\n")
                                + ("  Registration No.  : " + students.roll[i] + "\n")
                                + ("  Contact No.       : " + students.phno[i] + "\n")
                                + ("  DOB               : " + students.dob[i] + "\n")
                                + ("  Gender            : " + students.gender[i] + "\n")
                                + ("  Category          : " + students.category[i] + "\n")
                                + ("  Address           : " + students.address[i] + "\n")
                                + ("  Courses           : " + students.course[i] + "\n")
                                + ("  Course Fee        : " + students.fee[i] + "\n")
                                + ("  Fee Paid          : " + students.paid[i] + "\n")
                                + ("  Fee Dues          : " + students.dues[i] + "\n")
                                + ("  Date of Admission : " + students.dateofaddmission[i] + "\n")
                                + "  Course Duration   : " + students.duration[i] + "\n"
                                + "  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------"
                                + "\n");
                        check = 1;
                        intfrom++;
                        i = 0;
                    } else {
                        break;
                    }

                }
            }
            if (check == 0) {
                srclbl.setForeground(Color.red);
                srclbl.setText("Reg No. did't match to our database");
            }
        } catch (NumberFormatException e) {
            srclbl.setForeground(Color.red);
            srclbl.setText("Please check your values");
        }

    }
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        if (fromtxt.getText().length() > totxt.getText().length()) {
            srclbl.setForeground(Color.red);
            srclbl.setText("Please check your values");
        } else if (fromtxt.getText().length() <= 4 && totxt.getText().length() <= 4) {
            lesse4();
        } else if (fromtxt.getText().length() > 4 && totxt.getText().length() > 4) {
            greate4();
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    private void fromtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromtxtActionPerformed

    private void closebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttActionPerformed
        rangesearch.this.hide();
    }//GEN-LAST:event_closebuttActionPerformed

    private void totxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (fromtxt.getText().length() > totxt.getText().length()) {
                srclbl.setForeground(Color.red);
                srclbl.setText("Please check your values");
            } else if (fromtxt.getText().length() <= 4 && totxt.getText().length() <= 4) {
                lesse4();
            } else if (fromtxt.getText().length() > 4 && totxt.getText().length() > 4) {
                greate4();
            }
        }
    }//GEN-LAST:event_totxtKeyPressed

    private void fromtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromtxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            rangesearch.this.hide();
        }
    }//GEN-LAST:event_fromtxtKeyPressed

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
            java.util.logging.Logger.getLogger(rangesearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rangesearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rangesearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rangesearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rangesearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton closebutt;
    public static javax.swing.JTextField fromtxt;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KButton kButton2;
    public static javax.swing.JLabel srclbl;
    public static javax.swing.JTextField totxt;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
