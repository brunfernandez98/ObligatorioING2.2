/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Alimento;
import dominio.Profesional;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell Latitude e6440
 */


public class PanelListaAlimentos extends javax.swing.JPanel {

      private final Sistema sistema;
    private final PanelHomeDeAdministrador  ventanaAdministrador;
    private PanelEditarPerfilUsuario panelEditarUsuario;
    private JPanel panelInformacionUsuario;
    /**
     * Creates new form PanelListaAlimentos
     * @param unSistema
     * @param unaVentana
     */
    public PanelListaAlimentos(Sistema unSistema,PanelHomeDeAdministrador unaVentana) {
        sistema=unSistema;
        ventanaAdministrador=unaVentana;
       
        initComponents();
         actualizarTabla();
        
        
    }
    
    private  int[] indexNutrientes(Alimento unAlimento){
         int[] index = new int[8];
         
         for (int i = 0; i < unAlimento.getListaNutrientesSeleccionados().length; i++) {
             if(unAlimento.getListaNutrientesSeleccionados()[i]){
                 index[i]=i;
             }else{
                 index[i]=-1;
             }
            
        }
         return index;
    }
    
    
     private void actualizarTabla(){
      
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.getDataVector().removeAllElements();
         Object[] rowData  = new Object[model.getColumnCount()];
        
         
         
       for (int i=0; i<sistema.getListaAlimentos().size(); i++){
            Alimento unAlimento=sistema.getListaAlimentos().get(i);
            String[] array=new String[8];
            int[]index=indexNutrientes(unAlimento);
           for (int j = 0; j < index.length; j++) {
               if(index[j]!=-1)
            array[j]=unAlimento.getListaEnumNutrientes()[index[j]].toString();
               else
                  array[j]=""; 
              }
        rowData[0] = unAlimento.getNombre();  
        rowData[1] = unAlimento.getTipo();
        rowData[2] = Arrays.toString(array);
        
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
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Alimento", "Tipo Alimento", "Nutrientes"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("BorrarAlimento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
private Alimento getAlimentoEspecifico(
  String nombreAlimento, ArrayList<Alimento> alimentos) {
 
    for (Alimento unAlimento : alimentos) {
        if (unAlimento.getNombre().equals(nombreAlimento)) {
            return unAlimento;
        }
    }
    return null;
     }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row=jTable1.getSelectedRow();
        int column=0;
        String nombreAlimento=jTable1.getModel().getValueAt(row, column).toString();
        Alimento alimentoReal =getAlimentoEspecifico(nombreAlimento,sistema.getListaAlimentos());
        sistema.getListaAlimentos().remove(alimentoReal);
        JOptionPane optionPane = new JOptionPane("Alimento eliminado "
                    + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Baja Alimento");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         actualizarTabla();
         
       
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
