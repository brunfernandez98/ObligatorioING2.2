package interfaz;


import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;


public final class PanelSeleccionarPlanARealizar extends javax.swing.JPanel {

    private final Sistema sistema;
    private final PanelHomeDeProfesional ventana;
    private final Profesional usuarioActivo;

    public PanelSeleccionarPlanARealizar(Sistema unSistema,
            
            PanelHomeDeProfesional unaVentana, Profesional profesional) {
        initComponents();
       
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActivo=profesional;
        listaUsuarios.setListData(listaConPlanARealizar().toArray());
    }

    
    private Profesional getUsuarioActivo(){
        return usuarioActivo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        btnRealizarPlan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setText("Seleccionar Plan de Alimentacion a Realizar");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(20, 10, 720, 40);

        listaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 80, 390, 370);

        btnRealizarPlan.setBackground(new java.awt.Color(102, 153, 255));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(440, 490, 180, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
        if (listaUsuarios.getSelectedValue() != null) {
            Usuario usuarioAModificar = sistema.getListaUsuarios().get(listaUsuarios.getSelectedIndex());
            
            PanelRealizarPlanAlimentacion nuevoPanel = new PanelRealizarPlanAlimentacion(sistema,ventana, usuarioAModificar);
            
            ventana.setPanelActual(nuevoPanel);
      
      ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
      ventana.setPreferredSize(new Dimension(400, 400));
            
          
        }

    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    ArrayList<Usuario> listaConPlanARealizar() {
        ArrayList<Usuario> retorno = new ArrayList<Usuario>();
        for (int i = 0; i < sistema.getListaUsuarios().size(); i++) {
            if (sistema.getListaUsuarios().get(i).isNecesitoPlan() && sistema.getListaUsuarios().get(i).getProfesionalAsignado().equals(getUsuarioActivo())) {
                retorno.add(sistema.getListaUsuarios().get(i));
            }
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
