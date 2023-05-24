package Actividades;

import Ejemplo.MiComponeneteAWTinterno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Actividad2_Login {
    Actividad2_Login() {

        Frame f = new Frame();
        f.setBackground(Color.lightGray);

        Frame b = new Frame();
        f.setBackground(Color.lightGray);


        Label nombre = new Label("Nombre:");
        Label passwd = new Label("Password:");
        nombre.setBackground(Color.GRAY);
        passwd.setBackground(Color.GRAY);

        Button cancel = new Button("Cancelar");
        Button enter = new Button("Acceder");


        TextField textoNombre = new TextField();
        TextField textoPass = new TextField();


        nombre.setBounds(90, 80, 70, 30);
        textoNombre.setBounds(210, 85, 100, 20);
        passwd.setBounds(90, 140, 70, 30);
        textoPass.setBounds(210, 145, 100, 20);
        cancel.setBounds(100,250,80,30);
        enter.setBounds(210,250,80,30);


        f.add(nombre);
        f.add(textoNombre);
        f.add(passwd);
        f.add(textoPass);
        f.add(cancel);
        f.add(enter);


        f.setSize(400, 300);

        f.setTitle("Login");

        f.setLayout(null);

        f.setVisible(true);

        Dialog d = new Dialog(b , "Bienvenido !!", false);
        d.setLayout(null);
        d.setSize(200, 200);
        Label a = new Label("Bienvenido !!");
        a.setBounds(20, 20, 100,100);
        a.setVisible(true);
        d.add(a);
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                d.dispose();

            }
        });

        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(true);
                f.dispose();
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText(null);
                textoPass.setText(null);
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String args[]) {

        // creating instance of Frame class
        Actividad2_Login awt_obj = new Actividad2_Login();
    }
}
