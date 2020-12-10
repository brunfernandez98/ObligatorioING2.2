package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;


public class Profesional extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombreTituloProf;
    private String fechaGraduacion;
    private Pais paisObtuvoTitulo;
    private Pais[] listaEnumPais = inicializoListaEnumPaises();
    private ArrayList<Mensaje> casillaDeEntrada;

    //Constructor

    public Profesional() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario",
              "no ingreso fecha nacimiento", null);
        
        this.nombreTituloProf = "no ingreso titulo prof";
        this.fechaGraduacion = "no ingreso fecha graduacion";
        this.paisObtuvoTitulo = Pais.Uruguay;
        this.casillaDeEntrada = new ArrayList<>();
    }

    // Metodos de la clase profesional
    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public String getNombreTituloProf() {
        return nombreTituloProf;
    }

    public void setNombreTituloProf(String nombreTituloProf) {
        if(!nombreTituloProf.trim().isEmpty()){
            this.nombreTituloProf = nombreTituloProf;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if(!fechaGraduacion.trim().isEmpty()){
            this.fechaGraduacion = fechaGraduacion;
        }
    }

    public Pais getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setPaisObtuvoTitulo(Pais paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }

    public Pais[] getListaEnumPais() {
        Pais[] lista = listaEnumPais;
        return lista;
    }

    public void setListaEnumPais(Pais[] listaEnumPais) {
        this.listaEnumPais = Optional
                .ofNullable(listaEnumPais)
                .orElse(null);

    }

    public enum Pais {
        Alemania, Argentina, Australia, Austria, Brasil, Canadá, Chile, China,
        Colombia, CoreaDelSur, Cuba, Ecuador, Egipto, España, EstadosUnidos,
        Francia, Grecia, Holanda, India, Inglaterra, Israel, Italia, Japón,
        México, Paraguay, Perú, Portugal, Rusia, Sudáfrica, Uruguay, Venezuela
    }

    public Pais[] inicializoListaEnumPaises() {
        Pais[] listaEnumPivot = {
            Pais.Alemania, Pais.Argentina, Pais.Australia,
            Pais.Austria, Pais.Brasil, Pais.Canadá,
            Pais.Chile, Pais.China, Pais.Colombia,
            Pais.CoreaDelSur, Pais.Cuba, Pais.Ecuador,
            Pais.Egipto, Pais.España, Pais.EstadosUnidos,
            Pais.Francia, Pais.Grecia, Pais.Holanda,
            Pais.India, Pais.Inglaterra, Pais.Israel,
            Pais.Italia, Pais.Japón, Pais.México, Pais.Paraguay,
            Pais.Perú, Pais.Portugal, Pais.Rusia, Pais.Sudáfrica,
            Pais.Uruguay, Pais.Venezuela
        };
        return listaEnumPivot;
    }
    
    @Override
    public String getPassword()
    {
        return super.getPassword();
    }

    //redefino toString
    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
}
