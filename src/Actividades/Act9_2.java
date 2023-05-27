package Actividades;

import java.awt.*;
import java.awt.event.*;

public class Act9_2 {
    Act9_2() {

        Frame primerFrameLogin = new Frame();
        primerFrameLogin.setBackground(Color.lightGray);

        Frame segundoFrameBienvenida = new Frame();
        segundoFrameBienvenida.setBackground(Color.lightGray);

        Panel panelLogin = new Panel();
        //He añadido un panel para ponerlo como layout y así declarar 3 filas y dos columnas para los métodos
        //De esta forma consigo ordenar el te
        panelLogin.setLayout(new GridLayout(3, 2, 10, 10));

        Label nombre = new Label("Nombre:");
        Label passwd = new Label("Password:");
        nombre.setBackground(Color.GRAY);
        passwd.setBackground(Color.GRAY);

        Button cancel = new Button("Cancelar");
        Button enter = new Button("Acceder");

        TextField textoNombre = new TextField();
        TextField textoPass = new TextField();

        panelLogin.add(nombre);
        panelLogin.add(textoNombre);
        panelLogin.add(passwd);
        panelLogin.add(textoPass);
        panelLogin.add(cancel);
        panelLogin.add(enter);

        primerFrameLogin.add(panelLogin);

        primerFrameLogin.setSize(400, 300);
        primerFrameLogin.setTitle("Login");
        primerFrameLogin.setVisible(true);

        Dialog dialogoBienvenida = new Dialog(segundoFrameBienvenida, "Bienvenido !!", false);
        dialogoBienvenida.setLayout(null);
        dialogoBienvenida.setSize(200, 200);
        Label labelBienvenida = new Label("Bienvenido !!");
        labelBienvenida.setBounds(20, 20, 100, 100);
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
        Actividad2_Login awt_obj = new Actividad2_Login();
    }
}
