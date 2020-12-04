package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelPlanAlimentacionUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private Usuario usuarioActual;

    //Constructor
    public PanelPlanAlimentacionUsuario(Sistema unSistema,
            JFrame unaVentana,Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActual=unUsuario;
        listaProfesionalesAlim.setModel(new DefaultComboBoxModel(sistema.getListaProfesionales().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlan = new javax.swing.JPanel();
        etiquetaProfesionalACargo = new javax.swing.JLabel();
        listaProfesionalesAlim = new javax.swing.JComboBox();
        btnAceptarPlan = new javax.swing.JButton();
        etiquetaPlanDeAlimentacion = new javax.swing.JLabel();
        mensajeAlAceptar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelPlan.setBackground(new java.awt.Color(255, 255, 255));
        panelPlan.setPreferredSize(new java.awt.Dimension(650, 540));
        panelPlan.setRequestFocusEnabled(false);
        panelPlan.setLayout(null);

        etiquetaProfesionalACargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaProfesionalACargo.setText("Profesional a cargo:");
        panelPlan.add(etiquetaProfesionalACargo);
        etiquetaProfesionalACargo.setBounds(30, 200, 170, 30);

        listaProfesionalesAlim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelPlan.add(listaProfesionalesAlim);
        listaProfesionalesAlim.setBounds(190, 200, 240, 30);

        btnAceptarPlan.setBackground(new java.awt.Color(102, 153, 255));
        btnAceptarPlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarPlan.setText("Aceptar");
        btnAceptarPlan.setContentAreaFilled(false);
        btnAceptarPlan.setOpaque(true);
        btnAceptarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarPlanActionPerformed(evt);
            }
        });
        panelPlan.add(btnAceptarPlan);
        btnAceptarPlan.setBounds(470, 200, 150, 30);

        etiquetaPlanDeAlimentacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaPlanDeAlimentacion.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaPlanDeAlimentacion.setText("Plan de Alimentación");
        panelPlan.add(etiquetaPlanDeAlimentacion);
        etiquetaPlanDeAlimentacion.setBounds(150, 10, 350, 50);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelPlan.add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(140, 240, 460, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarPlanActionPerformed
        Profesional profesionalActivo = (Profesional) listaProfesionalesAlim.getSelectedItem();
        usuarioActual.setProfesionalAsignado(profesionalActivo);
        usuarioActual.setNecesitoPlan(true);
         JOptionPane optionPane
                    = new JOptionPane("Se ha pedido un plan "
                            + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Plan de Alimentacion");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
    }//GEN-LAST:event_btnAceptarPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarPlan;
    private javax.swing.JLabel etiquetaPlanDeAlimentacion;
    private javax.swing.JLabel etiquetaProfesionalACargo;
    private javax.swing.JComboBox listaProfesionalesAlim;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JPanel panelPlan;
    // End of variables declaration//GEN-END:variables
}
