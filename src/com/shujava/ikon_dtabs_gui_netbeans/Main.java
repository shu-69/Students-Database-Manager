/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujava.ikon_dtabs_gui_netbeans;

/**
 *
 * @author shubh
 */
//      Program created by Shubham at AM College
import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class students {
    
    static Scanner sc = new Scanner ( System.in );
    static String[] name = new String[50000];
    static String[] fname = new String[50000];
    static String[] roll = new String[50000];
    static String[] phno = new String[50000];
    static String[] dob = new String[50000];
    static String[] gender = new String[50000];
    static String[] category = new String[50000];
    static String[] address = new String[50000];
    static boolean[] ispass = new boolean[50000];
    static String[] course = new String[50000];
    static String[] fee = new String[50000];
    static String[] paid = new String[50000];
    static String[] dues = new String[50000];
    static String[] dateofaddmission = new String[50000];
    static String[] duration = new String[50000];
    static String namenew = "";
    static String fnamenew = "";
    static String rollnew = "";   
    static String phnonew = "";
    static String dobnew = "";
    static String gendernew = "";
    static String categorynew = "";
    static boolean ispassnew;
    static String addressnew = "";
    static String coursenew = "";
    static String feenew = "";
    static String paidnew = "";
    static String duesnew = "";
    static String dateofaddnew = "";
    static String durationnew = "";
    static int size_of_dta;

    static int a = 0;
/*
    static public void loadData(  ){

        try{
            BufferedReader br = new BufferedReader(new FileReader("s_dta_0.txt"));
            BufferedReader sz_dta = new BufferedReader(new FileReader("sz_dta.txt"));
            size_of_dta = Integer.parseInt(sz_dta.readLine());
            students.a = size_of_dta;
            for ( int i=0; i<students.a; i++ ){
                namenew = br.readLine();
                fnamenew = br.readLine();
                rollnew = br.readLine();
                phnonew = br.readLine();
                dobnew = br.readLine();
                gendernew = br.readLine();
                categorynew = br.readLine();
                addressnew = br.readLine();
                coursenew = br.readLine();
                feenew = br.readLine();
                paidnew = br.readLine();
                duesnew = br.readLine();
                dateofaddnew = br.readLine();
                durationnew = br.readLine();
                students.name[i] = namenew;
                students.fname[i] = fnamenew;
                students.roll[i] = rollnew;
                students.phno[i] = phnonew;
                students.dob[i] = dobnew;
                students.gender[i] = gendernew;
                students.category[i] = categorynew;
                students.address[i] = addressnew;
                students.course[i] = coursenew;
                students.fee[i] = feenew;
                students.paid[i] = paidnew;
                students.dues[i] = duesnew;
                students.dateofaddmission[i] = dateofaddnew;
                students.duration[i] = durationnew;
                
            }
            br.close();
        }
        catch(Exception e){

        }
    }
*/

    static public void saveData ( ){
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("s_dta_0.txt"));
            for ( int i=0; i<a; i++ ){
                bw.write(students.name[i] + "\n");
                bw.write(students.fname[i] + "\n");
                bw.write(students.roll[i] + "\n");              
                bw.write(students.phno[i] + "\n");
                bw.write(students.dob[i] + "\n");
                bw.write(students.gender[i] + "\n");
                bw.write(students.category[i] + "\n");
                bw.write(students.address[i] + "\n");
                bw.write(String.valueOf(students.ispass[i]) + "\n");
                bw.write(students.course[i] + "\n");
                bw.write(students.fee[i] + "\n");
                bw.write(students.paid[i] + "\n");
                bw.write(students.dues[i] + "\n");
                bw.write(students.dateofaddmission[i] + "\n");
                bw.write(students.duration[i] + "\n");
            }
            bw.close();
        }
        catch (Exception e){

        }
    }

    static public void save_sz_data(){
        try{
            BufferedWriter bw_size_writer = new BufferedWriter(new FileWriter("sz_dta.txt"));
            bw_size_writer.write(String.valueOf(a));
            bw_size_writer.close();
        }
        catch (Exception e){

        }
    }
    

    static void input( int i ){
        System.out.print("Student name  : ");
        name[i] = sc.nextLine();
        System.out.print("Roll no.      : ");
        roll[i] = sc.nextLine();
        for ( int ia = 0; ia< a; ia++ ){
            while (Objects.equals(roll[i], roll[ia])){  // roll[i] == roll[ia]
                System.out.println("Roll no. Conflict...! Please enter again");
                System.out.print("Roll no.      : ");
                roll[i] = sc.nextLine();
                ia = 0;
            }
        }
        System.out.print("Father's name : ");
        fname[i] = sc.nextLine();
        System.out.print("Contact no.   : ");
        phno[i] = sc.nextLine();
        System.out.print("Address       : ");
        address[i] = sc.nextLine();
        System.out.print("Did " + name[i] + " takes admission in any Course ? ( Y / N ) : ");
        String yn = students.sc.nextLine();
        while ( ! (Objects.equals(yn, "y") || Objects.equals(yn, "Y") || Objects.equals(yn, "n") || Objects.equals(yn, "N") || Objects.equals(yn, "yes") || Objects.equals(yn, "Yes") || Objects.equals(yn, "YES") || Objects.equals(yn, "no") || Objects.equals(yn, "No") || Objects.equals(yn, "NO")) ){
            System.out.println("Please Try again !");
            System.out.print("Did " + name[i] + " takes admission in any Course ? ( Y / N ) : ");
            yn = students.sc.nextLine();
        }
        int courselen;
        int feelen2;
        int paidlen;
        int dueslen;
        if ( Objects.equals(yn, "y") || Objects.equals(yn, "Y") || Objects.equals(yn, "yes") || Objects.equals(yn, "Yes") || Objects.equals(yn, "YES") ){
            System.out.print("Course name   : ");
            course[i] = students.sc.nextLine();
            courselen = course[i].length();
            System.out.print("Course fee    : ");
            fee[i] = students.sc.nextLine();
            int feelen = fee[i].length() - 1;
            while ( feelen != -1 ){
                if ( fee[i].charAt(feelen) == '0' ||fee[i].charAt(feelen) == '1' || fee[i].charAt(feelen) == '2' || fee[i].charAt(feelen) == '3' || fee[i].charAt(feelen) == '4' || fee[i].charAt(feelen) == '5' || fee[i].charAt(feelen) == '6' || fee[i].charAt(feelen) == '7' || fee[i].charAt(feelen) == '8' || fee[i].charAt(feelen) == '9' ){
                    feelen--;
                }
                else{
                    System.out.println("Try again");
                    System.out.print("Course fee    : ");
                    fee[i] = students.sc.nextLine();
                    feelen = fee[i].length() - 1;
                }
            }
            feelen2 = fee[i].length();
            System.out.print("Fee paid      : ");
            paid[i] = students.sc.nextLine();
            feelen = paid[i].length() - 1;
            while ( feelen != -1 ){
                if ( paid[i].charAt(feelen) == '0' || paid[i].charAt(feelen) == '1' || paid[i].charAt(feelen) == '2' || paid[i].charAt(feelen) == '3' || paid[i].charAt(feelen) == '4' || paid[i].charAt(feelen) == '5' || paid[i].charAt(feelen) == '6' || paid[i].charAt(feelen) == '7' || paid[i].charAt(feelen) == '8' || paid[i].charAt(feelen) == '9' ){
                    feelen--;
                }
                else{
                    System.out.println("Try again");
                    System.out.print("Fee paid      : ");
                    paid[i] = students.sc.nextLine();
                    feelen = paid[i].length() - 1;
                }
            }
            paidlen = paid[i].length();
            course[i] = "|  " + course[i];
            int newtempfee = Integer.parseInt(fee[i]);
            int newtemppaid = Integer.parseInt(paid[i]);
            dues[i] = String.valueOf(newtempfee - newtemppaid);
            dueslen = dues[i].length();
            fee[i] = "|  " + fee[i];
            paid[i] = "|  " + paid[i];
            dues[i] = "|  " + dues[i];
            System.out.println("Dues : " + (newtempfee - newtemppaid) );
            int maxlen = Math.max ( courselen, feelen2 );
            maxlen = Math.max( maxlen, paidlen );
            maxlen = Math.max(maxlen, dueslen);
            String minspaces = "";
            String spaces = "  ";
            if ( courselen < maxlen ){
                int len = maxlen - courselen;
                for ( int z=0; z<len; z++ ) {
                    minspaces += " ";
                }
                course[i] = course[i] + minspaces + spaces +  "|";
            }
            else{
                course[i] = course[i]  + spaces + "|";
            }
            if ( feelen2 < maxlen ){
                int len = maxlen - feelen2;
                minspaces = "";
                for ( int z=0; z<len; z++ ){
                    minspaces += " ";
                }
                fee[i] = fee[i] + minspaces  + spaces + "|";
            }
            else{
                fee[i] = fee[i] + spaces + "|";
            }
            if ( paidlen < maxlen ) {
                int len = maxlen - paidlen;
                minspaces = "";
                for ( int z=0; z<len; z++ ){
                    minspaces += " ";
                }
                paid[i] = paid[i] + minspaces  + spaces +  "|";
            }
            else{
                paid[i] = paid[i] + spaces + "|";
            }
            if ( dueslen < maxlen ){
                int len = maxlen - dueslen;
                minspaces = "";
                for ( int z=0; z<len; z++ ){
                    minspaces += " ";
                }
                dues[i] = dues[i] + minspaces  + spaces + "|";
            }
            else{
                dues[i] = dues[i] + spaces  + "|";
            }
            System.out.print("Did " + name[i] + " takes admission in any other Courses ? ( Y / N ) : ");
            yn = students.sc.nextLine();
            while ( true ){
                String tempc = "";
                String tempf = "";
                String tempp = "";
                String tempd = "";
                if ( Objects.equals(yn, "y") || Objects.equals(yn, "Y") || Objects.equals(yn, "yes") || Objects.equals(yn, "Yes") || Objects.equals(yn, "YES") ){
                    System.out.print("Course name : ");
                    tempc = students.sc.nextLine();
                    System.out.print("Course fee : ");
                    tempf = students.sc.nextLine();
                    feelen = tempf.length() - 1;
                    while ( feelen != -1 ){
                        if ( tempf.charAt(feelen) == '0' || tempf.charAt(feelen) == '1' || tempf.charAt(feelen) == '2' || tempf.charAt(feelen) == '3' || tempf.charAt(feelen) == '4' || tempf.charAt(feelen) == '5' || tempf.charAt(feelen) == '6' || tempf.charAt(feelen) == '7' || tempf.charAt(feelen) == '8' || tempf.charAt(feelen) == '9' ){
                            feelen--;
                        }
                        else{
                            System.out.println("Try again");
                            System.out.print("Course fee : ");
                            tempf = students.sc.nextLine();
                            feelen = tempf.length() - 1;
                        }
                    }
                    System.out.print("Fee paid : ");
                    tempp = students.sc.nextLine();
                    feelen = tempp.length() - 1;
                    while ( feelen != -1 ){
                        if ( tempp.charAt(feelen) == '0' || tempp.charAt(feelen) == '1' || tempp.charAt(feelen) == '2' || tempp.charAt(feelen) == '3' || tempp.charAt(feelen) == '4' || tempp.charAt(feelen) == '5' || tempp.charAt(feelen) == '6' || tempp.charAt(feelen) == '7' || tempp.charAt(feelen) == '8' || tempp.charAt(feelen) == '9' ){
                            feelen--;
                        }
                        else{
                            System.out.println("Try again");
                            System.out.print("Fee paid : ");
                            tempp = students.sc.nextLine();
                            feelen = tempp.length() - 1;
                        }
                    }
                    System.out.println("Dues : " + String.valueOf(Integer.parseInt(tempf) - Integer.parseInt(tempp)));
                    tempd = String.valueOf(Integer.parseInt(tempf) - Integer.parseInt(tempp));
                    System.out.print("Did " + name[i] + " takes admission in any other Courses ? ( Y / N ) : ");
                    yn = students.sc.nextLine();
                }
                else if ( Objects.equals(yn, "n") || Objects.equals(yn, "N") || Objects.equals(yn, "No") || Objects.equals(yn, "NO") || Objects.equals(yn, "no") ){
                    break;
                }
                else{
                    System.out.println("Try again");
                    System.out.print("Did " + name[i] + " takes admission in any other Courses ? ( Y / N ) : ");
                    yn = students.sc.nextLine();
                }
                int maxlen2 = Math.max ( tempc.length(), tempf.length() );
                maxlen2 = Math.max( maxlen2, tempp.length() );
                maxlen2 = Math.max(maxlen2,tempd.length() );
                String minspaces2 = "";

                if ( tempc.length() < maxlen2 ){
                    int len = maxlen2 - tempc.length();
                    for ( int z=0; z<len; z++ ) {
                        minspaces2 += " ";
                    }
                    course[i] = course[i] + spaces + tempc + minspaces2 + spaces + "|";
                }
                else{
                    course[i] = course[i] + spaces + tempc + spaces + "|";
                }
                if ( tempf.length() < maxlen2 ){
                    int len = maxlen2 - tempf.length();
                    minspaces2 = "";
                    for ( int z=0; z<len; z++ ){
                        minspaces2 += " ";
                    }
                    fee[i] = fee[i] + spaces + tempf + minspaces2 + spaces + "|";
                }
                else{
                    fee[i] = fee[i] + spaces + tempf + spaces + "|";
                }
                if ( tempp.length() < maxlen2 ) {
                    int len = maxlen2 - tempp.length();
                    minspaces2 = "";
                    for ( int z=0; z<len; z++ ){
                        minspaces2 += " ";
                    }
                    paid[i] = paid[i] + spaces + tempp + minspaces2 + spaces + "|";
                }
                else {
                    paid[i] = paid[i] + spaces + tempp + spaces + "|";
                }
                if ( tempd.length() < maxlen2 ){
                    int len = maxlen2 - tempd.length();
                    minspaces2 = "";
                    for ( int z = 0; z<len; z++ ){
                        minspaces2 += " ";
                    }
                    dues[i] = dues[i] + spaces + tempd + minspaces2 + spaces + "|";
                }
                else{
                    dues[i] = dues[i] + spaces + tempd + spaces + "|";
                }
            }
        }
    }
    static void display( int i ){
        System.out.println("Name of student : " + name[i]);
        System.out.println("Roll no.        : " + roll[i]);
        System.out.println("Father's name   : " + fname[i]);
        System.out.println("Contact no.     : " + phno[i]);
        System.out.println("Address         : " + address[i]);
        System.out.println("Course          : " + course[i]);
        System.out.println("Fee             : " + fee[i]);
        System.out.println("Paid            : " + paid[i]);
        System.out.println("Dues            : " + dues[i]);
    }
}

public class Main {

    public static void main( String[] args ) throws InterruptedException {
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //students.loadData();
        signUpfrm signUpfrm1 = new signUpfrm();
        signUpfrm1.setVisible(true);
        
    }
}
//      Program created by Shubham at AM College