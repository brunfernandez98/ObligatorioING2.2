package dominio;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlanDeAlimentacion implements Serializable{
   
    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private Usuario usuario;
    private ArrayList<Alimento> listaLunes;
    private ArrayList<Alimento> listaMartes;
    private ArrayList<Alimento> listaMiercoles;
    private ArrayList<Alimento> listaJueves;
    private ArrayList<Alimento> listaViernes;
    private ArrayList<Alimento> listaSabado;
    private ArrayList<Alimento> listaDomingo;
    
    
    //Constructor
    public PlanDeAlimentacion(Usuario usuario) {
        this.usuario = usuario;
        listaLunes = new ArrayList<>();
        listaMartes = new ArrayList<>();
        listaMiercoles = new ArrayList<>();
        listaJueves = new ArrayList<>();
        listaViernes = new ArrayList<>();
        listaSabado = new ArrayList<>();
        listaDomingo = new ArrayList<>();
    }
    
    //Metodos de la clase PlanDeAliemntacion

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Alimento> getListaLunes() {
        return listaLunes;
    }

    public void setListaLunes(ArrayList<Alimento> listaLunes) {
        this.listaLunes = listaLunes;
    }

    public ArrayList<Alimento> getListaMartes() {
        return listaMartes;
    }

    public void setListaMartes(ArrayList<Alimento> listaMartes) {
        this.listaMartes = listaMartes;
    }

    public ArrayList<Alimento> getListaMiercoles() {
        return listaMiercoles;
    }

    public void setListaMiercoles(ArrayList<Alimento> listaMiercoles) {
        this.listaMiercoles = listaMiercoles;
    }

    public ArrayList<Alimento> getListaJueves() {
        return listaJueves;
    }

    public void setListaJueves(ArrayList<Alimento> listaJueves) {
        this.listaJueves = listaJueves;
    }

    public ArrayList<Alimento> getListaViernes() {
        return listaViernes;
    }

    public void setListaViernes(ArrayList<Alimento> listaViernes) {
        this.listaViernes = listaViernes;
    }

    public ArrayList<Alimento> getListaSabado() {
        return listaSabado;
    }

    public void setListaSabado(ArrayList<Alimento> listaSabado) {
        this.listaSabado = listaSabado;
    }

    public ArrayList<Alimento> getListaDomingo() {
        return listaDomingo;
    }

    public void setListaDomingo(ArrayList<Alimento> listaDomingo) {
        this.listaDomingo = listaDomingo;
    }  
}
