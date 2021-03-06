/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell Latitude e6440
 */
public class PanelUsuariosRegistrados extends javax.swing.JPanel {

    /**
     * Creates new form PanelUsuariosRegistrados
     */
    private final Sistema sistema;
    private final PanelHomeDeAdministrador  ventanaAdministrador;
    private PanelEditarPerfilUsuario panelEditarUsuario;
    private JPanel panelInformacionUsuario;
    public PanelUsuariosRegistrados(Sistema unSistema,PanelHomeDeAdministrador unaVentana) {
        initComponents();
      
        sistema=unSistema;
        ventanaAdministrador=unaVentana;
      
    }

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
    public void actualizarTabla(){
      
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.getDataVector().removeAllElements();
         Object[] rowData  = new Object[model.getColumnCount()];
       for (int i=0; i<sistema.getListaUsuarios().size(); i++){
           Usuario unUsuario=sistema.getListaUsuarios().get(i);
           rowData[0] = unUsuario.getNombre();
        rowData[1] = unUsuario.getApellidos();
        rowData[2] = unUsuario.getNombreUsuario();
        rowData[3] = unUsuario.getPassword();
       model.addRow(rowData);
           }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setRequestFocusEnabled(false);
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Nombre Usuario", "Contraseña"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 221, 680, 330);

        jButton1.setText("Editar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(50, 80, 170, 34);

        jButton2.setText("Informacion del Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(430, 80, 170, 34);

        jButton4.setText("Borrar Usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(50, 80, 160, 34);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();
       
      Usuario usuarioReal=getUsuarioEspecifico(userName,sistema.getListaUsuarios());
      panelEditarUsuario=new PanelEditarPerfilUsuario(sistema,ventanaAdministrador,usuarioReal);
      ventanaAdministrador.setPanelActual(panelEditarUsuario);
      
      ventanaAdministrador.getPanelPrincipal().add(ventanaAdministrador.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
      ventanaAdministrador.setPreferredSize(new Dimension(400, 400));
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();
       
      Usuario usuarioReal=getUsuarioEspecifico(userName,sistema.getListaUsuarios());
      panelInformacionUsuario=new PanelPerfilUsuario(sistema,ventanaAdministrador,usuarioReal,this);
      ventanaAdministrador.setPanelActual(panelInformacionUsuario);
      
      ventanaAdministrador.getPanelPrincipal().add(ventanaAdministrador.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
      ventanaAdministrador.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row=jTable1.getSelectedRow();
        int column=2;
        String userName=jTable1.getModel().getValueAt(row, column).toString();
        Usuario usuarioReal=getUsuarioEspecifico(userName,sistema.getListaUsuarios());
        sistema.getListaProfesionales().remove(usuarioReal);
        JOptionPane optionPane = new JOptionPane("Usuario eliminado "
            + "correctamente", JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Baja Usuario");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        actualizarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private Usuario getUsuarioEspecifico(
  String userName, ArrayList<Usuario> usuario) {
 
    for (Usuario unUsuario : usuario) {
        if (unUsuario.getNombreUsuario().equals(userName)) {
            return unUsuario;
        }
    }
    return null;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
