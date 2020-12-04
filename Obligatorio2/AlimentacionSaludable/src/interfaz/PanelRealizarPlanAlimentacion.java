package interfaz;

import dominio.Alimento;
import dominio.PlanDeAlimentacion;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class PanelRealizarPlanAlimentacion extends javax.swing.JPanel {

    //Atributos
    private  final Sistema sistema;
 
    private final PanelHomeDeProfesional ventana;
    private final Usuario usuarioAModificar;
    private final PlanDeAlimentacion nuevoPlan;

    //Constructor
    public PanelRealizarPlanAlimentacion(Sistema unSistema,
            PanelHomeDeProfesional unaVentana,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        
        ventana = unaVentana;
        usuarioAModificar = unUsuario;
        nuevoPlan = new PlanDeAlimentacion(usuarioAModificar);
        listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
    }

    //Constructor
    public PanelRealizarPlanAlimentacion(Sistema unSistema,
           
            PanelHomeDeProfesional unaVentana,
            Usuario unUsuario,
            PlanDeAlimentacion unPlan) {
        initComponents();
        sistema = unSistema;
        
        ventana = unaVentana;
        usuarioAModificar = unUsuario;
        nuevoPlan = unPlan;
        listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        etiquetaDiasDeLaSemana = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        btnAgregarComida = new javax.swing.JButton();
        btnQuitarComida = new javax.swing.JButton();
        btnEnviarPlan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaDiasDeLaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        add(listaDiasDeLaSemana);
        listaDiasDeLaSemana.setBounds(140, 90, 160, 23);

        etiquetaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaDiasDeLaSemana.setText("Dia de la semana:");
        add(etiquetaDiasDeLaSemana);
        etiquetaDiasDeLaSemana.setBounds(20, 90, 200, 20);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Realizar Plan de Alimentación");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(110, 10, 480, 50);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 140, 380, 240);

        btnAgregarComida.setBackground(new java.awt.Color(51, 153, 255));
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
        btnAgregarComida.setBounds(390, 400, 190, 30);

        btnQuitarComida.setBackground(new java.awt.Color(51, 153, 255));
        btnQuitarComida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuitarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarComida.setText("Quitar Comida");
        btnQuitarComida.setContentAreaFilled(false);
        btnQuitarComida.setOpaque(true);
        btnQuitarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarComidaActionPerformed(evt);
            }
        });
        add(btnQuitarComida);
        btnQuitarComida.setBounds(50, 400, 170, 30);

        btnEnviarPlan.setBackground(new java.awt.Color(51, 153, 255));
        btnEnviarPlan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEnviarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarPlan.setText("Enviar Plan");
        btnEnviarPlan.setContentAreaFilled(false);
        btnEnviarPlan.setOpaque(true);
        btnEnviarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPlanActionPerformed(evt);
            }
        });
        add(btnEnviarPlan);
        btnEnviarPlan.setBounds(460, 490, 170, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarComidaActionPerformed
        Alimento alimentoSeleccionado = (Alimento) listaComidasDiarias.getSelectedValue();
        listaActiva().remove(alimentoSeleccionado);
        actualizarLista();
    }//GEN-LAST:event_btnQuitarComidaActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        
        ArrayList<Alimento> listaActiva = listaActiva();
        PanelAgregarComidasAPlan nuevo = new PanelAgregarComidasAPlan(sistema, ventana, listaActiva, nuevoPlan, usuarioAModificar,this);
       ventana.setPanelActual(nuevo);
                ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
                ventana.getPanelPrincipal().setPreferredSize(new Dimension(400, 400));
       
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged
        actualizarLista();
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void btnEnviarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPlanActionPerformed
        usuarioAModificar.setPlan(nuevoPlan);
      JOptionPane optionPane
                    = new JOptionPane("Plan registrado "
                            + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Plan Alimentacion Realizado");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnEnviarPlanActionPerformed

    public void actualizarLista() {
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaMartes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaMiercoles().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaJueves().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaViernes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaSabado().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaDomingo().toArray());
        }
    }

    ArrayList<Alimento> listaActiva() {
        ArrayList<Alimento> retorno = null;
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            retorno = nuevoPlan.getListaLunes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            retorno = nuevoPlan.getListaMartes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            retorno = nuevoPlan.getListaMiercoles();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            retorno = nuevoPlan.getListaJueves();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            retorno = nuevoPlan.getListaViernes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            retorno = nuevoPlan.getListaSabado();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            retorno = nuevoPlan.getListaDomingo();
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnEnviarPlan;
    private javax.swing.JButton btnQuitarComida;
    private javax.swing.JLabel etiquetaDiasDeLaSemana;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    // End of variables declaration//GEN-END:variables
}
