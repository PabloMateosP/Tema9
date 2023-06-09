package Actividades;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad1_Login extends Frame{

    Actividad1_Login() {

        Frame f = new Frame();
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

        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textoNombre.getText();
                String password = textoPass.getText();

                // Aquí se puede agregar la lógica de autenticación
                if (username.equals("Pablo") && password.equals("matpalpa")) {
                    System.out.println("Inicio de sesion exitoso");
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos");
                }
            }
        });
        
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {

        // creating instance of Frame class
        Actividad1_Login awt_obj = new Actividad1_Login();
    }
}