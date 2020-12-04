package interfaz;

import dominio.Mensaje;
import dominio.Profesional;
import dominio.Sistema;
import javax.swing.JFrame;

public class PanelConsultaProfesionalDesdeProfesional extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private Profesional profesional;
    private JFrame ventana;
    private Mensaje mensajeSeleccionado;

    //Constructor
    public PanelConsultaProfesionalDesdeProfesional(Sistema unSistema,
             JFrame unaVentana, Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        profesional=unProfesional;
        ventana = unaVentana;
        listaMensajes.setListData(profesional.getCasillaDeEntrada().toArray());
        textoLeerMensaje.setEditable(false);
        mensajeSeleccionado = null;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsultaProf = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMensajes = new javax.swing.JList();
        etiquetaTituloConsultas = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoLeerMensaje = new javax.swing.JTextArea();
        btnBorrarCons = new javax.swing.JButton();
        etiquetaBandejaDeEntrada1 = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelConsultaProf.setBackground(new java.awt.Color(255, 255, 255));
        panelConsultaProf.setPreferredSize(new java.awt.Dimension(650, 540));
        panelConsultaProf.setLayout(null);

        listaMensajes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaMensajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMensajesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaMensajes);

        panelConsultaProf.add(jScrollPane2);
        jScrollPane2.setBounds(340, 110, 290, 350);

        etiquetaTituloConsultas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloConsultas.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTituloConsultas.setText("Bandeja de Entrada");
        panelConsultaProf.add(etiquetaTituloConsultas);
        etiquetaTituloConsultas.setBounds(160, 10, 320, 44);

        etiquetaBandejaDeEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBandejaDeEntrada.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada);
        etiquetaBandejaDeEntrada.setBounds(680, 110, 220, 30);

        textoLeerMensaje.setColumns(20);
        textoLeerMensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoLeerMensaje.setRows(5);
        jScrollPane1.setViewportView(textoLeerMensaje);

        panelConsultaProf.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 270, 347);

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
        btnBorrarCons.setBounds(450, 470, 90, 30);

        etiquetaBandejaDeEntrada1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaBandejaDeEntrada1.setText("Mensaje:");
        panelConsultaProf.add(etiquetaBandejaDeEntrada1);
        etiquetaBandejaDeEntrada1.setBounds(130, 70, 60, 30);

        etiquetaBandejaDeEntrada2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaBandejaDeEntrada2.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada2);
        etiquetaBandejaDeEntrada2.setBounds(410, 70, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMensajesValueChanged
        mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
        if (mensajeSeleccionado != null) {
            textoLeerMensaje.setText(mensajeSeleccionado.getMensaje());
        }
    }//GEN-LAST:event_listaMensajesValueChanged

    private void btnBorrarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConsActionPerformed
        if (mensajeSeleccionado != null) {
            mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
            textoLeerMensaje.setText("");
            profesional.getCasillaDeEntrada().remove(mensajeSeleccionado);
            mensajeSeleccionado = null;
            listaMensajes.setListData(profesional.getCasillaDeEntrada().toArray());
        }
    }//GEN-LAST:event_btnBorrarConsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCons;
    private javax.swing.JLabel etiquetaBandejaDeEntrada;
    private javax.swing.JLabel etiquetaBandejaDeEntrada1;
    private javax.swing.JLabel etiquetaBandejaDeEntrada2;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaMensajes;
    private javax.swing.JPanel panelConsultaProf;
    private javax.swing.JTextArea textoLeerMensaje;
    // End of variables declaration//GEN-END:variables
}
