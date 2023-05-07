/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import javax.swing.JTabbedPane;

/**
 *
 * @author Administrator
 */
public class Nav extends PanelCustom {


    public Nav() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new swing.Button();
        button2 = new swing.Button();
        button3 = new swing.Button();
        button4 = new swing.Button();
        button5 = new swing.Button();

        setBackground(new java.awt.Color(212, 238, 252));

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setForeground(new java.awt.Color(102, 102, 102));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/acc.png"))); // NOI18N
        button1.setText("Account Information");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setForeground(new java.awt.Color(102, 102, 102));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cal.png"))); // NOI18N
        button2.setText("Electri'Co Calculator");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setForeground(new java.awt.Color(102, 102, 102));
        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/appliance.png"))); // NOI18N
        button3.setText("Appliance'Co Calculator");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setForeground(new java.awt.Color(102, 102, 102));
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        button4.setText("Generate Bill & Receipt");
        button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        button5.setBackground(new java.awt.Color(255, 255, 255));
        button5.setForeground(new java.awt.Color(102, 102, 102));
        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        button5.setText("Help & Support");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(524, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    private swing.Button button5;
    // End of variables declaration//GEN-END:variables
}
