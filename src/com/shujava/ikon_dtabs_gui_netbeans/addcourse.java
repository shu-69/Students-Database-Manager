/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujava.ikon_dtabs_gui_netbeans;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author shubh
 */
public class addcourse extends javax.swing.JFrame {

    /**
     * Creates new form addcourse
     */
    static int size = 0;
    static String[] courselistarr = new String[100];

    public addcourse() {
        initComponents();
        Arrays.fill(courselistarr, " ");
        loadcourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        wrnlbl = new javax.swing.JLabel();
        coursename = new javax.swing.JTextField();
        dltbutt = new com.k33ptoo.components.KButton();
        closebutt = new com.k33ptoo.components.KButton();
        addbutt = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Add course");
        setMinimumSize(new java.awt.Dimension(668, 400));
        setPreferredSize(new java.awt.Dimension(668, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(2, 45, 145));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setText(" Course list : ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 30));

        jScrollPane1.setViewportView(list);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 230));

        wrnlbl.setBackground(new java.awt.Color(255, 255, 255));
        wrnlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        wrnlbl.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(wrnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 250, 20));

        coursename.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        coursename.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        coursename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                coursenameKeyPressed(evt);
            }
        });
        jPanel3.add(coursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 170, -1));

        dltbutt.setBorder(null);
        dltbutt.setText("Remove");
        dltbutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dltbutt.setkEndColor(new java.awt.Color(255, 255, 255));
        dltbutt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        dltbutt.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        dltbutt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        dltbutt.setkStartColor(new java.awt.Color(255, 51, 51));
        dltbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbuttActionPerformed(evt);
            }
        });
        jPanel3.add(dltbutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 30));

        closebutt.setBorder(null);
        closebutt.setText("Close");
        closebutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closebutt.setkEndColor(new java.awt.Color(255, 102, 102));
        closebutt.setkFillButton(false);
        closebutt.setkForeGround(new java.awt.Color(255, 0, 0));
        closebutt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        closebutt.setkHoverForeGround(new java.awt.Color(204, 0, 0));
        closebutt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        closebutt.setkStartColor(new java.awt.Color(204, 0, 0));
        closebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttActionPerformed(evt);
            }
        });
        jPanel3.add(closebutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 100, 30));

        addbutt.setBorder(null);
        addbutt.setText("Add");
        addbutt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbutt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        addbutt.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        addbutt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        addbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttActionPerformed(evt);
            }
        });
        jPanel3.add(addbutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Course name : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 90, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Warning : Do not use spaces in Course name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 250, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttActionPerformed
        String coursenm = coursename.getText();
        boolean check = false;
        for (int i = 0; i < coursenm.length(); i++) {
            if (coursenm.charAt(i) == ' ') {
                wrnlbl.setForeground(Color.red);
                wrnlbl.setText("Course name should not contain space");
                check = true;
            }
        }

        if (check == false) {
            courselistarr[size] = coursenm;
            size++;
            savecourses();
            loadcourses();
            wrnlbl.setForeground(Color.green);
            wrnlbl.setText("Course Added ..!");
        }
    }//GEN-LAST:event_addbuttActionPerformed

    private void dltbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbuttActionPerformed

        boolean check = false;

        if (list.isSelectionEmpty()) {
            wrnlbl.setForeground(Color.red);
            wrnlbl.setText("No Course selected, select a course from the list and try again.");
            check = true;
        }
        if (check == false) {
            int i = list.getSelectedIndex() + 1;
            for (int j = 0; j < courselistarr.length; j++) {
                if (j == courselistarr.length - 1) {
                    break;
                }
                if (j >= i) {
                    courselistarr[j] = courselistarr[j + 1];
                }
            }

            size--;
            savecourses();
            loadcourses();
            wrnlbl.setForeground(Color.red);
            wrnlbl.setText("Course Removed ..!");
        }

    }//GEN-LAST:event_dltbuttActionPerformed

    private void closebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttActionPerformed
        addcourse.this.hide();
    }//GEN-LAST:event_closebuttActionPerformed

    private void coursenameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursenameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            addcourse.this.hide();
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String coursenm = coursename.getText();
            boolean check = false;
            for (int i = 0; i < coursenm.length(); i++) {
                if (coursenm.charAt(i) == ' ') {
                    wrnlbl.setForeground(Color.red);
                    wrnlbl.setText("Course name should not contain space");
                    check = true;
                }
            }

            if (check == false) {
                courselistarr[size] = coursenm;
                size++;
                savecourses();
                loadcourses();
                wrnlbl.setForeground(Color.green);
                wrnlbl.setText("Course Added ..!");
            }
        }
    }//GEN-LAST:event_coursenameKeyPressed

    static public void loadcourses() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("courses.txt"));
            size = Integer.parseInt(br.readLine());
            br.close();
        } catch (Exception e) {
        }

        try {
            BufferedReader brr = new BufferedReader(new FileReader("courses.txt"));
            for (int i = 0; i < size; i++) {
                courselistarr[i] = brr.readLine();
            }
            brr.close();
        } catch (Exception e) {
        }

        // removing size of loop from 0th index
        String[] tempclist = new String[size];
        for (int i = 0; i < size; i++) {
            tempclist[i] = courselistarr[i + 1];
        }

        list.setListData(tempclist);

    }

    public void savecourses() {

        if (size > 100) {

        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt"));
            bw.write(size + "\n");
            for (int i = 1; i < size; i++) {
                bw.write(courselistarr[i] + "\n");
            }
            bw.close();
        } catch (IOException e) {
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
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton addbutt;
    private com.k33ptoo.components.KButton closebutt;
    private javax.swing.JTextField coursename;
    private com.k33ptoo.components.KButton dltbutt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> list;
    private javax.swing.JLabel wrnlbl;
    // End of variables declaration//GEN-END:variables
}
