package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlimentoTest {
    private static Alimento instance;
     private static Alimento aux;
    private static ArrayList<Alimento> alimento;
    private static Alimento.TipoAlimento[] enumTipoAlimento;
    private static Alimento.Nutrientes[]  enumTipoNutrientes;
    private static boolean[] nutrientesSeleccionados;
    
    @BeforeClass
    public static void setUpClass() {
        instance=new Alimento();
        aux=new Alimento();
        alimento=new ArrayList();
        enumTipoAlimento=instance.getListaEnumTipoAlimento();
        enumTipoNutrientes=instance.getListaEnumNutrientes();
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
      public void testSetListaNutrientes() {
        System.out.println("SetListaNutrientes");
        nutrientesSeleccionados= new boolean[1];
        nutrientesSeleccionados[0] = true;

        instance.setListaNutrientesSeleccionados(nutrientesSeleccionados);
        assertTrue(Arrays.equals(instance.getListaNutrientesSeleccionados(), nutrientesSeleccionados));
        
    }
    
    
    
    
      @Test
      public void testSetListaEnumTipoAlimento() {
        System.out.println("SetListaEnumTipoAlimento");
        instance.setListaEnumTipoAlimento(enumTipoAlimento);
        assertTrue(instance.getListaEnumTipoAlimento().equals(enumTipoAlimento));
        
    }
      
      @Test
      public void testSetListaEnumTipoNutrientes() {
        System.out.println("SetListaEnumTipoNutrientes");
        instance.setListaEnumNutrientes(enumTipoNutrientes);
        assertTrue(instance.getListaEnumNutrientes().equals(enumTipoNutrientes));
        
    }
    
    
    @Test
    public void testGetTipoBebidas() {
        System.out.println("getTipo");
        instance.setTipo(Alimento.TipoAlimento.Bebidas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.Bebidas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesBlancas() {
        System.out.println("getTipo");
        
        instance.setTipo(Alimento.TipoAlimento.CarnesBlancas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CarnesBlancas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesRojas() {
        System.out.println("getTipo");
       
   instance.setTipo(Alimento.TipoAlimento.CarnesRojas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CarnesRojas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCereal() {
        System.out.println("getTipo");
        
        instance.setTipo(Alimento.TipoAlimento.Cereal);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.Cereal;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    
       @Test
      public void testToString() {
        System.out.println("testToString()");
        String nombreAlimento="test";
        instance.setNombre(nombreAlimento);
        String expResult = instance.toString();
        assertEquals(expResult, nombreAlimento);
    }
      
        @Test
      public void testGetNombre(){
        System.out.println("testToString()");
        String nombreAlimento="test";
        instance.setNombre(nombreAlimento);
        String expResult = instance.getNombre();
        assertEquals(expResult, nombreAlimento);
    }
      
  
    
}
