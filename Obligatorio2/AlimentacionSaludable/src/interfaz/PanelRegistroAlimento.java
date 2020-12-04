package interfaz;

import dominio.Sistema;
import dominio.Alimento;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelRegistroAlimento extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Alimento alimento;
    private JFrame ventana;

    //Cosntructor
    public PanelRegistroAlimento(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        alimento = new Alimento();
        Alimento.TipoAlimento[] listaTipoAlimento = alimento.getListaEnumTipoAlimento();
        listaTiposAlimentos.setModel(new DefaultComboBoxModel(listaTipoAlimento));
        listaTiposAlimentos.setSelectedIndex(Alimento.TipoAlimento.Fruta.ordinal());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegAlimento = new javax.swing.JPanel();
        etiquetaNombAlim = new javax.swing.JLabel();
        cajaNombreAlim = new javax.swing.JTextField();
        etiquetaTipoAlim = new javax.swing.JLabel();
        listaTiposAlimentos = new javax.swing.JComboBox<>();
        checkBoxProteinas = new javax.swing.JCheckBox();
        checkBoxLipidos = new javax.swing.JCheckBox();
        checkBoxHidratosDeCarbono = new javax.swing.JCheckBox();
        checkBoxVitaminas = new javax.swing.JCheckBox();
        checkBoxMinerales = new javax.swing.JCheckBox();
        checkBoxAgua = new javax.swing.JCheckBox();
        checkBoxFibra = new javax.swing.JCheckBox();
        etiquetaErrorNombreAlimento = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        etiquetaTituloPpalesNutrientes = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        btnAceptarRegAlim = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelRegAlimento.setBackground(new java.awt.Color(255, 255, 255));
        panelRegAlimento.setPreferredSize(new java.awt.Dimension(650, 540));
        panelRegAlimento.setLayout(null);

        etiquetaNombAlim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaNombAlim.setText("Nombre:");
        panelRegAlimento.add(etiquetaNombAlim);
        etiquetaNombAlim.setBounds(20, 170, 54, 20);

        cajaNombreAlim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombreAlim.setPreferredSize(new java.awt.Dimension(8, 32));
        cajaNombreAlim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreAlimFocusLost(evt);
            }
        });
        panelRegAlimento.add(cajaNombreAlim);
        cajaNombreAlim.setBounds(170, 170, 160, 30);

        etiquetaTipoAlim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaTipoAlim.setText("Tipo de alimento:");
        panelRegAlimento.add(etiquetaTipoAlim);
        etiquetaTipoAlim.setBounds(20, 220, 105, 20);

        listaTiposAlimentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaTiposAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTiposAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiposAlimentosActionPerformed(evt);
            }
        });
        panelRegAlimento.add(listaTiposAlimentos);
        listaTiposAlimentos.setBounds(170, 220, 160, 20);

        checkBoxProteinas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxProteinas.setText("Proteínas");
        checkBoxProteinas.setContentAreaFilled(false);
        checkBoxProteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxProteinasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxProteinas);
        checkBoxProteinas.setBounds(20, 430, 81, 25);

        checkBoxLipidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxLipidos.setText("Lípidos");
        checkBoxLipidos.setContentAreaFilled(false);
        checkBoxLipidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLipidosActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxLipidos);
        checkBoxLipidos.setBounds(20, 470, 67, 25);

        checkBoxHidratosDeCarbono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxHidratosDeCarbono.setText("Hidratos de Carbono");
        checkBoxHidratosDeCarbono.setContentAreaFilled(false);
        checkBoxHidratosDeCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHidratosDeCarbonoActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxHidratosDeCarbono);
        checkBoxHidratosDeCarbono.setBounds(170, 430, 151, 25);

        checkBoxVitaminas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxVitaminas.setText("Vitaminas");
        checkBoxVitaminas.setContentAreaFilled(false);
        checkBoxVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVitaminasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxVitaminas);
        checkBoxVitaminas.setBounds(340, 430, 83, 25);

        checkBoxMinerales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxMinerales.setText("Minerales");
        checkBoxMinerales.setContentAreaFilled(false);
        checkBoxMinerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMineralesActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxMinerales);
        checkBoxMinerales.setBounds(440, 430, 79, 25);

        checkBoxAgua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxAgua.setText("Agua");
        checkBoxAgua.setContentAreaFilled(false);
        checkBoxAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAguaActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxAgua);
        checkBoxAgua.setBounds(170, 470, 57, 25);

        checkBoxFibra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBoxFibra.setText("Fibra");
        checkBoxFibra.setContentAreaFilled(false);
        checkBoxFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFibraActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxFibra);
        checkBoxFibra.setBounds(340, 470, 55, 25);

        etiquetaErrorNombreAlimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegAlimento.add(etiquetaErrorNombreAlimento);
        etiquetaErrorNombreAlimento.setBounds(0, 0, 0, 0);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegAlimento.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(0, 0, 0, 0);

        etiquetaTituloPpalesNutrientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaTituloPpalesNutrientes.setText("Principales Nutrientes:");
        panelRegAlimento.add(etiquetaTituloPpalesNutrientes);
        etiquetaTituloPpalesNutrientes.setBounds(30, 350, 133, 17);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Registro Alimento");
        panelRegAlimento.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(190, 10, 280, 44);

        btnAceptarRegAlim.setBackground(new java.awt.Color(102, 153, 255));
        btnAceptarRegAlim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptarRegAlim.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarRegAlim.setText("Aceptar");
        btnAceptarRegAlim.setContentAreaFilled(false);
        btnAceptarRegAlim.setOpaque(true);
        btnAceptarRegAlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegAlimActionPerformed(evt);
            }
        });
        panelRegAlimento.add(btnAceptarRegAlim);
        btnAceptarRegAlim.setBounds(510, 500, 110, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxHidratosDeCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHidratosDeCarbonoActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.HidratosDeCarbono.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxHidratosDeCarbonoActionPerformed

    private void checkBoxFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFibraActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Fibra.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxFibraActionPerformed

    private void cajaNombreAlimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreAlimFocusLost
        String nombre = cajaNombreAlim.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombreAlimento.setText("El nombre no puede ser vacío");
        } else {
            alimento.setNombre(nombre);
            if (sistema.getListaAlimentos().contains(alimento)) {
                etiquetaErrorNombreAlimento.setText("Esa comida ya se encuentra en el sistema");
            } else {
                etiquetaErrorNombreAlimento.setText(" ");
            }
        }
    }//GEN-LAST:event_cajaNombreAlimFocusLost

    private void checkBoxProteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxProteinasActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Proteinas.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxProteinasActionPerformed

    private void checkBoxLipidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLipidosActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Lipidos.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxLipidosActionPerformed

    private void checkBoxVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVitaminasActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Vitaminas.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxVitaminasActionPerformed

    private void checkBoxMineralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMineralesActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Minerales.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxMineralesActionPerformed

    private void checkBoxAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAguaActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.Agua.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxAguaActionPerformed

    private void listaTiposAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiposAlimentosActionPerformed

    }//GEN-LAST:event_listaTiposAlimentosActionPerformed

    private void btnAceptarRegAlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegAlimActionPerformed
        Alimento comparo = new Alimento();

        comparo.setNombre(cajaNombreAlim.getText());
        boolean nombre = !cajaNombreAlim.getText().trim().isEmpty()
                && !sistema.getListaAlimentos().contains(comparo);
          
        if (nombre) {
            alimento.setNombre(cajaNombreAlim.getText());
            alimento.setTipo(alimento.getListaEnumTipoAlimento()[listaTiposAlimentos.getSelectedIndex()]);
            JOptionPane optionPane
                    = new JOptionPane("Alimento registrado "
                            + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Registro Alimento");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            limpiarDatos();
        } else {
            JOptionPane optionPane
                    = new JOptionPane("Alimento no pudo ser registrado"
                            + "correctamente", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Registro Alimento");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
       

    }//GEN-LAST:event_btnAceptarRegAlimActionPerformed

    private void limpiarDatos() {
        this.checkBoxAgua.setSelected(false);
        this.checkBoxFibra.setSelected(false);
        this.checkBoxHidratosDeCarbono.setSelected(false);
        this.checkBoxLipidos.setSelected(false);
        this.checkBoxMinerales.setSelected(false);
        this.checkBoxProteinas.setSelected(false);
        this.checkBoxVitaminas.setSelected(false);
        this.cajaNombreAlim.setText("");
        this.listaTiposAlimentos.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarRegAlim;
    private javax.swing.JTextField cajaNombreAlim;
    private javax.swing.JCheckBox checkBoxAgua;
    private javax.swing.JCheckBox checkBoxFibra;
    private javax.swing.JCheckBox checkBoxHidratosDeCarbono;
    private javax.swing.JCheckBox checkBoxLipidos;
    private javax.swing.JCheckBox checkBoxMinerales;
    private javax.swing.JCheckBox checkBoxProteinas;
    private javax.swing.JCheckBox checkBoxVitaminas;
    private javax.swing.JLabel etiquetaErrorNombreAlimento;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombAlim;
    private javax.swing.JLabel etiquetaTipoAlim;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTituloPpalesNutrientes;
    private javax.swing.JComboBox<String> listaTiposAlimentos;
    private javax.swing.JPanel panelRegAlimento;
    // End of variables declaration//GEN-END:variables

}
