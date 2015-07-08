/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LOGO.java
 *
 * Created on 23-abr-2011, 9:48:26
 */

/**
 *
 * @author ARACELLY
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.util.Calendar;

public class LOGO extends javax.swing.JFrame {
        public LOGO() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setUndecorated(true);
        initComponents();
        iniciarCarga();
        iniciarSplash();
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.pack();
    }
    public void iniciarCarga() { //Utilizando Hilos
        new Thread() {

            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    i++;
                    progreso.setValue(i);
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();
    }

   public void iniciarSplash() {
        this.getjProgressBar().setBorderPainted(true);
        this.getjProgressBar().setForeground(new Color(100, 120, 50, 50));
        this.getjProgressBar().setStringPainted(true);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locales.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 400, 270));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoInkafarma.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 300, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 60, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("FECHA : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("HORA :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        lblfecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 100, 10));

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 90, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INKA FARMA.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INKA FARMA.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 160, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico-05.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 180));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico-06.gif"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        progreso.setBackground(new java.awt.Color(0, 204, 51));
        progreso.setForeground(new java.awt.Color(252, 193, 64));
        progreso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 51)));
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        jPanel1.add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 510, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

 Calendar cal= Calendar.getInstance();
 String fecha= cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
 String hora= cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
      lblfecha.setText(""+fecha);
      lblhora.setText(""+hora);

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        // TODO add your handling code here:
        if (progreso.getValue()== 100) {
            ACCESO_FARMACIA logearse = new ACCESO_FARMACIA() {};
            logearse.setVisible(true);
            this.dispose();
        }
}//GEN-LAST:event_progresoStateChanged


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
 public javax.swing.JProgressBar getjProgressBar() {
       return progreso;
    }
}
