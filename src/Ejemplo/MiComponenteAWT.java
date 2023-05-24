package Ejemplo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MiComponenteAWT extends Frame implements ActionListener{
    Button botonSalir;
    public static void main(String[] args) {
    new MiComponenteAWT();
    }

    MiComponenteAWT (){
        setTitle("Mi componente");
        setLayout(null);
        setVisible(true);
        setBounds(200, 200, 400, 400);

        Button botonSalir = new Button("Salir");
        botonSalir.setBounds(50,50,50,50);
        add(botonSalir);

        botonSalir.addActionListener(new MiListener(this));
        //This hace referencia al componente MiComponenteAWT

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Necesitamos crear un campo Button botonSalir para que este sea el componente.
        ((Frame)botonSalir.getParent()).dispose();
        //Tenemos que decirle que queremos cerrar es el frame, ya que el botón como tal no se puede cerra
        //TODO: Para dejar correctamente el hecho de salir habría que añadir un window listener para cerrar la ventana
        // pulsando la x de la esquina derecha.
    }

}