package Ejemplo;

import java.awt.*;

public class Ejemplo1_Inicio extends Frame {
    // initializing using constructor
    Ejemplo1_Inicio() {

        Frame frame = new Frame("Victorr");
        frame.setBackground(Color.GREEN);


        // creating a button
        Button b = new Button("Si");
        Button c = new Button("No");

        // setting button position on screen
        b.setBounds(30,100,80,30);
        c.setBounds(120,100,80,30);

        // adding button into frame
        frame.add(b);
        frame.add(c);

        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    // main method
    public static void main(String args[]) {

        // creating instance of Frame class
        Ejemplo1_Inicio f = new Ejemplo1_Inicio();
    }
}