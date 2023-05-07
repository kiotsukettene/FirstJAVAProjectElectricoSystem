/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Administrator
 */
public class TextField extends JTextField{

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
    
    private String hint = "";
   
    public TextField () {
        
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(new Color(0,0,0,0));
        setForeground(new Color(102,102,102));
        setHorizontalAlignment(JTextField.CENTER);
        setContentAreaFilled(false);
        
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        int width = getWidth() - 1;
        int height = getHeight() - 1;
        g2.draw(new RoundRectangle2D.Double(0, 0, width, height, 50, 50));
        if (!hint.equals("") && getText().length()==0) {
            createHintText(g2);
        }
        g2.dispose();
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    private void createHintText(Graphics2D grphcs){
        
        FontMetrics fm = grphcs.getFontMetrics();
        int c0 = getBackground().getRGB();
        int c1 = getForeground().getRGB();
        int m = 0xfefefefe;
        int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
        grphcs.setColor(new Color (c2, true));
        grphcs.drawString(getHint(), ((getWidth()- fm.stringWidth(getHint())) / 2), getHeight() / 2 + fm.getAscent()/2 - 2);
        
    }

    private void setContentAreaFilled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
