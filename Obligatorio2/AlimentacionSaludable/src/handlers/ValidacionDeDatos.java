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
      public boolean esAlphaNumerico(String string){
       char[] charArray = string.toCharArray();
    for(char c:charArray)
    {
        if (!Character.isLetterOrDigit(c))
            return false;
    }
    return true;
    }
    public boolean esPasswordCorrecto(String password){
        return esAlphaNumerico(password) && password.length()>8;
    }
    
    //Metodo para validarque el dato sea numericoF

}
