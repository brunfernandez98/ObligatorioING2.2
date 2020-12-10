package dominio;

import java.awt.Image;
import javax.swing.ImageIcon;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {

    private static Persona instance;
    private static Persona aux;

    @BeforeClass
    public static void setUpClass() {
        instance = new Usuario();
        aux = new Usuario();
    }

    @AfterClass
    public static void tearDownClass() {
        aux = null;
        instance = null;
    }
    
    
     @Test
    public void testSetFotoPerfil() {
        System.out.println("setFotoPerfil");
        
        instance.setFotoPerfil(new ImageIcon(getClass().getResource("prueba.png")));
        ImageIcon result = instance.getFotoPerfil();
       assertEquals(instance.getFotoPerfil(), result);
    }
 
    
    

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "no ingreso nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        aux.setNombreUsuario("pruebaFalse");
        boolean expResult = false;
        boolean result = instance.equals(aux);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        aux = null;
        assert (instance.equals(aux));
    }

    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsNull");
        boolean test = instance.equals("soy string");
        assertFalse(test);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "prueba";
        instance.setPassword("prueba");
        assertTrue(instance.getPassword().equals(password));

    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String password = "prueba";
        instance.setPassword("prueba");
        String result = instance.getPassword();
        assertEquals(password, result);

    }
   
     @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        String fecha = "12-01-2001";
        instance.setFechaNacimiento(fecha);
        String result = instance.getFechaNacimiento();
        assertEquals(fecha, result);

    }
         @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        String apellido = "test";
        instance.setApellidos(apellido);
        String result = instance.getApellidos();
        assertEquals(apellido, result);

    }
    
    
    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "", "", null);
        }
    }

}
