

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * menuavon.java
 *
 * Created on 17/03/2011, 01:47:34 PM
 */

/**
 *
 * @author alumno
 */
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.io.IOException;
import java.lang.InterruptedException;
public class producfar extends javax.swing.JFrame {

    /** Creates new form menuavon */
    public producfar() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        papa = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        REINICIAR = new javax.swing.JMenuBar();
        jmpro = new javax.swing.JMenu();
        itemacce = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        papa.setBackground(new java.awt.Color(255, 255, 255));
        papa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 10, true));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_form.png"))); // NOI18N
        jButton1.setText("Factura");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_side_boxes.png"))); // NOI18N
        jButton4.setText("Nota de Venta");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_suit.png"))); // NOI18N
        jButton5.setText("Sueldo Trab");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_put.png"))); // NOI18N
        jButton2.setText("Ver Productos");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator.png"))); // NOI18N
        jButton6.setText("Calculadora");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book_edit.png"))); // NOI18N
        jButton7.setText("Bloc de Notas");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 5, true));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jToolBar1.setBounds(280, 200, 520, 50);
        papa.add(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/far.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 20, true));
        jLabel1.setBounds(300, 300, 480, 364);
        papa.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoInkafarma.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 5, true));
        jLabel2.setBounds(390, 100, 300, 60);
        papa.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REICIAR.JPG"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(790, 670, 50, 50);
        papa.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/APAGAR.JPG"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(870, 670, 50, 50);
        papa.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CANCEL.JPG"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.setBounds(940, 670, 50, 50);
        papa.add(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        REINICIAR.setBackground(new java.awt.Color(0, 0, 0));
        REINICIAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));

        jmpro.setBackground(new java.awt.Color(0, 0, 0));
        jmpro.setBorder(new javax.swing.border.MatteBorder(null));
        jmpro.setForeground(new java.awt.Color(255, 0, 51));
        jmpro.setText("COMPROBATES");
        jmpro.setFont(new java.awt.Font("Tahoma", 1, 11));

        itemacce.setForeground(new java.awt.Color(0, 0, 255));
        itemacce.setText("FACTURA");
        itemacce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemacceActionPerformed(evt);
            }
        });
        jmpro.add(itemacce);

        jMenuItem3.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem3.setText("NOTA DE VENTA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmpro.add(jMenuItem3);

        REINICIAR.add(jmpro);

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setForeground(new java.awt.Color(255, 0, 51));
        jMenu1.setText("VISUALIZAR");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });
        jMenu1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenu1PropertyChange(evt);
            }
        });
        jMenu1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jMenu1VetoableChange(evt);
            }
        });

        jMenuItem1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem1.setText("VER PRODUCTOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem4.setText("SUELDO TRBAJADOR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        REINICIAR.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(255, 0, 0));
        jMenu3.setText("ADICIONALES");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 11));

        jMenuItem5.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem5.setText("CALCULADORA");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem6.setText("BLOC DE NOTAS");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        REINICIAR.add(jMenu3);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("OPCIONES");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem2.setText("REINICIAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem7.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem7.setText("APAGAR");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem8.setText("ABORDAR");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        REINICIAR.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setForeground(new java.awt.Color(255, 0, 0));
        jMenu4.setText("SALIR");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        REINICIAR.add(jMenu4);

        setJMenuBar(REINICIAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(papa, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(papa, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemacceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemacceActionPerformed
         FACTURA eje = new FACTURA();
        papa.add(eje);
        eje.setVisible(true);
    }//GEN-LAST:event_itemacceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         FACTURA eje = new FACTURA();
        papa.add(eje);
        eje.setVisible(true);
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rpta;
        rpta=JOptionPane.showConfirmDialog(this, "¿Esta seguro de salir del Menu?","Salir", 0);
        if(rpta==0)
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jMenu1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1VetoableChange

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1StateChanged

    private void jMenu1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenu1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1PropertyChange

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            VER_PRODUCTOS mn=new VER_PRODUCTOS();
        papa.add(mn);
        mn.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VER_PRODUCTOS mn=new VER_PRODUCTOS();
        papa.add(mn);
        mn.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -r -t 30");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NOTA_VENTA xx=new NOTA_VENTA();
        papa.add(xx);
        xx.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        NOTA_VENTA xx=new NOTA_VENTA();
        papa.add(xx);
        xx.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SUELDO_TRAB yy=new SUELDO_TRAB();
        papa.add(yy);
        yy.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        SUELDO_TRAB yy=new SUELDO_TRAB();
        papa.add(yy);
        yy.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("calc");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("notepad");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("calc");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("notepad");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        int rpta;
        rpta=JOptionPane.showConfirmDialog(this, "Esta seguro de salir del Menu","Salir", 0);
        if(rpta==0)
            this.dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -s -t 30");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -a");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -r -t 30");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -s -t 30");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 try
{
    Runtime rt=Runtime.getRuntime();
    Process p =rt.exec("shutdown -a");
    p.waitFor();

}
catch (IOException ioe )
{
    ioe.getStackTrace();
        }
catch (InterruptedException ie )
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producfar().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar REINICIAR;
    private javax.swing.JMenuItem itemacce;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu jmpro;
    private javax.swing.JDesktopPane papa;
    // End of variables declaration//GEN-END:variables

}