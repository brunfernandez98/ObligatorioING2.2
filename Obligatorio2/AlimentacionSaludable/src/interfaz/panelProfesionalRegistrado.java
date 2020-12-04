/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell Latitude e6440
 */

public class panelProfesionalRegistrado extends javax.swing.JPanel {
 private final Sistema sistema;
    private final PanelHomeDeAdministrador  ventanaAdministrador;
    private PanelEditarPerfilProfesional panelEditarUsuario;
    private JPanel panelInformacionUsuario;
    
    /**
     * Creates new form panelProfesionalRegistrado
     */
    public panelProfesionalRegistrado(Sistema unSistema,PanelHomeDeAdministrador unaVentana) {
        initComponents();
        sistema=unSistema;
        ventanaAdministrador=unaVentana;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT mo}
dify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        jButton4.setText("Borrar Usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(30, 50, 210, 34);

        jButton1.setText("Editar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 50, 210, 34);

        jButton2.setText("Informacion del Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(380, 50, 220, 34);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Nombre Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 172, 670, 370);
    }// </editor-fold>//GEN-END:initComponents

    public void setModo(int unModo){
        
        if(unModo==0){
            this.jButton4.setVisible(true);
           this.jButton1.setVisible(false);
        }else if(unModo==1){
            this.jButton1.setVisible(true);
            this.jButton4.setVisible(false);
        }else{
            this.jButton1.setVisible(false);
            this.jButton4.setVisible(false);
        }
    }
     void actualizarTabla(){
      
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.getDataVector().removeAllElements();
         Object[] rowData  = new Object[model.getColumnCount()];
        
       for (int i=0; i<sistema.getListaProfesionales().size(); i++){
           Profesional unUsuario=sistema.getListaProfesionales().get(i);
           rowData[0] = unUsuario.getNombre();
        rowData[1] = unUsuario.getApellidos();
        rowData[2] = unUsuario.getNombreUsuario();
        rowData[3] = unUsuario.getPassword();
       model.addRow(rowData);
           }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();

        Profesional usuarioReal=getUsuarioEspecifico(userName,sistema.getListaProfesionales());
        panelEditarUsuario=new PanelEditarPerfilProfesional(sistema,ventanaAdministrador,usuarioReal);
        ventanaAdministrador.setPanelActual(panelEditarUsuario);

        ventanaAdministrador.getPanelPrincipal().add(ventanaAdministrador.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventanaAdministrador.setPreferredSize(new Dimension(400, 400));
  actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed
private Profesional getUsuarioEspecifico(
  String userName, ArrayList<Profesional> profesionales) {
 
    for (Profesional unProfesional : profesionales) {
        if (unProfesional.getNombreUsuario().equals(userName)) {
            return unProfesional;
        }
    }
    return null;
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();

        Profesional usuarioReal=getUsuarioEspecifico(userName,sistema.getListaProfesionales());
        panelInformacionUsuario=new PanelHomeProfesional(sistema,ventanaAdministrador,usuarioReal,this);
        ventanaAdministrador.setPanelActual(panelInformacionUsuario);
      ventanaAdministrador.getPanelPrincipal().add(ventanaAdministrador.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventanaAdministrador.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();
        Profesional usuarioReal=getUsuarioEspecifico(userName,sistema.getListaProfesionales());
        sistema.getListaProfesionales().remove(usuarioReal);
        JOptionPane optionPane = new JOptionPane("Profesional eliminado "
                    + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Baja Profesional");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         actualizarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
