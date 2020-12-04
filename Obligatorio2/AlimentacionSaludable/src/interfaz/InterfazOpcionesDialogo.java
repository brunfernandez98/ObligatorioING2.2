/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell Latitude e6440
 */
public class InterfazOpcionesDialogo {

    public int verMensajeOpcionGestionUsuario() {
        String[] options = {"Registro Usuario", "Modificacion Usuario", "Baja Usuario"};

        int opciones = JOptionPane.showOptionDialog(null, "Seleccione alguna opcion de la gestion de Usuario",
                "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        return opciones;
    }

    public int verMensajeOpcionGestionProfesional() {
        String[] options = {"Registro Profesional", "Modificacion Profesional", "Baja Profesional"};

        int opciones = JOptionPane.showOptionDialog(null, "Seleccione alguna opcion de la gestion de Profesional",
                "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return opciones;
    }

    public int verMensajeOpcionGestionAlimentos() {
        String[] options = {"Registro Alimento", "Modificacion Alimento", "Baja Alimento"};

        int opciones = JOptionPane.showOptionDialog(null, "Seleccione alguna opcion de la gestion de Alimento",
                "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return opciones;
    }
    
    
    
    
    
    
    
    
    
    

}
