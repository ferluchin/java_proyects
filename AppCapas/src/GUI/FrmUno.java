package GUI;

import BL.BLConexion;
import BL.BLEstudiantes;
import Clases.Estudiante;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmUno extends javax.swing.JFrame 
{
    BLEstudiantes ManejadorEstudiantes = new BLEstudiantes();
    BLConexion ManejadorConexion = new BLConexion();
    //Estudiante Estudiante = new Estudiante();
    
    public FrmUno() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        btnPresentar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        btnPresentar.setText("Presentar");
        btnPresentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnPresentar)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPresentar)
                    .addComponent(btnCerrar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentarActionPerformed
        try 
        {
            Estudiante  ArrEstudiante[]  = ManejadorEstudiantes.Consultar();
            //Estudiante [] ArrEstudiante = new Estudiante[2];
            /*
            for (int i = 0; i<=1; i++)
            {
                Estudiante e = new Estudiante();
                e.SetIdentificacion(i);
                e.SetNombres("Daniel " + i);
                e.SetApellidos("Guaman " + i);
                ArrEstudiante[i] = e;
            }*/
            /*
            for (int i=0; i< ArrEstudiante.length; i++)
            {
                System.out.println(ArrEstudiante[i].GetIdentificacion());
                System.out.println(ArrEstudiante[i].GetNombres());
                System.out.println(ArrEstudiante[i].GetApellidos());
            }*/
            for (Estudiante objeto : ArrEstudiante) 
            {
                System.out.println(" " + objeto.GetNombres() + " " + objeto.GetApellidos()+ " " + objeto.GetIdentificacion());
           }            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmUno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPresentarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try 
        {
            ManejadorConexion.CerrarConexion();
            this.dispose();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnPresentar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}
