package KasirDashboard.CustomePalette;

import LoginNew.*;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelTransparent extends JPanel {

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    private float alpha = 0.2f;

    public PanelTransparent() {
        setOpaque(false);
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#0396ff"), 0, getHeight(), Color.decode("#abdcff"));
        g2.setPaint(gp);
        super.paint(grphcs);
    }
}
