package Ejemplo;

import java.awt.*;

public class Ejemplo0_HolaMundo {
    public static void main(String[] args) {
        Frame frame = new Frame("Hola Pablo");
        frame.setBackground(Color.GREEN);
        frame.setLayout(null); //Posicionamiento relativo
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
