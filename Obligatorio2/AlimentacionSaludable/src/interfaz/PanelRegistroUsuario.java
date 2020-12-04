package interfaz;

import dominio.Persona;
import dominio.Profesional;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelRegistroUsuario extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private Usuario usuario;
    private final JFrame ventana;

    //Constructor
    public PanelRegistroUsuario(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuario = new Usuario();
        this.setUsuario(usuario);
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
        fotoPerfil.setSize(110, 110);

    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private Usuario getUsuario() {
        return this.usuario;
    }

    private void manejoDeErrorLogin(boolean nombreValido, boolean apellidoValido,
             boolean nombreUsuarioValido, boolean fNacimientoValido,
            boolean altura, boolean peso, boolean passwordCorrecto) {
        JOptionPane optionPane = new JOptionPane("Usuario no pudo ser registrado correctamente", JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error registro usuario");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

        if (nombreValido == false) {
            etiquetaErrorNombre.setText("El nombre no puede ser vacío");
        }

        if (apellidoValido == false) {
            etiquetaErrorApellido.setText("El apellido no puede ser vacío");
        }
        if (nombreUsuarioValido == false) {
            etiquetaErrorNombreUsuario.setText("Nombre de usuario no válido");
        }
        if (fNacimientoValido == false) {
            etiquetaErrorFechaNacimiento.setText("Fecha de nacimiento no válida");
        }
        if (altura == false) {
            etiquetaErrorAltura.setText("La altura es invalida");
        }
        if (peso == false) {
            etiquetaErrorPeso.setText("El peso es invalido");
        }
        if (passwordCorrecto == false) {
            etiquetaErrorPassword.setText("Contraseña no válida");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelRegUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaNombUsuario = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        etiquetaFotoPerfil = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        cajaPassword = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaAltura = new javax.swing.JLabel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        etiquetaMedidaPeso = new javax.swing.JLabel();
        etiquetaMedidaAltura = new javax.swing.JLabel();
        btnAceptarUsuario = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNacionalidadUsuario = new javax.swing.JLabel();
        listaNacionalidadesUsuario = new javax.swing.JComboBox();
        etiquetaSexo = new javax.swing.JLabel();
        rBtnMasculinoUsuario = new javax.swing.JRadioButton();
        rBtnFemeninoUsuario = new javax.swing.JRadioButton();
        etiquetaRestricciones = new javax.swing.JLabel();
        checkBoxCeliaco = new javax.swing.JCheckBox();
        checkBoxIntoleranteLactosa = new javax.swing.JCheckBox();
        checkBoxDiabetico = new javax.swing.JCheckBox();
        checkBoxHipertension = new javax.swing.JCheckBox();
        etiquetaErrorNombre = new javax.swing.JLabel();
        etiquetaErrorApellido = new javax.swing.JLabel();
        etiquetaErrorNombreUsuario = new javax.swing.JLabel();
        etiquetaErrorAltura = new javax.swing.JLabel();
        etiquetaErrorPeso = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        etiquetaPreferencias = new javax.swing.JLabel();
        rBVegano = new javax.swing.JRadioButton();
        rBVegetariano = new javax.swing.JRadioButton();
        rBMacrobiotico = new javax.swing.JRadioButton();
        rBOrganico = new javax.swing.JRadioButton();
        btnCambiarFoto = new javax.swing.JButton();
        cajaNombUsuario = new javax.swing.JTextField();
        etiquetaNombUsuario1 = new javax.swing.JLabel();
        etiquetaErrorPassword = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelRegUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelRegUsuario.setPreferredSize(new java.awt.Dimension(650, 540));
        panelRegUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelRegUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(150, 70, 70, 15);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");
        panelRegUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(150, 110, 130, 26);

        etiquetaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombUsuario.setText("Contraseña:");
        panelRegUsuario.add(etiquetaNombUsuario);
        etiquetaNombUsuario.setBounds(150, 180, 100, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelRegUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(150, 260, 250, 26);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelRegUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(30, 130, 90, 30);

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
        panelRegUsuario.add(cajaNombre);
        cajaNombre.setBounds(280, 70, 180, 20);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosFocusLost(evt);
            }
        });
        cajaApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(280, 110, 180, 20);

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
        panelRegUsuario.add(cajaPassword);
        cajaPassword.setBounds(280, 180, 180, 20);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPeso.setText("Peso:");
        panelRegUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(150, 340, 80, 26);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelRegUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(150, 300, 90, 26);

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
        panelRegUsuario.add(cajaAltura);
        cajaAltura.setBounds(280, 300, 180, 20);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPesoFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaPeso);
        cajaPeso.setBounds(280, 340, 180, 20);

        etiquetaMedidaPeso.setText("Kg");
        panelRegUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(470, 340, 40, 14);

        etiquetaMedidaAltura.setText("Cm");
        panelRegUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(470, 300, 20, 20);

        btnAceptarUsuario.setBackground(new java.awt.Color(102, 153, 255));
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
        panelRegUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(480, 490, 130, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Registro Usuario");
        panelRegUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(190, 0, 330, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelRegUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(150, 220, 180, 20);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(280, 220, 180, 20);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaSexo.setText("Sexo:");
        panelRegUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(150, 380, 90, 15);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(270, 370, 110, 35);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(370, 370, 110, 35);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelRegUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(200, 430, 150, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(290, 430, 120, 20);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(390, 430, 149, 23);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(390, 450, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(290, 450, 170, 35);

        etiquetaErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorNombre.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorNombre);
        etiquetaErrorNombre.setBounds(470, 70, 190, 20);

        etiquetaErrorApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorApellido.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorApellido);
        etiquetaErrorApellido.setBounds(470, 110, 190, 20);

        etiquetaErrorNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorNombreUsuario.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorNombreUsuario);
        etiquetaErrorNombreUsuario.setBounds(470, 150, 190, 20);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorAltura.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(490, 300, 170, 20);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorPeso.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(490, 340, 170, 20);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(20, 160, 110, 110);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelRegUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(280, 260, 180, 20);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorFechaNacimiento.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(480, 260, 180, 20);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelRegUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(50, 430, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegano);
        rBVegano.setBounds(100, 480, 100, 20);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(100, 460, 100, 20);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(10, 480, 100, 20);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBOrganico);
        rBOrganico.setBounds(10, 460, 80, 20);

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
        panelRegUsuario.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(10, 280, 120, 30);

        cajaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cajaNombUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombUsuarioFocusLost(evt);
            }
        });
        cajaNombUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaNombUsuario);
        cajaNombUsuario.setBounds(280, 150, 180, 20);

        etiquetaNombUsuario1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaNombUsuario1.setText("Nombre de Usuario:");
        panelRegUsuario.add(etiquetaNombUsuario1);
        etiquetaNombUsuario1.setBounds(150, 150, 120, 20);

        etiquetaErrorPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaErrorPassword.setPreferredSize(new java.awt.Dimension(100, 20));
        panelRegUsuario.add(etiquetaErrorPassword);
        etiquetaErrorPassword.setBounds(470, 180, 190, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreFocusLost


    }//GEN-LAST:event_cajaNombreFocusLost

    private void cajaApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosFocusLost

    }//GEN-LAST:event_cajaApellidosFocusLost

    private void cajaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPasswordFocusLost

    }//GEN-LAST:event_cajaPasswordFocusLost

    private void cajaAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaAlturaFocusLost

    }//GEN-LAST:event_cajaAlturaFocusLost

    private void cajaPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPesoFocusLost

    }//GEN-LAST:event_cajaPesoFocusLost


    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        Usuario usuarioNuevo = new Usuario();
        Profesional comparoProf = new Profesional();
        comparoProf.setNombreUsuario(cajaNombUsuario.getText());
        Usuario comparoUsr = new Usuario();
        comparoUsr.setNombreUsuario(cajaNombUsuario.getText());
        ValidacionDeDatos manejoDeValidacion = new ValidacionDeDatos();
        boolean passwordCorrecto = manejoDeValidacion.esPasswordCorrecto(cajaPassword.getText());
        boolean nombreValido = !cajaNombre.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean nombreUsuarioValido = !cajaNombUsuario.getText().trim().isEmpty()
                && !sistema.getListaUsuarios().contains(comparoUsr)
                && !sistema.getListaProfesionales().contains(comparoProf);
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean altura = pidoDatoNumerico(cajaAltura.getText(), 0, 265, etiquetaErrorAltura);
        boolean peso = pidoDatoNumerico(cajaPeso.getText(), 0, 600, etiquetaErrorPeso);
        boolean sexoPred = sexoPredeterminado();
        if (nombreValido && apellidoValido && nombreUsuarioValido
                && altura && peso && fNacimientoValido && passwordCorrecto) {
            usuarioNuevo.setNombre(cajaNombre.getText());
            usuarioNuevo.setApellidos(cajaApellidos.getText());
            usuarioNuevo.setNombreUsuario(cajaNombUsuario.getText());
            usuarioNuevo.setPassword(cajaPassword.getText());
            usuarioNuevo.setNacionalidad(usuario.getListaEnumNac()[listaNacionalidadesUsuario.getSelectedIndex()]);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.
                    getCalendar().getTime());
            usuarioNuevo.setFechaNacimiento(fNacimiento);
            if (sexoPred == true) {
                usuarioNuevo.setSexo("Masculino");
            } else {
                usuarioNuevo.setSexo("Femenino");
            }
            usuarioNuevo.setAlturaCm(Integer.parseInt(cajaAltura.getText()));
            usuarioNuevo.setPesoKg(Integer.parseInt(cajaPeso.getText()));
            usuarioNuevo.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            sistema.getListaUsuarios().add(usuarioNuevo);
            this.setUsuario(usuarioNuevo);
            JOptionPane optionPane = new JOptionPane("Usuario registrado correctamente", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Registro usuario");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            limpiarDatos();

        } else {
            this.manejoDeErrorLogin(nombreValido, apellidoValido, nombreUsuarioValido,
                    fNacimientoValido, altura, peso, passwordCorrecto);

        }

    }//GEN-LAST:event_btnAceptarUsuarioActionPerformed

    private void rBtnMasculinoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoUsuarioActionPerformed
        this.getUsuario().setSexo("Masculino");
    }//GEN-LAST:event_rBtnMasculinoUsuarioActionPerformed

    private void rBtnFemeninoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemeninoUsuarioActionPerformed
        this.getUsuario().setSexo("Femenino");
    }//GEN-LAST:event_rBtnFemeninoUsuarioActionPerformed

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
        if (fechaNacimiento.getCalendar() == null) {
            etiquetaErrorFechaNacimiento.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void checkBoxIntoleranteLactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxIntoleranteLactosaActionPerformed
        int posicionEnum = Usuario.Restricciones.IntoleranteALaLactosa.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxIntoleranteLactosaActionPerformed

    private void checkBoxHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHipertensionActionPerformed
        int posicionEnum = Usuario.Restricciones.Hipertension.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxHipertensionActionPerformed

    private void rBMacrobioticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBMacrobioticoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Macrobiotico);
    }//GEN-LAST:event_rBMacrobioticoActionPerformed

    private void listaNacionalidadesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaNacionalidadesUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaNacionalidadesUsuarioActionPerformed

    private void rBVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVeganoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Vegano);
    }//GEN-LAST:event_rBVeganoActionPerformed

    private void rBVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVegetarianoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Vegetariano);
    }//GEN-LAST:event_rBVegetarianoActionPerformed

    private void rBOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBOrganicoActionPerformed
        this.getUsuario().setPreferenciasAlimentarias(Usuario.Preferencias.Organico);
    }//GEN-LAST:event_rBOrganicoActionPerformed

    private void checkBoxCeliacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCeliacoActionPerformed
        int posicionEnum = Usuario.Restricciones.Celiaco.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxCeliacoActionPerformed

    private void checkBoxDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiabeticoActionPerformed
        int posicionEnum = Usuario.Restricciones.Diabetico.ordinal();
        boolean valorEnPos = this.getUsuario().getListaRestricciones()[posicionEnum];
        this.getUsuario().getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxDiabeticoActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPasswordActionPerformed

    private void cajaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAlturaActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            this.getUsuario().setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void cajaNombUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombUsuarioFocusLost

    private void cajaNombUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombUsuarioActionPerformed

    private void cajaApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosActionPerformed

    void actualizar() {
        fotoPerfil.setIcon(this.getUsuario().getFotoPerfil());
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();

        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarUsuario;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaNombUsuario;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPassword;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JCheckBox checkBoxCeliaco;
    private javax.swing.JCheckBox checkBoxDiabetico;
    private javax.swing.JCheckBox checkBoxHipertension;
    private javax.swing.JCheckBox checkBoxIntoleranteLactosa;
    private javax.swing.JLabel etiquetaAltura;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaErrorAltura;
    private javax.swing.JLabel etiquetaErrorApellido;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombre;
    private javax.swing.JLabel etiquetaErrorNombreUsuario;
    private javax.swing.JLabel etiquetaErrorPassword;
    private javax.swing.JLabel etiquetaErrorPeso;
    private javax.swing.JLabel etiquetaFDNaciomiento;
    private javax.swing.JLabel etiquetaFotoPerfil;
    private javax.swing.JLabel etiquetaMedidaAltura;
    private javax.swing.JLabel etiquetaMedidaPeso;
    private javax.swing.JLabel etiquetaNacionalidadUsuario;
    private javax.swing.JLabel etiquetaNombUsuario;
    private javax.swing.JLabel etiquetaNombUsuario1;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPreferencias;
    private javax.swing.JLabel etiquetaRestricciones;
    private javax.swing.JLabel etiquetaSexo;
    private javax.swing.JLabel etiquetaTitulo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.ButtonGroup grupoBotonesPreferencias;
    private javax.swing.ButtonGroup grupoBotonesSexo;
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelRegUsuario;
    private javax.swing.JRadioButton rBMacrobiotico;
    private javax.swing.JRadioButton rBOrganico;
    private javax.swing.JRadioButton rBVegano;
    private javax.swing.JRadioButton rBVegetariano;
    private javax.swing.JRadioButton rBtnFemeninoUsuario;
    private javax.swing.JRadioButton rBtnMasculinoUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean pidoDatoNumerico(String dato, int min, int max, JLabel etiqueta) {
        int datoAVerificar = 0;
        boolean pidiendo = false;
        try {
            datoAVerificar = Integer.parseInt(dato);
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                pidiendo = true;
            } else {
                etiqueta.setText("El dato debe estar entre:"
                        + min + "y" + max);
            }
        } catch (NumberFormatException ex) {
            etiqueta.setText("Debe ingresar un valor numérico");
        }
        return pidiendo;
    }

    private void limpiarDatos() {
        this.cajaNombre.setText("");
        this.cajaApellidos.setText("");
        this.cajaAltura.setText("");
        this.cajaNombUsuario.setText("");
        this.cajaPassword.setText("");
        this.cajaPeso.setText("");
        this.etiquetaErrorFechaNacimiento.setText("");
        this.etiquetaErrorPeso.setText("");
        this.etiquetaErrorPeso.setText("");
        this.etiquetaErrorPassword.setText("");
        this.fechaNacimiento.setDate(null);
        this.etiquetaErrorNombre.setText("");
        this.etiquetaNombUsuario1.setText("");
        this.etiquetaErrorApellido.setText("");
        this.etiquetaErrorAltura.setText("");
    }

    private boolean sexoPredeterminado() {
        boolean predeterminado = true;
        if (rBtnMasculinoUsuario.isSelected() == false) {
            predeterminado = false;
        }
        return predeterminado;
    }
}
