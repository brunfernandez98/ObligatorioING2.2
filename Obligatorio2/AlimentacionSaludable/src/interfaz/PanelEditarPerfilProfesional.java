package interfaz;

import dominio.Sistema;
import dominio.Profesional;
import handlers.ValidacionDeDatos;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelEditarPerfilProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Profesional profesional;
    private JFrame ventana;
    

    //Constructor
    public PanelEditarPerfilProfesional(Sistema unSistema, JFrame unaVentana, Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        
        profesional = unProfesional;
        Profesional.Pais[] listaPaises = profesional.getListaEnumPais();
        listaPaisDeGraduacion.setModel(new DefaultComboBoxModel(listaPaises));
        listaPaisDeGraduacion.setSelectedIndex(Profesional.Pais.Uruguay.ordinal());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegProf = new javax.swing.JPanel();
        etiquetaTituloProf = new javax.swing.JLabel();
        etiquetaNombreProf = new javax.swing.JLabel();
        etiquetaApellidosProf = new javax.swing.JLabel();
        etiquetaFechaNacProf = new javax.swing.JLabel();
        etiquetaNombTituloProf = new javax.swing.JLabel();
        etiquetaFechaGradProf = new javax.swing.JLabel();
        cajaNombreProf = new javax.swing.JTextField();
        cajaApellidosProf = new javax.swing.JTextField();
        cajaNombreTituloProf = new javax.swing.JTextField();
        btnAceptarProf = new javax.swing.JButton();
        etiquetaPaisDeGraduacion = new javax.swing.JLabel();
        listaPaisDeGraduacion = new javax.swing.JComboBox<>();
        etiquetaErrorNombreProf = new javax.swing.JLabel();
        etiquetaErrorApellidoProf = new javax.swing.JLabel();
        etiquetaErrorNombreUsuarioProf = new javax.swing.JLabel();
        etiquetaErrorNombreTituloProf = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        fechaGraduacion = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaGraduacion = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        etiquetaFotoPerfilProf = new javax.swing.JLabel();
        btnAceptarProf1 = new javax.swing.JButton();
        btnCambiarFoto = new javax.swing.JButton();
        cajaPassword = new javax.swing.JTextField();
        etiquetaApellidos = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelRegProf.setBackground(new java.awt.Color(255, 255, 255));
        panelRegProf.setPreferredSize(new java.awt.Dimension(650, 540));
        panelRegProf.setLayout(null);

        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(153, 153, 255));
        etiquetaTituloProf.setText("Editar perfil del profesional");
        panelRegProf.add(etiquetaTituloProf);
        etiquetaTituloProf.setBounds(100, 10, 450, 50);

        etiquetaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombreProf.setText("Nombre:");
        panelRegProf.add(etiquetaNombreProf);
        etiquetaNombreProf.setBounds(270, 120, 70, 15);

        etiquetaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidosProf.setText("Apellidos:");
        panelRegProf.add(etiquetaApellidosProf);
        etiquetaApellidosProf.setBounds(270, 160, 60, 20);

        etiquetaFechaNacProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFechaNacProf.setText("Fecha de nacimiento:");
        panelRegProf.add(etiquetaFechaNacProf);
        etiquetaFechaNacProf.setBounds(220, 210, 130, 20);

        etiquetaNombTituloProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombTituloProf.setText("Nombre de titulo profesional:");
        panelRegProf.add(etiquetaNombTituloProf);
        etiquetaNombTituloProf.setBounds(180, 290, 160, 20);

        etiquetaFechaGradProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFechaGradProf.setText("Fecha de graduación:");
        panelRegProf.add(etiquetaFechaGradProf);
        etiquetaFechaGradProf.setBounds(220, 340, 120, 26);

        cajaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombreProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreProf);
        cajaNombreProf.setBounds(350, 110, 150, 30);

        cajaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaApellidosProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosProfFocusLost(evt);
            }
        });
        cajaApellidosProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosProfActionPerformed(evt);
            }
        });
        panelRegProf.add(cajaApellidosProf);
        cajaApellidosProf.setBounds(350, 160, 150, 30);

        cajaNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreTituloProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreTituloProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreTituloProf);
        cajaNombreTituloProf.setBounds(350, 290, 150, 30);

        btnAceptarProf.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarProf.setText("Aceptar");
        btnAceptarProf.setContentAreaFilled(false);
        btnAceptarProf.setOpaque(true);
        btnAceptarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProfActionPerformed(evt);
            }
        });
        panelRegProf.add(btnAceptarProf);
        btnAceptarProf.setBounds(880, 610, 160, 40);

        etiquetaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPaisDeGraduacion.setText("País de graduación:");
        panelRegProf.add(etiquetaPaisDeGraduacion);
        etiquetaPaisDeGraduacion.setBounds(230, 390, 110, 26);

        listaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaPaisDeGraduacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegProf.add(listaPaisDeGraduacion);
        listaPaisDeGraduacion.setBounds(350, 390, 160, 30);

        etiquetaErrorNombreProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreProf);
        etiquetaErrorNombreProf.setBounds(520, 110, 60, 26);

        etiquetaErrorApellidoProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorApellidoProf);
        etiquetaErrorApellidoProf.setBounds(520, 160, 80, 26);

        etiquetaErrorNombreUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreUsuarioProf);
        etiquetaErrorNombreUsuarioProf.setBounds(520, 210, 120, 26);

        etiquetaErrorNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreTituloProf);
        etiquetaErrorNombreTituloProf.setBounds(520, 340, 90, 26);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(750, 540, 380, 40);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelRegProf.add(fechaNacimiento);
        fechaNacimiento.setBounds(350, 210, 150, 20);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(520, 290, 140, 26);

        fechaGraduacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaGraduacionFocusLost(evt);
            }
        });
        panelRegProf.add(fechaGraduacion);
        fechaGraduacion.setBounds(350, 340, 150, 20);

        etiquetaErrorFechaGraduacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaGraduacion);
        etiquetaErrorFechaGraduacion.setBounds(520, 380, 130, 26);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesional.png"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegProf.add(fotoPerfil);
        fotoPerfil.setBounds(20, 150, 140, 110);

        etiquetaFotoPerfilProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaFotoPerfilProf.setText("Foto de perfil:");
        panelRegProf.add(etiquetaFotoPerfilProf);
        etiquetaFotoPerfilProf.setBounds(50, 110, 100, 30);

        btnAceptarProf1.setBackground(new java.awt.Color(153, 153, 255));
        btnAceptarProf1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptarProf1.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarProf1.setText("Aceptar");
        btnAceptarProf1.setContentAreaFilled(false);
        btnAceptarProf1.setOpaque(true);
        btnAceptarProf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProf1ActionPerformed(evt);
            }
        });
        panelRegProf.add(btnAceptarProf1);
        btnAceptarProf1.setBounds(480, 490, 140, 30);

        btnCambiarFoto.setBackground(new java.awt.Color(102, 153, 255));
        btnCambiarFoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setText("Cambiar Foto");
        btnCambiarFoto.setContentAreaFilled(false);
        btnCambiarFoto.setOpaque(true);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        panelRegProf.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(30, 290, 120, 30);

        cajaPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPasswordFocusLost(evt);
            }
        });
        cajaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPasswordActionPerformed(evt);
            }
        });
        panelRegProf.add(cajaPassword);
        cajaPassword.setBounds(350, 250, 150, 30);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidos.setText("Constraseña");
        panelRegProf.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(220, 250, 80, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreProfFocusLost
        String nombre = cajaNombreProf.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombreProf.setText("El nombre no puede ser vacío");
        }
    }//GEN-LAST:event_cajaNombreProfFocusLost

    private void cajaApellidosProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosProfFocusLost
        String apellido = cajaApellidosProf.getText();
        if (apellido.trim().isEmpty()) {
            etiquetaErrorApellidoProf.setText("El apellido no puede ser vacío");
        }
    }//GEN-LAST:event_cajaApellidosProfFocusLost

    private void cajaNombreTituloProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreTituloProfFocusLost
        String nombreTitulo = cajaNombreTituloProf.getText();
        if (nombreTitulo.trim().isEmpty()) {
            etiquetaErrorNombreTituloProf.setText("El nombre de usuario no puede estar vacío");
        }
    }//GEN-LAST:event_cajaNombreTituloProfFocusLost

    private void btnAceptarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProfActionPerformed
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidosProf.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
        if (nombreValido && apellidoValido
                && fNacimientoValido && nombreTituloValido && fGraduacionValido) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()[listaPaisDeGraduacion.getSelectedIndex()]);
            etiquetaMensajeAlAceptar.setText("Profesional editado correctamente");
        } else {
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional");
        }
    }//GEN-LAST:event_btnAceptarProfActionPerformed

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
        if (fechaNacimiento.getCalendar() == null) {
            etiquetaErrorFechaNacimiento.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void fechaGraduacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaGraduacionFocusLost
        //Metodo para validar que se seleccione la fecha de graduacion 
        if (fechaGraduacion.getCalendar() == null) {
            etiquetaErrorFechaGraduacion.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaGraduacionFocusLost

    private void cajaApellidosProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosProfActionPerformed

    private void btnAceptarProf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProf1ActionPerformed
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidosProf.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
          ValidacionDeDatos manejoDeValidacion = new ValidacionDeDatos();
        boolean passwordCorrecto = manejoDeValidacion.esPasswordCorrecto(cajaPassword.getText());
        if (nombreValido && apellidoValido
            && fNacimientoValido && nombreTituloValido && fGraduacionValido&& passwordCorrecto) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()[listaPaisDeGraduacion.getSelectedIndex()]);
            profesional.setPassword(cajaPassword.getText());
            JOptionPane optionPane = new JOptionPane("Profesional modificado Correctmanete", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Modificacion profesional");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } else {
           JOptionPane optionPane = new JOptionPane("Profesional no pudo ser modificado correctamente", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Modificacion profesional");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnAceptarProf1ActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg","png");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            profesional.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void cajaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPasswordFocusLost

    }//GEN-LAST:event_cajaPasswordFocusLost

    private void cajaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPasswordActionPerformed

    void actualizar() {
        fotoPerfil.setIcon(profesional.getFotoPerfil());
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarProf;
    private javax.swing.JButton btnAceptarProf1;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaApellidosProf;
    private javax.swing.JTextField cajaNombreProf;
    private javax.swing.JTextField cajaNombreTituloProf;
    private javax.swing.JTextField cajaPassword;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaApellidosProf;
    private javax.swing.JLabel etiquetaErrorApellidoProf;
    private javax.swing.JLabel etiquetaErrorFechaGraduacion;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombreProf;
    private javax.swing.JLabel etiquetaErrorNombreTituloProf;
    private javax.swing.JLabel etiquetaErrorNombreUsuarioProf;
    private javax.swing.JLabel etiquetaFechaGradProf;
    private javax.swing.JLabel etiquetaFechaNacProf;
    private javax.swing.JLabel etiquetaFotoPerfilProf;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombTituloProf;
    private javax.swing.JLabel etiquetaNombreProf;
    private javax.swing.JLabel etiquetaPaisDeGraduacion;
    private javax.swing.JLabel etiquetaTituloProf;
    private com.toedter.calendar.JDateChooser fechaGraduacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JComboBox<String> listaPaisDeGraduacion;
    private javax.swing.JPanel panelRegProf;
    // End of variables declaration//GEN-END:variables
}
