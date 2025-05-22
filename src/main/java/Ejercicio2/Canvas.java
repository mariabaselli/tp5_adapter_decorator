package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Canvas extends JPanel {
    private List<Figura> figuras;

    public Canvas() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        PanelAdapter panel = new PanelAdapter(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}
