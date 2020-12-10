/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;


/**
 *
 * @author Dell Latitude e6440
 */
public class ValidacionDeDatos {

    

    public boolean esAlphaNumerico(String cadena) {

       if (cadena.isEmpty()) {
            return false;
        }
        if (cadena.length() < 8) {
            return false;
        }
        boolean contieneInt = false;
        boolean contieneChar = false;

        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) > 64 && cadena.charAt(i) < 91) || (cadena.charAt(i) > 96 && cadena.charAt(i) < 123)) {
                contieneChar = true;
            }
            if (cadena.charAt(i) > 47 && cadena.charAt(i) < 58) {
                contieneInt = true;
            }

        }
        return contieneInt && contieneChar;

    }

    public boolean esPasswordCorrecto(String password) {
        return esAlphaNumerico(password) && password.length() > 8;
    }

    //Metodo para validarque el dato sea numericoF
}
