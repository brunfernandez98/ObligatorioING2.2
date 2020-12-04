package dominio;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class Alimento implements Serializable {

    //Atrubutos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombre;
    private TipoAlimento tipo;
    private TipoAlimento[] listaEnumTipoAlimento = inicializoEnumTipoAlimento();
    private Nutrientes[] listaEnumNutrientes = inicializoEnumNutrientes();
    private boolean[] listaNutrientesSeleccionados;

    //Constructor
    public Alimento() {
        this.nombre = "sin nombre";
        this.tipo = TipoAlimento.Otro;
        this.listaNutrientesSeleccionados = new boolean[listaEnumNutrientes
                                                        .length];
    }

    //Metodos de la clase Aliemntos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(!nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public Nutrientes[] getListaEnumNutrientes() {
        Nutrientes[] lista = listaEnumNutrientes;
        return lista;
    }

    public void setListaEnumNutrientes(Nutrientes[] listaEnumNutrientes) {
        this.listaEnumNutrientes = Optional
                .ofNullable(listaEnumNutrientes)
                .orElse(null);
    }

    public TipoAlimento[] getListaEnumTipoAlimento() {
        TipoAlimento[] lista = listaEnumTipoAlimento;
        return lista;
    }

    public void setListaEnumTipoAlimento(TipoAlimento[]
                                         listaEnumTipoAlimento) {
        this.listaEnumTipoAlimento = Optional
                .ofNullable(listaEnumTipoAlimento)
                .orElse(null);
    }

    public boolean[] getListaNutrientesSeleccionados() {
        boolean[] lista = listaNutrientesSeleccionados;
        return lista;
    }

    public void setListaNutrientesSeleccionados(boolean[]
                                                listaNutrientesSeleccionados) {
        this.listaNutrientesSeleccionados = Optional
                .ofNullable(listaNutrientesSeleccionados)
                .orElse(null);
    }

    public enum TipoAlimento {
        Fruta, Cereal, Legumbre, CarnesBlancas, CarnesRojas, Vegetales,
        Embutidos, Lacteos, Bebidas, Mariscos, Postres, Otro,
        ProvenienteDeAnimales
    }

    public TipoAlimento[] inicializoEnumTipoAlimento() {
        TipoAlimento[] listaEnumPivot = {
            TipoAlimento.Bebidas, TipoAlimento.CarnesBlancas,
            TipoAlimento.CarnesRojas, TipoAlimento.Cereal,
            TipoAlimento.Embutidos, TipoAlimento.Fruta,
            TipoAlimento.Lacteos, TipoAlimento.Legumbre,
            TipoAlimento.Mariscos, TipoAlimento.Otro,
            TipoAlimento.Postres, TipoAlimento.ProvenienteDeAnimales,
            TipoAlimento.Vegetales
        };
        return listaEnumPivot;
    }

    public enum Nutrientes {
        Proteinas, Lipidos, HidratosDeCarbono, Vitaminas, Minerales, Agua,
        Fibra, Ninguna
    }

    public Nutrientes[] inicializoEnumNutrientes() {
        Nutrientes[] listaEnumPivot = {
            Nutrientes.Agua, Nutrientes.Fibra,
            Nutrientes.HidratosDeCarbono,
            Nutrientes.Lipidos, Nutrientes.Minerales,
            Nutrientes.Proteinas, Nutrientes.Vitaminas
        };
        return listaEnumPivot;
    }

    //redefino toString
    @Override
    public String toString() {
        return nombre;
    }
    @Override
 public boolean equals(Object obj) {
        boolean retorno = true;
        if (obj == null) {
            retorno = false;
        }
        if (obj.getClass() != this.getClass()) {
            retorno = false;
        }
        if(retorno){
            Alimento p = (Alimento) obj;
            retorno =this.getNombre()
                    .equalsIgnoreCase(p.getNombre());
        }
        return retorno;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    } 
    

}
