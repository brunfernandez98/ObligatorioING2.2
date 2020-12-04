package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import javax.swing.JFrame;

public class PanelVerHistorialUsuario extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private final JFrame ventana;
  
    private final ComidaPorDia comidaActiva;

    //Constructor
    public PanelVerHistorialUsuario(Sistema unSistema,
            JFrame unaVentana,
            ComidaPorDia unaComidaPorDia) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        
        comidaActiva = unaComidaPorDia;
        fecha.setText(comidaActiva.getFecha());
        listaHistorialDeComidas.setListData(comidaActiva.getComidasIngeridas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        etiquetaFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 540));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 140, 280, 400);

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFecha.setText("Fecha de Ingesta:");
        add(etiquetaFecha);
        etiquetaFecha.setBounds(80, 80, 200, 40);

        fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fecha.setText("-");
        add(fecha);
        fecha.setBounds(280, 90, 180, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("Historial de Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(130, 20, 330, 44);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
