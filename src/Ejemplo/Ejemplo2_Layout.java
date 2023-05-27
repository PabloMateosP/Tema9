package Ejemplo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejemplo2_Layout {
    public static void main(String[] args){
        new Ejemplo2_Layout();

    }
    private Ejemplo2_Layout(){
        Frame frame = new Frame();
        BorderLayout borderLayout = new BorderLayout();
        Button botonArriba = new Button("Arriba");
        Button botonAbajo = new Button("Abajo");
        Button botonIzquierda = new Button("Izquierda");
        Button botonDerecha = new Button("Derecha");
        Button botonCentro = new Button("Centro");

        borderLayout.addLayoutComponent(botonArriba, BorderLayout.NORTH);
        borderLayout.addLayoutComponent(botonAbajo, BorderLayout.SOUTH);
        borderLayout.addLayoutComponent(botonIzquierda, BorderLayout.WEST);
        borderLayout.addLayoutComponent(botonDerecha, BorderLayout.EAST);
        borderLayout.addLayoutComponent(botonCentro, BorderLayout.CENTER);

        frame.add(botonArriba);
        frame.add(botonAbajo);
        frame.add(botonIzquierda);
        frame.add(botonDerecha);
        frame.add(botonCentro);

        frame.setLayout(borderLayout);
        frame.setSize(300, 300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
