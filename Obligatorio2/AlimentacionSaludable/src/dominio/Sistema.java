package dominio;

import com.toedter.calendar.JDateChooser;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sistema implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    ArrayList<Alimento> listaAlimentos;
    ArrayList<Usuario> listaUsuarios;
    ArrayList<Profesional> listaProfesionales;
    tipoUsuario[] listaTiposDeUsuario;
    tipoUsuario usuarioActivo;
    HashMap<String, String> usuarioAdministrador;

    //Cosntructor
    public Sistema(ArrayList<Alimento> listaAlimentos,
            ArrayList<Usuario> listaUsuarios,
            ArrayList<Profesional> listaProfesionales,
            tipoUsuario usuarioActivo, HashMap<String, String> usuarioAdministrador) {
        this.listaAlimentos = listaAlimentos;
        this.listaUsuarios = listaUsuarios;
        this.listaProfesionales = listaProfesionales;
        this.usuarioActivo = usuarioActivo;
        this.usuarioAdministrador = usuarioAdministrador;
        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();

    }

    public Sistema() {
        this.listaAlimentos = new ArrayList();
        this.listaUsuarios = new ArrayList();
        this.listaProfesionales = new ArrayList();
        this.usuarioActivo = tipoUsuario.NoSeleccionado;
        this.usuarioAdministrador = new HashMap<>();

        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();
        usuarioAdministrador = new HashMap<>();
        usuarioAdministrador.put("admin", "adminalimentacion");

    }
    //Metodos de la clase sistema

    public HashMap<String, String> getListaUsuarioAdministador() {
        return this.usuarioAdministrador;
    }

    public void setUsuarioAdministrador(String nombreUsuario, String password) {
        this.usuarioAdministrador.put(nombreUsuario, password);
    }

    public tipoUsuario[] getListaTiposDeUsuario() {
        tipoUsuario[] lista = listaTiposDeUsuario;
        return lista;
    }

    public void setListaTiposDeUsuario(tipoUsuario[] listaTiposDeUsuario) {
        this.listaTiposDeUsuario = Optional
                .ofNullable(listaTiposDeUsuario)
                .orElse(null);
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(ArrayList<Alimento> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public void setListaProfesionales(ArrayList<Profesional> listaProfesionales) {
        this.listaProfesionales = listaProfesionales;
    }

    public tipoUsuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(tipoUsuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public enum tipoUsuario {
        Profesional, Usuario, NoSeleccionado
    }

    //Metodo para inicializar lista de enums de tipo de usuario
    tipoUsuario[] inicializoListaTiposDeUsuario() {
        tipoUsuario[] listaPivot = {tipoUsuario.Profesional,
            tipoUsuario.Usuario};
        return listaPivot;
    }

    //CARGAR Y GUARDAR SISTEMA
    public void cargarSistema() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("repositorio.ser"));
            ArrayList<Alimento> listAlimentos = (ArrayList<Alimento>) in.readObject();
            listaAlimentos = listAlimentos;
            ArrayList<Usuario> listUsuarios = (ArrayList<Usuario>) in.readObject();
            listaUsuarios = listUsuarios;
            ArrayList<Profesional> listProfesionales = (ArrayList<Profesional>) in.readObject();
            listaProfesionales = listProfesionales;

            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            listaAlimentos = new ArrayList<>();
            listaUsuarios = new ArrayList<>();
            listaProfesionales = new ArrayList<>();
            usuarioAdministrador = new HashMap<>();
            usuarioAdministrador.put("admin", "adminalimentacion");
        }
    }

    public void guardarSistema() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("repositorio.ser"));
            out.writeObject(listaAlimentos);
            out.writeObject(listaUsuarios);
            out.writeObject(listaProfesionales);

            out.flush();
            out.close();
        } catch (IOException ex) {
        }
    }

    public String pidoDatoNumerico(int dato, int min, int max) {
        int datoAVerificar = 0;
        String severidad = "NO OK";
        try {
            datoAVerificar = dato;
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                severidad = "OK";
            }
        } catch (NumberFormatException ex) {
            severidad = "ERROR";
        }
        return severidad;
    }

}
