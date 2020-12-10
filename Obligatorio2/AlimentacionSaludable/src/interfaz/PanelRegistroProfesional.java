package interfaz;

import dominio.Persona;
import dominio.Sistema;
import dominio.Profesional;
import dominio.Usuario;
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

public class PanelRegistroProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Profesional prof;
    private JFrame ventana;
    
    //Constructor
    public PanelRegistroProfesional(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        prof = new Profesional();
        Profesional.Pais[] listaPaises = prof.inicializoListaEnumPaises();
        listaPaisDeGraduacion.setModel(new DefaultComboBoxModel(listaPaises));
        listaPaisDeGraduacion.setSelectedIndex(Profesional.Pais.Uruguay.ordinal());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegProf = new javax.swing.JPanel();
        etiquetaNombreProf = new javax.swing.JLabel();
        etiquetaApellidosProf = new javax.swing.JLabel();
        etiquetaUsuarioProf = new javax.swing.JLabel();
        etiquetaFechaNacProf = new javax.swing.JLabel();
        etiquetaNombTituloProf = new javax.swing.JLabel();
        etiquetaFechaGradProf = new javax.swing.JLabel();
        etiquetaFotoPerfilProf = new javax.swing.JLabel();
        cajaNombreProf = new javax.swing.JTextField();
        cajaApellidosProf = new javax.swing.JTextField();
        cajaPassword = new javax.swing.JTextField();
        cajaNombreTituloProf = new javax.swing.JTextField();
        etiquetaPaisDeGraduacion = new javax.swing.JLabel();
        listaPaisDeGraduacion = new javax.swing.JComboBox<>();
        etiquetaErrorApellidoProf = new javax.swing.JLabel();
        etiquetaErrorNombreUsuarioProf = new javax.swing.JLabel();
        etiquetaErrorNombreTituloProf = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        fechaGraduacion = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaGraduacion = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        btnAceptarProf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cajaUsuarioProf = new javax.swing.JTextField();
        etiquetaErrorNombreProf = new javax.swing.JLabel();
        etiquetaErrorPassword = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        panelRegProf.setBackground(new java.awt.Color(255, 255, 255));
        panelRegProf.setPreferredSize(new java.awt.Dimension(650, 540));
        panelRegProf.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                panelRegProfComponentHidden(evt);
            }
        });
        panelRegProf.setLayout(null);

        etiquetaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombreProf.setText("Nombre:");
        panelRegProf.add(etiquetaNombreProf);
        etiquetaNombreProf.setBounds(240, 140, 60, 29);

        etiquetaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidosProf.setText("Apellidos:");
        panelRegProf.add(etiquetaApellidosProf);
        etiquetaApellidosProf.setBounds(240, 190, 60, 20);

        etiquetaUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaUsuarioProf.setText("Nombre de Usuario:");
        panelRegProf.add(etiquetaUsuarioProf);
        etiquetaUsuarioProf.setBounds(180, 220, 120, 26);

        etiquetaFechaNacProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFechaNacProf.setText("Fecha de nacimiento:");
        panelRegProf.add(etiquetaFechaNacProf);
        etiquetaFechaNacProf.setBounds(170, 310, 120, 26);

        etiquetaNombTituloProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombTituloProf.setText("Nombre de título profesional:");
        panelRegProf.add(etiquetaNombTituloProf);
        etiquetaNombTituloProf.setBounds(140, 360, 180, 20);

        etiquetaFechaGradProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFechaGradProf.setText("Fecha de graduación:");
        panelRegProf.add(etiquetaFechaGradProf);
        etiquetaFechaGradProf.setBounds(170, 390, 120, 26);

        etiquetaFotoPerfilProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaFotoPerfilProf.setText("Foto de perfil:");
        panelRegProf.add(etiquetaFotoPerfilProf);
        etiquetaFotoPerfilProf.setBounds(50, 130, 100, 30);

        cajaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombreProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreProf);
        cajaNombreProf.setBounds(300, 140, 160, 30);

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
        cajaApellidosProf.setBounds(300, 180, 160, 30);

        cajaPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPasswordFocusLost(evt);
            }
        });
        panelRegProf.add(cajaPassword);
        cajaPassword.setBounds(300, 260, 160, 30);

        cajaNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombreTituloProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreTituloProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreTituloProf);
        cajaNombreTituloProf.setBounds(300, 350, 160, 30);

        etiquetaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPaisDeGraduacion.setText("País de graduación:");
        panelRegProf.add(etiquetaPaisDeGraduacion);
        etiquetaPaisDeGraduacion.setBounds(180, 430, 120, 26);

        listaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaPaisDeGraduacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegProf.add(listaPaisDeGraduacion);
        listaPaisDeGraduacion.setBounds(300, 430, 160, 30);

        etiquetaErrorApellidoProf.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorApellidoProf);
        etiquetaErrorApellidoProf.setBounds(470, 190, 160, 20);

        etiquetaErrorNombreUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreUsuarioProf);
        etiquetaErrorNombreUsuarioProf.setBounds(470, 230, 160, 20);

        etiquetaErrorNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreTituloProf);
        etiquetaErrorNombreTituloProf.setBounds(470, 350, 160, 20);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelRegProf.add(fechaNacimiento);
        fechaNacimiento.setBounds(300, 310, 160, 20);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(470, 310, 160, 20);

        fechaGraduacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaGraduacionFocusLost(evt);
            }
        });
        panelRegProf.add(fechaGraduacion);
        fechaGraduacion.setBounds(300, 390, 160, 20);

        etiquetaErrorFechaGraduacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaGraduacion);
        etiquetaErrorFechaGraduacion.setBounds(470, 390, 160, 20);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesional.png"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegProf.add(fotoPerfil);
        fotoPerfil.setBounds(10, 170, 140, 100);

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
        btnCambiarFoto.setBounds(20, 280, 120, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Registro Profesional");
        panelRegProf.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(150, 10, 330, 40);

        btnAceptarProf.setBackground(new java.awt.Color(102, 153, 255));
        btnAceptarProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        btnAceptarProf.setBounds(410, 490, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Contraseña:");
        panelRegProf.add(jLabel1);
        jLabel1.setBounds(220, 260, 70, 30);

        cajaUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaUsuarioProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaUsuarioProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaUsuarioProf);
        cajaUsuarioProf.setBounds(300, 220, 160, 30);

        etiquetaErrorNombreProf.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreProf);
        etiquetaErrorNombreProf.setBounds(470, 140, 160, 20);

        etiquetaErrorPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelRegProf.add(etiquetaErrorPassword);
        etiquetaErrorPassword.setBounds(470, 270, 160, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreProfFocusLost
       
    }//GEN-LAST:event_cajaNombreProfFocusLost

    private void cajaApellidosProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosProfFocusLost
        
 
    }//GEN-LAST:event_cajaApellidosProfFocusLost

    private void cajaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPasswordFocusLost
       
    }//GEN-LAST:event_cajaPasswordFocusLost

    private void cajaNombreTituloProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreTituloProfFocusLost
       
    }//GEN-LAST:event_cajaNombreTituloProfFocusLost

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
    
    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void fechaGraduacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaGraduacionFocusLost
        //Metodo para validar que se seleccione la fecha de graduacion 
    
    }//GEN-LAST:event_fechaGraduacionFocusLost

    private void cajaApellidosProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosProfActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
         FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg","png");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            prof.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed
  
    private void manejoDeErrorLogin(boolean nombreValido,boolean apellidoValido
            ,boolean nombreUsuarioValido,boolean fNacimientoValido,
            boolean fechaGraduacion,boolean tituloGraduacion,boolean passwordCorrecto){
         JOptionPane optionPane = new JOptionPane("Usuario no pudo ser registrado correctamente", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error registro usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

            if (nombreValido == false) {
                this.etiquetaErrorNombreProf.setText("El nombre no puede ser vacío");
            }

            if (apellidoValido == false) {
                etiquetaErrorApellidoProf.setText("El apellido no puede ser vacío");
            }
            if (nombreUsuarioValido == false) {
                etiquetaErrorNombreUsuarioProf.setText("Nombre de usuario no válido");
            }
            if (fNacimientoValido == false) {
                etiquetaErrorFechaNacimiento.setText("Fecha de nacimiento no válida");
            }
            if (fechaGraduacion == false) {
                 etiquetaErrorFechaGraduacion.setText("Fecha de graduacion no válida");
            }
           
            if (passwordCorrecto == false) {
                etiquetaErrorPassword.setText("Contraseña no válida");
            }
             if (tituloGraduacion == false) {
               etiquetaErrorNombreTituloProf.setText("Nombre de titulo no válida");
            }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnAceptarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProfActionPerformed
         Profesional profesional = new Profesional();
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
         boolean apellidoValido = !cajaApellidosProf.getText().trim().isEmpty();
         ValidacionDeDatos manejoDeValidacion = new ValidacionDeDatos();
          boolean passwordCorrecto = manejoDeValidacion.esPasswordCorrecto(cajaPassword.getText());
        Usuario comparoUsr = new Usuario();
        comparoUsr.setNombreUsuario(cajaUsuarioProf.getText());
        Profesional comparoProf = new Profesional();
        comparoProf.setNombreUsuario(cajaUsuarioProf.getText());
        boolean nombreUsuarioValido = !cajaUsuarioProf.getText().trim().isEmpty()
                && !sistema.getListaUsuarios().contains(comparoUsr)
                && !sistema.getListaProfesionales().contains(comparoProf ) ;
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
        if (nombreValido && nombreUsuarioValido
                && fNacimientoValido && nombreTituloValido && fGraduacionValido && apellidoValido && passwordCorrecto) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            profesional.setNombreUsuario(cajaUsuarioProf.getText());
            profesional.setPassword(cajaPassword.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar
        ().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()
                    [listaPaisDeGraduacion.getSelectedIndex()]);
            profesional.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            sistema.getListaProfesionales().add(profesional);
            JOptionPane optionPane = new JOptionPane("Profesional registrado "
                    + "correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Registro Profesional");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            limpiarDatos();
        } else {
            
            this.manejoDeErrorLogin(nombreValido, apellidoValido, 
                    nombreUsuarioValido, fNacimientoValido, fGraduacionValido,
                    nombreTituloValido, passwordCorrecto);
            
}
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnAceptarProfActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    private void cajaUsuarioProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaUsuarioProfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuarioProfFocusLost

    private void panelRegProfComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelRegProfComponentHidden
        

    }//GEN-LAST:event_panelRegProfComponentHidden

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
       limpiarDatos();
    }//GEN-LAST:event_formComponentHidden
    
    private void limpiarDatos() {
        this.cajaNombreProf.setText("");
        this.cajaApellidosProf.setText("");
        this.cajaUsuarioProf.setText("");
        this.cajaNombreTituloProf.setText("");
        this.cajaPassword.setText("");
        
        this.etiquetaErrorFechaNacimiento.setText("");
        this.etiquetaErrorApellidoProf.setText("");
        this.etiquetaErrorNombreProf.setText("");
        this.etiquetaErrorNombreUsuarioProf.setText("");
        this.etiquetaErrorNombreTituloProf.setText("");
        this.etiquetaErrorFechaGraduacion.setText("");
        this.etiquetaErrorPassword.setText("");
        this.fechaNacimiento.setDate(null);
this.fechaGraduacion.setDate(null);
    }
    
    
    
    
    void actualizar() {
        fotoPerfil.setIcon(prof.getFotoPerfil());
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
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaApellidosProf;
    private javax.swing.JTextField cajaNombreProf;
    private javax.swing.JTextField cajaNombreTituloProf;
    private javax.swing.JTextField cajaPassword;
    private javax.swing.JTextField cajaUsuarioProf;
    private javax.swing.JLabel etiquetaApellidosProf;
    private javax.swing.JLabel etiquetaErrorApellidoProf;
    private javax.swing.JLabel etiquetaErrorFechaGraduacion;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombreProf;
    private javax.swing.JLabel etiquetaErrorNombreTituloProf;
    private javax.swing.JLabel etiquetaErrorNombreUsuarioProf;
    private javax.swing.JLabel etiquetaErrorPassword;
    private javax.swing.JLabel etiquetaFechaGradProf;
    private javax.swing.JLabel etiquetaFechaNacProf;
    private javax.swing.JLabel etiquetaFotoPerfilProf;
    private javax.swing.JLabel etiquetaNombTituloProf;
    private javax.swing.JLabel etiquetaNombreProf;
    private javax.swing.JLabel etiquetaPaisDeGraduacion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaUsuarioProf;
    private com.toedter.calendar.JDateChooser fechaGraduacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listaPaisDeGraduacion;
    private javax.swing.JPanel panelRegProf;
    // End of variables declaration//GEN-END:variables
}
