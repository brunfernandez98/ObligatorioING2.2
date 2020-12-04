package interfaz;

import dominio.Mensaje;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelRedactarConsulta extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private final Usuario usuarioActual;
  

    //Constructor para usuarios
    public PanelRedactarConsulta(Sistema unSistema,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        usuarioActual=unUsuario;
        listaProfConsulta.setModel(new DefaultComboBoxModel(sistema.getListaProfesionales().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaDestinatarioConsulta = new javax.swing.JLabel();
        listaProfConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoConsultaAEnviar = new javax.swing.JTextArea();
        btnEnviarConsulta = new javax.swing.JButton();
        cajaAsunto = new javax.swing.JTextField();
        etiquetaAsunto = new javax.swing.JLabel();
        etiquetaMensaje = new javax.swing.JLabel();
        mensajeAlAceptar = new javax.swing.JLabel();
        etiquetaTitulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setRequestFocusEnabled(false);
        setLayout(null);

        etiquetaDestinatarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaDestinatarioConsulta.setText("Destinatarios:");
        add(etiquetaDestinatarioConsulta);
        etiquetaDestinatarioConsulta.setBounds(60, 120, 150, 17);

        listaProfConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaProfConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaProfConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProfConsultaActionPerformed(evt);
            }
        });
        add(listaProfConsulta);
        listaProfConsulta.setBounds(160, 120, 190, 23);

        textoConsultaAEnviar.setColumns(20);
        textoConsultaAEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoConsultaAEnviar.setRows(5);
        jScrollPane1.setViewportView(textoConsultaAEnviar);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 540, 160);

        btnEnviarConsulta.setBackground(new java.awt.Color(102, 153, 255));
        btnEnviarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarConsulta.setText("Enviar");
        btnEnviarConsulta.setContentAreaFilled(false);
        btnEnviarConsulta.setOpaque(true);
        btnEnviarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarConsultaActionPerformed(evt);
            }
        });
        add(btnEnviarConsulta);
        btnEnviarConsulta.setBounds(460, 480, 170, 30);

        cajaAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAsuntoActionPerformed(evt);
            }
        });
        add(cajaAsunto);
        cajaAsunto.setBounds(160, 170, 250, 23);

        etiquetaAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaAsunto.setText("Asunto:");
        add(etiquetaAsunto);
        etiquetaAsunto.setBounds(60, 170, 100, 26);

        etiquetaMensaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaMensaje.setText("Mensaje:");
        add(etiquetaMensaje);
        etiquetaMensaje.setBounds(60, 240, 110, 26);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(710, 640, 370, 50);

        etiquetaTitulo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo1.setText("Redactar Consulta");
        add(etiquetaTitulo1);
        etiquetaTitulo1.setBounds(160, 10, 310, 44);
    }// </editor-fold>//GEN-END:initComponents

    private void listaProfConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProfConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaProfConsultaActionPerformed

    private void btnEnviarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarConsultaActionPerformed
        Mensaje mensajeAEnviar = new Mensaje();
        Profesional destino = (Profesional) listaProfConsulta.getSelectedItem();
        if(destino!=null){
        mensajeAEnviar.setOrigen(usuarioActual);
        mensajeAEnviar.setDestino(destino);
        mensajeAEnviar.setAsunto(cajaAsunto.getText());
        mensajeAEnviar.setMensaje(textoConsultaAEnviar.getText());
        if (!textoConsultaAEnviar.getText().isEmpty() && !cajaAsunto.getText().isEmpty()) {
            destino.getCasillaDeEntrada().add(mensajeAEnviar);
           JOptionPane optionPane = new JOptionPane("Consulta enviada", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Consulta");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            limpiarDatos();
            
            
            
        } else {
             JOptionPane optionPane = new JOptionPane("Consulta erronea verique los campos", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Consulta");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        }else{
             JOptionPane optionPane = new JOptionPane("Consulta fallida, no existen profesionales disponibles, consulte al administrador", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Consulta");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarConsultaActionPerformed

    void limpiarDatos(){
        cajaAsunto.setText("");
        textoConsultaAEnviar.setText("");
    }
    
    
    
    private void cajaAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAsuntoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarConsulta;
    private javax.swing.JTextField cajaAsunto;
    private javax.swing.JLabel etiquetaAsunto;
    private javax.swing.JLabel etiquetaDestinatarioConsulta;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaProfConsulta;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JTextArea textoConsultaAEnviar;
    // End of variables declaration//GEN-END:variables
}
