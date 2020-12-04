package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesionalTest {
    
    private static Profesional instance;
    private static  Profesional objectCompare; 

    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          instance=new Profesional();
          objectCompare = new Profesional();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetCasillaDeEntrada() {
        System.out.println("getCasillaDeEntrada");
       
        ArrayList<Mensaje> expResult = new ArrayList<>();
        ArrayList<Mensaje> result = instance.getCasillaDeEntrada();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCasillaDeEntrada() {
        System.out.println("setCasillaDeEntrada");
        ArrayList<Mensaje> casillaDeEntrada = new ArrayList<>();
       
        instance.setCasillaDeEntrada(casillaDeEntrada);
        assertEquals(instance.getCasillaDeEntrada(),casillaDeEntrada);
    }

    @Test
    public void testGetNombreTituloProf() {
        System.out.println("getNombreTituloProf");
        String expResult = "no ingreso titulo prof";
        String result = instance.getNombreTituloProf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombreTituloProf() {
        System.out.println("setNombreTituloProf");
        String nombreTituloProf = "no ingreso titulo prof";
       
        instance.setNombreTituloProf(nombreTituloProf);
        assertEquals(nombreTituloProf,instance.getNombreTituloProf());
    }
    
    @Test
    public void testGetFechaGrauacion() {
        System.out.println("getFechaGraduacion");
        String fechaGraduacion = "12-01-2001";
       
        instance.setFechaGraduacion(fechaGraduacion);
        String result=instance.getFechaGraduacion();
        assertEquals(result,fechaGraduacion);
       
    }
    
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String password = "prueba";
        instance.setPassword(password);
        String result=instance.getPassword();
        assertEquals(result,password);
       
    }
    
    
    @Test
    public void testGetPaisObtuvoTituloIndia() {
        System.out.println("getPaisObtuvoTitulo");
       
        instance.setPaisObtuvoTitulo(Profesional.Pais.India);
        Profesional.Pais expResult = Profesional.Pais.India;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloInglaterra() {
        System.out.println("setPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Inglaterra);
        Profesional.Pais expResult = Profesional.Pais.Inglaterra;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Inglaterra);
        Profesional.Pais expResult = Profesional.Pais.Inglaterra;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
      @Test
    public void testSetNombreTituloProfesional() {
        System.out.println("setNombreTituloProfesional");
        String nombreTituloProf="test";
        instance.setNombreTituloProf(nombreTituloProf);
        assertEquals(nombreTituloProf, instance.getNombreTituloProf());
    }
    
          @Test
    public void testSetFechaGraduacion() {
        System.out.println("setFechaGraduacion");
        String fechaGradu="12-02-2001";
        instance.setFechaGraduacion(fechaGradu);
        assertEquals(fechaGradu, instance.getFechaGraduacion());
    }
    
    
    @Test
    public void testSetPaisObtuvoTituloIsrael() {
        System.out.println("setPaisObtuvoTitulo");
        
        instance.setPaisObtuvoTitulo(Profesional.Pais.Israel);
        Profesional.Pais expResult = Profesional.Pais.Israel;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
       
        instance.setPaisObtuvoTitulo(Profesional.Pais.Israel);
        Profesional.Pais expResult = Profesional.Pais.Israel;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
       
        instance.setPaisObtuvoTitulo(Profesional.Pais.Italia);
        Profesional.Pais expResult = Profesional.Pais.Italia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Italia);
        Profesional.Pais expResult = Profesional.Pais.Italia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
       
        instance.setPaisObtuvoTitulo(Profesional.Pais.Japón);
        Profesional.Pais expResult = Profesional.Pais.Japón;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Japón);
        Profesional.Pais expResult = Profesional.Pais.Japón;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.México);
        Profesional.Pais expResult = Profesional.Pais.México;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.México);
        Profesional.Pais expResult = Profesional.Pais.México;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Paraguay);
        Profesional.Pais expResult = Profesional.Pais.Paraguay;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Paraguay);
        Profesional.Pais expResult = Profesional.Pais.Paraguay;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Perú);
        Profesional.Pais expResult = Profesional.Pais.Perú;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Perú);
        Profesional.Pais expResult = Profesional.Pais.Perú;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Portugal);
        Profesional.Pais expResult = Profesional.Pais.Portugal;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Portugal);
        Profesional.Pais expResult = Profesional.Pais.Portugal;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Sudáfrica);
        Profesional.Pais expResult = Profesional.Pais.Sudáfrica;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Venezuela);
        Profesional.Pais expResult = Profesional.Pais.Venezuela;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        instance.setPaisObtuvoTitulo(Profesional.Pais.Venezuela);
        Profesional.Pais expResult = Profesional.Pais.Venezuela;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetListaEnumPais() {
        System.out.println("getListaEnumPais");
        Profesional.Pais[] expResult = instance.inicializoListaEnumPaises();
        Profesional.Pais[] result = instance.getListaEnumPais();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaEnumPais() {
        System.out.println("setListaEnumPais");
        Profesional.Pais[] listaEnumPais = instance.inicializoListaEnumPaises();
        instance.setListaEnumPais(listaEnumPais);
        assertArrayEquals(instance.getListaEnumPais(),listaEnumPais);
    }

    @Test
    public void testInicializoListaEnumPaises() {
        System.out.println("inicializoListaEnumPaises");
        Profesional.Pais[] expResult = instance.inicializoListaEnumPaises();
        Profesional.Pais[] result = instance.inicializoListaEnumPaises();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Usuario: " + instance.getNombreUsuario();;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        
        objectCompare.setNombreUsuario("prueba");
        boolean expResult = false;
        boolean result = instance.equals(objectCompare);
        assertFalse(objectCompare.equals(instance));
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
       
        boolean expResult = true;
        boolean result = instance.equals(objectCompare);
        assertEquals(expResult, result);
    } 
    
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        
        instance = null;
        assert(instance.equals(objectCompare));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsDistintoTipo");
        objectCompare.setNombreUsuario("nombre");
        boolean test = objectCompare.equals("soy string");
        assertFalse(test);
    } 
}
