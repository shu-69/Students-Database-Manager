/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujava.ikon_dtabs_gui_netbeans;

import static com.shujava.ikon_dtabs_gui_netbeans.students.a;
import static com.shujava.ikon_dtabs_gui_netbeans.students.name;
import static com.shujava.ikon_dtabs_gui_netbeans.students.roll;
import static com.shujava.ikon_dtabs_gui_netbeans.students.sc;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author shubh
 */
public class inputstudentsfrm extends javax.swing.JFrame {

    static String gender;
    static String category;
    static boolean pass;
    static String courses;
    static String fee;
    static String paid;
    static String dues;
    static String dateofadd = "";
    static String cduration = "";

    public inputstudentsfrm() {
        initComponents();
        modifyinitcomponents();
        loadcourses();
    }

    public void inputfrm(int i) {
        students.name[i] = stuName.getText();
        students.fname[i] = fName.getText();
        students.roll[i] = regNo.getText();
        students.phno[i] = cCode.getText() + " " + phNo.getText();
        students.dob[i] = dobDD.getText() + "/" + dobMM.getText() + "/" + dobYYYY.getText() ;
        students.gender[i] = gender;
        students.category[i] = category;
        students.address[i] = address.getText();
        students.ispass[i] = pass;
        students.course[i] = courses;
        students.fee[i] = fee;
        students.paid[i] = paid;
        students.dues[i] = dues;
        students.dateofaddmission[i] = dateofadd;
        students.duration[i] = cduration;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        paid6 = new javax.swing.JTextField();
        fee6 = new javax.swing.JTextField();
        course6 = new javax.swing.JComboBox<>();
        course7 = new javax.swing.JComboBox<>();
        fee7 = new javax.swing.JTextField();
        paid7 = new javax.swing.JTextField();
        course8 = new javax.swing.JComboBox<>();
        fee8 = new javax.swing.JTextField();
        paid8 = new javax.swing.JTextField();
        paid9 = new javax.swing.JTextField();
        fee9 = new javax.swing.JTextField();
        course9 = new javax.swing.JComboBox<>();
        course10 = new javax.swing.JComboBox<>();
        fee10 = new javax.swing.JTextField();
        paid10 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        d6DD = new javax.swing.JTextField();
        duration6 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        d6MM = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        d6YYYY = new javax.swing.JTextField();
        d7DD = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        d7MM = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        d7YYYY = new javax.swing.JTextField();
        d8DD = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        d8MM = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        d8YYYY = new javax.swing.JTextField();
        d9DD = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        d9MM = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        d9YYYY = new javax.swing.JTextField();
        d10DD = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        d10MM = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        d10YYYY = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        duration10 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        duration9 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        duration8 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        duration7 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        stuName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dobYYYY = new javax.swing.JTextField();
        cCode = new javax.swing.JTextField();
        dobDD = new javax.swing.JTextField();
        dobMM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fee4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        genderF = new javax.swing.JRadioButton();
        genderM = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        catMah = new javax.swing.JCheckBox();
        catGen = new javax.swing.JCheckBox();
        catSc = new javax.swing.JCheckBox();
        catSt = new javax.swing.JCheckBox();
        catObc = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        course4 = new javax.swing.JComboBox<>();
        course1 = new javax.swing.JComboBox<>();
        course2 = new javax.swing.JComboBox<>();
        course3 = new javax.swing.JComboBox<>();
        address = new javax.swing.JTextField();
        fee1 = new javax.swing.JTextField();
        fee2 = new javax.swing.JTextField();
        fee3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        duration1 = new javax.swing.JTextField();
        paid2 = new javax.swing.JTextField();
        paid3 = new javax.swing.JTextField();
        paid4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        course5 = new javax.swing.JComboBox<>();
        fee5 = new javax.swing.JTextField();
        paid5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        d1MM = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        d1YYYY = new javax.swing.JTextField();
        d1DD = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        d2DD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        d2MM = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        d2YYYY = new javax.swing.JTextField();
        d3DD = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        d3MM = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        d3YYYY = new javax.swing.JTextField();
        d4DD = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        d4MM = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        d4YYYY = new javax.swing.JTextField();
        d5DD = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        d5MM = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        d5YYYY = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        paid1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        duration2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        duration3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        duration4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        duration5 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        phNo = new javax.swing.JTextField();
        resetButt = new com.k33ptoo.components.KButton();
        saveButt = new com.k33ptoo.components.KButton();
        closeButt = new com.k33ptoo.components.KButton();
        jLabel39 = new javax.swing.JLabel();
        regconerr = new javax.swing.JLabel();
        paiderr = new javax.swing.JLabel();
        errlbl1 = new javax.swing.JLabel();
        errlbl2 = new javax.swing.JLabel();
        errlbl4 = new javax.swing.JLabel();
        regerr = new javax.swing.JLabel();
        durationerr = new javax.swing.JLabel();
        caterr = new javax.swing.JLabel();
        doadderr = new javax.swing.JLabel();
        pherr = new javax.swing.JLabel();
        feeerr = new javax.swing.JLabel();
        doberr = new javax.swing.JLabel();
        gendererr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pssout = new javax.swing.JCheckBox();

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("Select Course          :");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Course Fee               :");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Fee Paid                   :");

        paid6.setBackground(new Color (0,0,0,0));
        paid6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid6.setToolTipText("");
        paid6.setActionCommand("<Not Set>");
        paid6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid6.setOpaque(false);

        fee6.setBackground(new Color (0,0,0,0));
        fee6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee6.setToolTipText("");
        fee6.setActionCommand("<Not Set>");
        fee6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee6.setOpaque(false);

        course6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 6", " ", "Item 1", "Item 2", "Item 3", "Item 4" }));

        course7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 7", "Item 1", "Item 2", "Item 3", "Item 4" }));

        fee7.setBackground(new Color (0,0,0,0));
        fee7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee7.setToolTipText("");
        fee7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee7.setOpaque(false);

        paid7.setBackground(new Color (0,0,0,0));
        paid7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid7.setToolTipText("");
        paid7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid7.setOpaque(false);

        course8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 8", "Item 1", "Item 2", "Item 3", "Item 4" }));

        fee8.setBackground(new Color (0,0,0,0));
        fee8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee8.setToolTipText("");
        fee8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee8.setOpaque(false);

        paid8.setBackground(new Color (0,0,0,0));
        paid8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid8.setToolTipText("");
        paid8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid8.setOpaque(false);

        paid9.setBackground(new Color (0,0,0,0));
        paid9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid9.setToolTipText("");
        paid9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid9.setOpaque(false);

        fee9.setBackground(new Color (0,0,0,0));
        fee9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee9.setToolTipText("");
        fee9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee9.setOpaque(false);

        course9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 9", "Item 1", "Item 2", "Item 3", "Item 4" }));

        course10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 10", "Item 1", "Item 2", "Item 3", "Item 4" }));

        fee10.setBackground(new Color (0,0,0,0));
        fee10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee10.setToolTipText("");
        fee10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee10.setOpaque(false);

        paid10.setBackground(new Color (0,0,0,0));
        paid10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid10.setToolTipText("");
        paid10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid10.setOpaque(false);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setText("Date of Admission :");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setText("Course Duration     :");

