package dominio;

import static datechooser.beans.pic.Pictures.getResource;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    private static Sistema instance;

    private static ArrayList<Usuario> listaU;
    private static ArrayList<Profesional> listaP;
    private static ArrayList<Alimento> listaA;
    private static Sistema.tipoUsuario tipoUsuario;
    private static String nombreUsuarioAdmin;
    private static String passwordUsuarioAdmin;
    private static HashMap<String, String> usuarioAdministrador;
    private static Sistema.tipoUsuario[] listaTiposDeUsuario;

    @BeforeClass
    public static void setUpClass() {
        tipoUsuario = Sistema.tipoUsuario.Usuario;
        listaP = new ArrayList<>();
        listaA = new ArrayList<>();
        listaU = new ArrayList<>();
        usuarioAdministrador = new HashMap<>();
        instance = new Sistema(listaA, listaU, listaP, tipoUsuario, usuarioAdministrador);

        nombreUsuarioAdmin = "test";
        passwordUsuarioAdmin = "test2";
        usuarioAdministrador.put(nombreUsuarioAdmin, passwordUsuarioAdmin);
        listaTiposDeUsuario = instance.inicializoListaTiposDeUsuario();

    }

    private boolean areEqual(Map<String, String> first, Map<String, String> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetListaTipoDeUsuario() {
        Sistema.tipoUsuario[] listaTipoDeUsuario = {Sistema.tipoUsuario.Profesional,
            Sistema.tipoUsuario.Usuario};
        instance.setListaTiposDeUsuario(listaTiposDeUsuario);
        assertTrue(Arrays.equals(listaTipoDeUsuario, instance.getListaTiposDeUsuario()));
    }

    @Test
    public void testPidoDatoNumericoValido() {
        System.out.println("pidoDatoNumericoValido");
        int dato = 4;
        int min = 0;
        int max = 10;

        String result = instance.pidoDatoNumerico(dato, min, max);
        assertEquals("OK", result);
    }

    @Test
    public void testSistemaPorParametro() {
        Sistema s = new Sistema();
        Sistema l = s;
        assertEquals(l, s);
    }

    @Test
    public void testPidoDatoNumericoInvalido() {
        System.out.println("pidoDatoNumericoInvalido");
        int dato = -1;
        int min = 0;
        int max = 2;

        String result = instance.pidoDatoNumerico(dato, min, max);
        assertEquals("NO OK", result);
    }

    @Test
    public void testPidoDatoNumericoInvalido2() {
        System.out.println("pidoDatoNumericoInvalido2");
        int dato = 3;
        int min = 0;
        int max = 2;

        String result = instance.pidoDatoNumerico(dato, min, max);
        assertEquals("NO OK", result);
    }

    @Test
    public void testPidoDatoNumericoInvalido4() {
        System.out.println("pidoDatoNumericoInvalido4");
        String dato = "test";
         String result = "";
        String resultAux = "";
        try {
            int datoTest = Integer.parseInt(dato);
            int min = 0;
            int max = 2;
            resultAux= instance.pidoDatoNumerico(datoTest, min, max);

        } catch (NumberFormatException ex) {
            result = "ERROR";
        }

        assertEquals(resultAux, result);
    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void testPidoDatoNumericoInvalido3() {
        System.out.println("pidoDatoNumericoInvalido3");
        String dato = "test";
        int datoTest = Integer.parseInt(dato);
        int min = 0;
        int max = 2;
        String result = instance.pidoDatoNumerico(datoTest, min, max);

    }

    @Test
    public void testSetUsuarioActivo() {
        System.out.println("testSetUsuarioActivo");
        instance.setUsuarioActivo(tipoUsuario);
        assertTrue(instance.getUsuarioActivo().equals(tipoUsuario));

    }

    @Test
    public void testSetListaAlimentos() {
        System.out.println("testSetListaAlimentos");

        instance.setListaAlimentos(listaA);
        assertTrue(instance.getListaAlimentos().equals(listaA));

    }

    @Test
    public void testGetListaAlimentos() {
        System.out.println("testSetListaAlimentos");
        ArrayList<Alimento> listaAaux = new ArrayList();
        assertEquals(listaAaux, instance.getListaAlimentos());

    }

    @Test
    public void testSetListaUsuarios() {
        System.out.println("testSetListaUsuarios");

        instance.setListaUsuarios(listaU);
        assertTrue(instance.getListaUsuarios().equals(listaU));

    }

    @Test
    public void testSetListaProfesionales() {
        System.out.println("testSetListaProfesionales");

        instance.setListaProfesionales(listaP);
        assertTrue(instance.getListaProfesionales().equals(listaP));

    }

    @Test
    public void testSetListaAdministrador() {
        System.out.println("testSetListaAdministrador");
        instance.setUsuarioAdministrador(nombreUsuarioAdmin, passwordUsuarioAdmin);
        HashMap<String, String> usuarioAdministradorAux = new HashMap();
        usuarioAdministradorAux.put(nombreUsuarioAdmin, passwordUsuarioAdmin);
        boolean isTrue = this.areEqual(usuarioAdministradorAux, usuarioAdministrador);
        assertTrue(isTrue);

    }

    @Test
    public void testGetListaAdministrador() {
        System.out.println("testGetListaAdministrador");
        HashMap<String, String> usuarioAdministradorAux = new HashMap<>();
        usuarioAdministradorAux.put(nombreUsuarioAdmin, passwordUsuarioAdmin);
        assertTrue(instance.getListaUsuarioAdministador().equals(usuarioAdministradorAux));

    }

    @Test
    public void testGetListaProfesionales() {
        System.out.println("testSetListaAlimentos");
        ArrayList<Profesional> listaP = new ArrayList();
        assertEquals(listaP, instance.getListaProfesionales());

    }

    @Test
    public void testGetListaUsuarios() {
        System.out.println("testSetListaAlimentos");
        ArrayList<Usuario> listaU = new ArrayList();
        assertEquals(listaU, instance.getListaUsuarios());

    }

    @Test
    public void testGetUsuarioActivo() {
        System.out.println("testSetUsuarioActivo");

        Sistema.tipoUsuario compare = tipoUsuario;
        assertEquals(instance.getUsuarioActivo(), compare);

    }

}
