package ventana;

import modelo.Juego;

import javax.swing.*;
import java.awt.*;

public class VentanaJuego extends JPanel {
    private Juego juego;

    public VentanaJuego(Juego juego) {
        this.juego = juego;
        setPreferredSize(new Dimension(400, 200));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar el piso
        g.setColor(Color.GRAY);
        g.drawLine(0, 180, getWidth(), 180);

        // Dibujar el círculo (personaje)
        g.setColor(Color.BLUE);
        g.fillOval(juego.getxCirculo(), juego.getyCirculo(), juego.getRadio() * 2, juego.getRadio() * 2);

        // Dibujar el cuadrado (obstáculo)
        g.setColor(Color.RED);
        g.fillRect(juego.getxCuadrado(), juego.getyCuadrado(), juego.getLado(), juego.getLado());
    }
}

