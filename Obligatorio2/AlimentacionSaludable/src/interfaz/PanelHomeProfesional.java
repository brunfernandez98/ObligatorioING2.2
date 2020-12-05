package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelHomeProfesional extends javax.swing.JPanel {

    //Atributos
    private Profesional profesional;
    private Sistema sistema;
   private panelProfesionalRegistrado panelUsuarioRegistrados;
   
    private PanelHomeDeAdministrador ventana;

    //Cosntructor
    public PanelHomeProfesional(Sistema unSistema,
            PanelHomeDeAdministrador unaVentana, Profesional unProfesional, panelProfesionalRegistrado unPanelUsuariosRegistrados) {
        initComponents();
        sistema = unSistema;
        profesional=unProfesional;
        ventana = unaVentana;
        panelUsuarioRegistrados=unPanelUsuariosRegistrados;
        jListDatosDelProfesional.setListData(cargoDatosDelProfesional(profesional).toArray());
        etiquetaFoto.setIcon(profesional.getFotoPerfil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDatosDelProfesional = new javax.swing.JList();
        etiquetaFoto = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setRequestFocusEnabled(false);
        setLayout(null);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTitulo.setText("Datos del Profesional");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(180, 10, 360, 40);

        jListDatosDelProfesional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListDatosDelProfesional.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListDatosDelProfesional);

        add(jScrollPane2);
        jScrollPane2.setBounds(260, 100, 350, 260);

        etiquetaFoto.setMaximumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setMinimumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setPreferredSize(new java.awt.Dimension(210, 240));
        add(etiquetaFoto);
        etiquetaFoto.setBounds(20, 110, 210, 290);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        add(fotoPerfil);
        fotoPerfil.setBounds(20, 120, 210, 220);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setToolTipText("");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 10, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.setPanelActual(panelUsuarioRegistrados);
        ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        ventana.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btnVolverActionPerformed

private void actualizarFoto() {
        fotoPerfil.setIcon(this.getUsuario().getFotoPerfil());
    }

private Profesional getUsuario(){
    return this.profesional;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JList jListDatosDelProfesional;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> cargoDatosDelProfesional(Profesional prof) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Nombre: " + prof.getNombre());
        datos.add("Apellidos: " + prof.getApellidos());
        datos.add("Nombre de usuario: " + prof.getNombreUsuario());
        datos.add("Fecha de nacimiento: " + prof.getFechaNacimiento());
        datos.add("Nombre del título profesional: " + prof.getNombreTituloProf());
        datos.add("Fecha graduación: " + prof.getFechaGraduacion());
        datos.add("País de graduación: " + prof.getPaisObtuvoTitulo());
        return datos;
    }

}
