/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Dell Latitude e6440
 */
public final class Constante {

    public static enum TipoAlimento {
        Fruta, Cereal, Legumbre, CarnesBlancas, CarnesRojas, Vegetales,
        Embutidos, Lacteos, Bebidas, Mariscos, Postres, Otro,
        ProvenienteDeAnimales;

    }

    public static enum Pais {
        Alemania, Argentina, Australia, Austria, Brasil, Canadá, Chile, China,
        Colombia, CoreaDelSur, Cuba, Ecuador, Egipto, España, EstadosUnidos,
        Francia, Grecia, Holanda, India, Inglaterra, Israel, Italia, Japón,
        México, Paraguay, Perú, Portugal, Rusia, Sudáfrica, Uruguay, Venezuela
    }

    public static enum Nacionalidades {
        Alemana, Argentina, Australiana, Austriaca, Brasileña, Canadiense,
        Chilena, China, Colombiana, Cubana, Ecuatoriana, Egipcia,
        Española, EstadoUnidense, Francesa, Griega, Holandesa, India, Inglesa,
        Israeli, Italiana, Japonesa, Méxicana, Paraguaya, Peruana, Portuguesa,
        Rusa, Sudáfricana, Surcoreana, Uruguaya, Venezolana
    }

    public static enum tipoUsuario {
        Profesional, Usuario, Root, NoSeleccionado
    }

    public enum Nutrientes {
        Proteinas, Lipidos, HidratosDeCarbono, Vitaminas, Minerales, Agua,
        Fibra, Ninguna
    }

    public enum Preferencias {
        Vegano, Vegetariano, Macrobiotico, Organico, Ninguna
    }

    public enum Restricciones {
        Celiaco, IntoleranteALaLactosa, Diabetico, Hipertension, Ninguna
    }

}
