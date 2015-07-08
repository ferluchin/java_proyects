package GUI;

import CRUD.BLConexion;
import CRUD.BLPersonas;
import CRUD.conexionBD;
import Clases.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmExtraccionDatos extends javax.swing.JFrame 
{
    BLPersonas ManejadorPersonas = new BLPersonas();
    BLConexion ManejadorConexion = new BLConexion();
   
    
    public FrmExtraccionDatos() 
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
      
         try {

            Connection miConexion = conexionBD.GetConnection();

            if (miConexion != null) {
                JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
            }
            Persona ArrEstudiante[] = ManejadorPersonas.Consultar();
            String msn = null;
           
            for (Persona objeto : ArrEstudiante) {
                msn = objeto.GetNombres() + " " + objeto.GetApellidos() + " " + objeto.GetIdentificacion() + "\n" + msn;
            }
            //jLabel1.setText(msn);
            txtDatos.setText(msn);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmExtraccionDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrmExtraccionDatos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FrmExtraccionDatos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FrmExtraccionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExtraccionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExtraccionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExtraccionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExtraccionDatos().setVisible(true);
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
