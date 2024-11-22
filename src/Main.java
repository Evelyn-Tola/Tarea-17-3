import controlador.ControladorJuego;
import javax.swing.SwingUtilities;
import modelo.Juego;
import ventana.VentanaJuego;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Juego juego = new Juego();
            VentanaJuego ventanaJuego = new VentanaJuego(juego);
            ControladorJuego controlador = new ControladorJuego(juego, ventanaJuego);

            controlador.iniciar();
        });
    }
}

