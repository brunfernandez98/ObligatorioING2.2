package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelPerfilProfesionalDesdeProfesional extends javax.swing.JPanel {

    //Atributos
    private final Profesional profesional;
    private final Sistema sistema;
   
    private final PanelHomeDeProfesional ventana;

    //Cosntructor
    public PanelPerfilProfesionalDesdeProfesional(Sistema unSistema,
            PanelHomeDeProfesional unaVentana, Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        profesional = unProfesional;
        ventana = unaVentana;
     
        jListDatosDelProfesional.setListData(cargoDatosDelProfesional(profesional).toArray());
        actualizarFoto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDatosDelProfesional = new javax.swing.JList();
        fotoPerfil = new javax.swing.JLabel();

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

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesional.png"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        add(fotoPerfil);
        fotoPerfil.setBounds(20, 110, 210, 220);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarFoto() {
        fotoPerfil.setIcon(this.getUsuario().getFotoPerfil());
    }

    private Profesional getUsuario() {
        return this.profesional;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
