package EjercicioDobleVentana.ronaldo.com.app.mvc.Controller;

import EjercicioDobleVentana.ronaldo.com.app.mvc.View.VentanaDoble;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaController {

    private VentanaDoble vista;

    // Constructor que recibe la vista (VentanaDoble)
    public VentanaController(VentanaDoble vista) {
        this.vista = vista;
    }

    // Configurar los eventos de los botones
    public void configurarEventos(JButton btnVentana, JButton btnImagen, JButton btnTexto, JButton btnAgregar) {
        btnVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el tamaño de la ventana de botones
                int width = vista.getFramesecundario().getWidth();
                int height = vista.getFramesecundario().getHeight();

                // Crear Ventana 1 y mostrarla a la derecha de la ventana de botones
                JFrame ventana1 = new JFrame("Ventana 1");
                ventana1.setSize(width, height);  // Tamaño de la ventana 1 (igual a la ventana de botones)
                ventana1.setLocation(vista.getFramesecundario().getX() + vista.getFramesecundario().getWidth(), vista.getFramesecundario().getY());
                ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cerrar solo la ventana 1
                ventana1.setVisible(true);
                ventana1.add(new JLabel("Contenido de la Ventana 1"));

                // Hacer que la nueva ventana siga el tamaño de la ventana de botones
                ventana1.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentResized(java.awt.event.ComponentEvent evt) {
                        ventana1.setSize(vista.getFramesecundario().getWidth(), vista.getFramesecundario().getHeight());
                    }
                });
            }
        });

        btnImagen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el tamaño de la ventana de botones
                int width = vista.getFramesecundario().getWidth();
                int height = vista.getFramesecundario().getHeight();

                // Crear Ventana 2 y mostrarla a la derecha de la ventana de botones
                JFrame ventana2 = new JFrame("Ventana 2");
                ventana2.setSize(width, height);  // Tamaño de la ventana 2 (igual a la ventana de botones)
                ventana2.setLocation(vista.getFramesecundario().getX() + vista.getFramesecundario().getWidth(), vista.getFramesecundario().getY());
                ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cerrar solo la ventana 2
                ventana2.setVisible(true);
                ventana2.add(new JLabel("Contenido de la Ventana 2"));

                // Hacer que la nueva ventana siga el tamaño de la ventana de botones
                ventana2.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentResized(java.awt.event.ComponentEvent evt) {
                        ventana2.setSize(vista.getFramesecundario().getWidth(), vista.getFramesecundario().getHeight());
                    }
                });
            }
        });

        btnTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el tamaño de la ventana de botones
                int width = vista.getFramesecundario().getWidth();
                int height = vista.getFramesecundario().getHeight();

                // Crear Ventana 3 y mostrarla a la derecha de la ventana de botones
                JFrame ventana3 = new JFrame("Ventana 3");
                ventana3.setSize(width, height);  // Tamaño de la ventana 3 (igual a la ventana de botones)
                ventana3.setLocation(vista.getFramesecundario().getX() + vista.getFramesecundario().getWidth(), vista.getFramesecundario().getY());
                ventana3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cerrar solo la ventana 3
                ventana3.setVisible(true);
                ventana3.add(new JLabel("Contenido de la Ventana 3"));

                // Hacer que la nueva ventana siga el tamaño de la ventana de botones
                ventana3.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentResized(java.awt.event.ComponentEvent evt) {
                        ventana3.setSize(vista.getFramesecundario().getWidth(), vista.getFramesecundario().getHeight());
                    }
                });
            }
        });

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el tamaño de la ventana de botones
                int width = vista.getFramesecundario().getWidth();
                int height = vista.getFramesecundario().getHeight();

                // Crear Ventana 4 y mostrarla a la derecha de la ventana de botones
                JFrame ventana4 = new JFrame("Ventana 4");
                ventana4.setSize(width, height);  // Tamaño de la ventana 4 (igual a la ventana de botones)
                ventana4.setLocation(vista.getFramesecundario().getX() + vista.getFramesecundario().getWidth(), vista.getFramesecundario().getY());
                ventana4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cerrar solo la ventana 4
                ventana4.setVisible(true);
                ventana4.add(new JLabel("Contenido de la Ventana 4"));

                // Hacer que la nueva ventana siga el tamaño de la ventana de botones
                ventana4.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentResized(java.awt.event.ComponentEvent evt) {
                        ventana4.setSize(vista.getFramesecundario().getWidth(), vista.getFramesecundario().getHeight());
                    }
                });
            }
        });
    }
}
