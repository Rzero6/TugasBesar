/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LoginNew;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author dendy
 * Kelompok 14
 * Ryan Pratama Wijaya     | 210711008 | C
 * I Kadek Dendy Pramartha | 210711095 | C
 */
public class BackgroundPanel extends JPanel{


    
    public float getAnimate() {
        return animate;
    }

    public void setAnimate(float animate) {
        this.animate = animate;
        repaint();
    }
    
    private float easeOutQuint(float x) {
        return (float) (1 - Math.pow(1 - x, 5));
    }

    private float easeInOutCirc(float x) {
        double v = x < 0.5 ? (1 - Math.sqrt(1 - Math.pow(2 * x, 2))) / 2 : (Math.sqrt(1 - Math.pow(-2 * x + 2, 2)) + 1) / 2;
        return (float) v;
    }
    
   private float animate;
   private int header =50;
   private boolean showPaint;

    public void setShowPaint(boolean showPaint) {
        this.showPaint = showPaint;
    }
   
    
   public BackgroundPanel() {
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics gr){
        if(!showPaint){
            super.paint(gr);
        }
        Graphics2D g2 = (Graphics2D)gr.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int height = (int) (getHeight() * (1f - easeOutQuint(animate)));
        g2.setColor(new Color(220,254,255));
        g2.fill(createShape(height, 50, 70, 50, 100));
        g2.setColor(new Color(178,254,250));
        g2.fill(createShape(height, 80, 50, 100, 50, 100, 50));
        g2.setColor(new Color(14,210,247));
        g2.fill(createShape(height, 70, 20, 60, 20, 70));
        int bgHeight = (int) (getHeight() * (1f - easeInOutCirc(animate)));
        g2.setColor(new Color(245, 245, 245));
        g2.fillRect(0, bgHeight, getWidth(), getHeight());
        g2.dispose();
        if(showPaint){
            super.paint(gr);
        }
                        
    }
    
    private Shape createShape(int location, int startInit, int... points) {
        int width = getWidth();
        int height = getHeight();
        int ss = width / points.length;
        int size = location;
        GeneralPath p = new GeneralPath();
        int space = 0;
        int xs = 0;
        int ys = location - startInit;
        for (int point : points) {
            point = size - point;
            int s = space + ss / 2;
            p.append(new CubicCurve2D.Double(xs, ys, s, ys, s, point, xs + ss, point), true);
            space += ss;
            xs += ss;
            ys = point;
        }
        p.lineTo(width, ys);
        p.lineTo(width, height);
        p.lineTo(0, height);
        return p;
    }

}
