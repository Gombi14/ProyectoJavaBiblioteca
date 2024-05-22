import javax.swing.*;
import java.awt.*;

public class Bibliotecari extends JFrame {
    public Bibliotecari() {
        setTitle("Interfície de Bibliotecari");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnAfegir = new JButton("Afegir Llibre");
        JButton btnModificar = new JButton("Modificar Llibre");
        JButton btnEliminar = new JButton("Eliminar Llibre");

        panel.add(btnAfegir);
        panel.add(btnModificar);
        panel.add(btnEliminar);

        add(panel, BorderLayout.CENTER);

        btnAfegir.addActionListener(e -> {
            GestioLlibres gestioLlibres = new GestioLlibres();
            gestioLlibres.afegirLlibre();
        });

        btnModificar.addActionListener(e -> {
            GestioLlibres gestioLlibres = new GestioLlibres();
            gestioLlibres.modificarLlibre();
        });

        btnEliminar.addActionListener(e -> {
            GestioLlibres gestioLlibres = new GestioLlibres();
            gestioLlibres.eliminarLlibre();
        });
    }
}
