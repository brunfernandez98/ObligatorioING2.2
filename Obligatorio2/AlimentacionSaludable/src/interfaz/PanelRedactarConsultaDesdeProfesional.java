package interfaz;

import dominio.Mensaje;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelRedactarConsultaDesdeProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
   
    private JFrame ventana;
    private Profesional profesional;
    //Constructor para profesional
    public PanelRedactarConsultaDesdeProfesional(Sistema unSistema,
            Profesional persona, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        profesional=persona;
        ventana = unaVentana;
        listaUsrConsultas.setModel(new DefaultComboBoxModel(sistema.getListaUsuarios().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRedactarConsulta = new javax.swing.JPanel();
        listaUsrConsultas = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoConsultaAEnviar = new javax.swing.JTextArea();
        cajaAsunto = new javax.swing.JTextField();
        mensajeAlAceptar = new javax.swing.JLabel();
        etiquetaAsunto = new javax.swing.JLabel();
        etiquetaDestinatarioConsulta = new javax.swing.JLabel();
        etiquetaMensaje = new javax.swing.JLabel();
        btnEnviarConsulta = new javax.swing.JButton();
        etiquetaTitulo1 = new javax.swing.JLabel();

        panelRedactarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        panelRedactarConsulta.setPreferredSize(new java.awt.Dimension(650, 540));
        panelRedactarConsulta.setRequestFocusEnabled(false);
        panelRedactarConsulta.setLayout(null);

        listaUsrConsultas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaUsrConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRedactarConsulta.add(listaUsrConsultas);
        listaUsrConsultas.setBounds(160, 110, 190, 27);

        textoConsultaAEnviar.setColumns(20);
        textoConsultaAEnviar.setRows(5);
        jScrollPane3.setViewportView(textoConsultaAEnviar);

        panelRedactarConsulta.add(jScrollPane3);
        jScrollPane3.setBounds(60, 270, 490, 150);

        cajaAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRedactarConsulta.add(cajaAsunto);
        cajaAsunto.setBounds(160, 160, 260, 30);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRedactarConsulta.add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(710, 650, 370, 50);

        etiquetaAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaAsunto.setText("Asunto:");
        panelRedactarConsulta.add(etiquetaAsunto);
        etiquetaAsunto.setBounds(100, 160, 50, 26);

        etiquetaDestinatarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaDestinatarioConsulta.setText("Destinatarios:");
        panelRedactarConsulta.add(etiquetaDestinatarioConsulta);
        etiquetaDestinatarioConsulta.setBounds(70, 110, 140, 20);

        etiquetaMensaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaMensaje.setText("Mensaje:");
        panelRedactarConsulta.add(etiquetaMensaje);
        etiquetaMensaje.setBounds(70, 220, 110, 26);

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
        panelRedactarConsulta.add(btnEnviarConsulta);
        btnEnviarConsulta.setBounds(450, 480, 170, 30);

        etiquetaTitulo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo1.setText("Redactar Consulta");
        panelRedactarConsulta.add(etiquetaTitulo1);
        etiquetaTitulo1.setBounds(160, 10, 310, 44);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRedactarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRedactarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarConsultaActionPerformed
        Mensaje mensajeAEnviar = new Mensaje();
        Usuario destino = (Usuario) listaUsrConsultas.getSelectedItem();
        if(destino!=null){
        mensajeAEnviar.setOrigen(profesional);
        mensajeAEnviar.setDestino(destino);
        mensajeAEnviar.setAsunto(cajaAsunto.getText());
        mensajeAEnviar.setMensaje(textoConsultaAEnviar.getText());
        
        mensajeAlAceptar.setText("Se ha enviado la consulta");
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
            dialog.setVisible(true);;
        }
        } 
    }//GEN-LAST:event_btnEnviarConsultaActionPerformed
 void limpiarDatos(){
        cajaAsunto.setText("");
        textoConsultaAEnviar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarConsulta;
    private javax.swing.JTextField cajaAsunto;
    private javax.swing.JLabel etiquetaAsunto;
    private javax.swing.JLabel etiquetaDestinatarioConsulta;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> listaUsrConsultas;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JPanel panelRedactarConsulta;
    private javax.swing.JTextArea textoConsultaAEnviar;
    // End of variables declaration//GEN-END:variables
}
