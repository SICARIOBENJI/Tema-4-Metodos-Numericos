/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericosu4;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Henry chuc tec
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtB = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnTrapecio = new javax.swing.JButton();
        btnSimpson = new javax.swing.JButton();
        txtSimpson = new javax.swing.JTextField();
        txtTrapecio = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIntegrantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Metodos de integracion\"");
        setBackground(new java.awt.Color(0, 0, 204));
        setMinimumSize(new java.awt.Dimension(450, 327));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        txtB.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtB.setText(" ");
        jPanel1.add(txtB);
        txtB.setBounds(180, 10, 50, 30);

        txtA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtA.setText(" ");
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        jPanel1.add(txtA);
        txtA.setBounds(370, 10, 50, 30);

        txtFuncion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });
        jPanel1.add(txtFuncion);
        txtFuncion.setBounds(110, 60, 120, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Valor de b: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 10, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("n = ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 60, 30, 30);

        txtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNKeyTyped(evt);
            }
        });
        jPanel1.add(txtN);
        txtN.setBounds(370, 60, 40, 30);

        btnTrapecio.setText("Metodo del Trapecio");
        btnTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrapecioActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrapecio);
        btnTrapecio.setBounds(20, 140, 220, 30);

        btnSimpson.setText("Metodo de Simpson ");
        btnSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpsonActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpson);
        btnSimpson.setBounds(20, 220, 220, 30);
        jPanel1.add(txtSimpson);
        txtSimpson.setBounds(280, 220, 160, 30);
        jPanel1.add(txtTrapecio);
        txtTrapecio.setBounds(280, 140, 160, 30);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(410, 330, 80, 30);

        btnNuevo.setText("Borrar");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);
        btnNuevo.setBounds(20, 330, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("f(x)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 60, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Valor de a: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 10, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("dx");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 60, 30, 30);

        btnIntegrantes.setText("Integrantes");
        btnIntegrantes.setPreferredSize(new java.awt.Dimension(120, 24));
        btnIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrantesActionPerformed(evt);
            }
        });
        jPanel1.add(btnIntegrantes);
        btnIntegrantes.setBounds(210, 330, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtA.setText("");
        txtB.setText("");
        txtFuncion.setText("");
        txtN.setText("");
        txtSimpson.setText("");
        txtTrapecio.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        if (!txtA.getText().equals("") && !txtB.getText().equals("") && !txtFuncion.getText().equals("") && !txtN.getText().equals("") && !txtA.getText().equals("a") && !txtB.getText().equals("b") && !txtFuncion.getText().equals("f(x)")) {
            String funcion = txtFuncion.getText();
            String a = txtA.getText();
            String b = txtB.getText();
            int n = Integer.parseInt(txtN.getText());

            Metodos trapecio = new Metodos();
            if (n == 2) {
                txtTrapecio.setText(trapecio.metodoTrapecio(a, b, funcion));
            } else if (n > 2) {
                dlgTrapecio trapecioMultiple = new dlgTrapecio(this, true);
                ModeloTablaTrapecio model = null;
                ArrayList<Trapecio> lista = trapecio.metodoTrapecio(a, b, n, funcion);
                txtTrapecio.setText(Double.toString(trapecio.resultadoTrapecio));
                if (lista != null) {
                    model = new ModeloTablaTrapecio(lista);
                    trapecioMultiple.tblTrapecioMultiple.setModel(model);
                }
                trapecioMultiple.setLocationRelativeTo(null);
                trapecioMultiple.setTitle("Tabla Trapecio");
                trapecioMultiple.setVisible(true);
            } else {
                txtTrapecio.setText("n debe ser >= 2");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos correctamente");
        }
    }//GEN-LAST:event_btnTrapecioActionPerformed

    private void btnSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpsonActionPerformed
        if (!txtA.getText().equals("") && !txtB.getText().equals("") && !txtFuncion.getText().equals("") && !txtN.getText().equals("") && !txtA.getText().equals("a") && !txtB.getText().equals("b") && !txtFuncion.getText().equals("f(x)")) {
            String funcion = txtFuncion.getText();
            String a = txtA.getText();
            String b = txtB.getText();
            int n = Integer.parseInt(txtN.getText());

            Metodos simpsonTercio = new Metodos();
            if (n == 2) {
                txtSimpson.setText(simpsonTercio.metodoSimpson(a, b, funcion));
            } else if (n > 2 && n % 2 == 0) {
                dlgSimpson simpson = new dlgSimpson(this, true);
                ModeloTablaSimpson model = null;
                ArrayList<Simpson> lista = simpsonTercio.metodoSimpson(a, b, n, funcion);
                txtSimpson.setText(Double.toString(simpsonTercio.resultadoSimpson));
                if (lista != null) {
                    model = new ModeloTablaSimpson(lista);
                    simpson.tblSimpsonTercioMultiple.setModel(model);
                }
                simpson.setLocationRelativeTo(null);
                simpson.setTitle("Tabla Simpson");
                simpson.setVisible(true);
            } else {
                txtSimpson.setText("n debe ser >= 2 y par");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos correctamente");
        }
    }//GEN-LAST:event_btnSimpsonActionPerformed

    private void txtNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKeyTyped
        char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    getToolkit().beep();
                    evt.consume();
                }
    }//GEN-LAST:event_txtNKeyTyped

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void btnIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrantesActionPerformed
        // TODO add your handling code here:
		dngIntegrantes btn= new  dngIntegrantes(this, true);
		btn.setVisible(true);
    }//GEN-LAST:event_btnIntegrantesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntegrantes;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimpson;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtSimpson;
    private javax.swing.JTextField txtTrapecio;
    // End of variables declaration//GEN-END:variables
}
