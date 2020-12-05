package interfaz;

import dominio.Sistema;
import javax.swing.JFrame;
import dominio.Mensaje;
import dominio.Usuario;

public class PanelConsultaProfesional extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    
    private JFrame ventana;
    private Mensaje mensajeSeleccionado;
    private Usuario usuario;
 
    //Constructor
    public PanelConsultaProfesional(Sistema unSistema,JFrame unaVentana, Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        usuario=unUsuario;
        ventana = unaVentana;
        listaMensajes.setListData(usuario.getCasillaDeEntrada().toArray());
        if (usuario.getCasillaDeEntrada().size() > 0) {
            listaMensajes.setSelectedIndex(0);
        }
        mensajeSeleccionado = null;
        textoLeerMensaje.setEditable(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsultaProf = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoLeerMensaje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMensajes = new javax.swing.JList();
        btnBorrarCons = new javax.swing.JButton();
        etiquetaTituloConsultas = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelConsultaProf.setBackground(new java.awt.Color(255, 255, 255));
        panelConsultaProf.setPreferredSize(new java.awt.Dimension(650, 540));
        panelConsultaProf.setLayout(null);

        textoLeerMensaje.setColumns(20);
        textoLeerMensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoLeerMensaje.setRows(5);
        jScrollPane1.setViewportView(textoLeerMensaje);

        panelConsultaProf.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 270, 347);

        listaMensajes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaMensajes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaMensajesFocusGained(evt);
            }
        });
        listaMensajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMensajesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaMensajes);

        panelConsultaProf.add(jScrollPane2);
        jScrollPane2.setBounds(360, 110, 260, 350);

        btnBorrarCons.setBackground(new java.awt.Color(102, 153, 255));
        btnBorrarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBorrarCons.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCons.setText("Borrar");
        btnBorrarCons.setContentAreaFilled(false);
        btnBorrarCons.setOpaque(true);
        btnBorrarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarConsActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnBorrarCons);
        btnBorrarCons.setBounds(490, 480, 100, 30);

        etiquetaTituloConsultas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloConsultas.setForeground(new java.awt.Color(102, 102, 255));
        etiquetaTituloConsultas.setText("Consultas a Profesionales");
        panelConsultaProf.add(etiquetaTituloConsultas);
        etiquetaTituloConsultas.setBounds(110, 10, 420, 40);

        etiquetaBandejaDeEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaBandejaDeEntrada.setText("Mensaje:");
        panelConsultaProf.add(etiquetaBandejaDeEntrada);
        etiquetaBandejaDeEntrada.setBounds(120, 60, 60, 30);

        etiquetaBandejaDeEntrada1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaBandejaDeEntrada1.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada1);
        etiquetaBandejaDeEntrada1.setBounds(420, 60, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaMensajesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaMensajesFocusGained

    }//GEN-LAST:event_listaMensajesFocusGained

    private void btnBorrarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConsActionPerformed
        if (mensajeSeleccionado != null) {
            mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
            textoLeerMensaje.setText("");
            usuario.getCasillaDeEntrada().remove(mensajeSeleccionado);
            mensajeSeleccionado = null;
            listaMensajes.setListData(usuario.getCasillaDeEntrada().toArray());
        }
    }//GEN-LAST:event_btnBorrarConsActionPerformed

    private void listaMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMensajesValueChanged
        mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
        if (mensajeSeleccionado != null) {
            String textoMensaje = mensajeSeleccionado.getMensaje();
            textoLeerMensaje.setText(textoMensaje);
        }
    }//GEN-LAST:event_listaMensajesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCons;
    private javax.swing.JLabel etiquetaBandejaDeEntrada;
    private javax.swing.JLabel etiquetaBandejaDeEntrada1;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaMensajes;
    private javax.swing.JPanel panelConsultaProf;
    private javax.swing.JTextArea textoLeerMensaje;
    // End of variables declaration//GEN-END:variables
}
