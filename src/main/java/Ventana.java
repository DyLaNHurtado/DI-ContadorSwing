import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.SwingConstants.*;

public class Ventana extends JFrame {
    private JLabel pantalla;
    private JButton botonMas;
    private JButton botonMenos;
    private JPanel panel;
    private JPanel buttons;
    /*
    private JMenuBar menu;
    private JMenu menuArchivo;
    private JMenuItem menuArchivoOpcionNuevo;
    */
    private Service service;

    public Ventana(){
        initComponents();
    }

    private void initComponents(){
        /*
        menu=new JMenuBar();
        menuArchivo=new JMenu();
        menuArchivo.setText("Archivo");

        menuArchivoOpcionNuevo= new JMenuItem();
        menuArchivoOpcionNuevo.setText("Nuevo");
        menuArchivo.add(menuArchivoOpcionNuevo);
        menu.add(menuArchivo);
        */
        service = new Service();

        panel=new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        pantalla=new JLabel("0", CENTER);
        botonMenos=new JButton("Decrementar");
        botonMas=new JButton("Incrementar");

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,1));
        buttons.setBackground(new Color(0,0,0,0));
        buttons.add(botonMenos);
        buttons.add(botonMas);



        panel.add(pantalla);
        panel.add(buttons);
        this.add(panel);
        this.setPreferredSize(new Dimension(300,250));


        botonMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                service.incrementValue(pantalla);
            }
        });

        botonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                service.decrementValue(pantalla);
            }
        });
        service.setSystemLookAndFeel();
        this.pack();
        //this.setJMenuBar(menu);
    }
}
