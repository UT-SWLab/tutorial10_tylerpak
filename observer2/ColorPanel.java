package observer1;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    private Color color;
    private float hue;
    private float saturation;
    private float brightness;

    public ColorPanel(Color initialColor) {
        this.color = initialColor;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
        repaint();
    }
    public void setHue(float hue){
        this.hue = hue;
    }

    public void setSaturation(float saturation){
        this.saturation = saturation;
    }

    public void setBrightness(float brightness){
        this.brightness = brightness;
    }
    protected void paintComponent(Graphics g) {
        this.setBackground(color);
        super.paintComponent(g);
    }
}