package Actividades;

import Ejemplo.MiComponeneteAWTinterno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Actividad2_Login {
    Actividad2_Login() {

        Frame primerFrameLogin = new Frame();
        primerFrameLogin.setBackground(Color.lightGray);

        Frame segundoFrameBienvenida = new Frame();
        segundoFrameBienvenida.setBackground(Color.lightGray);


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


        primerFrameLogin.add(nombre);
        primerFrameLogin.add(textoNombre);
        primerFrameLogin.add(passwd);
        primerFrameLogin.add(textoPass);
        primerFrameLogin.add(cancel);
        primerFrameLogin.add(enter);


        primerFrameLogin.setSize(400, 300);
        primerFrameLogin.setTitle("Login");
        primerFrameLogin.setLayout(null);
        primerFrameLogin.setVisible(true);

        Dialog dialogoBienvenida = new Dialog(segundoFrameBienvenida , "Bienvenido !!", false);
        dialogoBienvenida.setLayout(null);
        dialogoBienvenida.setSize(200, 200);
        Label labelBienvenida = new Label("Bienvenido !!");
        labelBienvenida.setBounds(20, 20, 100,100);
        labelBienvenida.setVisible(true);
        dialogoBienvenida.add(labelBienvenida);
        dialogoBienvenida.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                segundoFrameBienvenida.dispose();
            }
        });
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogoBienvenida.setVisible(true);
                primerFrameLogin.dispose();
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText(null);
                textoPass.setText(null);
            }
        });
        primerFrameLogin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primerFrameLogin.dispose();
            }
        });
    }
    public static void main(String args[]) {

        // creating instance of Frame class
        Actividad2_Login awt_obj = new Actividad2_Login();
    }
}