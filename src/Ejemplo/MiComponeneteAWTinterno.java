package Ejemplo;

import java.awt.*;
import java.awt.event.*;

public class MiComponeneteAWTinterno extends Frame {

    public static void main(String[] args) {
        new MiComponeneteAWTinterno();
    }

    MiComponeneteAWTinterno() {
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        setBounds(200,200, 400, 400);

        Button botonSalir = new Button("Salir");
        botonSalir.setBounds(50, 50, 50, 50);
        add(botonSalir);

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame)botonSalir.getParent()).dispose();
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MiComponeneteAWTinterno.this.dispose();
            }
        });

    }

}