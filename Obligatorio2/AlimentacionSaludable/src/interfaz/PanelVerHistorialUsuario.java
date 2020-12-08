package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import java.awt.Dimension;
import javax.swing.JFrame;

public class PanelVerHistorialUsuario extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private final PanelHomeDeUsuario ventana;
    private final PanelHistorialDeComidasUsuario panelHistorial;
    private final ComidaPorDia comidaActiva;

    //Constructor
    public PanelVerHistorialUsuario(Sistema unSistema,
            PanelHomeDeUsuario unaVentana,
            ComidaPorDia unaComidaPorDia,PanelHistorialDeComidasUsuario unPanelHistorial) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        panelHistorial=unPanelHistorial;
        comidaActiva = unaComidaPorDia;
        fecha.setText(comidaActiva.getFecha());
        listaHistorialDeComidas.setListData(comidaActiva.getComidasIngeridas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        etiquetaFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 130, 280, 380);

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaFecha.setText("Fecha de Ingesta:");
        add(etiquetaFecha);
        etiquetaFecha.setBounds(80, 80, 200, 40);

        fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fecha.setText("-");
        add(fecha);
        fecha.setBounds(280, 90, 180, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Historial de Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(160, 20, 330, 44);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setToolTipText("");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(30, 20, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.setPanelActual(panelHistorial);
        ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventana.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
