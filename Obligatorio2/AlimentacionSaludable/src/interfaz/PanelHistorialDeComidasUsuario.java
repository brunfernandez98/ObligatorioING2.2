package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.JFrame;

public class PanelHistorialDeComidasUsuario extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private final JFrame ventana;
    private final Usuario usuarioActual;

    //Constructor
    public PanelHistorialDeComidasUsuario(Sistema unSistema,
            JFrame unaVentana, Usuario usuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActual =usuario;
        listaHistorialDeComidas.setListData(usuarioActual.getHistorialComidas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        btnVerHistorial = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 130, 440, 280);

        btnVerHistorial.setBackground(new java.awt.Color(51, 153, 255));
        btnVerHistorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistorial.setText("Ver Historial");
        btnVerHistorial.setContentAreaFilled(false);
        btnVerHistorial.setOpaque(true);
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });
        add(btnVerHistorial);
        btnVerHistorial.setBounds(390, 460, 210, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Historial de Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(160, 30, 330, 40);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 0, 90, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        ComidaPorDia comidaSeleccionada = (ComidaPorDia) listaHistorialDeComidas.getSelectedValue();
        if (comidaSeleccionada != null) {
            ventana.remove(this);
            PanelVerHistorialUsuario nuevo = new PanelVerHistorialUsuario(sistema, ventana, comidaSeleccionada);
            
           
        }
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelHomeDeUsuario nuevo = new PanelHomeDeUsuario(sistema, ventana,usuarioActual.getNombreUsuario());
        
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
