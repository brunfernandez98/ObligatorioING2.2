package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.time.LocalDate;
import javax.swing.JPanel;

public class PanelAgregarComidasADietaDiariaUsuario extends javax.swing.JPanel {

    private final Sistema sistema;
    private final PanelHomeDeUsuario ventana;
    private final Usuario persona;
    private PanelDietaDiariaUsuario panelRealizarPlanAlimentacion;

    public PanelAgregarComidasADietaDiariaUsuario(Sistema unSistema,
            PanelHomeDeUsuario unaVentana, Usuario usuario, PanelDietaDiariaUsuario panelRealizarPlan) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        persona = usuario;
     
        listaComidasDiarias.setListData(sistema.getListaAlimentos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        btnAgregarComida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 90, 370, 320);

        etiquetaTitulo.setBackground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setText("Agregar Comida");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(170, 10, 280, 50);

        btnAgregarComida.setBackground(new java.awt.Color(102, 153, 255));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Comida");
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        add(btnAgregarComida);
        btnAgregarComida.setBounds(230, 430, 180, 30);

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
        btnVolver.setBounds(30, 10, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        Alimento comidaSeleccionada = (Alimento) listaComidasDiarias.getSelectedValue();
        persona.getHistorialDelDia().getComidasIngeridas().add(comidaSeleccionada);
        LocalDate diaActual = LocalDate.now();
        persona.setFechaUltimaAdicion(diaActual.toString());
       
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        panelRealizarPlanAlimentacion = new PanelDietaDiariaUsuario(sistema,ventana,persona);
        ventana.setPanelActual(panelRealizarPlanAlimentacion);
        ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventana.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidasDiarias;
    // End of variables declaration//GEN-END:variables
}
