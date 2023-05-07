/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;


public class NavBar extends javax.swing.JPanel {

   
    private MigLayout layout;
    private Nav nav;
    
    public static Color MyframeColor = new Color (255, 255, 255);
    
    public NavBar() {
        initComponents();
        init();
    }
    
    private void init() {
        setBackground(MyframeColor);
        layout = new MigLayout ("fill", "fill", "fill");
        setLayout(layout);
        nav = new Nav();
        add(nav, "pos (35%)-300px 0.5al n n");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
