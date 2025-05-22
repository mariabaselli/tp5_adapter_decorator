package Ejercicio2;

import java.awt.*;

public class PanelAdapter implements  Panel{
    Graphics2D g2d;

    public PanelAdapter(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        this.g2d.drawLine(x1, y1, x2, y2);

    }

    @Override
    public void drawString(String str, int x, int y) {
        this.g2d.drawString(str, x, y);

    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        this.g2d.drawOval(x, y, width, height);

    }
}
