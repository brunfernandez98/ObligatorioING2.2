package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {

    private static PlanDeAlimentacion instance;
    private static Usuario usuario;
    private static ArrayList<Alimento> listaLunes;
    private static ArrayList<Alimento> listaMartes;
    private static ArrayList<Alimento> listaMiercoles;
    private static ArrayList<Alimento> listaJueves;
    private static ArrayList<Alimento> listaViernes;
    private static ArrayList<Alimento> listaSabado;
    private static ArrayList<Alimento> listaDomingo;

  
     @Test
      public void testGetListaLunes() {
        System.out.println("getListaLunes");
         instance.setListaLunes(listaLunes);
        ArrayList<Alimento> listaLunesAux = instance.getListaLunes();
        assertEquals(listaLunes,listaLunesAux);
    }
    
     @Test
      public void testGetListaMartes() {
        System.out.println("getListaMartes");
         instance.setListaMartes(listaMartes);
        ArrayList<Alimento> listaMartesAux = instance.getListaMartes();
        assertEquals(listaMartes,listaMartesAux);
    } 
      
       @Test
      public void testGetListaMiercoles() {
        System.out.println("getListaMiercoles");
         instance.setListaMiercoles(listaMiercoles);
        ArrayList<Alimento> listaMiercolesAux = instance.getListaMiercoles();
        assertEquals(listaMiercoles,listaMiercolesAux);
    } 
      
         @Test
      public void testGetListaJueves() {
        System.out.println("getListaJueves");
         instance.setListaJueves(listaJueves);
        ArrayList<Alimento> listaJuevesAux = instance.getListaJueves();
        assertEquals(listaJueves,listaJuevesAux);
    } 
        @Test
      public void testGetListaViernes() {
        System.out.println("getListaViernes");
         instance.setListaViernes(listaViernes);
        ArrayList<Alimento> listaViernesAux = instance.getListaViernes();
        assertEquals(listaJueves,listaViernesAux);
    } 
      
        @Test
      public void testGetListaSabado() {
        System.out.println("getListaSabado");
         instance.setListaSabado(listaSabado);
        ArrayList<Alimento> listaSabadoAux = instance.getListaSabado();
        assertEquals(listaJueves,listaSabadoAux);
    } 
      
          @Test
      public void testGetListaDomingo() {
        System.out.println("getListaDomingo");
         instance.setListaDomingo(listaSabado);
        ArrayList<Alimento> listaDomingoAux = instance.getListaDomingo();
        assertEquals(listaJueves,listaDomingoAux);
    } 
      
      
      
    
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        instance.setUsuario(usuario);
        Usuario result = instance.getUsuario();
        assertEquals(usuario, result);
    }

    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario()");
        instance.setUsuario(usuario);
        assertTrue(instance.getUsuario().equals(usuario));
    }

    @Test
    public void testSetListaLunes() {
        System.out.println("setListaLunes()");
        instance.setListaLunes(listaLunes);
        assertTrue(instance.getListaLunes().equals(listaLunes));
    }

    @Test
    public void testSetListaMartes() {
        System.out.println("setListaMartes()");
        instance.setListaMartes(listaMartes);
        assertTrue(instance.getListaLunes().equals(listaMartes));
    }

    @Test
    public void testSetListaMiercoles() {
        System.out.println("setListaMiercoles()");
        instance.setListaMiercoles(listaMiercoles);
        assertTrue(instance.getListaLunes().equals(listaMiercoles));
    }

    @Test
    public void testSetListaJueves() {
        System.out.println("setListaJueves()");
        instance.setListaJueves(listaJueves);
        assertTrue(instance.getListaLunes().equals(listaJueves));
    }

    @Test
    public void testSetListaViernes() {
        System.out.println("setListaViernes()");
        instance.setListaViernes(listaViernes);
        assertTrue(instance.getListaLunes().equals(listaViernes));
    }

    @Test
    public void testSetListaSabado() {
        System.out.println("setListaSabado()");
        instance.setListaSabado(listaSabado);
        assertTrue(instance.getListaLunes().equals(listaSabado));
    }

    @Test
    public void testSetListaDomingo() {
        System.out.println("setListaDoming()");
        instance.setListaDomingo(listaDomingo);
        assertTrue(instance.getListaLunes().equals(listaDomingo));
    }

    @BeforeClass
    public static void setUpClass() {
        usuario = new Usuario();
        instance = new PlanDeAlimentacion(usuario);
        listaLunes = new ArrayList<>();
        listaMartes = new ArrayList<>();
        listaMiercoles = new ArrayList<>();
        listaJueves = new ArrayList();
        listaViernes = new ArrayList();
        listaSabado = new ArrayList();
        listaDomingo = new ArrayList();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        usuario.setNombreUsuario("test");
    }

    @After
    public void tearDown() {
    }

}
