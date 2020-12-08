package interfaz;

import dominio.Alimento;
import dominio.ComidaPorDia;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Dimension;
import java.time.LocalDate;

import javax.swing.JFrame;

public class PanelDietaDiariaUsuario extends javax.swing.JPanel {

    //Atrubutos
    private final Sistema sistema;
    private final PanelHomeDeUsuario ventana;
    private final Usuario usuarioActual;
    private boolean deboActualizar;

    //Constructor
    public PanelDietaDiariaUsuario(Sistema unSistema,
            PanelHomeDeUsuario unaVentana, Usuario usuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActual = usuario;
        LocalDate diaActual = LocalDate.now();
        usuarioActual.setFechaUltimaAdicion(diaActual.toString());
        if (usuarioActual.getHistorialDelDia().getFecha() == null) {
            usuarioActual.getHistorialDelDia().setFecha(diaActual.toString());
        } else {
            if (!usuarioActual.getHistorialDelDia().getFecha().equals(usuarioActual.getFechaUltimaAdicion()) && !usuarioActual.getHistorialDelDia().getComidasIngeridas().isEmpty()) {
                usuarioActual.getHistorialComidas().add(usuarioActual.getHistorialDelDia());
                ComidaPorDia nuevoHistorial = new ComidaPorDia();
                nuevoHistorial.setFecha(diaActual.toString());
                usuarioActual.setHistorialDelDia(nuevoHistorial);
            }
        }
        listaComidasDiarias.setListData(usuarioActual.getHistorialDelDia().getComidasIngeridas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDietaDiaria = new javax.swing.JPanel();
        lstComDiarias = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTituloAlim = new javax.swing.JLabel();
        etiquetaBtnAgregarComidas = new javax.swing.JButton();
        etiquetaBtnQuitarComida = new javax.swing.JButton();

        panelDietaDiaria.setBackground(new java.awt.Color(255, 255, 255));
        panelDietaDiaria.setPreferredSize(new java.awt.Dimension(650, 540));
        panelDietaDiaria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelDietaDiariaFocusGained(evt);
            }
        });
        panelDietaDiaria.setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lstComDiarias.setViewportView(listaComidasDiarias);

        panelDietaDiaria.add(lstComDiarias);
        lstComDiarias.setBounds(130, 170, 370, 310);

        etiquetaTituloAlim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloAlim.setForeground(new java.awt.Color(102, 153, 255));
        etiquetaTituloAlim.setText("Comidas Ingeridas Diarias");
        panelDietaDiaria.add(etiquetaTituloAlim);
        etiquetaTituloAlim.setBounds(100, 10, 450, 44);

        etiquetaBtnAgregarComidas.setBackground(new java.awt.Color(102, 153, 255));
        etiquetaBtnAgregarComidas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        etiquetaBtnAgregarComidas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBtnAgregarComidas.setText("Agregar Comida");
        etiquetaBtnAgregarComidas.setContentAreaFilled(false);
        etiquetaBtnAgregarComidas.setOpaque(true);
        etiquetaBtnAgregarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiquetaBtnAgregarComidasActionPerformed(evt);
            }
        });
        panelDietaDiaria.add(etiquetaBtnAgregarComidas);
        etiquetaBtnAgregarComidas.setBounds(350, 90, 210, 30);

        etiquetaBtnQuitarComida.setBackground(new java.awt.Color(102, 153, 255));
        etiquetaBtnQuitarComida.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        etiquetaBtnQuitarComida.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBtnQuitarComida.setText("Quitar Comida");
        etiquetaBtnQuitarComida.setContentAreaFilled(false);
        etiquetaBtnQuitarComida.setOpaque(true);
        etiquetaBtnQuitarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiquetaBtnQuitarComidaActionPerformed(evt);
            }
        });
        panelDietaDiaria.add(etiquetaBtnQuitarComida);
        etiquetaBtnQuitarComida.setBounds(40, 90, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etiquetaBtnQuitarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaBtnQuitarComidaActionPerformed
      if (listaComidasDiarias.getSelectedValue() != null) {
           Alimento alimentoABorrar = (Alimento) listaComidasDiarias.getSelectedValue();
           int diaActual = usuarioActual.getHistorialComidas().size();
       usuarioActual.getHistorialDelDia().getComidasIngeridas().remove(alimentoABorrar);
        listaComidasDiarias.setListData(usuarioActual.getHistorialDelDia().getComidasIngeridas().toArray());
       }
    }//GEN-LAST:event_etiquetaBtnQuitarComidaActionPerformed

    private void etiquetaBtnAgregarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaBtnAgregarComidasActionPerformed

    PanelAgregarComidasADietaDiariaUsuario nuevo = new PanelAgregarComidasADietaDiariaUsuario(sistema,ventana,usuarioActual,this);
       ventana.setPanelActual(nuevo);
       ventana.getPanelPrincipal().add(ventana.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
       ventana.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_etiquetaBtnAgregarComidasActionPerformed

    private void panelDietaDiariaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelDietaDiariaFocusGained
      
    }//GEN-LAST:event_panelDietaDiariaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton etiquetaBtnAgregarComidas;
    private javax.swing.JButton etiquetaBtnQuitarComida;
    private javax.swing.JLabel etiquetaTituloAlim;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JScrollPane lstComDiarias;
    private javax.swing.JPanel panelDietaDiaria;
    // End of variables declaration//GEN-END:variables
}
