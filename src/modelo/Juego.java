package modelo;

import java.awt.*;

public class Juego {
    private int xCirculo, yCirculo, radio;
    private int xCuadrado, yCuadrado, lado;

    public Juego() {
        // Inicializar posiciones
        xCirculo = 50;
        yCirculo = 150;
        radio = 20;

        xCuadrado = 200;
        yCuadrado = 130;
        lado = 40;
    }

    // Mover el círculo
    public void moverCirculo(int dx, int dy) {
        xCirculo += dx;
        yCirculo += dy;

        // Mantener el círculo dentro de la ventana
        if (xCirculo < 0) xCirculo = 0;
        if (yCirculo < 0) yCirculo = 0;
        if (yCirculo > 160) yCirculo = 160; // No pasar del piso
    }

    // Verificar colisión con el cuadrado
    public boolean colisionConCuadrado() {
        Rectangle rectCirculo = new Rectangle(xCirculo, yCirculo, radio * 2, radio * 2);
        Rectangle rectCuadrado = new Rectangle(xCuadrado, yCuadrado, lado, lado);
        return rectCirculo.intersects(rectCuadrado);
    }

    // Getters para los elementos
    public int getxCirculo() {
        return xCirculo;
    }

    public int getyCirculo() {
        return yCirculo;
    }

    public int getRadio() {
        return radio;
    }

    public int getxCuadrado() {
        return xCuadrado;
    }

    public int getyCuadrado() {
        return yCuadrado;
    }

    public int getLado() {
        return lado;
    }
}

