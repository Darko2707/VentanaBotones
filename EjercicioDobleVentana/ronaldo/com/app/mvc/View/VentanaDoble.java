package EjercicioDobleVentana.ronaldo.com.app.mvc.View;

import EjercicioDobleVentana.ronaldo.com.app.mvc.Controller.*;

import javax.swing.*;
import java.awt.*;

public class VentanaDoble extends JFrame {
    private JFrame Framesecundario;  // Ventana de los botones
    private VentanaController controller;
    private JButton btnVentana, btnImagen, btnTexto, btnAgregar;

    public VentanaDoble(int ancho, int alto, String titulo) {
        // Configurar ventana de los botones (Ventana Secundaria)
        Framesecundario = new JFrame("Ventana de los botones");
        Framesecundario.setSize(300, alto);  // Ancho de la ventana de los botones
        Framesecundario.setLocation(400, 100);  // Ubicación de la ventana de los botones
        Framesecundario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Framesecundario.setLayout(new GridLayout(4, 1));  // Layout para los botones
        Framesecundario.setResizable(false); // No permitir que se cambie el tamaño de la ventana de los botones

        // Crear botones
        btnVentana = new JButton("Ventana 1");
        btnImagen = new JButton("Ventana 2");
        btnTexto = new JButton("Ventana 3");
        btnAgregar = new JButton("Ventana 4");

        // Agregar botones a la ventana de botones
        Framesecundario.add(btnVentana);
        Framesecundario.add(btnImagen);
        Framesecundario.add(btnTexto);
        Framesecundario.add(btnAgregar);

        // Configurar eventos de los botones
        controller = new VentanaController(this);
        controller.configurarEventos(btnVentana, btnImagen, btnTexto, btnAgregar);

        // Hacer visible la ventana de los botones
        Framesecundario.setVisible(true);
    }

    // Método para obtener la ventana de los botones
    public JFrame getFramesecundario() {
        return Framesecundario;
    }
}