        d6DD.setBackground(new Color (0,0,0,0));
        d6DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d6DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d6DD.setOpaque(false);

        duration6.setBackground(new Color (0,0,0,0));
        duration6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration6.setToolTipText("");
        duration6.setActionCommand("<Not Set>");
        duration6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration6.setOpaque(false);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText(" /");

        d6MM.setBackground(new Color (0,0,0,0));
        d6MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d6MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d6MM.setOpaque(false);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText(" /");

        d6YYYY.setBackground(new Color (0,0,0,0));
        d6YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d6YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d6YYYY.setOpaque(false);

        d7DD.setBackground(new Color (0,0,0,0));
        d7DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d7DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d7DD.setOpaque(false);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText(" /");

        d7MM.setBackground(new Color (0,0,0,0));
        d7MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d7MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d7MM.setOpaque(false);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText(" /");

        d7YYYY.setBackground(new Color (0,0,0,0));
        d7YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d7YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d7YYYY.setOpaque(false);

        d8DD.setBackground(new Color (0,0,0,0));
        d8DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d8DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d8DD.setOpaque(false);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText(" /");

        d8MM.setBackground(new Color (0,0,0,0));
        d8MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d8MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d8MM.setOpaque(false);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText(" /");

        d8YYYY.setBackground(new Color (0,0,0,0));
        d8YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d8YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d8YYYY.setOpaque(false);

        d9DD.setBackground(new Color (0,0,0,0));
        d9DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d9DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d9DD.setOpaque(false);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText(" /");

        d9MM.setBackground(new Color (0,0,0,0));
        d9MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d9MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d9MM.setOpaque(false);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText(" /");

        d9YYYY.setBackground(new Color (0,0,0,0));
        d9YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d9YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d9YYYY.setOpaque(false);

        d10DD.setBackground(new Color (0,0,0,0));
        d10DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d10DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d10DD.setOpaque(false);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText(" /");

        d10MM.setBackground(new Color (0,0,0,0));
        d10MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d10MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d10MM.setOpaque(false);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText(" /");

        d10YYYY.setBackground(new Color (0,0,0,0));
        d10YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d10YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d10YYYY.setOpaque(false);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setText("  months");

        duration10.setBackground(new Color (0,0,0,0));
        duration10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration10.setToolTipText("");
        duration10.setActionCommand("<Not Set>");
        duration10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration10.setOpaque(false);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setText("  months");

        duration9.setBackground(new Color (0,0,0,0));
        duration9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration9.setToolTipText("");
        duration9.setActionCommand("<Not Set>");
        duration9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration9.setOpaque(false);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setText("  months");

        duration8.setBackground(new Color (0,0,0,0));
        duration8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration8.setToolTipText("");
        duration8.setActionCommand("<Not Set>");
        duration8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration8.setOpaque(false);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setText("  months");

        duration7.setBackground(new Color (0,0,0,0));
        duration7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration7.setToolTipText("");
        duration7.setActionCommand("<Not Set>");
        duration7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration7.setOpaque(false);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel59.setText("  months");

