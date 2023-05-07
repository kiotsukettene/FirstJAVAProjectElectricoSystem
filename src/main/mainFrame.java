/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class mainFrame extends javax.swing.JFrame {
        

    Color defaultcolor, clickedcolor, white;
    private String user;
    private String pass;
    private String fullname;
    private String meternumber;
    private String add;
    private String phone_num;
 
    
    public mainFrame(String user, String pass, String fullname, String meternumber, String add, String phone_num) {
        initComponents();
        this.user = user;
        this.pass = pass;
        this.fullname = fullname;
        this.meternumber = meternumber;
        this.add = add;
        this.phone_num = phone_num;
        defaultcolor = new Color(120,120,120);
        clickedcolor = new Color(51,51,51);
        white = new Color (255, 255, 255);
        
        jPanel9.setBackground(new Color(0,0,0,0)); 
        
        FillComboBox();
        appList.setSelectedItem("null");
        
    }
    
    public mainFrame(){
        initComponents();
        
        defaultcolor = new Color(120,120,120);
        clickedcolor = new Color(51,51,51);
        white = new Color (255, 255, 255);
        
        jPanel9.setBackground(new Color(0,0,0,0)); 
        
        FillComboBox();
        appList.setSelectedItem("null");
        
    }
   
    HashMap<String, Integer> hash_map = new HashMap<>();
    
    
    
    public void FillComboBox()
    {
        
        hash_map.put("Air Conditioner - Split Type, Inverter", 2100);
        hash_map.put("Air Fryer",1450);
        hash_map.put("Bread Toaster",850);
        hash_map.put("Washing Machine – Spin & Dryer",157);
        hash_map.put("Computer - Desktop PC",23);
        hash_map.put("Computer - Printer",175);
        hash_map.put("Flat Iron - Standard",600);
        hash_map.put("Fan - Stand",35);
        hash_map.put("Laptop",135);
        hash_map.put("Refrigerator",100);
        hash_map.put("Rice Cooker",1950);
        hash_map.put("TV - LED 55 Inches",153);
        hash_map.put("Vacuum Cleaner - Dry and Wet",1600);
        hash_map.put("Wi-Fi Router",6);
        hash_map.put("LED - Bulb - Cool/White/Daylight",20);
        hash_map.put("VCD/DVD/MP3 Player",22);
        hash_map.put("Cellphone Charger",6);
        hash_map.put("Blender",300);
        hash_map.put("Air Humidifier",24);
        hash_map.put("Electric Cooktop, 2-Plate",2000);
        
        for(Map.Entry entry: hash_map.entrySet())
        {
            Object Items = entry.getKey();
            appList.addItem((String) Items);
        }
    }
    
        public String getNextMonth(String month) {
        // map month name to its index (0-11)
        Map<String, Integer> monthBox= new HashMap<>();
        monthBox.put("January", 0);
        monthBox.put("February", 1);
        monthBox.put("March", 2);
        monthBox.put("April", 3);
        monthBox.put("May", 4);
        monthBox.put("June", 5);
        monthBox.put("July", 6);
        monthBox.put("August", 7);
        monthBox.put("September", 8);
        monthBox.put("October", 9);
        monthBox.put("November", 10);
        monthBox.put("December", 11);

        // get next month's index
        int nextMonthIndex = monthBox.get(month) + 1;
        if (nextMonthIndex == 12) {
            nextMonthIndex = 0; // wrap around to January
        }

        // get month name from index
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String nextMonthName = monthNames[nextMonthIndex];
        return nextMonthName;
    }
    
    
    private static final DecimalFormat df = new DecimalFormat("0.00"); 

   
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelCustom1 = new main.PanelCustom();
        button1 = new swing.Button();
        button2 = new swing.Button();
        button3 = new swing.Button();
        button4 = new swing.Button();
        button5 = new swing.Button();
        button8 = new swing.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        navname = new javax.swing.JTextField();
        meternum = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        desc = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        defLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        electrico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        meternum_electrico = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        monthbox = new javax.swing.JComboBox<>();
        copy1 = new main.copy();
        jLabel20 = new javax.swing.JLabel();
        prev = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        curr = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        button6 = new swing.Button();
        unitConsumed = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        totalPay = new javax.swing.JTextField();
        submit = new swing.Button();
        reset = new swing.Button();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        copy2 = new main.copy();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        appco = new javax.swing.JPanel();
        appCalPanel = new main.copy();
        perDayCost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        perDayConsume = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        perWeekCost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        perWeekConsume = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        perMonthCost = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        perMonthConsume = new javax.swing.JTextField();
        appList = new javax.swing.JComboBox<>();
        consump = new javax.swing.JTextField();
        watts = new javax.swing.JComboBox<>();
        hours = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        appCalReset = new swing.Button();
        jLabel18 = new javax.swing.JLabel();
        copy3 = new main.copy();
        copy4 = new main.copy();
        appCalButton = new swing.Button();
        gbill = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        copy5 = new main.copy();
        copy6 = new main.copy();
        monthBox = new javax.swing.JComboBox<>();
        generate = new swing.Button();
        delete = new swing.Button();
        accInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        copy7 = new main.copy();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        accName = new javax.swing.JTextField();
        accNumber = new javax.swing.JTextField();
        accAdd = new javax.swing.JTextField();
        accPhone = new javax.swing.JTextField();
        accPass = new javax.swing.JPasswordField();
        button9 = new swing.Button();
        jLabel33 = new javax.swing.JLabel();
        accUser = new javax.swing.JTextField();
        button10 = new swing.Button();
        copy8 = new main.copy();
        copy9 = new main.copy();
        helpsupp = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        intro = new javax.swing.JLabel();
        feat = new javax.swing.JLabel();
        guide = new javax.swing.JLabel();
        tips = new javax.swing.JLabel();
        safety = new javax.swing.JLabel();
        how = new javax.swing.JLabel();
        why = new javax.swing.JLabel();
        whom = new javax.swing.JLabel();

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ELECTRI'CO ");

        defLabel.setBackground(new java.awt.Color(255, 255, 255));
        defLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        defLabel.setForeground(new java.awt.Color(102, 102, 102));
        defLabel.setText("<HTML>Electri'Co is a comprehensive and user-friendly electricity consumption tracker system that helps you efficiently monitor and manage your energy usage.  With its powerful features, including an electricity consumption calculator, appliance energy consumption tracker,  bill and receipt generation, and robust help and support, Electri'Co empowers you to effectively track, analyze, and optimize your electricity usage.</HTML>");
        defLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(defLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom1.setBackground(new java.awt.Color(212, 238, 252));

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setForeground(new java.awt.Color(102, 102, 102));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/acc.png"))); // NOI18N
        button1.setText("Account Information");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button1.setIconTextGap(10);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setForeground(new java.awt.Color(102, 102, 102));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maths.png"))); // NOI18N
        button2.setText("Electri'Co Calculator");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button2.setIconTextGap(10);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setForeground(new java.awt.Color(102, 102, 102));
        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/appliance.png"))); // NOI18N
        button3.setText("Appliance'Co Calculator");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button3.setIconTextGap(10);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setForeground(new java.awt.Color(102, 102, 102));
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        button4.setText("Generate Bill & Receipt");
        button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button4.setIconTextGap(10);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(255, 255, 255));
        button5.setForeground(new java.awt.Color(102, 102, 102));
        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        button5.setText("Help & Support");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button5.setIconTextGap(10);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(255, 255, 255));
        button8.setForeground(new java.awt.Color(102, 102, 102));
        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        button8.setText("Logout");
        button8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button8.setIconTextGap(10);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eleclogonobg.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 238, 252)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/worker.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/electric-meter.png"))); // NOI18N

        navname.setEditable(false);
        navname.setBackground(new java.awt.Color(212, 238, 252));
        navname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        navname.setForeground(new java.awt.Color(51, 51, 51));
        navname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        navname.setText("Fullname of Customer");
        navname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        meternum.setEditable(false);
        meternum.setBackground(new java.awt.Color(212, 238, 252));
        meternum.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        meternum.setForeground(new java.awt.Color(51, 51, 51));
        meternum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        meternum.setText("Meter Number");
        meternum.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navname)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(meternum, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(meternum, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 590));

        desc.setBackground(new java.awt.Color(255, 255, 255));
        desc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ELECTRI'CO ");

        defLabel2.setBackground(new java.awt.Color(0, 0, 0));
        defLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        defLabel2.setForeground(new java.awt.Color(51, 51, 51));
        defLabel2.setText("<HTML><div style = 'text-align: justify;'>Electri'Co is a comprehensive and user-friendly electricity consumption tracker system that helps you efficiently monitor and manage your energy usage.  With its powerful features, including an electricity consumption calculator, appliance energy consumption tracker,  bill and receipt generation, and robust help and support, Electri'Co empowers you to effectively track, analyze, and optimize your electricity usage.</HTML>");
        defLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/opacity-logo.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(50, 20, 600, 520);

        desc.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 650, 610));

        jTabbedPane1.addTab("tab6", desc);

        electrico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Meter Number");

        meternum_electrico.setEditable(false);
        meternum_electrico.setBackground(new java.awt.Color(255, 255, 255));
        meternum_electrico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        meternum_electrico.setForeground(new java.awt.Color(51, 51, 51));
        meternum_electrico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        meternum_electrico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Month");

        monthbox.setBackground(new java.awt.Color(212, 238, 252));
        monthbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthbox.setForeground(new java.awt.Color(102, 102, 102));
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Previous");

        prev.setBackground(new java.awt.Color(255, 255, 255));
        prev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prev.setForeground(new java.awt.Color(51, 51, 51));
        prev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Current");

        curr.setBackground(new java.awt.Color(255, 255, 255));
        curr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        curr.setForeground(new java.awt.Color(51, 51, 51));
        curr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        curr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Unit Consumed (kWh)");

        button6.setBackground(new java.awt.Color(102, 102, 102));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("CALCULATE");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        unitConsumed.setEditable(false);
        unitConsumed.setBackground(new java.awt.Color(255, 255, 255));
        unitConsumed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unitConsumed.setForeground(new java.awt.Color(51, 51, 51));
        unitConsumed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unitConsumed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Total Payable (₱)");

        totalPay.setEditable(false);
        totalPay.setBackground(new java.awt.Color(255, 255, 255));
        totalPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalPay.setForeground(new java.awt.Color(51, 51, 51));
        totalPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        totalPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPayActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(102, 102, 102));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(102, 102, 102));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout copy1Layout = new javax.swing.GroupLayout(copy1);
        copy1.setLayout(copy1Layout);
        copy1Layout.setHorizontalGroup(
            copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copy1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curr, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(unitConsumed, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(copy1Layout.createSequentialGroup()
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(totalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        copy1Layout.setVerticalGroup(
            copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copy1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitConsumed, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(copy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/meter (1).png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("● To get the Unit Consumed (kWh) (previous - current)");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("● Unit Consumed x 11.3168");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("● Residential Rate for the month of April is ₱11.3168");

        javax.swing.GroupLayout copy2Layout = new javax.swing.GroupLayout(copy2);
        copy2.setLayout(copy2Layout);
        copy2Layout.setHorizontalGroup(
            copy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        copy2Layout.setVerticalGroup(
            copy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("● The value that the system provided is just estimation.");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("● By default, bill is calculated for 30 days only");

        javax.swing.GroupLayout electricoLayout = new javax.swing.GroupLayout(electrico);
        electrico.setLayout(electricoLayout);
        electricoLayout.setHorizontalGroup(
            electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(electricoLayout.createSequentialGroup()
                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(electricoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(copy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, electricoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(electricoLayout.createSequentialGroup()
                                .addComponent(copy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(electricoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meternum_electrico, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        electricoLayout.setVerticalGroup(
            electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(electricoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(copy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meternum_electrico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(electricoLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", electrico);

        appco.setBackground(new java.awt.Color(255, 255, 255));
        appco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perDayCost.setEditable(false);
        perDayCost.setBackground(new java.awt.Color(255, 255, 255));
        perDayCost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perDayCost.setForeground(new java.awt.Color(51, 51, 51));
        perDayCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perDayCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        perDayCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perDayCostActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Per Day");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cost");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Consume (kWh)");

        perDayConsume.setEditable(false);
        perDayConsume.setBackground(new java.awt.Color(255, 255, 255));
        perDayConsume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perDayConsume.setForeground(new java.awt.Color(51, 51, 51));
        perDayConsume.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perDayConsume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        perDayConsume.setPreferredSize(new java.awt.Dimension(216, 32));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Per Month");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Cost");

        perWeekCost.setEditable(false);
        perWeekCost.setBackground(new java.awt.Color(255, 255, 255));
        perWeekCost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perWeekCost.setForeground(new java.awt.Color(51, 51, 51));
        perWeekCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perWeekCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        perWeekCost.setPreferredSize(new java.awt.Dimension(216, 32));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Consume (kWh)");

        perWeekConsume.setEditable(false);
        perWeekConsume.setBackground(new java.awt.Color(255, 255, 255));
        perWeekConsume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perWeekConsume.setForeground(new java.awt.Color(51, 51, 51));
        perWeekConsume.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perWeekConsume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        perWeekConsume.setPreferredSize(new java.awt.Dimension(216, 32));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Per Year");
        jLabel15.setPreferredSize(new java.awt.Dimension(70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Cost");

        perMonthCost.setEditable(false);
        perMonthCost.setBackground(new java.awt.Color(255, 255, 255));
        perMonthCost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perMonthCost.setForeground(new java.awt.Color(51, 51, 51));
        perMonthCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perMonthCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Consume (kWh)");

        perMonthConsume.setEditable(false);
        perMonthConsume.setBackground(new java.awt.Color(255, 255, 255));
        perMonthConsume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perMonthConsume.setForeground(new java.awt.Color(51, 51, 51));
        perMonthConsume.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perMonthConsume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout appCalPanelLayout = new javax.swing.GroupLayout(appCalPanel);
        appCalPanel.setLayout(appCalPanelLayout);
        appCalPanelLayout.setHorizontalGroup(
            appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appCalPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appCalPanelLayout.createSequentialGroup()
                        .addGroup(appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(perWeekCost, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perDayCost, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perDayConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perWeekConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appCalPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(appCalPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(appCalPanelLayout.createSequentialGroup()
                .addGroup(appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perMonthCost, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(appCalPanelLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(appCalPanelLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(perMonthConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appCalPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        appCalPanelLayout.setVerticalGroup(
            appCalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appCalPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perDayCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perDayConsume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perWeekCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perWeekConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perMonthCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perMonthConsume, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        appco.add(appCalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 280, 590));

        appList.setBackground(new java.awt.Color(212, 238, 252));
        appList.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        appList.setForeground(new java.awt.Color(51, 51, 51));
        appList.setMaximumRowCount(20);
        appList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Appliance ", " " }));
        appList.setBorder(null);
        appList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appListActionPerformed(evt);
            }
        });
        appco.add(appList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, 40));

        consump.setBackground(new java.awt.Color(212, 238, 252));
        consump.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        consump.setForeground(new java.awt.Color(102, 102, 102));
        consump.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        consump.setText("Consumption");
        consump.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        consump.setMargin(new java.awt.Insets(5, 6, 2, 6));
        consump.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                consumpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                consumpFocusLost(evt);
            }
        });
        appco.add(consump, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 280, 40));

        watts.setBackground(new java.awt.Color(212, 238, 252));
        watts.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        watts.setForeground(new java.awt.Color(51, 51, 51));
        watts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Watts (W)", "kiloWatts(kW)" }));
        watts.setBorder(null);
        watts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wattsActionPerformed(evt);
            }
        });
        appco.add(watts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 280, 40));

        hours.setBackground(new java.awt.Color(212, 238, 252));
        hours.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hours.setForeground(new java.awt.Color(102, 102, 102));
        hours.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hours.setText("Hours");
        hours.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        hours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hoursFocusLost(evt);
            }
        });
        appco.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 280, 40));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(212, 238, 252));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 102, 102));
        jTextField9.setText("  ₱11.3168 per kWh");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        appco.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 280, 40));

        appCalReset.setBackground(new java.awt.Color(102, 102, 102));
        appCalReset.setForeground(new java.awt.Color(255, 255, 255));
        appCalReset.setText("RESET");
        appCalReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appCalReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                appCalResetMouseReleased(evt);
            }
        });
        appCalReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appCalResetActionPerformed(evt);
            }
        });
        appco.add(appCalReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 110, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("As of April 2023 (Meralco)");
        appco.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 220, -1));

        javax.swing.GroupLayout copy3Layout = new javax.swing.GroupLayout(copy3);
        copy3.setLayout(copy3Layout);
        copy3Layout.setHorizontalGroup(
            copy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        copy3Layout.setVerticalGroup(
            copy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        appco.add(copy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, 30));

        javax.swing.GroupLayout copy4Layout = new javax.swing.GroupLayout(copy4);
        copy4.setLayout(copy4Layout);
        copy4Layout.setHorizontalGroup(
            copy4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        copy4Layout.setVerticalGroup(
            copy4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        appco.add(copy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 340, 30));

        appCalButton.setBackground(new java.awt.Color(102, 102, 102));
        appCalButton.setForeground(new java.awt.Color(255, 255, 255));
        appCalButton.setText("CALCULATE");
        appCalButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appCalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                appCalButtonMouseReleased(evt);
            }
        });
        appCalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appCalButtonActionPerformed(evt);
            }
        });
        appco.add(appCalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 30));

        jTabbedPane1.addTab("tab3", appco);

        gbill.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Select Month:");

        copy5.setPreferredSize(new java.awt.Dimension(635, 30));

        javax.swing.GroupLayout copy5Layout = new javax.swing.GroupLayout(copy5);
        copy5.setLayout(copy5Layout);
        copy5Layout.setHorizontalGroup(
            copy5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        copy5Layout.setVerticalGroup(
            copy5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        copy6.setPreferredSize(new java.awt.Dimension(635, 30));

        javax.swing.GroupLayout copy6Layout = new javax.swing.GroupLayout(copy6);
        copy6.setLayout(copy6Layout);
        copy6Layout.setHorizontalGroup(
            copy6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        copy6Layout.setVerticalGroup(
            copy6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        monthBox.setBackground(new java.awt.Color(212, 238, 252));
        monthBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthBox.setForeground(new java.awt.Color(102, 102, 102));
        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        generate.setBackground(new java.awt.Color(102, 102, 102));
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("GENERATE BILL");
        generate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE BILL");
        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gbillLayout = new javax.swing.GroupLayout(gbill);
        gbill.setLayout(gbillLayout);
        gbillLayout.setHorizontalGroup(
            gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gbillLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copy5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copy6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(gbillLayout.createSequentialGroup()
                .addGroup(gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gbillLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gbillLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gbillLayout.setVerticalGroup(
            gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbillLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(copy5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(246, 246, 246)
                .addComponent(copy6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("tab4", gbill);

        accInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CUSTOMER ACCOUNT INFORMATION");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Meter Number");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Address");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Password");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Phone #");

        accName.setEditable(false);
        accName.setBackground(new java.awt.Color(212, 238, 252));
        accName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accName.setForeground(new java.awt.Color(102, 102, 102));
        accName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accName.setText("Russell Kelvin Anthony Loreto");
        accName.setBorder(null);

        accNumber.setEditable(false);
        accNumber.setBackground(new java.awt.Color(212, 238, 252));
        accNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accNumber.setForeground(new java.awt.Color(102, 102, 102));
        accNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accNumber.setText("123456");
        accNumber.setBorder(null);
        accNumber.setPreferredSize(new java.awt.Dimension(198, 20));

        accAdd.setEditable(false);
        accAdd.setBackground(new java.awt.Color(212, 238, 252));
        accAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accAdd.setForeground(new java.awt.Color(102, 102, 102));
        accAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accAdd.setText("Bagong Silang ");
        accAdd.setBorder(null);
        accAdd.setPreferredSize(new java.awt.Dimension(198, 20));
        accAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accAddActionPerformed(evt);
            }
        });

        accPhone.setEditable(false);
        accPhone.setBackground(new java.awt.Color(212, 238, 252));
        accPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accPhone.setForeground(new java.awt.Color(102, 102, 102));
        accPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accPhone.setText("09093206353");
        accPhone.setBorder(null);
        accPhone.setPreferredSize(new java.awt.Dimension(198, 20));

        accPass.setBackground(new java.awt.Color(212, 238, 252));
        accPass.setForeground(new java.awt.Color(102, 102, 102));
        accPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accPass.setText("password");
        accPass.setBorder(null);
        accPass.setPreferredSize(new java.awt.Dimension(198, 20));

        button9.setBackground(new java.awt.Color(102, 102, 102));
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("EDIT INFORMATION");
        button9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Username");

        accUser.setEditable(false);
        accUser.setBackground(new java.awt.Color(212, 238, 252));
        accUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accUser.setForeground(new java.awt.Color(102, 102, 102));
        accUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accUser.setText("kiotsukettene");
        accUser.setBorder(null);
        accUser.setPreferredSize(new java.awt.Dimension(198, 20));

        button10.setBackground(new java.awt.Color(102, 102, 102));
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("SAVE CHANGES");
        button10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout copy7Layout = new javax.swing.GroupLayout(copy7);
        copy7.setLayout(copy7Layout);
        copy7Layout.setHorizontalGroup(
            copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copy7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(copy7Layout.createSequentialGroup()
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(copy7Layout.createSequentialGroup()
                        .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accUser, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accPass, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accName))))
                .addGap(50, 50, 50))
        );
        copy7Layout.setVerticalGroup(
            copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copy7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(copy7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        copy8.setPreferredSize(new java.awt.Dimension(635, 30));

        javax.swing.GroupLayout copy8Layout = new javax.swing.GroupLayout(copy8);
        copy8.setLayout(copy8Layout);
        copy8Layout.setHorizontalGroup(
            copy8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        copy8Layout.setVerticalGroup(
            copy8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        copy9.setPreferredSize(new java.awt.Dimension(635, 30));

        javax.swing.GroupLayout copy9Layout = new javax.swing.GroupLayout(copy9);
        copy9.setLayout(copy9Layout);
        copy9Layout.setHorizontalGroup(
            copy9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        copy9Layout.setVerticalGroup(
            copy9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout accInfoLayout = new javax.swing.GroupLayout(accInfo);
        accInfo.setLayout(accInfoLayout);
        accInfoLayout.setHorizontalGroup(
            accInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(accInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copy9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copy8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(copy7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        accInfoLayout.setVerticalGroup(
            accInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(copy8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(copy7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(copy9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("tab1", accInfo);

        helpsupp.setBackground(new java.awt.Color(255, 255, 255));
        helpsupp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Help and Support");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("<html><b> Welcome to the Help and Support section of our system! </b><br><br><br> <div style='text-align: justify;'>  &nbsp &nbsp &nbsp &nbsp Here, we provide a range of resources to help you make the most of our  platform and answer any questions you may have.  Our Help and Support section  includes features such as tutorials and guides, energy saver tips, and privacy and safety policies.  Whether you are a new user or a long-time customer, our  Help and Support section is designed to provide you with the information and resources you need to succeed. <br><br><br>  &nbsp &nbsp &nbsp &nbsp  We believe that by providing our users with the best possible support, we can help them achieve their energy-saving goals and enjoy a more sustainable future.     So, if you're looking for guidance on how to use a specific feature, tips on how to save energy, or information about our data collection practices, you've come to    the right place. We're here to help you every step of the way, and we hope that our Help and Support section will be a valuable resource for you. </html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("<html><div style='text-align:justify;'> &nbsp&nbsp <b>● Customer management tool </b><br> A customer management tool stores customer data, allowing businesses to manage their customer base efficiently. It includes features like adding new customers, logging existing ones, and accessing their billing history. <br><br>   &nbsp&nbsp <b>● The Meter Reading System</b> <br>  This system checks your paper bill for accuracy and calculates your monthly bill using a simple formula. Enter the previous and current meter readings from your paper bill and the system will calculate the units consumed and estimated bill. Use this information to check your bill and track usage over time.  <br><br>  &nbsp&nbsp <b>● Appliance Estimated Calculator </b><br> This feature is  designed to help users estimate their electricity consumption and costs for a specific appliance. The system provides a list of common household appliances that users  can choose from, and automatically provides an average watts per hour consumption rate for each appliance (although this may vary depending on the specific brand or  model of the appliance).<br><br> &nbsp&nbsp <b>● Generate Bills</b><br> This feature saves information calculated by the Electric Calculator and creates bills for users.  Users select the month and year, and the system retrieves information such as user details, meter readings, consumption, due date, and total amount  due. The user can then print or view the bill on their device to track their electricity usage and payments.  </html>");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Features");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("tab2", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Guides");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("<html><div style='text-align: justify;'> \n\n<b>● Electrico Electric Calculator</b> <br>\n\n&nbsp&nbsp To use the system, you need to have your paper bill handy. On the bill, you will find the previous and current meter readings. Enter the previous reading in the 'previous' field and the current reading in the 'current' field of the calculator.\n\nThe system will then calculate the number of units you have consumed by subtracting the previous reading from the current reading. It will then use this figure to estimate your monthly bill by multiplying it by a fixed rate of 11.3168. The result will be displayed on the screen.\n\n<br><br>\n<b>● Appliance Estimated Consumption Calculator</b><br>\n\n&nbsp&nbsp This calculator helps users estimate the electricity consumption and costs for a specific household appliance. Users can choose from a list of common appliances, select watts or kilowatts, and input the hours per day they use the appliance. The system then calculates the estimated amount of electricity consumed in watts and cost per day, week, and month. It helps users make informed decisions about their energy usage and budgeting.\n\n<br><br>\n<b>● Generate bills</b><br>\n\n&nbsp&nbsp This feature saves info calculated with the Electric Calculator and creates bills as needed. Users select the month for billing, and the system retrieves details such as name, address, meter number, and usage info to generate the bill. Users can print or view the bill for easy tracking of usage and payments.</html>");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(14, 14, 14))
        );

        jTabbedPane2.addTab("tab3", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Tips");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("<html><div style='text-align:justify;'>\nElectri'Co system can calculate the estimated daily or\nweekly consumption of appliances and can also help to know the monthly electricity consumption. However, we have some\ntips on how you will be able to save energy costs and prevent paying high bills. \n<br><br>\n\t&emsp <b>Here are some tips:</b><br><br>\n&nbsp&nbsp&nbsp 1. Switch off the appliance itself or turn it off at the plug if possible<br><br>\n&nbsp&nbsp&nbsp 2. Turn off the lights when not in use<br><br>\n&nbsp&nbsp&nbsp 3. Keep appliances clean and well-maintained to ensure they run efficiently.<br><br>\n&nbsp&nbsp&nbsp 4. Check the energy consumption of appliances before purchasing<br><br>\n&nbsp&nbsp&nbsp 5. Open your curtains or blinds during the day to let in natural light.  \n</html>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel7);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Safety and Privacy Policy");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("<html><div style='text-align:justify;'> Electric'Co values your Personal Information and ensures that your Personal Data are protected from collection to disposal.   This Privacy Statement serves as our notice to all our data subjects on how we keep our privacy practices consistent with the data privacy principles of transparency,  legitimate purpose, and proportionality.  <br><br> This Privacy Policy protects Personal Information against accidental or intentional exposure, alteration, loss, or any unauthorized  processing such as creation, collection, distribution, and destruction.  We are committed to ensuring that your personal information is protected from collection  to disposal under the laws of the Philippines.  <br><br>You have a right to know how and why we gather your personal information. You also have the right to access a copy of  your personal information in our possession; the right to withdraw consent that you previously gave; the right to have your information corrected if you believe that it is  inaccurate or incomplete; and the right to erase or block your information from our databases.</html>");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(512, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab6", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("How...");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("<html><div style='text-align:justify;'> These data include any other information that you provide to us for any legitimate purpose declared at the point of collection as well as information about you.  <br><br><br>\n &nbsp &nbsp 1. We will be collecting the following information from you: This system will be collecting your name, address (i.e. postal address, geographical coordinates, and open location\n codes), phone number, and meter number.<br><br> &nbsp &nbsp 2. The Information you provide us when you register at our customer portal, outage notifications, and billing services.  \n<br><br> &nbsp &nbsp 3. Electri'co-related information that you post on your social media accounts, such as your posts on Twitter, Facebook, YouTube, etc. that talk about your experience in\n transacting with our system.  </html>");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab7", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Why...");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("<html><div style='text-align: justify;'> We store, process, and analyze the personal data collected for some legitimate purpose, related or incidental to the conduct of our system including\n maintaining safety and security. <br><br><br>\n&nbsp &nbsp 1. Information collected from social media will not be used against you or to hold you in a negative light, except if the social \nmedia activity promotes fraud or any illegal act that can hurt others.  <br><br> \n&nbsp &nbsp 2. We process your data to administer and update your customer data; compute your electric\n consumption and verify your identity when you access your account through our system. <br><br>\n&nbsp &nbsp 3. We collect and process your personal data to comply with the existing laws,\n rules, and regulations, as well as ordinances, issued or mandated by the government. </html>");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab8", jPanel14);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Whom...");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("<html> <div style='text-align;'> We can assure you that the data will be limited only to the administrators and users of this system. <br><br>\n\nYou are responsible for the security of your information once it reaches you or your representative in any medium. You should take appropriate measures to ensure that any medium or device you use to monitor or manage your account is secure and not accessible to anyone without permission. </html>");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(517, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab5", jPanel11);

        helpsupp.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -31, 490, 650));

        intro.setForeground(new java.awt.Color(0, 51, 255));
        intro.setText("Intro");
        intro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                introMousePressed(evt);
            }
        });
        helpsupp.add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        feat.setForeground(new java.awt.Color(0, 51, 255));
        feat.setText("Features");
        feat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                featMousePressed(evt);
            }
        });
        helpsupp.add(feat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));

        guide.setForeground(new java.awt.Color(0, 51, 255));
        guide.setText("Guides");
        guide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guideMousePressed(evt);
            }
        });
        helpsupp.add(guide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, -1));

        tips.setForeground(new java.awt.Color(0, 51, 255));
        tips.setText("Tips");
        tips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tipsMousePressed(evt);
            }
        });
        helpsupp.add(tips, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, -1));

        safety.setForeground(new java.awt.Color(0, 51, 255));
        safety.setText("Safety and Privacy Policy");
        safety.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                safetyMousePressed(evt);
            }
        });
        helpsupp.add(safety, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        how.setForeground(new java.awt.Color(0, 51, 255));
        how.setText("How");
        how.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                howMousePressed(evt);
            }
        });
        helpsupp.add(how, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        why.setForeground(new java.awt.Color(0, 51, 255));
        why.setText("Why");
        why.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                whyMousePressed(evt);
            }
        });
        helpsupp.add(why, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 20));

        whom.setForeground(new java.awt.Color(0, 51, 255));
        whom.setText("Whom");
        whom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                whomMousePressed(evt);
            }
        });
        helpsupp.add(whom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, -1));

        jTabbedPane1.addTab("tab5", helpsupp);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -40, 670, 650));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        button1.setBackground(clickedcolor);
        button1.setForeground(white);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
        button8.setBackground(white);
        button8.setForeground(defaultcolor);
      
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        button2.setBackground(clickedcolor);
        button2.setForeground(white);
        button1.setForeground(defaultcolor);
        button1.setBackground(white);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
        button8.setBackground(white);
        button8.setForeground(defaultcolor);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button1.setForeground(defaultcolor);
        button1.setBackground(white);
        button3.setBackground(clickedcolor);
        button3.setForeground(white);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
                button8.setBackground(white);
        button8.setForeground(defaultcolor);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        button1.setForeground(defaultcolor);
        button1.setBackground(white);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(clickedcolor);
        button4.setForeground(white);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
        button8.setBackground(white);
        button8.setForeground(defaultcolor);
        
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        button1.setForeground(defaultcolor);
        button1.setBackground(white);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(clickedcolor);
        button5.setForeground(white);
        button8.setBackground(white);
        button8.setForeground(defaultcolor);
    }//GEN-LAST:event_button5ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        button1.setBackground(white);
        button1.setForeground(defaultcolor);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
        button8.setBackground(white);
        button8.setForeground(defaultcolor);
    }//GEN-LAST:event_jLabel6MousePressed

    private void perDayCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perDayCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perDayCostActionPerformed

    private void appCalResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appCalResetActionPerformed
        consump.setText("Consumption");
        hours.setText("Hours");
        perDayCost.setText("");
        perDayConsume.setText("");
        perWeekCost.setText("");
        perWeekConsume.setText("");
        perMonthCost.setText("");
        perMonthConsume.setText("");
        
        
          double costDay, costWeek, costMonth;
          double consumedDay, consumedWeek, consumedMonth;

         
          double rate = 11.3168;
          
          consump.setForeground(new Color(153,153,153));
          hours.setForeground(new Color(153,153,153));
        if (!consump.getText().equals("Consumption") && !hours.getText().equals("Hours"))
        {
           
            double wattage = Double.parseDouble(consump.getText());
            double timeConsumed = Double.parseDouble(hours.getText());
            
            if (watts.getSelectedItem().equals("kiloWatts(kW)")){
            
            consumedDay = wattage * timeConsumed;
            perDayConsume.setText(String.format("%.2f", (consumedDay)));
            costDay = consumedDay * rate;
            perDayCost.setText("₱" + df.format(costDay));
            
            costWeek = costDay * 7;
            perWeekCost.setText("₱" + df.format(costWeek));
            consumedWeek = Math.round(consumedDay * 7 * 100.0) / 100.0; 
            perWeekConsume.setText(Double.toString(consumedWeek));
            
            costMonth = costDay * 30;
            perMonthCost.setText("₱" + df.format(costMonth));
            consumedMonth = Math.round(consumedDay * 30 * 100.0) / 100.0;
            perMonthConsume.setText(Double.toString(consumedMonth));
            
        }
        
            else if (!consump.getText().equals("Consumption") && !hours.getText().equals("Hours")) {
 
            consumedDay = (wattage * timeConsumed) / 1000;
            perDayConsume.setText(String.format("%.2f", (consumedDay)));
            costDay = consumedDay * rate;
            perDayCost.setText("₱" + df.format(costDay));
            
            costWeek = costDay * 7; 
            perWeekCost.setText("₱" + df.format(costWeek)); 
            consumedWeek = (wattage * timeConsumed * 7 ) / 1000; 
            perWeekConsume.setText(Double.toString(consumedWeek));
            
            costMonth = costDay * 30;
            perMonthCost.setText("₱" + df.format(costMonth));
            consumedMonth = (wattage * timeConsumed * 30) / 1000;
            perMonthConsume.setText(Double.toString(consumedMonth));
        }
        }
    }//GEN-LAST:event_appCalResetActionPerformed

    private void appCalResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appCalResetMouseReleased
        // TODO add your handling coe here
    }//GEN-LAST:event_appCalResetMouseReleased

    private void consumpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consumpFocusGained
        // TODO add your handling code here:
        if (consump.getText().equals("Consumption")) {
            consump.setText("");
            consump.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_consumpFocusGained

    private void hoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hoursFocusLost
        
        if (hours.getText().equals("")){
            hours.setText("Hours");
            hours.setForeground(defaultcolor);
        }
    }//GEN-LAST:event_hoursFocusLost

    private void consumpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consumpFocusLost
        if (consump.getText().equals("")){
            consump.setText("Consumption");
            consump.setForeground(defaultcolor);
        }
    }//GEN-LAST:event_consumpFocusLost

    private void hoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hoursFocusGained
        // TODO add your handling code here:
         if (hours.getText().equals("Hours")) {
            hours.setText("");
            hours.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_hoursFocusGained

    private void totalPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPayActionPerformed

    private void accAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accAddActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        String date = monthBox.getSelectedItem().toString();
        String mnum = meternum_electrico.getText();
        String updname = accName.getText();
        String updnum = accNumber.getText();
        String updadd = accAdd.getText();
        String updphone = accPhone.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            String sqlurl = "SELECT meternumber, previous, current, unitconsumed, totalpayable FROM billdata WHERE month = ? AND meternumber = ? ";
            PreparedStatement pst = sqlcon.prepareStatement(sqlurl);
            pst.setString(1, date);
            pst.setString(2, mnum);
            ResultSet result = pst.executeQuery();
            
            if (result.next()) {
                String mnumber = result.getString("meternumber");
                String previous = result.getString("previous");
                String current = result.getString("current");
                String unitconsumed = result.getString("unitconsumed");
                String totalpayable = result.getString("totalpayable");
                
                if (mnumber.equals(meternumber)) {
                    BillandReceipt bill = new BillandReceipt(mnumber, date, previous, current, unitconsumed, totalpayable, updname, updadd, updphone);
                    String nextMonth = getNextMonth(date);
                    
                    BillandReceipt.fname.setText(fullname);
                    BillandReceipt.place.setText(add);
                    BillandReceipt.billPeriod.setText(date + " to " + nextMonth + " 2023");
                    BillandReceipt.billdate.setText(nextMonth + " 2023");
                    BillandReceipt.dateMeterRead.setText(date + " 2023");
                    BillandReceipt.dateNextRead.setText(nextMonth + " 2023");
                    BillandReceipt.meter_number.setText(mnumber);
                    BillandReceipt.curr_read.setText(current);
                    BillandReceipt.prev_read.setText(previous);
                    BillandReceipt.actual_consump.setText(unitconsumed);
                    BillandReceipt.metNumber.setText(mnumber);
                    BillandReceipt.due.setText(nextMonth);
                    BillandReceipt.payable.setText(totalpayable);
                    BillandReceipt.fname.setText(updname);
                    BillandReceipt.place.setText(updadd);
                    bill.setVisible(true);
                }
                
                else {
                    JOptionPane.showMessageDialog(null,  "You don't have any data submitted here!!");
                }
                
                        
            }
            else {
                JOptionPane.showMessageDialog(null, "There is no inputed data for this month");
            } sqlcon.close();
        }
        
        catch(HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
 
    }//GEN-LAST:event_generateActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
        double rate = 11.3168;
        int previous = Integer.parseInt(prev.getText());
        int current = Integer.parseInt(curr.getText());
       
        int unit; 
        double total;
        
        if (current >= previous ) {
            unit = current - previous;   
            total = unit * rate;

            unitConsumed.setText(unitConsumed.getText() + unit);
            totalPay.setText(totalPay.getText() + "₱" + df.format(total));
        }
        
        else {
            unit = previous - current;   
            total = unit * rate;

            unitConsumed.setText(unitConsumed.getText() + unit);
            totalPay.setText(totalPay.getText() + "₱" + df.format(total));
        }
        
        
        
    }//GEN-LAST:event_button6ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
 
        double rate = 11.3168;
        int previous;
        int current;

        int unit;
        double total;

        prev.setText("");
        curr.setText("");
        unitConsumed.setText("");
        totalPay.setText("");

        if (!prev.getText().equals("") && !curr.getText().equals("")){
            previous = Integer.parseInt(prev.getText());
            current = Integer.parseInt(curr.getText());
            unit = previous - current;
            unitConsumed.setText(Integer.toString(unit));
            total = unit * rate;
            totalPay.setText("₱" + df.format(total));
}
    }//GEN-LAST:event_resetActionPerformed

    private void appCalButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appCalButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_appCalButtonMouseReleased

    private void appCalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appCalButtonActionPerformed
        double wattage = Double.parseDouble(consump.getText());
         
         
          double timeConsumed = Double.parseDouble(hours.getText());
          
          double costDay, costWeek, costMonth;
          double consumedDay, consumedWeek, consumedMonth;
          double rate = 11.3168;
          
          
        if (watts.getSelectedItem().equals("kiloWatts(kW)")){
            
            consumedDay = wattage * timeConsumed;
            perDayConsume.setText(String.format("%.2f", (consumedDay)));
            costDay = consumedDay * rate;
            perDayCost.setText("₱" + df.format(costDay));
            
            costWeek = costDay * 7;
            perWeekCost.setText("₱" + df.format(costWeek));
            consumedWeek = Math.round(consumedDay * 7 * 100.0) / 100.0; 
            perWeekConsume.setText(Double.toString(consumedWeek));
            
            costMonth = costDay * 30;
            perMonthCost.setText("₱" + df.format(costMonth));
            consumedMonth = Math.round(consumedDay * 30 * 100.0) / 100.0;
            perMonthConsume.setText(Double.toString(consumedMonth));
            
        }
        
        else {
 
            consumedDay = (wattage * timeConsumed) / 1000;
            perDayConsume.setText(String.format("%.2f", (consumedDay)));
            costDay = consumedDay * rate;
            perDayCost.setText("₱" + df.format(costDay));
            
            costWeek = costDay * 7;
            perWeekCost.setText("₱" + df.format(costWeek));
            consumedWeek = (wattage * timeConsumed * 7 ) / 1000;
            perWeekConsume.setText(Double.toString(consumedWeek)); 
            
            costMonth = costDay * 30;
            perMonthCost.setText("₱" + df.format(costMonth));
            consumedMonth = (wattage * timeConsumed * 30) / 1000;
            perMonthConsume.setText(Double.toString(consumedMonth));
        }
    }//GEN-LAST:event_appCalButtonActionPerformed

    private void appListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appListActionPerformed
            String ItemName = (String) appList.getSelectedItem();
            consump.setText(String.valueOf(hash_map.get(ItemName)));
    }//GEN-LAST:event_appListActionPerformed

    private void wattsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wattsActionPerformed
        
        
        double wattage = Double.parseDouble(consump.getText());
         
        if (watts.getSelectedItem().equals("kiloWatts(kW)")){
            
            double convert = wattage / 1000;
            consump.setText(String.valueOf(convert));
        }
        
        else {
 
            double convertback = wattage * 1000;
            int convertedWattage = (int) convertback;
            consump.setText(String.valueOf(convertedWattage));
        }
        
    }//GEN-LAST:event_wattsActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        button1.setForeground(defaultcolor);
        button1.setBackground(white);
        button2.setBackground(white);
        button2.setForeground(defaultcolor);
        button3.setBackground(white);
        button3.setForeground(defaultcolor);
        button4.setBackground(white);
        button4.setForeground(defaultcolor);
        button5.setBackground(white);
        button5.setForeground(defaultcolor);
        button8.setBackground(clickedcolor);
        button8.setForeground(white);
        
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "LOGOUT YOUR ACCOUNT",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (choice == JOptionPane.YES_OPTION) {
            Frontpage login = new Frontpage();
            login.setVisible(true);
            dispose();
        }
        
        
        

    }//GEN-LAST:event_button8ActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBorder(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        
        accName.setBackground(white);
        accAdd.setBackground(white);
        accPhone.setBackground(white);
        accPass.setBackground(white);
        accUser.setBackground(white);
        
        accName.setEditable(true);
        accAdd.setEditable(true);
        accPhone.setEditable(true);
        accPass.setEditable(true);
        accUser.setEditable(true);
            
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
       String updname = accName.getText();
       String updnum = accNumber.getText();
       String updadd = accAdd.getText();
       String updphone = accPhone.getText();
       String updpass = accPass.getText();
       
       
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            
            String sql = "UPDATE userregistration SET fname = ?, crePass = ?, mNumber = ?, address = ?, phoneNum = ? WHERE cUser = ?";
           
            PreparedStatement pst = sqlcon.prepareStatement(sql);
            pst.setString(1, updname);
            pst.setString(2, updpass);
            pst.setString(3, updnum);
            pst.setString(4, updadd);
            pst.setString(5, updphone);
            pst.setString(6, user);
            
            int rowsUpd = pst.executeUpdate();
            
            if (rowsUpd > 0 ) {
                JOptionPane.showMessageDialog(null, "Updated Successfuly!!!");
                        accName.setBackground(new java.awt.Color(212, 238, 252));
                        accNumber.setBackground(new java.awt.Color(212, 238, 252));
                        accAdd.setBackground(new java.awt.Color(212, 238, 252));
                        accPhone.setBackground(new java.awt.Color(212, 238, 252));
                        accPass.setBackground(new java.awt.Color(212, 238, 252));
                        accUser.setBackground(new java.awt.Color(212, 238, 252));

                        accName.setEditable(false);
                        accNumber.setEditable(false);
                        accAdd.setEditable(false);
                        accPhone.setEditable(false);
                        accPass.setEditable(false);
                        accUser.setEditable(false);
                        
                        navname.setText(updname);
                        meternum.setText(updnum);
                        meternum_electrico.setText(updnum);
                        
                        
                        
                        
                        
            }
                sqlcon.close();
        }
            
            
        catch (HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
                    }
    }//GEN-LAST:event_button10ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String mnumber = meternum_electrico.getText();
        String month = monthbox.getSelectedItem().toString();
        String prevBill = prev.getText();
        String currBill = curr.getText();
        String unit = unitConsumed.getText();
        String total = totalPay.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            
            String sqlCheck = "SELECT COUNT(*) FROM billdata WHERE meternumber = ? AND month = ?";
            PreparedStatement pstmtCheck = sqlcon.prepareStatement(sqlCheck);
            pstmtCheck.setString(1, mnumber);
            pstmtCheck.setString(2, month);
            ResultSet rs = pstmtCheck.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "You have already submitted a bill for this month!!");
                return;
    }
            String sqltable = "INSERT into billdata (meternumber, month, previous, current, unitconsumed, totalpayable) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = sqlcon.prepareStatement(sqltable);
            pstmt.setString(1, mnumber);
            pstmt.setString(2, month);
            pstmt.setString(3, prevBill);
            pstmt.setString(4, currBill);
            pstmt.setString(5, unit);
            pstmt.setString(6, total);
           
            
            int b = pstmt.executeUpdate();
            
            if (b == 1) {
                JOptionPane.showMessageDialog(null, "Your Bill is added successfully");
                
            }
            else {
                JOptionPane.showMessageDialog(null, "There is an error adding your bill");
            }
            sqlcon.close();
        }
        
        catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void introMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introMousePressed
        jTabbedPane2.setSelectedIndex(0);
        intro.setText("<html><u>Intro</u></html>");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        whom.setText("Why");
        why.setText("Whom");
        
        
        
    }//GEN-LAST:event_introMousePressed

    private void featMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_featMousePressed
       jTabbedPane2.setSelectedIndex(1);
        intro.setText("Intro");
        feat.setText("<html><u>Features</u></html>");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        whom.setText("Why");
        why.setText("Whom");
    }//GEN-LAST:event_featMousePressed

    private void guideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideMousePressed
        jTabbedPane2.setSelectedIndex(2);
        intro.setText("Intro");
        feat.setText("Features");
        guide.setText("<html><u>Guides</u></html>");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        whom.setText("Why");
        why.setText("Whom");
    }//GEN-LAST:event_guideMousePressed

    private void tipsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipsMousePressed
        jTabbedPane2.setSelectedIndex(3);
        intro.setText("Intro");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("<html><u>Tips</u></html>");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        whom.setText("Why");
        why.setText("Whom");
    }//GEN-LAST:event_tipsMousePressed

    private void safetyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_safetyMousePressed
        jTabbedPane2.setSelectedIndex(5);
        intro.setText("Intro");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("<html><u>Safety and Privacy Policy</u></html>");
        how.setText("How");
        whom.setText("Why");
        why.setText("Whom");
    }//GEN-LAST:event_safetyMousePressed

    private void howMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howMousePressed
       jTabbedPane2.setSelectedIndex(6);
       intro.setText("Intro");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("<html><u>How</u></html>");
        whom.setText("Why");
        why.setText("Whom");
    }//GEN-LAST:event_howMousePressed

    private void whomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whomMousePressed
        jTabbedPane2.setSelectedIndex(4);
        intro.setText("Intro");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        why.setText("Why");
        whom.setText("<html><u>Whom</u></html>");
    }//GEN-LAST:event_whomMousePressed

    private void whyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whyMousePressed
        jTabbedPane2.setSelectedIndex(7);
        intro.setText("Intro");
        feat.setText("Features");
        guide.setText("Guides");
        tips.setText("Tips");
        safety.setText("Safety and Privacy Policy");
        how.setText("How");
        why.setText("<html><u>Why</u></html>");
        whom.setText("<html><u>Whom</u></html>");
    }//GEN-LAST:event_whyMousePressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String mnumber = meternum_electrico.getText();
        String month = monthBox.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            String sqlDelete = "DELETE from billdata WHERE meternumber = ? and month = ?";
            PreparedStatement pst = sqlcon.prepareStatement(sqlDelete);
            pst.setString(1, mnumber);
            pst.setString(2, month);
            
            int d = pst.executeUpdate();
            
            if (d == 1) {
                int select = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO DELETE??", "DELETE BILL",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if (select == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Deleted Successfully");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "No record found to delete!!");
            }
            
        }
        
        catch(HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField accAdd;
    private javax.swing.JPanel accInfo;
    public static javax.swing.JTextField accName;
    public static javax.swing.JTextField accNumber;
    public static javax.swing.JPasswordField accPass;
    public static javax.swing.JTextField accPhone;
    public static javax.swing.JTextField accUser;
    private swing.Button appCalButton;
    private main.copy appCalPanel;
    private swing.Button appCalReset;
    private javax.swing.JComboBox<String> appList;
    private javax.swing.JPanel appco;
    private swing.Button button1;
    public static swing.Button button10;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    private swing.Button button5;
    private swing.Button button6;
    private swing.Button button8;
    private swing.Button button9;
    private javax.swing.JTextField consump;
    private main.copy copy1;
    private main.copy copy2;
    private main.copy copy3;
    private main.copy copy4;
    private main.copy copy5;
    private main.copy copy6;
    private main.copy copy7;
    private main.copy copy8;
    private main.copy copy9;
    private javax.swing.JTextField curr;
    private javax.swing.JLabel defLabel;
    private javax.swing.JLabel defLabel2;
    private swing.Button delete;
    private javax.swing.JPanel desc;
    private javax.swing.JPanel electrico;
    private javax.swing.JLabel feat;
    private javax.swing.JPanel gbill;
    private swing.Button generate;
    private javax.swing.JLabel guide;
    private javax.swing.JPanel helpsupp;
    private javax.swing.JTextField hours;
    private javax.swing.JLabel how;
    private javax.swing.JLabel intro;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JTextField meternum;
    public static javax.swing.JTextField meternum_electrico;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JComboBox<String> monthbox;
    public static javax.swing.JTextField navname;
    private main.PanelCustom panelCustom1;
    private javax.swing.JTextField perDayConsume;
    private javax.swing.JTextField perDayCost;
    private javax.swing.JTextField perMonthConsume;
    private javax.swing.JTextField perMonthCost;
    private javax.swing.JTextField perWeekConsume;
    private javax.swing.JTextField perWeekCost;
    private javax.swing.JTextField prev;
    private swing.Button reset;
    private javax.swing.JLabel safety;
    private swing.Button submit;
    private javax.swing.JLabel tips;
    private javax.swing.JTextField totalPay;
    private javax.swing.JTextField unitConsumed;
    private javax.swing.JComboBox<String> watts;
    private javax.swing.JLabel whom;
    private javax.swing.JLabel why;
    // End of variables declaration//GEN-END:variables
}
