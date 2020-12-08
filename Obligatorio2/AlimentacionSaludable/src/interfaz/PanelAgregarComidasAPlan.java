package interfaz;

import dominio.Alimento;
import dominio.PlanDeAlimentacion;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelAgregarComidasAPlan extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
   
    private final PanelHomeDeProfesional ventana;
    private final Usuario usuarioAModificar;
    private final PanelRealizarPlanAlimentacion  realizarPlan;
    private final ArrayList<Alimento> listaAModificar;
    private final PlanDeAlimentacion plan;

    //Constructor
    public PanelAgregarComidasAPlan(Sistema unSistema,
            
            PanelHomeDeProfesional unaVentana,
            ArrayList<Alimento> unaLista,
            PlanDeAlimentacion unPlan,
            Usuario unUsuario,PanelRealizarPlanAlimentacion  panelRealizar) {
        initComponents();
        sistema = unSistema;
        
        ventana = unaVentana;
        usuarioAModificar = unUsuario;
        listaAModificar = unaLista;
        plan = unPlan;
        listaComidas.setListData(sistema.getListaAlimentos().toArray());
        realizarPlan=panelRealizar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidas = new javax.swing.JList();
        btnAgregarComida = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        listaComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 90, 370, 350);

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
        btnAgregarComida.setBounds(230, 450, 170, 30);

        etiquetaTitulo.setBackground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setText("Agregar Comida a la dieta");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(120, 20, 450, 50);

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
        btnVolver.setBounds(10, 20, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        Alimento alimentoAAgregar = (Alimento) listaComidas.getSelectedValue();
        listaAModificar.add(alimentoAAgregar);
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.setPanelActual(realizarPlan);
        ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventana.setPreferredSize(new Dimension(400, 400));
        realizarPlan.actualizarLista();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidas;
    // End of variables declaration//GEN-END:variables
}
