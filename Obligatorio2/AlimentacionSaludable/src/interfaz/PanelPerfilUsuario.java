package interfaz;

import dominio.Sistema;
 import dominio.Usuario;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPerfilUsuario extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private Usuario usuarioActual;
    private PanelHomeDeAdministrador ventana;
   private PanelUsuariosRegistrados panelUsuarioRegistrados;

    //Constructor
    public PanelPerfilUsuario(Sistema unSistema, PanelHomeDeAdministrador unaVentana, Usuario usuario, PanelUsuariosRegistrados unPanelUsuariosRegistrados) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        this.usuarioActual=usuario;
        this.usuarioActual.getFotoPerfil();
        datosDelUsuario.setListData(cargoDatosDelUsuario(this.getUsuario()).toArray());
        panelUsuarioRegistrados=unPanelUsuariosRegistrados;
       actualizarFoto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHome = new javax.swing.JPanel();
        etiquetaFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosDelUsuario = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 540));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setPreferredSize(new java.awt.Dimension(650, 540));
        panelHome.setLayout(null);

        etiquetaFoto.setMaximumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setMinimumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setPreferredSize(new java.awt.Dimension(210, 240));
        panelHome.add(etiquetaFoto);
        etiquetaFoto.setBounds(80, 140, 130, 130);

        datosDelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datosDelUsuario.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(datosDelUsuario);

        panelHome.add(jScrollPane1);
        jScrollPane1.setBounds(260, 130, 370, 230);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Informacion del Usuario");
        panelHome.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(130, 30, 390, 44);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelHome.add(fotoPerfil);
        fotoPerfil.setBounds(30, 130, 210, 220);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setToolTipText("");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelHome.add(btnVolver);
        btnVolver.setBounds(10, 10, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       ventana.setPanelActual(panelUsuarioRegistrados);
       ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
       ventana.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JList datosDelUsuario;
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    public ArrayList<String> cargoDatosDelUsuario(Usuario unUsuario) {
        String restricciones = imprimoRestricciones(unUsuario);
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Nombre: " + unUsuario.getNombre());
        datos.add("Apellidos: " + unUsuario.getApellidos());
        datos.add("Nombre de usuario: " + unUsuario.getNombreUsuario());
        datos.add("Fecha de nacimiento: " + unUsuario.getFechaNacimiento());
        datos.add("Nacionalidad: " + unUsuario.getNacionalidad());
        datos.add("Altura: " + unUsuario.getAlturaCm());
        datos.add("Paso: " + unUsuario.getPesoKg());
        datos.add("Sexo: " + unUsuario.getSexo());
        datos.add("Restricciones: " + restricciones);
        datos.add("Preferencias: " + unUsuario.getPreferenciasAlimentarias());
        return datos;
    }

    public String imprimoRestricciones(Usuario unUsuario) {
        int cantidadDeRestricciones = 0;
        String retorno = "";
        int contador = 0;
        for (int i = 0; i < unUsuario.getListaRestricciones().length; i++) {
            if (unUsuario.getListaRestricciones()[i] == true) {
                cantidadDeRestricciones++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Celiaco.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Celiaco";
            } else {
                retorno += "Celiaco, ";
                contador++;
            }

        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Diabetico.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Diabético";
            } else {
                retorno += "Diabético, ";
                contador++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Hipertension.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Hipertensión";
            } else {
                retorno += "Hipertensión, ";
                contador++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.IntoleranteALaLactosa.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Intolerancia a la lactosa";
            } else {
                retorno += "Intolerancia a la lactosa, ";
                contador++;
            }
        }
        if (cantidadDeRestricciones == 0) {
            retorno += "Ninguna ";
        }
        return retorno;
    }
private void actualizarFoto() {
        fotoPerfil.setIcon(this.getUsuario().getFotoPerfil());
    }
private Usuario getUsuario(){
    return this.usuarioActual;
}

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();

        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }
}
