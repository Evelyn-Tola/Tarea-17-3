package controlador;

import modelo.Juego;


import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ventana.VentanaJuego;

public class ControladorJuego {
    private Juego juego;
    private VentanaJuego ventanaJuego;
    private JFrame frame;

    public ControladorJuego(Juego juego, VentanaJuego ventanaJuego) {
        this.juego = juego;
        this.ventanaJuego = ventanaJuego;

        // Crear ventana
        frame = new JFrame("Juego - POO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ventanaJuego);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Agregar eventos de teclado
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int dx = 0, dy = 0;

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W: // Arriba
                    case KeyEvent.VK_UP:
                        dy = -5;
                        break;
                    case KeyEvent.VK_S: // Abajo
                    case KeyEvent.VK_DOWN:
                        dy = 5;
                        break;
                    case KeyEvent.VK_A: // Izquierda
                    case KeyEvent.VK_LEFT:
                        dx = -5;
                        break;
                    case KeyEvent.VK_D: // Derecha
                    case KeyEvent.VK_RIGHT:
                        dx = 5;
                        break;
                }

                juego.moverCirculo(dx, dy);

                // Verificar colisión
                if (juego.colisionConCuadrado()) {
                    JOptionPane.showMessageDialog(frame, "¡Colisión detectada!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }

                // Repintar la ventana
                ventanaJuego.repaint();
            }
        });
    }

    public void iniciar() {
        frame.setVisible(true);
    }
}
