package interfaz;

import dominio.Sistema;
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

public class PanelEditarPerfilUsuario extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private Usuario usuario;
    private JFrame ventana;

    //Constructor
    public PanelEditarPerfilUsuario(Sistema unSistema, JFrame unaVentana,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;

        usuario = unUsuario;
        grupoBotonesSexo.add(rBtnFemeninoUsuario);
        grupoBotonesSexo.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setSelected(true);
        grupoBotonesPreferencias.add(rBVegano);
        grupoBotonesPreferencias.add(rBVegetariano);
        grupoBotonesPreferencias.add(rBMacrobiotico);
        grupoBotonesPreferencias.add(rBOrganico);
        Usuario.Nacionalidades[] listaNac = usuario.getListaEnumNac();
        listaNacionalidadesUsuario.setModel(new DefaultComboBoxModel(listaNac));
        listaNacionalidadesUsuario.setSelectedIndex(Usuario.Nacionalidades.Uruguaya.ordinal());
        usuario.setListaRestricciones(new boolean[usuario.getListaRestricciones().length]);
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Ninguna);
        fotoPerfil.setSize(110, 110);

    }

    public PanelEditarPerfilUsuario(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;

        grupoBotonesSexo.add(rBtnFemeninoUsuario);
        grupoBotonesSexo.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setSelected(true);
        grupoBotonesPreferencias.add(rBVegano);
        grupoBotonesPreferencias.add(rBVegetariano);
        grupoBotonesPreferencias.add(rBMacrobiotico);
        grupoBotonesPreferencias.add(rBOrganico);
        Usuario.Nacionalidades[] listaNac = usuario.getListaEnumNac();
        listaNacionalidadesUsuario.setModel(new DefaultComboBoxModel(listaNac));
        listaNacionalidadesUsuario.setSelectedIndex(Usuario.Nacionalidades.Uruguaya.ordinal());
        usuario.setListaRestricciones(new boolean[usuario.getListaRestricciones().length]);
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Ninguna);
        fotoPerfil.setSize(110, 110);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelEditarPerfilUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaAltura = new javax.swing.JLabel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        etiquetaMedidaPeso = new javax.swing.JLabel();
        etiquetaMedidaAltura = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNacionalidadUsuario = new javax.swing.JLabel();
        listaNacionalidadesUsuario = new javax.swing.JComboBox();
        etiquetaErrorAltura = new javax.swing.JLabel();
        etiquetaErrorPeso = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        fotoPerfil = new javax.swing.JLabel();
        btnCambiarFoto1 = new javax.swing.JButton();
        etiquetaRestricciones = new javax.swing.JLabel();
        checkBoxCeliaco = new javax.swing.JCheckBox();
        checkBoxIntoleranteLactosa = new javax.swing.JCheckBox();
        checkBoxDiabetico = new javax.swing.JCheckBox();
        checkBoxHipertension = new javax.swing.JCheckBox();
        etiquetaPreferencias = new javax.swing.JLabel();
        rBVegano = new javax.swing.JRadioButton();
        rBVegetariano = new javax.swing.JRadioButton();
        rBMacrobiotico = new javax.swing.JRadioButton();
        rBOrganico = new javax.swing.JRadioButton();
        rBtnMasculinoUsuario = new javax.swing.JRadioButton();
        rBtnFemeninoUsuario = new javax.swing.JRadioButton();
        etiquetaErrorNombre = new javax.swing.JLabel();
        etiquetaErrorApellido = new javax.swing.JLabel();
        etiquetaErrorPassword = new javax.swing.JLabel();
        cajaPassword = new javax.swing.JTextField();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        etiquetaApellidos1 = new javax.swing.JLabel();
        btnAceptarUsuario = new javax.swing.JButton();
        etiquetaPeso1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelEditarPerfilUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelEditarPerfilUsuario.setPreferredSize(new java.awt.Dimension(650, 540));
        panelEditarPerfilUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelEditarPerfilUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(250, 110, 54, 17);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidos.setText("Constraseña");
        panelEditarPerfilUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(230, 180, 80, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelEditarPerfilUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(180, 260, 140, 26);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreFocusLost(evt);
            }
        });
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaNombre);
        cajaNombre.setBounds(310, 100, 160, 30);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(310, 140, 160, 30);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPeso.setText("Sexo");
        panelEditarPerfilUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(280, 380, 30, 20);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelEditarPerfilUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(270, 300, 40, 26);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaAlturaFocusLost(evt);
            }
        });
        cajaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAlturaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaAltura);
        cajaAltura.setBounds(310, 340, 160, 30);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPesoFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaPeso);
        cajaPeso.setBounds(310, 300, 160, 30);

        etiquetaMedidaPeso.setText("Kg");
        panelEditarPerfilUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(480, 340, 20, 16);

        etiquetaMedidaAltura.setText("Cm");
        panelEditarPerfilUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(480, 300, 30, 16);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 29, 238));
        etiquetaTitulo.setText("Editar perfil del Usuario");
        panelEditarPerfilUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(150, 10, 380, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelEditarPerfilUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(230, 220, 90, 29);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(310, 220, 160, 30);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(510, 300, 170, 20);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(510, 340, 170, 20);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(310, 260, 160, 29);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelEditarPerfilUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(60, 110, 110, 110);

        btnCambiarFoto1.setBackground(new java.awt.Color(102, 29, 238));
        btnCambiarFoto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCambiarFoto1.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto1.setText("Cambiar Foto");
        btnCambiarFoto1.setContentAreaFilled(false);
        btnCambiarFoto1.setOpaque(true);
        btnCambiarFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFoto1ActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(btnCambiarFoto1);
        btnCambiarFoto1.setBounds(50, 230, 120, 30);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelEditarPerfilUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(300, 430, 80, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(250, 460, 120, 20);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(370, 480, 160, 30);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(370, 450, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(250, 480, 170, 35);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelEditarPerfilUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(50, 430, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegano);
        rBVegano.setBounds(120, 480, 100, 20);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(120, 460, 100, 20);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(10, 480, 100, 20);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBOrganico);
        rBOrganico.setBounds(10, 460, 80, 20);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(310, 380, 110, 20);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(430, 380, 110, 20);

        etiquetaErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorNombre.setPreferredSize(new java.awt.Dimension(100, 20));
        panelEditarPerfilUsuario.add(etiquetaErrorNombre);
        etiquetaErrorNombre.setBounds(480, 90, 200, 20);

        etiquetaErrorApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorApellido.setPreferredSize(new java.awt.Dimension(100, 20));
        panelEditarPerfilUsuario.add(etiquetaErrorApellido);
        etiquetaErrorApellido.setBounds(480, 130, 200, 20);

        etiquetaErrorPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorPassword.setPreferredSize(new java.awt.Dimension(100, 20));
        panelEditarPerfilUsuario.add(etiquetaErrorPassword);
        etiquetaErrorPassword.setBounds(480, 170, 200, 20);

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
        panelEditarPerfilUsuario.add(cajaPassword);
        cajaPassword.setBounds(310, 180, 160, 30);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorFechaNacimiento.setPreferredSize(new java.awt.Dimension(100, 20));
        panelEditarPerfilUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(500, 260, 180, 20);

        etiquetaApellidos1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidos1.setText("Apellidos:");
        panelEditarPerfilUsuario.add(etiquetaApellidos1);
        etiquetaApellidos1.setBounds(250, 140, 60, 26);

        btnAceptarUsuario.setBackground(new java.awt.Color(102, 29, 238));
        btnAceptarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarUsuario.setText("Aceptar");
        btnAceptarUsuario.setContentAreaFilled(false);
        btnAceptarUsuario.setOpaque(true);
        btnAceptarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(540, 470, 110, 30);

        etiquetaPeso1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPeso1.setText("Peso:");
        panelEditarPerfilUsuario.add(etiquetaPeso1);
        etiquetaPeso1.setBounds(270, 340, 60, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreFocusLost

    }//GEN-LAST:event_cajaNombreFocusLost

    private void cajaApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosFocusLost

    }//GEN-LAST:event_cajaApellidosFocusLost

    private void cajaAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaAlturaFocusLost

    }//GEN-LAST:event_cajaAlturaFocusLost

    private void cajaPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPesoFocusLost

    }//GEN-LAST:event_cajaPesoFocusLost

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 

    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void listaNacionalidadesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaNacionalidadesUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaNacionalidadesUsuarioActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAlturaActionPerformed

    private void btnCambiarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFoto1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
         FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg","png");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            this.getUsuario().setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFoto1ActionPerformed

    private void checkBoxCeliacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCeliacoActionPerformed
        int posicionEnum = Usuario.Restricciones.Celiaco.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxCeliacoActionPerformed

    private void checkBoxIntoleranteLactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxIntoleranteLactosaActionPerformed
        int posicionEnum = Usuario.Restricciones.IntoleranteALaLactosa.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxIntoleranteLactosaActionPerformed

    private void checkBoxDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiabeticoActionPerformed
        int posicionEnum = Usuario.Restricciones.Diabetico.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxDiabeticoActionPerformed

    private void checkBoxHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHipertensionActionPerformed
        int posicionEnum = Usuario.Restricciones.Hipertension.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxHipertensionActionPerformed

    private void rBVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVeganoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Vegano);
    }//GEN-LAST:event_rBVeganoActionPerformed

    private void rBVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVegetarianoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Vegetariano);
    }//GEN-LAST:event_rBVegetarianoActionPerformed

    private void rBMacrobioticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBMacrobioticoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Macrobiotico);
    }//GEN-LAST:event_rBMacrobioticoActionPerformed

    private void rBOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBOrganicoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Organico);
    }//GEN-LAST:event_rBOrganicoActionPerformed

    private void rBtnMasculinoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoUsuarioActionPerformed
        this.getUsuario().setSexo("Masculino");
    }//GEN-LAST:event_rBtnMasculinoUsuarioActionPerformed

    private void rBtnFemeninoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemeninoUsuarioActionPerformed
        this.getUsuario().setSexo("Femenino");
    }//GEN-LAST:event_rBtnFemeninoUsuarioActionPerformed


    private void cajaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPasswordFocusLost

    }//GEN-LAST:event_cajaPasswordFocusLost

    private void cajaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPasswordActionPerformed

    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        boolean nombreValido = !cajaNombre.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        int numero = Integer.parseInt(cajaAltura.getText());
        String severidad = sistema.pidoDatoNumerico(numero, 0, 265);
        boolean altura = true;
        if (severidad.equals("OK")) {
            altura = true;

        }
        if (severidad.equals("NO OK")) {
            altura = false;
        }
        if (severidad.equals("ERROR")) {
            altura = false;
            JOptionPane optionPane = new JOptionPane("Altura permitida entre 0 y 265 cm", JOptionPane.ERROR);
            JDialog dialog = optionPane.createDialog("Modificacion usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        int pesoNumero = Integer.parseInt(cajaPeso.getText());
        String severidadPeso = sistema.pidoDatoNumerico(pesoNumero, 0, 265);
        boolean peso;
        peso = true;

        if (severidad.equals("OK")) {
            peso = true;

        }
        if (severidad.equals("NO OK")) {
            peso = false;
        }
        if (severidad.equals("ERROR")) {
            peso = false;
            JOptionPane optionPane = new JOptionPane("Peso permitido entre 0 y 265 cm", JOptionPane.ERROR);
            JDialog dialog = optionPane.createDialog("Modificacion usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        ValidacionDeDatos manejoDeValidacion = new ValidacionDeDatos();
        boolean passwordCorrecto = manejoDeValidacion.esPasswordCorrecto(cajaPassword.getText());
        boolean sexoPred = sexoPredeterminado();
        if (nombreValido && apellidoValido
                && altura && peso && fNacimientoValido && passwordCorrecto) {
            usuario.setNombre(cajaNombre.getText());
            usuario.setApellidos(cajaApellidos.getText());
            usuario.setNacionalidad(usuario.getListaEnumNac()[listaNacionalidadesUsuario.getSelectedIndex()]);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            usuario.setFechaNacimiento(fNacimiento);
            if (sexoPred == true) {
                usuario.setSexo("Masculino");
            } else {
                usuario.setSexo("Femenino");
            }
            usuario.setAlturaCm(Integer.parseInt(cajaAltura.getText()));
            usuario.setPesoKg(Integer.parseInt(cajaPeso.getText()));
            usuario.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            usuario.setPassword(cajaPassword.getText());
            JOptionPane optionPane = new JOptionPane("Usuario modificado correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Modificacion usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            limpiarDatos();
        } else {
            JOptionPane optionPane = new JOptionPane("Usuario no pudo ser modificado correctamente", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Modificacion usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            if (nombreValido == false) {
                etiquetaErrorNombre.setText("El nombre no puede ser vacío");
            }
            if (apellidoValido == false) {
                etiquetaErrorApellido.setText("El apellido no puede ser vacío");
            }
            if (fNacimientoValido == false) {
                etiquetaErrorFechaNacimiento.setText("Fecha de nacimiento no válida");
            }
            if (altura == false) {
                etiquetaErrorAltura.setText("La altura no puede estar vacía");
            }
            if (peso == false) {
                etiquetaErrorPeso.setText("El peso no puede estar vacío");
            }
            if (passwordCorrecto == false) {
                etiquetaErrorPassword.setText("Contraseña no válida");
            }
        }
    }//GEN-LAST:event_btnAceptarUsuarioActionPerformed

    void actualizar() {
        fotoPerfil.setIcon(usuario.getFotoPerfil());
    }

    private void limpiarDatos() {
        this.cajaNombre.setText("");
        this.cajaApellidos.setText("");
        this.cajaAltura.setText("");
        this.cajaPassword.setText("");
        this.cajaPeso.setText("");
        this.etiquetaErrorFechaNacimiento.setText("");
        this.etiquetaErrorPeso.setText("");
        this.etiquetaErrorPeso.setText("");
        this.etiquetaErrorPassword.setText("");
        this.fechaNacimiento.setDate(null);
        this.etiquetaErrorNombre.setText("");
        this.etiquetaErrorApellido.setText("");
        this.etiquetaErrorAltura.setText("");
        this.rBtnFemeninoUsuario.setSelected(false);
        this.rBtnMasculinoUsuario.setSelected(false);
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();

        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    private Usuario getUsuario() {
        return usuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarUsuario;
    private javax.swing.JButton btnCambiarFoto1;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPassword;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JCheckBox checkBoxCeliaco;
    private javax.swing.JCheckBox checkBoxDiabetico;
    private javax.swing.JCheckBox checkBoxHipertension;
    private javax.swing.JCheckBox checkBoxIntoleranteLactosa;
    private javax.swing.JLabel etiquetaAltura;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaApellidos1;
    private javax.swing.JLabel etiquetaErrorAltura;
    private javax.swing.JLabel etiquetaErrorApellido;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombre;
    private javax.swing.JLabel etiquetaErrorPassword;
    private javax.swing.JLabel etiquetaErrorPeso;
    private javax.swing.JLabel etiquetaFDNaciomiento;
    private javax.swing.JLabel etiquetaMedidaAltura;
    private javax.swing.JLabel etiquetaMedidaPeso;
    private javax.swing.JLabel etiquetaNacionalidadUsuario;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPeso1;
    private javax.swing.JLabel etiquetaPreferencias;
    private javax.swing.JLabel etiquetaRestricciones;
    private javax.swing.JLabel etiquetaTitulo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.ButtonGroup grupoBotonesPreferencias;
    private javax.swing.ButtonGroup grupoBotonesSexo;
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelEditarPerfilUsuario;
    private javax.swing.JRadioButton rBMacrobiotico;
    private javax.swing.JRadioButton rBOrganico;
    private javax.swing.JRadioButton rBVegano;
    private javax.swing.JRadioButton rBVegetariano;
    private javax.swing.JRadioButton rBtnFemeninoUsuario;
    private javax.swing.JRadioButton rBtnMasculinoUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean sexoPredeterminado() {
        boolean predeterminado = true;
        if (rBtnMasculinoUsuario.isSelected() == false) {
            predeterminado = false;
        }
        return predeterminado;
    }
}
