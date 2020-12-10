/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentacionsaludable;

import dominio.Sistema;
import interfaz.InterfazLogin;

import interfaz.PanelPrincipal;

/**
 *
 * @author ale
 */
public class AlimentacionSaludable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema repositorio = new Sistema();
        repositorio.cargarSistema();
        PanelPrincipal panel = new PanelPrincipal(repositorio);

        InterfazLogin comienzo = new InterfazLogin(panel, panel.getSistema());

        comienzo.setVisible(true);
    }
}
