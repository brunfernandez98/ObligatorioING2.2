/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;


import dominio.Usuario;
import dominio.Persona;
import dominio.Profesional;
import dominio.Sistema;

/**
 *
 * @author Dell Latitude e6440
 */
public class GestionLogin {

    private Sistema sistema;

    public GestionLogin(Sistema unSistema) {
        sistema = unSistema;
    }
 
    public String[] manejoDeDatos(String nombreUsuario, String password) {
        Persona unCliente = new Usuario();
        unCliente.setNombreUsuario(nombreUsuario);
        unCliente.setPassword(password);
        Profesional unProfesional = new Profesional();
        unProfesional.setNombreUsuario(nombreUsuario);
        unProfesional.setPassword(password);
        int indiceUsuario = sistema.getListaUsuarios().indexOf(unCliente);
        int indiceProfesional = sistema.getListaProfesionales()
                .indexOf(unProfesional);

        
        boolean existeUsuario = indiceUsuario != -1;
        boolean existeProfesional = indiceProfesional != -1;
        boolean existeUsuarioRoot = sistema.getListaUsuarioAdministador()
                .containsKey(nombreUsuario)
                && sistema.getListaUsuarioAdministador().containsValue(password);
       
        
        String[] existeRetorno = new String[]{"", "", ""};
        if (!existeUsuario && !existeProfesional && !existeUsuarioRoot) {
            existeRetorno[0] = "No existe";
            existeRetorno[1] = "No existe";
        } else if (!existeUsuario && existeProfesional && !existeUsuarioRoot) {
            Persona persona=(Profesional)sistema.getListaProfesionales().get(indiceProfesional);
           
            String passwordProf=((Profesional)persona).getPassword();
            if(!passwordProf.equals(password)) {
                existeRetorno[0] = "existe un usuario";
                existeRetorno[1] = "No existe";
            } else {
                existeRetorno[0] = "existe un usuario";
                existeRetorno[1] = "Profesional";
                existeRetorno[2] = ""+indiceProfesional;
            }
           
        } else if (!existeProfesional && existeUsuario && !existeUsuarioRoot) {
            Usuario persona=(Usuario)sistema.getListaUsuarios().get(indiceUsuario);
             if(!persona.getPassword().equals(password)) {
                existeRetorno[0] = "existe un usuario";
                existeRetorno[1] = "No existe";
            } else {
                existeRetorno[0] = "existe un usuario";
                existeRetorno[1] = "Usuario";
                existeRetorno[2] = ""+indiceUsuario;
            }
           
        } else {
            existeRetorno[0] = "existe un usuario";
            existeRetorno[1] = "Root";
        }

        return existeRetorno;
    }
    
  
}
