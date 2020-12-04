package interfaz;

import dominio.Sistema;


public class PanelPrincipal extends javax.swing.JFrame {

    //Atributos
    private Sistema sistema;

    //Constructor
    public PanelPrincipal(Sistema unSistema) {
        initComponents();
        sistema = unSistema;
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.getSistema().guardarSistema();
    }//GEN-LAST:event_formWindowClosing

    public Sistema getSistema() {
        return sistema;
    }

    private void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
