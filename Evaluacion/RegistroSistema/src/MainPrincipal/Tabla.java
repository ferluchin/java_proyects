/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrincipal;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTabbedPane;
import java.io.*;

/**
 *
 * @author Luis
 */
public class Tabla extends JFrame {

    public Tabla() {

        super("Ejemplo 3");

        DefaultTableModel myModel = new DefaultTableModel();
        myModel.addColumn("Nombres");
        myModel.addColumn("Apellidos");
        myModel.addColumn("Identificacion");
        myModel.addColumn("Direccion");
        myModel.addColumn("Correo electronico");
        myModel.addColumn("Edad");

        JTable table = new JTable(myModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 150));

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Luis/Documents/Conductores_Java.txt"));
            String line = br.readLine();

            for (int row = 0; row < 10; row++) {
                for (int column = 0; column < 5; column++) {

                    while (line != null) {
                        String[] rowfields = line.split("\\s+");
                        myModel.addRow(rowfields);
                        line = br.readLine();
                    }

                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        JTabbedPane panelInformacion = new JTabbedPane();
        JPanel panel1 = new JPanel();
        panel1.add(new JScrollPane(table));
        panelInformacion.addTab("Codigo", null, panel1, "Primer panel");
        //agregar objeto JTabbedPane al contenedor
        getContentPane().add(panelInformacion);

        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Tabla aplicacion = new Tabla();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
