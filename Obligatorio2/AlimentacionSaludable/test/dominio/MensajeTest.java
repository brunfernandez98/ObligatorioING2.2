package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensajeTest {
    private static Mensaje mensaje;
    private static Usuario usuario;
    
    @Before
    public void setUp() throws Exception  {
      usuario.setNombre("prueba");
      usuario.setNombreUsuario("pruebaTest");
    }
    
    
    @BeforeClass
    public static void setUpClass() {
       mensaje=new Mensaje();
       usuario=new Usuario();
      
    }
      @Test
    public void testEqualsAsuntoVacio() {
        System.out.println("EqualsAsuntoVacio()");
        mensaje.setAsunto("");
        boolean resultEsVacio = mensaje.getAsunto().isEmpty();
        assertTrue(resultEsVacio);
    }
    
     @Test
    public void testEqualsAsuntoNoVacio() {
        System.out.println("EqualsAsuntoNoVacio()");
        mensaje.setAsunto("test");
        boolean resultEsNoVacio = !mensaje.getAsunto().isEmpty();
        assertTrue(resultEsNoVacio);
    }
    
      @Test
        public void testEqualsGetMensaje() {
        System.out.println("EqualsGetMensaje");
        String mensajeNuevo="Nuevo";
        mensaje.setMensaje(mensajeNuevo);
        String mensajeObtenido = mensaje.getMensaje();
        assertEquals(mensajeNuevo,mensajeObtenido);
    }
        
        @Test
        public void testEqualsGetMensajeOk() {
        System.out.println("EqualsGetMensaje()");
        String mensajeNuevo="Nuevo";
        mensaje.setMensaje(mensajeNuevo);
        String mensajeObtenido = mensaje.getMensaje();
        boolean existeMensaje=!mensajeObtenido.isEmpty();
        assertTrue(existeMensaje);
    }
   
       @Test
      public void testToString() {
        System.out.println("GetDestino()");
        mensaje.setOrigen(usuario);
        mensaje.setAsunto("asunto");
        String expResult = "Mensaje de: " + usuario.getNombreUsuario() 
               + " con Asunto: " + mensaje.getAsunto();
        String result = mensaje.toString();
        assertEquals(expResult, result);
    }
      
       @Test
      public void testGetDestino() {
        System.out.println("toString");
        mensaje.setAsunto("prueba");
        mensaje.setDestino(usuario);
        Usuario result = (Usuario) mensaje.getDestino();
        assertEquals(result,usuario);
    }
      
       @Test
      public void testSetDestino() {
        System.out.println("GetDestino()");
        mensaje.setDestino(usuario);
        assertTrue(mensaje.getDestino().equals(usuario));
    }
      
        @Test
      public void testGetOrigen() {
        System.out.println("GetOrigen()");
        mensaje.setOrigen(usuario);
        Usuario result = (Usuario) mensaje.getOrigen();
        assertEquals(result,usuario);
    }
      
       @Test
      public void testSetOrigen() {
        System.out.println("SetOrigen()");
        mensaje.setOrigen(usuario);
        assertTrue(mensaje.getOrigen().equals(usuario));
    }
      
       @After
    public void tearDown() {
        mensaje.setAsunto("");
        mensaje.setDestino(null);
        mensaje.setOrigen(null);
        mensaje.setMensaje(null);
        
    }
      
      
    @AfterClass
    public static void tearDownClass() {
        mensaje=null;
    }
    
    
    
   
    
}
