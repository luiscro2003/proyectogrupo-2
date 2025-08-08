/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capapresentacion;

/**
 *
 * @author quesi
 */
public class JFraMDI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFraMDI.class.getName());

    /**
     * Creates new form JFraMDI
     */
    public JFraMDI() {
        initComponents();
        setExtendedState(JFraMDI.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIFacturacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMICiudad = new javax.swing.JMenuItem();
        jMIProveedor = new javax.swing.JMenuItem();
        jMIProducto = new javax.swing.JMenuItem();
        jMIMarca = new javax.swing.JMenuItem();
        jMICliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMIUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPPrincipalLayout = new javax.swing.GroupLayout(jDPPrincipal);
        jDPPrincipal.setLayout(jDPPrincipalLayout);
        jDPPrincipalLayout.setHorizontalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        jDPPrincipalLayout.setVerticalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMISalir.setText("Salir");
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transacciones");

        jMIFacturacion.setText("Facturacion");
        jMenu2.add(jMIFacturacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mantenimiento");

        jMICiudad.setText("Ciudad");
        jMICiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICiudadActionPerformed(evt);
            }
        });
        jMenu3.add(jMICiudad);

        jMIProveedor.setText("Proveedor");
        jMenu3.add(jMIProveedor);

        jMIProducto.setText("Producto");
        jMenu3.add(jMIProducto);

        jMIMarca.setText("Marca");
        jMenu3.add(jMIMarca);

        jMICliente.setText("Cliente");
        jMenu3.add(jMICliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Usuario");

        jMIUsuario.setText("Gestion usuario");
        jMenu4.add(jMIUsuario);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICiudadActionPerformed
        JIFraCiudad miCiudad = new JIFraCiudad();
        jDPPrincipal.add(miCiudad);
        miCiudad.show();
    }//GEN-LAST:event_jMICiudadActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFraMDI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPPrincipal;
    private javax.swing.JMenuItem jMICiudad;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIFacturacion;
    private javax.swing.JMenuItem jMIMarca;
    private javax.swing.JMenuItem jMIProducto;
    private javax.swing.JMenuItem jMIProveedor;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenuItem jMIUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
