/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Frontpage extends javax.swing.JFrame {

    
    public Frontpage() {
        initComponents();
        
    }
    //===============DATABASE FOR LOGIN==========================
    Connection sqlcon = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    
    public void connect(){
        
    }
    
    
    //===============END=========================================
     public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        front = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button2 = new swing.Button();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ent_user = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ent_password = new javax.swing.JPasswordField();
        button1 = new swing.Button();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        button4 = new swing.Button();
        signup = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cUser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        mNumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phoneNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        crePass = new javax.swing.JPasswordField();
        button3 = new swing.Button();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(931, 612));
        setPreferredSize(new java.awt.Dimension(931, 612));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(212, 238, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        front.setBackground(new java.awt.Color(212, 238, 252));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ELECTRI'CO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Welcome to");

        button2.setBackground(new java.awt.Color(102, 102, 102));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("GET STARTED");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleclogonobg.png"))); // NOI18N

        javax.swing.GroupLayout frontLayout = new javax.swing.GroupLayout(front);
        front.setLayout(frontLayout);
        frontLayout.setHorizontalGroup(
            frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frontLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frontLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frontLayout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
            .addGroup(frontLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frontLayout.setVerticalGroup(
            frontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", front);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setPreferredSize(new java.awt.Dimension(550, 619));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleclogonobg.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Login to your Account");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Don't have an account? ");

        ent_user.setBackground(new java.awt.Color(212, 238, 252));
        ent_user.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ent_user.setForeground(new java.awt.Color(153, 153, 153));
        ent_user.setText("Enter Username");
        ent_user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ent_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ent_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ent_userFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Password");

        ent_password.setBackground(new java.awt.Color(212, 238, 252));
        ent_password.setForeground(new java.awt.Color(153, 153, 153));
        ent_password.setText("Enter Password");
        ent_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ent_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ent_passwordFocusLost(evt);
            }
        });

        button1.setBackground(new java.awt.Color(102, 102, 102));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Login");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("<HTML><u>Sign Up</u></HTML>");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Username");

        button4.setBackground(new java.awt.Color(102, 102, 102));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Go Back");
        button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ent_user, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ent_password, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel9)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ent_user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ent_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", login);

        signup.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleclogonobg.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Sign Up");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Create Username");

        cUser.setBackground(new java.awt.Color(212, 238, 252));
        cUser.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cUser.setForeground(new java.awt.Color(153, 153, 153));
        cUser.setText("Create Username");
        cUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cUserFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Meter Number");

        mNumber.setBackground(new java.awt.Color(212, 238, 252));
        mNumber.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mNumber.setForeground(new java.awt.Color(153, 153, 153));
        mNumber.setText("Enter Meter Number");
        mNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mNumberFocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Address");

        phoneNum.setBackground(new java.awt.Color(212, 238, 252));
        phoneNum.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        phoneNum.setForeground(new java.awt.Color(153, 153, 153));
        phoneNum.setText("Enter Phone #");
        phoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Phone #");

        address.setBackground(new java.awt.Color(212, 238, 252));
        address.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        address.setForeground(new java.awt.Color(153, 153, 153));
        address.setText("Enter Address");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Password");

        crePass.setBackground(new java.awt.Color(212, 238, 252));
        crePass.setForeground(new java.awt.Color(153, 153, 153));
        crePass.setText("Create Password");
        crePass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                crePassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                crePassFocusLost(evt);
            }
        });

        button3.setBackground(new java.awt.Color(102, 102, 102));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Signup");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Already have an Account?");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 255));
        jLabel21.setText("<HTML><u>Login</u></HTML>");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Full Name");

        fname.setBackground(new java.awt.Color(212, 238, 252));
        fname.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(153, 153, 153));
        fname.setText("Enter Full Name");
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup);
        signup.setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(signupLayout.createSequentialGroup()
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crePass, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cUser, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signupLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crePass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("tab3", signup);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 540, 650));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bulb.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -10, 398, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_button2ActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel21MousePressed

    private void button4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MousePressed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_button4MousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        //LOG IN
        String user = ent_user.getText();
        String pass = ent_password.getText();

        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            pst = sqlcon.prepareStatement("SELECT * from userregistration WHERE cUser = ? and crePass = ? ");
            pst.setString(1, user);
            pst.setString(2, pass);
            result = pst.executeQuery();
            
            if(result.next()){
                    String fullname = result.getString("fname");
                    String meternumber = result.getString("mNumber");
                    String add = result.getString("address");
                    String phone_num = result.getString("phoneNum");

                    mainFrame main = new mainFrame(user, pass, fullname, meternumber, add, phone_num);
                    mainFrame.navname.setText(fullname);
                    mainFrame.meternum.setText(meternumber);
                    mainFrame.meternum_electrico.setText(meternumber);
                    mainFrame.accName.setText(fullname);
                    mainFrame.accNumber.setText(meternumber);
                    mainFrame.accAdd.setText(add);
                    mainFrame.accPhone.setText(phone_num);
                    mainFrame.accUser.setText(user);
                    mainFrame.accPass.setText(pass);
                    main.setVisible(true);
                    dispose();
                 
            }
            else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect");  
            } sqlcon.close();
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
       

    }//GEN-LAST:event_button1ActionPerformed

    private void ent_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ent_userFocusGained
        if (ent_user.getText().equals("Enter Username")) {
            ent_user.setText("");
            ent_user.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_ent_userFocusGained

    private void ent_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ent_userFocusLost
        if (ent_user.getText().equals("")) {
            ent_user.setText("Enter Username");
            ent_user.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ent_userFocusLost

    private void ent_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ent_passwordFocusGained
        if (ent_password.getText().equals("Enter Password")) {
            ent_password.setText("");
            ent_password.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_ent_passwordFocusGained

    private void ent_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ent_passwordFocusLost
        if (ent_password.getText().equals("")) {
            ent_password.setText("Enter Password");
            ent_password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ent_passwordFocusLost

    private void cUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cUserFocusGained
         if (cUser.getText().equals("Create Username")) {
            cUser.setText("");
            cUser.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_cUserFocusGained

    private void cUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cUserFocusLost
         if (cUser.getText().equals("")) {
            cUser.setText("Create Username");
            cUser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_cUserFocusLost

    private void mNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mNumberFocusGained
        if (mNumber.getText().equals("Enter Meter Number")) {
            mNumber.setText("");
            mNumber.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_mNumberFocusGained

    private void mNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mNumberFocusLost
        if (mNumber.getText().equals("")) {
            mNumber.setText("Enter Meter Number");
            mNumber.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_mNumberFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
         if (address.getText().equals("Enter Address")) {
            address.setText("");
            address.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        if (address.getText().equals("")) {
            address.setText("Enter Address");
            address.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addressFocusLost

    private void phoneNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumFocusGained
        if (phoneNum.getText().equals("Enter Phone #")) {
            phoneNum.setText("");
            phoneNum.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_phoneNumFocusGained

    private void phoneNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumFocusLost
         if (phoneNum.getText().equals("")) {
            phoneNum.setText("Enter Phone #");
            phoneNum.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_phoneNumFocusLost

    private void crePassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_crePassFocusGained
         if (crePass.getText().equals("Create Password")) {
            crePass.setText("");
            crePass.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_crePassFocusGained

    private void crePassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_crePassFocusLost
          if (crePass.getText().equals("")) {
            crePass.setText("Create Password");
            crePass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_crePassFocusLost

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
         if (fname.getText().equals("Enter Full Name")) {
            fname.setText("");
            fname.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        if (fname.getText().equals("")) {
            fname.setText("Enter Full Name");
            fname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_fnameFocusLost

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        String fullname = fname.getText();
        String meternumber = mNumber.getText();
        String create_user = cUser.getText();
        String add = address.getText();
        String phone_num = phoneNum.getText();
        String create_pass = new String(crePass.getPassword());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            pst = sqlcon.prepareStatement("SELECT COUNT(*) from userregistration WHERE fname = ? OR mNumber = ? OR cUser = ? ");
            
            pst.setString(1, fullname);
            pst.setString(2, meternumber);
            pst.setString(3, create_user);
            result = pst.executeQuery();
            
            result.next();
            int count = result.getInt(1);
           
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "The information for name or meter number or username have already existed!!");
            
            }
            else {
            pst = sqlcon.prepareStatement("INSERT into userregistration(fname,mNumber,cUser,address,phoneNum,crePass) VALUES (?, ?, ?, ?, ?, ?)");
            pst.setString(1, fullname);
            pst.setString(2, meternumber);
            pst.setString(3, create_user);
            pst.setString(4, add);
            pst.setString(5, phone_num);
            pst.setString(6, create_pass);
            
            int k = pst.executeUpdate();
            
            if (k==1){
                JOptionPane.showMessageDialog(null, "You have successfully registered to Electri'Co");
                fname.setText("");
                mNumber.setText("");
                cUser.setText("");
                address.setText("");
                phoneNum.setText("");
                crePass.setText("");
                
               
                jTabbedPane1.setSelectedIndex(1);
            } 
            
            else {
                JOptionPane.showMessageDialog(null, "Registration Failed!!");
            }
            }
            
            
           sqlcon.close(); 
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_button3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frontpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField address;
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    public static javax.swing.JTextField cUser;
    public static javax.swing.JPasswordField crePass;
    private javax.swing.JPasswordField ent_password;
    private javax.swing.JTextField ent_user;
    public static javax.swing.JTextField fname;
    private javax.swing.JPanel front;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel login;
    public static javax.swing.JTextField mNumber;
    public static javax.swing.JTextField phoneNum;
    private javax.swing.JPanel signup;
    // End of variables declaration//GEN-END:variables
}