        kButton1.setText("Done");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        setTitle("New Student input");
        setBackground(new java.awt.Color(2, 54, 145));
        setLocation(new java.awt.Point(200, 40));
        setMinimumSize(new java.awt.Dimension(1115, 733));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 45, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stuName.setBackground(new Color (0,0,0,0));
        stuName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stuName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        stuName.setOpaque(false);
        stuName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stuNameKeyPressed(evt);
            }
        });
        jPanel2.add(stuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 380, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Father's Name         :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        fName.setBackground(new Color (0,0,0,0));
        fName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        fName.setOpaque(false);
        jPanel2.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 380, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Registration No.     :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));

        regNo.setBackground(new Color (0,0,0,0));
        regNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        regNo.setOpaque(false);
        jPanel2.add(regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 210, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText(" /");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 20, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Contact No.             :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 30));

        dobYYYY.setBackground(new Color (0,0,0,0));
        dobYYYY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dobYYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        dobYYYY.setOpaque(false);
        dobYYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobYYYYActionPerformed(evt);
            }
        });
        jPanel2.add(dobYYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 60, 30));

        cCode.setBackground(new Color (0,0,0,0));
        cCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cCode.setText("+91");
        cCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        cCode.setOpaque(false);
        jPanel2.add(cCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 30));

        dobDD.setBackground(new Color (0,0,0,0));
        dobDD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dobDD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        dobDD.setOpaque(false);
        jPanel2.add(dobDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, 30));

        dobMM.setBackground(new Color (0,0,0,0));
        dobMM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dobMM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        dobMM.setOpaque(false);
        jPanel2.add(dobMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Category                  :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText(" /");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 20, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("  months");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 80, 30));

        fee4.setBackground(new Color (0,0,0,0));
        fee4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fee4.setToolTipText("");
        fee4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee4.setOpaque(false);
        fee4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee4ActionPerformed(evt);
            }
        });
        jPanel2.add(fee4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 110, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Date of Birth           : ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 30));

        buttonGroup1.add(genderF);
        genderF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderF.setText(" Female");
        genderF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFActionPerformed(evt);
            }
        });
        jPanel2.add(genderF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 100, -1));

        buttonGroup1.add(genderM);
        genderM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderM.setText(" Male");
        genderM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderMActionPerformed(evt);
            }
        });
        jPanel2.add(genderM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Gender                     :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 30));

        buttonGroup2.add(catMah);
        catMah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catMah.setText(" Mahadalit");
        catMah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catMahActionPerformed(evt);
            }
        });
        jPanel2.add(catMah, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        buttonGroup2.add(catGen);
        catGen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catGen.setText(" General");
        catGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catGenActionPerformed(evt);
            }
        });
        jPanel2.add(catGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        buttonGroup2.add(catSc);
        catSc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catSc.setText(" SC");
        catSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catScActionPerformed(evt);
            }
        });
        jPanel2.add(catSc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        buttonGroup2.add(catSt);
        catSt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catSt.setText(" ST");
        catSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catStActionPerformed(evt);
            }
        });
        jPanel2.add(catSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        buttonGroup2.add(catObc);
        catObc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catObc.setText(" OBC");
        catObc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catObcActionPerformed(evt);
            }
        });
        jPanel2.add(catObc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText(" Address                   :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 190, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Select Course          :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 190, 30));

        course4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 4" }));
        course4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course4ActionPerformed(evt);
            }
        });
        jPanel2.add(course4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 110, -1));

        course1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 1" }));
        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });
        jPanel2.add(course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 110, -1));

        course2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 2" }));
        course2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course2ActionPerformed(evt);
            }
        });
        jPanel2.add(course2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 110, -1));

        course3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 3" }));
        course3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course3ActionPerformed(evt);
            }
        });
        jPanel2.add(course3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 110, -1));

        address.setBackground(new Color (0,0,0,0));
        address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        address.setOpaque(false);
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 670, 30));

        fee1.setBackground(new Color (0,0,0,0));
        fee1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fee1.setToolTipText("");
        fee1.setActionCommand("<Not Set>");
        fee1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee1.setOpaque(false);
        fee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee1ActionPerformed(evt);
            }
        });
        jPanel2.add(fee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 110, 30));

        fee2.setBackground(new Color (0,0,0,0));
        fee2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fee2.setToolTipText("");
        fee2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee2.setOpaque(false);
        fee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee2ActionPerformed(evt);
            }
        });
        jPanel2.add(fee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 110, 30));

        fee3.setBackground(new Color (0,0,0,0));
        fee3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fee3.setToolTipText("");
        fee3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee3.setOpaque(false);
        fee3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee3ActionPerformed(evt);
            }
        });
        jPanel2.add(fee3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 110, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Course Fee               :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 190, 30));

        duration1.setBackground(new Color (0,0,0,0));
        duration1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration1.setToolTipText("");
        duration1.setActionCommand("<Not Set>");
        duration1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration1.setOpaque(false);
        duration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration1ActionPerformed(evt);
            }
        });
        jPanel2.add(duration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 30, 30));

        paid2.setBackground(new Color (0,0,0,0));
        paid2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid2.setToolTipText("");
        paid2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid2.setOpaque(false);
        paid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid2ActionPerformed(evt);
            }
        });
        jPanel2.add(paid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 110, 30));

        paid3.setBackground(new Color (0,0,0,0));
        paid3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid3.setToolTipText("");
        paid3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid3.setOpaque(false);
        paid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid3ActionPerformed(evt);
            }
        });
        jPanel2.add(paid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 110, 30));

        paid4.setBackground(new Color (0,0,0,0));
        paid4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid4.setToolTipText("");
        paid4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid4.setOpaque(false);
        paid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid4ActionPerformed(evt);
            }
        });
        jPanel2.add(paid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 110, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Name of Student    : ");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 190, 30));

        course5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 5" }));
        course5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course5ActionPerformed(evt);
            }
        });
        jPanel2.add(course5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 110, -1));

        fee5.setBackground(new Color (0,0,0,0));
        fee5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fee5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fee5.setToolTipText("");
        fee5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fee5.setOpaque(false);
        fee5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee5ActionPerformed(evt);
            }
        });
        jPanel2.add(fee5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 110, 30));

        paid5.setBackground(new Color (0,0,0,0));
        paid5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid5.setToolTipText("");
        paid5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid5.setOpaque(false);
        paid5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid5ActionPerformed(evt);
            }
        });
        jPanel2.add(paid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 110, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Fee Paid                   :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 190, 30));

        d1MM.setBackground(new Color (0,0,0,0));
        d1MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d1MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d1MM.setOpaque(false);
        d1MM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1MMActionPerformed(evt);
            }
        });
        jPanel2.add(d1MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 568, 20, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText(" /");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 20, 40));

        d1YYYY.setBackground(new Color (0,0,0,0));
        d1YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d1YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d1YYYY.setOpaque(false);
        d1YYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1YYYYActionPerformed(evt);
            }
        });
        jPanel2.add(d1YYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 568, 50, -1));

        d1DD.setBackground(new Color (0,0,0,0));
        d1DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d1DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d1DD.setOpaque(false);
        d1DD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1DDActionPerformed(evt);
            }
        });
        jPanel2.add(d1DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 568, 20, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText(" /");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 20, 40));

        d2DD.setBackground(new Color (0,0,0,0));
        d2DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d2DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d2DD.setOpaque(false);
        jPanel2.add(d2DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 568, 20, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(" /");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 20, 40));

        d2MM.setBackground(new Color (0,0,0,0));
        d2MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d2MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d2MM.setOpaque(false);
        d2MM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2MMActionPerformed(evt);
            }
        });
        jPanel2.add(d2MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 568, 20, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText(" /");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 20, 40));

        d2YYYY.setBackground(new Color (0,0,0,0));
        d2YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d2YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d2YYYY.setOpaque(false);
        d2YYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2YYYYActionPerformed(evt);
            }
        });
        jPanel2.add(d2YYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 568, 50, -1));

        d3DD.setBackground(new Color (0,0,0,0));
        d3DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d3DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d3DD.setOpaque(false);
        jPanel2.add(d3DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 568, 20, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText(" /");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 20, 40));

        d3MM.setBackground(new Color (0,0,0,0));
        d3MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d3MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d3MM.setOpaque(false);
        d3MM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3MMActionPerformed(evt);
            }
        });
        jPanel2.add(d3MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 568, 20, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText(" /");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 20, 40));

        d3YYYY.setBackground(new Color (0,0,0,0));
        d3YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d3YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d3YYYY.setOpaque(false);
        d3YYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3YYYYActionPerformed(evt);
            }
        });
        jPanel2.add(d3YYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 568, 50, -1));

        d4DD.setBackground(new Color (0,0,0,0));
        d4DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d4DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d4DD.setOpaque(false);
        jPanel2.add(d4DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 568, 20, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(" /");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 20, 40));

        d4MM.setBackground(new Color (0,0,0,0));
        d4MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d4MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d4MM.setOpaque(false);
        d4MM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4MMActionPerformed(evt);
            }
        });
        jPanel2.add(d4MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 568, 20, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText(" /");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 20, 40));

        d4YYYY.setBackground(new Color (0,0,0,0));
        d4YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d4YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d4YYYY.setOpaque(false);
        d4YYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4YYYYActionPerformed(evt);
            }
        });
        jPanel2.add(d4YYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 568, 50, -1));

        d5DD.setBackground(new Color (0,0,0,0));
        d5DD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d5DD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d5DD.setOpaque(false);
        jPanel2.add(d5DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 568, 20, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText(" /");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 20, 40));

        d5MM.setBackground(new Color (0,0,0,0));
        d5MM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d5MM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d5MM.setOpaque(false);
        d5MM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5MMActionPerformed(evt);
            }
        });
        jPanel2.add(d5MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 568, 20, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText(" /");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 20, 40));

        d5YYYY.setBackground(new Color (0,0,0,0));
        d5YYYY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d5YYYY.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        d5YYYY.setOpaque(false);
        d5YYYY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5YYYYActionPerformed(evt);
            }
        });
        jPanel2.add(d5YYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 568, 50, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Date of Admission :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 190, 40));

        paid1.setBackground(new Color (0,0,0,0));
        paid1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid1.setToolTipText("");
        paid1.setActionCommand("<Not Set>");
        paid1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        paid1.setOpaque(false);
        paid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid1ActionPerformed(evt);
            }
        });
        jPanel2.add(paid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 110, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Course Duration     :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 190, 30));

        duration2.setBackground(new Color (0,0,0,0));
        duration2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration2.setToolTipText("");
        duration2.setActionCommand("<Not Set>");
        duration2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration2.setOpaque(false);
        duration2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration2ActionPerformed(evt);
            }
        });
        jPanel2.add(duration2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 30, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("  months");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 80, 30));

        duration3.setBackground(new Color (0,0,0,0));
        duration3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration3.setToolTipText("");
        duration3.setActionCommand("<Not Set>");
        duration3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration3.setOpaque(false);
        duration3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration3ActionPerformed(evt);
            }
        });
        jPanel2.add(duration3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 30, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("  months");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 80, 30));

        duration4.setBackground(new Color (0,0,0,0));
        duration4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration4.setToolTipText("");
        duration4.setActionCommand("<Not Set>");
        duration4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration4.setOpaque(false);
        duration4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration4ActionPerformed(evt);
            }
        });
        jPanel2.add(duration4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 30, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setText("  months");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 80, 30));

        duration5.setBackground(new Color (0,0,0,0));
        duration5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        duration5.setToolTipText("");
        duration5.setActionCommand("<Not Set>");
        duration5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        duration5.setOpaque(false);
        duration5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration5ActionPerformed(evt);
            }
        });
        jPanel2.add(duration5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 30, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setText("  months");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, 80, 30));

        phNo.setBackground(new Color (0,0,0,0));
        phNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        phNo.setOpaque(false);
        jPanel2.add(phNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 170, 30));

        resetButt.setBorder(null);
        resetButt.setText("Reset");
        resetButt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        resetButt.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        resetButt.setkEndColor(new java.awt.Color(255, 0, 0));
        resetButt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        resetButt.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        resetButt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        resetButt.setkStartColor(new java.awt.Color(255, 153, 153));
        resetButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtActionPerformed(evt);
            }
        });
        jPanel2.add(resetButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 80, 30));

        saveButt.setBorder(null);
        saveButt.setText("Save");
        saveButt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        saveButt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        saveButt.setkHoverForeGround(new java.awt.Color(51, 255, 51));
        saveButt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        saveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtActionPerformed(evt);
            }
        });
        jPanel2.add(saveButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 170, 30));

        closeButt.setBorder(null);
        closeButt.setText("Close");
        closeButt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        closeButt.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        closeButt.setkEndColor(new java.awt.Color(255, 0, 0));
        closeButt.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        closeButt.setkHoverForeGround(new java.awt.Color(255, 51, 51));
        closeButt.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        closeButt.setkStartColor(new java.awt.Color(255, 102, 102));
        closeButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtMouseClicked(evt);
            }
        });
        closeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtActionPerformed(evt);
            }
        });
        jPanel2.add(closeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 80, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setText("Please fill out the details given below :");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 360, 30));

        regconerr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regconerr.setForeground(new java.awt.Color(204, 0, 0));
        regconerr.setText("Reg No. Conflict, try another...!");
        jPanel2.add(regconerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 360, 30));

        paiderr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paiderr.setForeground(new java.awt.Color(204, 0, 0));
        paiderr.setText("*");
        jPanel2.add(paiderr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 10, 20));

        errlbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errlbl1.setForeground(new java.awt.Color(204, 0, 0));
        errlbl1.setText("Please resolve the errors !");
        jPanel2.add(errlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 170, 30));

        errlbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errlbl2.setForeground(new java.awt.Color(204, 0, 0));
        errlbl2.setText("Fileds contains error are ");
        jPanel2.add(errlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 170, 30));

        errlbl4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errlbl4.setForeground(new java.awt.Color(204, 0, 0));
        errlbl4.setText("marked with * .");
        jPanel2.add(errlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 170, 40));

        regerr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regerr.setForeground(new java.awt.Color(204, 0, 0));
        regerr.setText("*");
        jPanel2.add(regerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 10, 20));

        durationerr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        durationerr.setForeground(new java.awt.Color(204, 0, 0));
        durationerr.setText("*");
        jPanel2.add(durationerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 10, 20));

        caterr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        caterr.setForeground(new java.awt.Color(204, 0, 0));
        caterr.setText("*");
        jPanel2.add(caterr, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 10, 20));

        doadderr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doadderr.setForeground(new java.awt.Color(204, 0, 0));
        doadderr.setText("*");
        jPanel2.add(doadderr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 10, 20));

        pherr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pherr.setForeground(new java.awt.Color(204, 0, 0));
        pherr.setText("*");
        jPanel2.add(pherr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 10, 20));

        feeerr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        feeerr.setForeground(new java.awt.Color(204, 0, 0));
        feeerr.setText("*");
        jPanel2.add(feeerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 10, 20));

        doberr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doberr.setForeground(new java.awt.Color(204, 0, 0));
        doberr.setText("*");
        jPanel2.add(doberr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 10, 20));

        gendererr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gendererr.setForeground(new java.awt.Color(204, 0, 0));
        gendererr.setText("*");
        jPanel2.add(gendererr, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 10, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("+");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, 20));

        pssout.setText("Passout");
        jPanel2.add(pssout, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1130, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifyinitcomponents() {
        errlbl1.setVisible(false);
        errlbl2.setVisible(false);
        errlbl4.setVisible(false);
        paiderr.setVisible(false);
        regerr.setVisible(false);
        regconerr.setVisible(false);
        pherr.setVisible(false);
        doberr.setVisible(false);
        gendererr.setVisible(false);
        caterr.setVisible(false);
        feeerr.setVisible(false);
        paiderr.setVisible(false);
        doadderr.setVisible(false);
        durationerr.setVisible(false);
    }
    private void loadcourses(){
        try{
            BufferedReader brr = new BufferedReader(new FileReader("courses.txt"));
            int j = Integer.parseInt(brr.readLine());
            for ( int i=0; i<j-1; i++ ){
                String cdta = brr.readLine();
                course1.addItem(cdta);
                course2.addItem(cdta);
                course3.addItem(cdta);
                course4.addItem(cdta);
                course5.addItem(cdta);               
            }
            brr.close();
        }catch ( Exception e  ){ }
        
    }
    private void genderFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFActionPerformed

    private void genderMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderMActionPerformed

    private void catMahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catMahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catMahActionPerformed

    private void catGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catGenActionPerformed

    private void catScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catScActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catScActionPerformed

    private void catStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catStActionPerformed

    private void catObcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catObcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catObcActionPerformed

    private void course4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course4ActionPerformed

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course1ActionPerformed

    private void course2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course2ActionPerformed

    private void course3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course3ActionPerformed

    private void fee4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fee4ActionPerformed

    private void fee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fee1ActionPerformed

    private void fee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fee2ActionPerformed

    private void fee3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fee3ActionPerformed

    private void duration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration1ActionPerformed

    private void paid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid2ActionPerformed

    private void paid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid3ActionPerformed

    private void paid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid4ActionPerformed

    private void course5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course5ActionPerformed

    private void fee5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fee5ActionPerformed

    private void paid5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid5ActionPerformed

    private void d1YYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1YYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1YYYYActionPerformed

    private void d1MMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1MMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1MMActionPerformed

    private void d2MMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2MMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2MMActionPerformed

    private void d2YYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2YYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2YYYYActionPerformed

    private void d3MMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3MMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3MMActionPerformed

    private void d3YYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3YYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3YYYYActionPerformed

    private void d4MMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4MMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d4MMActionPerformed

    private void d4YYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4YYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d4YYYYActionPerformed

    private void d5MMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5MMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d5MMActionPerformed

    private void d5YYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5YYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d5YYYYActionPerformed

    private void paid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid1ActionPerformed

    private void duration2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration2ActionPerformed

    private void duration3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration3ActionPerformed

    private void duration4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration4ActionPerformed

    private void duration5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration5ActionPerformed

    private void resetButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtActionPerformed

        stuName.setText("");
        fName.setText("");
        regNo.setText("");
        cCode.setText("+91");
        phNo.setText("");
        dobDD.setText("");
        dobMM.setText("");
        dobYYYY.setText("");
        genderM.setSelected(false);
        genderF.setSelected(false);
        catGen.setSelected(false);
        catSc.setSelected(false);
        catSt.setSelected(false);
        catObc.setSelected(false);
        catMah.setSelected(false);
        address.setText("");
        course1.setSelectedItem("Course 1");
        course2.setSelectedItem("Course 2");
        course3.setSelectedItem("Course 3");
        course4.setSelectedItem("Course 4");
        course5.setSelectedItem("Course 5");
        fee1.setText("");
        fee2.setText("");
        fee3.setText("");
        fee4.setText("");
        fee5.setText("");
        paid1.setText("");
        paid2.setText("");
        paid3.setText("");
        paid4.setText("");
        paid5.setText("");
        d1DD.setText("");
        d1MM.setText("");
        d1YYYY.setText("");
        d2DD.setText("");
        d2MM.setText("");
        d2YYYY.setText("");
        d3DD.setText("");
        d3MM.setText("");
        d3YYYY.setText("");
        d4DD.setText("");
        d4MM.setText("");
        d4YYYY.setText("");
        d5DD.setText("");
        d5MM.setText("");
        d5YYYY.setText("");
        duration1.setText("");
        duration2.setText("");
        duration3.setText("");
        duration4.setText("");
        duration5.setText("");
        additionalcourse.ncourses = "";
        additionalcourse.nfee = "";
        additionalcourse.npaid = "";
        additionalcourse.ndues = "";
        additionalcourse.ndate = "";
        additionalcourse.nduration = "";
        genderM.setSelected(false);
        genderF.setSelected(false);
        catGen.setSelected(false);
        catSc.setSelected(false);
        catSt.setSelected(false);
        catObc.setSelected(false);
        catMah.setSelected(false);
        courses = "";
        fee = "";
        paid = "";
        dues = "";
        dateofadd = "";
        cduration = "";
        modifyinitcomponents();
    }//GEN-LAST:event_resetButtActionPerformed

    private void saveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtActionPerformed
        modifyinitcomponents();

        // check roll no
        byte checkerr = 0;
        for (int ia = 0; ia < students.a; ia++) {
            if (Objects.equals(regNo.getText(), roll[ia])) {  // roll[i] == roll[ia]
                checkerr = 1;
                regconerr.setVisible(true);
                regerr.setVisible(true);
                errlbl1.setVisible(true);
                errlbl2.setVisible(true);
                errlbl4.setVisible(true);
                break;
            }
        }

        // check DOB
        if (checkerr == 0) {
            try {
                if (Integer.parseInt(dobDD.getText()) > 0 && Integer.parseInt(dobDD.getText()) <= 31 && Integer.parseInt(dobMM.getText()) > 0 && Integer.parseInt(dobMM.getText()) <= 12 && dobYYYY.getText().length() == 4) {

                } else {
                    doberr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
            } catch (Exception e) {
                doberr.setVisible(true);
                checkerr = 1;
                errlbl1.setVisible(true);
                errlbl2.setVisible(true);
                errlbl4.setVisible(true);
            }
        }

        // check course fee && fee paid && date of addmission && course duration
        if (checkerr == 0) {
            if (course1.getSelectedItem() != "Course 1") {
                try {
                    Integer.parseInt(fee1.getText());
                    try {
                        if (Integer.parseInt(d1DD.getText()) > 0 && Integer.parseInt(d1DD.getText()) <= 31 && Integer.parseInt(d1MM.getText()) > 0 && Integer.parseInt(d1MM.getText()) <= 12 && d1YYYY.getText().length() == 4) {

                        } else {
                            doadderr.setVisible(true);
                            checkerr = 1;
                            errlbl1.setVisible(true);
                            errlbl2.setVisible(true);
                            errlbl4.setVisible(true);
                        }
                    } catch (Exception e) {
                        doadderr.setVisible(true);
                        checkerr = 1;
                        errlbl1.setVisible(true);
                        errlbl2.setVisible(true);
                        errlbl4.setVisible(true);
                    }
                } catch (Exception e) {
                    feeerr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(paid1.getText());
                } catch (Exception e) {
                    paiderr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(duration1.getText());
                } catch (Exception e) {
                    checkerr = 1;
                    durationerr.setVisible(true);
                }
            }
            if (course2.getSelectedItem() != "Course 2") {
                try {
                    Integer.parseInt(fee2.getText());
                    try {
                        if (Integer.parseInt(d2DD.getText()) > 0 && Integer.parseInt(d2DD.getText()) <= 31 && Integer.parseInt(d2MM.getText()) > 0 && Integer.parseInt(d2MM.getText()) <= 12 && d2YYYY.getText().length() == 4) {

                        } else {
                            doadderr.setVisible(true);
                            checkerr = 1;
                            errlbl1.setVisible(true);
                            errlbl2.setVisible(true);
                            errlbl4.setVisible(true);
                        }
                    } catch (Exception e) {
                        doadderr.setVisible(true);
                        checkerr = 1;
                        errlbl1.setVisible(true);
                        errlbl2.setVisible(true);
                        errlbl4.setVisible(true);
                    }
                } catch (Exception e) {
                    feeerr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(paid2.getText());
                } catch (Exception e) {
                    paiderr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(duration2.getText());
                } catch (Exception e) {
                    checkerr = 1;
                    durationerr.setVisible(true);
                }
            }
            if (course3.getSelectedItem() != "Course 3") {
                try {
                    Integer.parseInt(fee3.getText());
                    try {
                        if (Integer.parseInt(d3DD.getText()) > 0 && Integer.parseInt(d3DD.getText()) <= 31 && Integer.parseInt(d3MM.getText()) > 0 && Integer.parseInt(d3MM.getText()) <= 12 && d3YYYY.getText().length() == 4) {

                        } else {
                            doadderr.setVisible(true);
                            checkerr = 1;
                            errlbl1.setVisible(true);
                            errlbl2.setVisible(true);
                            errlbl4.setVisible(true);
                        }
                    } catch (Exception e) {
                        doadderr.setVisible(true);
                        checkerr = 1;
                        errlbl1.setVisible(true);
                        errlbl2.setVisible(true);
                        errlbl4.setVisible(true);
                    }
                } catch (Exception e) {
                    feeerr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(paid3.getText());
                } catch (Exception e) {
                    paiderr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(duration3.getText());
                } catch (Exception e) {
                    checkerr = 1;
                    durationerr.setVisible(true);
                }
            }
            if (course4.getSelectedItem() != "Course 4") {
                try {
                    Integer.parseInt(fee4.getText());
                    try {
                        if (Integer.parseInt(d4DD.getText()) > 0 && Integer.parseInt(d4DD.getText()) <= 31 && Integer.parseInt(d4MM.getText()) > 0 && Integer.parseInt(d4MM.getText()) <= 12 && d4YYYY.getText().length() == 4) {

                        } else {
                            doadderr.setVisible(true);
                            checkerr = 1;
                            errlbl1.setVisible(true);
                            errlbl2.setVisible(true);
                            errlbl4.setVisible(true);
                        }
                    } catch (Exception e) {
                        doadderr.setVisible(true);
                        checkerr = 1;
                        errlbl1.setVisible(true);
                        errlbl2.setVisible(true);
                        errlbl4.setVisible(true);
                    }
                } catch (Exception e) {
                    feeerr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(paid4.getText());
                } catch (Exception e) {
                    paiderr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(duration4.getText());
                } catch (Exception e) {
                    checkerr = 1;
                    durationerr.setVisible(true);
                }
            }
            if (course5.getSelectedItem() != "Course 5") {
                try {
                    Integer.parseInt(fee5.getText());
                    try {
                        if (Integer.parseInt(d5DD.getText()) > 0 && Integer.parseInt(d5DD.getText()) <= 31 && Integer.parseInt(d5MM.getText()) > 0 && Integer.parseInt(d5MM.getText()) <= 12 && d5YYYY.getText().length() == 4) {

                        } else {
                            doadderr.setVisible(true);
                            checkerr = 1;
                            errlbl1.setVisible(true);
                            errlbl2.setVisible(true);
                            errlbl4.setVisible(true);
                        }
                    } catch (Exception e) {
                        doadderr.setVisible(true);
                        checkerr = 1;
                        errlbl1.setVisible(true);
                        errlbl2.setVisible(true);
                        errlbl4.setVisible(true);
                    }
                } catch (Exception e) {
                    feeerr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(paid5.getText());
                } catch (Exception e) {
                    paiderr.setVisible(true);
                    checkerr = 1;
                    errlbl1.setVisible(true);
                    errlbl2.setVisible(true);
                    errlbl4.setVisible(true);
                }
                try {
                    Integer.parseInt(duration5.getText());
                } catch (Exception e) {
                    checkerr = 1;
                    durationerr.setVisible(true);
                }
            }
        }

        // final saving
        if (checkerr == 0) {
            try {
                // gender
                if (genderM.isSelected()) {
                    gender = "Male";
                }
                if (genderF.isSelected()) {
                    gender = "Female";
                }

                // category
                if (catGen.isSelected()) {
                    category = "General";
                }
                if (catSc.isSelected()) {
                    category = "SC";
                }
                if (catSt.isSelected()) {
                    category = "ST";
                }
                if (catObc.isSelected()) {
                    category = "OBC";
                }
                if (catMah.isSelected()) {
                    category = "Mahadalit";
                }
                
                //isPassOut
                if ( pssout.isSelected() ){
                    pass = true;
                }else
                    pass = false;

                //courses //fee //paid //dues //dateofadd // duration 
                String spaces = "  ";
                if (course1.getSelectedItem() != "Course 1") {
                    courses = "|" + spaces + course1.getSelectedItem();
                    fee = "|" + spaces + fee1.getText();
                    paid = "|" + spaces + paid1.getText();
                    dues = "|" + spaces + (Integer.parseInt(fee1.getText()) - Integer.parseInt(paid1.getText()));
                    dateofadd = "|" + spaces + d1DD.getText() + "/" + d1MM.getText() + "/" + d1YYYY.getText();
                    cduration = "|" + spaces + duration1.getText() + " " + "months";
                    int courselen = courses.length();
                    int feelen = fee.length();
                    int paidlen = paid.length();
                    int dueslen = dues.length();
                    int datelen = dateofadd.length();
                    int durationlen = cduration.length();
                    int maxlen = Math.max(courselen, feelen);
                    maxlen = Math.max(maxlen, paidlen);
                    maxlen = Math.max(maxlen, dueslen);
                    maxlen = Math.max(maxlen, datelen);
                    maxlen = Math.max(maxlen, durationlen);
                    String minspaces = "";
                    if (courselen < maxlen) {
                        int len = maxlen - courselen;
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        courses = courses + minspaces + spaces + "|";
                    } else {
                        courses = courses + spaces + "|";
                    }
                    if (feelen < maxlen) {
                        int len = maxlen - feelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        fee = fee + minspaces + spaces + "|";
                    } else {
                        fee = fee + spaces + "|";
                    }
                    if (paidlen < maxlen) {
                        int len = maxlen - paidlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        paid = paid + minspaces + spaces + "|";
                    } else {
                        paid = paid + spaces + "|";
                    }
                    if (dueslen < maxlen) {
                        int len = maxlen - dueslen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dues = dues + minspaces + spaces + "|";
                    } else {
                        dues = dues + spaces + "|";
                    }
                    if (datelen < maxlen) {
                        int len = maxlen - datelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dateofadd = dateofadd + minspaces + spaces + "|";
                    } else {
                        dateofadd = dateofadd + spaces + "|";
                    }
                    if (durationlen < maxlen) {
                        int len = maxlen - durationlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        cduration = cduration + minspaces + spaces + "|";
                    } else {
                        cduration = cduration + spaces + "|";
                    }
                }

                if (course2.getSelectedItem() != "Course 2") {
                    String tempc = "";
                    String tempf = "";
                    String tempp = "";
                    String tempd = "";
                    String tempdate = "";
                    String tempduration = "";
                    tempc = (String) course2.getSelectedItem();
                    tempf = fee2.getText();
                    tempp = paid2.getText();
                    tempd = String.valueOf(Integer.parseInt(fee2.getText()) - Integer.parseInt(paid2.getText()));
                    tempdate = d2DD.getText() + "/" + d2MM.getText() + "/" + d2YYYY.getText();
                    tempduration = duration2.getText() + " " + "months";
                    int courselen = tempc.length();
                    int feelen = tempf.length();
                    int paidlen = tempp.length();
                    int dueslen = tempd.length();
                    int datelen = tempdate.length();
                    int durationlen = tempduration.length();
                    int maxlen = Math.max(courselen, feelen);
                    maxlen = Math.max(maxlen, paidlen);
                    maxlen = Math.max(maxlen, dueslen);
                    maxlen = Math.max(maxlen, datelen);
                    maxlen = Math.max(maxlen, durationlen);
                    String minspaces = "";
                    if (courselen < maxlen) {
                        int len = maxlen - courselen;
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        courses = courses + spaces + tempc + minspaces + spaces + "|";
                    } else {
                        courses = courses + spaces + tempc + spaces + "|";
                    }
                    if (feelen < maxlen) {
                        int len = maxlen - feelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        fee = fee + spaces + tempf + minspaces + spaces + "|";
                    } else {
                        fee = fee + spaces + tempf + spaces + "|";
                    }
                    if (paidlen < maxlen) {
                        int len = maxlen - paidlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        paid = paid + spaces + tempp + minspaces + spaces + "|";
                    } else {
                        paid = paid + spaces + tempp + spaces + "|";
                    }
                    if (dueslen < maxlen) {
                        int len = maxlen - dueslen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dues = dues + spaces + tempd + minspaces + spaces + "|";
                    } else {
                        dues = dues + spaces + tempd + spaces + "|";
                    }
                    if (datelen < maxlen) {
                        int len = maxlen - datelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dateofadd = dateofadd + spaces + tempdate + minspaces + spaces + "|";
                    } else {
                        dateofadd = dateofadd + spaces + tempdate + spaces + "|";
                    }
                    if (durationlen < maxlen) {
                        int len = maxlen - durationlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        cduration = cduration + spaces + tempduration + minspaces + spaces + "|";
                    } else {
                        cduration = cduration + spaces + tempduration + spaces + "|";
                    }
                }

                if (course3.getSelectedItem() != "Course 3") {
                    String tempc = "";
                    String tempf = "";
                    String tempp = "";
                    String tempd = "";
                    String tempdate = "";
                    String tempduration = "";
                    tempc = (String) course3.getSelectedItem();
                    tempf = fee3.getText();
                    tempp = paid3.getText();
                    tempd = String.valueOf(Integer.parseInt(fee3.getText()) - Integer.parseInt(paid3.getText()));
                    tempdate = d3DD.getText() + "/" + d3MM.getText() + "/" + d3YYYY.getText();
                    tempduration = duration3.getText() + " " + "months";
                    int courselen = tempc.length();
                    int feelen = tempf.length();
                    int paidlen = tempp.length();
                    int dueslen = tempd.length();
                    int datelen = tempdate.length();
                    int durationlen = tempduration.length();
                    int maxlen = Math.max(courselen, feelen);
                    maxlen = Math.max(maxlen, paidlen);
                    maxlen = Math.max(maxlen, dueslen);
                    maxlen = Math.max(maxlen, datelen);
                    maxlen = Math.max(maxlen, durationlen);
                    String minspaces = "";
                    if (courselen < maxlen) {
                        int len = maxlen - courselen;
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        courses = courses + spaces + tempc + minspaces + spaces + "|";
                    } else {
                        courses = courses + spaces + tempc + spaces + "|";
                    }
                    if (feelen < maxlen) {
                        int len = maxlen - feelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        fee = fee + spaces + tempf + minspaces + spaces + "|";
                    } else {
                        fee = fee + spaces + tempf + spaces + "|";
                    }
                    if (paidlen < maxlen) {
                        int len = maxlen - paidlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        paid = paid + spaces + tempp + minspaces + spaces + "|";
                    } else {
                        paid = paid + spaces + tempp + spaces + "|";
                    }
                    if (dueslen < maxlen) {
                        int len = maxlen - dueslen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dues = dues + spaces + tempd + minspaces + spaces + "|";
                    } else {
                        dues = dues + spaces + tempd + spaces + "|";
                    }
                    if (datelen < maxlen) {
                        int len = maxlen - datelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dateofadd = dateofadd + spaces + tempdate + minspaces + spaces + "|";
                    } else {
                        dateofadd = dateofadd + spaces + tempdate + spaces + "|";
                    }
                    if (durationlen < maxlen) {
                        int len = maxlen - durationlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        cduration = cduration + spaces + tempduration + minspaces + spaces + "|";
                    } else {
                        cduration = cduration + spaces + tempduration + spaces + "|";
                    }
                }

                if (course4.getSelectedItem() != "Course 4") {
                    String tempc = "";
                    String tempf = "";
                    String tempp = "";
                    String tempd = "";
                    String tempdate = "";
                    String tempduration = "";
                    tempc = (String) course4.getSelectedItem();
                    tempf = fee4.getText();
                    tempp = paid4.getText();
                    tempd = String.valueOf(Integer.parseInt(fee4.getText()) - Integer.parseInt(paid4.getText()));
                    tempdate = d4DD.getText() + "/" + d4MM.getText() + "/" + d4YYYY.getText();
                    tempduration = duration4.getText() + " " + "months";
                    int courselen = tempc.length();
                    int feelen = tempf.length();
                    int paidlen = tempp.length();
                    int dueslen = tempd.length();
                    int datelen = tempdate.length();
                    int durationlen = tempduration.length();
                    int maxlen = Math.max(courselen, feelen);
                    maxlen = Math.max(maxlen, paidlen);
                    maxlen = Math.max(maxlen, dueslen);
                    maxlen = Math.max(maxlen, datelen);
                    maxlen = Math.max(maxlen, durationlen);
                    String minspaces = "";
                    if (courselen < maxlen) {
                        int len = maxlen - courselen;
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        courses = courses + spaces + tempc + minspaces + spaces + "|";
                    } else {
                        courses = courses + spaces + tempc + spaces + "|";
                    }
                    if (feelen < maxlen) {
                        int len = maxlen - feelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        fee = fee + spaces + tempf + minspaces + spaces + "|";
                    } else {
                        fee = fee + spaces + tempf + spaces + "|";
                    }
                    if (paidlen < maxlen) {
                        int len = maxlen - paidlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        paid = paid + spaces + tempp + minspaces + spaces + "|";
                    } else {
                        paid = paid + spaces + tempp + spaces + "|";
                    }
                    if (dueslen < maxlen) {
                        int len = maxlen - dueslen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dues = dues + spaces + tempd + minspaces + spaces + "|";
                    } else {
                        dues = dues + spaces + tempd + spaces + "|";
                    }
                    if (datelen < maxlen) {
                        int len = maxlen - datelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dateofadd = dateofadd + spaces + tempdate + minspaces + spaces + "|";
                    } else {
                        dateofadd = dateofadd + spaces + tempdate + spaces + "|";
                    }
                    if (durationlen < maxlen) {
                        int len = maxlen - durationlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        cduration = cduration + spaces + tempduration + minspaces + spaces + "|";
                    } else {
                        cduration = cduration + spaces + tempduration + spaces + "|";
                    }
                }

                if (course5.getSelectedItem() != "Course 5") {
                    String tempc = "";
                    String tempf = "";
                    String tempp = "";
                    String tempd = "";
                    String tempdate = "";
                    String tempduration = "";
                    tempc = (String) course5.getSelectedItem();
                    tempf = fee5.getText();
                    tempp = paid5.getText();
                    tempd = String.valueOf(Integer.parseInt(fee5.getText()) - Integer.parseInt(paid5.getText()));
                    tempdate = d5DD.getText() + "/" + d5MM.getText() + "/" + d5YYYY.getText();
                    tempduration = duration5.getText() + " " + "months";
                    int courselen = tempc.length();
                    int feelen = tempf.length();
                    int paidlen = tempp.length();
                    int dueslen = tempd.length();
                    int datelen = tempdate.length();
                    int durationlen = tempduration.length();
                    int maxlen = Math.max(courselen, feelen);
                    maxlen = Math.max(maxlen, paidlen);
                    maxlen = Math.max(maxlen, dueslen);
                    maxlen = Math.max(maxlen, datelen);
                    maxlen = Math.max(maxlen, durationlen);
                    String minspaces = "";
                    if (courselen < maxlen) {
                        int len = maxlen - courselen;
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        courses = courses + spaces + tempc + minspaces + spaces + "|";
                    } else {
                        courses = courses + spaces + tempc + spaces + "|";
                    }
                    if (feelen < maxlen) {
                        int len = maxlen - feelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        fee = fee + spaces + tempf + minspaces + spaces + "|";
                    } else {
                        fee = fee + spaces + tempf + spaces + "|";
                    }
                    if (paidlen < maxlen) {
                        int len = maxlen - paidlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        paid = paid + spaces + tempp + minspaces + spaces + "|";
                    } else {
                        paid = paid + spaces + tempp + spaces + "|";
                    }
                    if (dueslen < maxlen) {
                        int len = maxlen - dueslen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dues = dues + spaces + tempd + minspaces + spaces + "|";
                    } else {
                        dues = dues + spaces + tempd + spaces + "|";
                    }
                    if (datelen < maxlen) {
                        int len = maxlen - datelen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        dateofadd = dateofadd + spaces + tempdate + minspaces + spaces + "|";
                    } else {
                        dateofadd = dateofadd + spaces + tempdate + spaces + "|";
                    }
                    if (durationlen < maxlen) {
                        int len = maxlen - durationlen;
                        minspaces = "";
                        for (int z = 0; z < len; z++) {
                            minspaces += " ";
                        }
                        cduration = cduration + spaces + tempduration + minspaces + spaces + "|";
                    } else {
                        cduration = cduration + spaces + tempduration + spaces + "|";
                    }
                }
                // taking values form additional course form 
                courses = courses + additionalcourse.ncourses;
                fee = fee + additionalcourse.nfee;
                paid = paid + additionalcourse.npaid;
                dues = dues + additionalcourse.ndues;
                dateofadd = dateofadd + additionalcourse.ndate;
                cduration = cduration + additionalcourse.nduration;

                inputfrm(students.a);
                students.a++;
                students.saveData();
                students.save_sz_data();
                resetButtActionPerformed(evt);
                if ( SystemTray.isSupported()){
                    displayTray();
                }
                    
            } catch (NumberFormatException e) {
                errlbl1.setVisible(true);
                errlbl2.setVisible(true);
                errlbl4.setVisible(true);
            } catch (AWTException ex) {
                Logger.getLogger(inputstudentsfrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            errlbl1.setVisible(true);
            errlbl2.setVisible(true);
            errlbl4.setVisible(true);
        }

    }//GEN-LAST:event_saveButtActionPerformed

    public void displayTray() throws AWTException{
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("IKON LOGOs.png");
        TrayIcon trayIcon = new TrayIcon( image, "Tray Demo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("Data saved", "Your data is successfully saved in database.", MessageType.INFO);
    }
    private void d1DDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1DDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d1DDActionPerformed

    private void closeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtActionPerformed

    }//GEN-LAST:event_closeButtActionPerformed

    private void closeButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtMouseClicked
        inputstudentsfrm.this.hide();
    }//GEN-LAST:event_closeButtMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        additionalcourse additionalcourse = new additionalcourse();
        additionalcourse.setVisible(true);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void dobYYYYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobYYYYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobYYYYActionPerformed

    private void stuNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stuNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            inputstudentsfrm.this.hide();
        }
    }//GEN-LAST:event_stuNameKeyPressed

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
            java.util.logging.Logger.getLogger(editentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editentry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputstudentsfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cCode;
    private javax.swing.JCheckBox catGen;
    private javax.swing.JCheckBox catMah;
    private javax.swing.JCheckBox catObc;
    private javax.swing.JCheckBox catSc;
    private javax.swing.JCheckBox catSt;
    private javax.swing.JLabel caterr;
    private com.k33ptoo.components.KButton closeButt;
    private javax.swing.JComboBox<String> course1;
    private javax.swing.JComboBox<String> course10;
    private javax.swing.JComboBox<String> course2;
    private javax.swing.JComboBox<String> course3;
    private javax.swing.JComboBox<String> course4;
    private javax.swing.JComboBox<String> course5;
    private javax.swing.JComboBox<String> course6;
    private javax.swing.JComboBox<String> course7;
    private javax.swing.JComboBox<String> course8;
    private javax.swing.JComboBox<String> course9;
    private javax.swing.JTextField d10DD;
    private javax.swing.JTextField d10MM;
    private javax.swing.JTextField d10YYYY;
    private javax.swing.JTextField d1DD;
    private javax.swing.JTextField d1MM;
    private javax.swing.JTextField d1YYYY;
    private javax.swing.JTextField d2DD;
    private javax.swing.JTextField d2MM;
    private javax.swing.JTextField d2YYYY;
    private javax.swing.JTextField d3DD;
    private javax.swing.JTextField d3MM;
    private javax.swing.JTextField d3YYYY;
    private javax.swing.JTextField d4DD;
    private javax.swing.JTextField d4MM;
    private javax.swing.JTextField d4YYYY;
    private javax.swing.JTextField d5DD;
    private javax.swing.JTextField d5MM;
    private javax.swing.JTextField d5YYYY;
    private javax.swing.JTextField d6DD;
    private javax.swing.JTextField d6MM;
    private javax.swing.JTextField d6YYYY;
    private javax.swing.JTextField d7DD;
    private javax.swing.JTextField d7MM;
    private javax.swing.JTextField d7YYYY;
    private javax.swing.JTextField d8DD;
    private javax.swing.JTextField d8MM;
    private javax.swing.JTextField d8YYYY;
    private javax.swing.JTextField d9DD;
    private javax.swing.JTextField d9MM;
    private javax.swing.JTextField d9YYYY;
    private javax.swing.JLabel doadderr;
    private javax.swing.JTextField dobDD;
    private javax.swing.JTextField dobMM;
    private javax.swing.JTextField dobYYYY;
    private javax.swing.JLabel doberr;
    private javax.swing.JTextField duration1;
    private javax.swing.JTextField duration10;
    private javax.swing.JTextField duration2;
    private javax.swing.JTextField duration3;
    private javax.swing.JTextField duration4;
    private javax.swing.JTextField duration5;
    private javax.swing.JTextField duration6;
    private javax.swing.JTextField duration7;
    private javax.swing.JTextField duration8;
    private javax.swing.JTextField duration9;
    private javax.swing.JLabel durationerr;
    private javax.swing.JLabel errlbl1;
    private javax.swing.JLabel errlbl2;
    private javax.swing.JLabel errlbl4;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fee1;
    private javax.swing.JTextField fee10;
    private javax.swing.JTextField fee2;
    private javax.swing.JTextField fee3;
    private javax.swing.JTextField fee4;
    private javax.swing.JTextField fee5;
    private javax.swing.JTextField fee6;
    private javax.swing.JTextField fee7;
    private javax.swing.JTextField fee8;
    private javax.swing.JTextField fee9;
    private javax.swing.JLabel feeerr;
    private javax.swing.JRadioButton genderF;
    private javax.swing.JRadioButton genderM;
    private javax.swing.JLabel gendererr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JTextField paid1;
    private javax.swing.JTextField paid10;
    private javax.swing.JTextField paid2;
    private javax.swing.JTextField paid3;
    private javax.swing.JTextField paid4;
    private javax.swing.JTextField paid5;
    private javax.swing.JTextField paid6;
    private javax.swing.JTextField paid7;
    private javax.swing.JTextField paid8;
    private javax.swing.JTextField paid9;
    private javax.swing.JLabel paiderr;
    private javax.swing.JTextField phNo;
    private javax.swing.JLabel pherr;
    private javax.swing.JCheckBox pssout;
    private javax.swing.JTextField regNo;
    private javax.swing.JLabel regconerr;
    private javax.swing.JLabel regerr;
    private com.k33ptoo.components.KButton resetButt;
    private com.k33ptoo.components.KButton saveButt;
    private javax.swing.JTextField stuName;
    // End of variables declaration//GEN-END:variables
}
