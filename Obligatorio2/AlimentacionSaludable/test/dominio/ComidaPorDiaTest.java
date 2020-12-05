package dominio;


import java.util.ArrayList;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {

    private static ComidaPorDia instance;
    private static ComidaPorDia aux;
    private static ComidaPorDia auxDos;
    
    @BeforeClass
    public static void setUpClass() {
        instance = new ComidaPorDia();
        aux = new ComidaPorDia();
        auxDos = new ComidaPorDia();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        
        ArrayList<Alimento> expResult = new ArrayList<>();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConstructor() {
        System.out.println("constructor");
        ArrayList<Alimento> expResult = new ArrayList<>();
        String fecha = "";
        instance = new ComidaPorDia(expResult, fecha);
        
    }
    
    @Test
    public void testSetComidasIngeridas() {
        System.out.println("setComidasIngeridas");
        ArrayList<Alimento> expResult = new ArrayList<>();
        instance.setComidasIngeridas(expResult);
        assertTrue(instance.getComidasIngeridas().equals(expResult));
        
    }
    
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "12-01-2001";
        instance.setFecha(fecha);
        assertTrue(instance.getFecha().equals(fecha));
        
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        String fecha = "12-01-2001";
        instance.setFecha(fecha);
        String expResult = "Comidas ingeridas el: " + instance.getFecha();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsTipo() {
        System.out.println("equals");
        String fecha = "12-01-2001";
        aux=new ComidaPorDia();
        auxDos=new ComidaPorDia();
        aux.setFecha(fecha);
        auxDos.setFecha(fecha);
        ArrayList<Alimento> expResult = new ArrayList<>();
        aux.setComidasIngeridas(expResult);
        auxDos.setComidasIngeridas(expResult);
        boolean test = auxDos.equals(aux);
        assertTrue(test);
    }
    
    
      @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equals");
        String fecha = "12-01-2001";
        String fechaDos = "12-02-2001";
        aux=new ComidaPorDia();
        auxDos=new ComidaPorDia();
        aux.setFecha(fecha);
        auxDos.setFecha(fechaDos);
        ArrayList<Alimento> expResult = new ArrayList<>();
        aux.setComidasIngeridas(expResult);
        auxDos.setComidasIngeridas(expResult);
        boolean test = auxDos.equals(aux);
        assertFalse(test);
    }
    
       @Test
    public void testEqualsDistintoTipo2() {
        System.out.println("equals");
        String fecha = "12-01-2001";
        String fechaDos = "12-01-2001";
        aux=new ComidaPorDia();
        auxDos=new ComidaPorDia();
        aux.setFecha(fecha);
        auxDos.setFecha(fechaDos);
        ArrayList<Alimento> expResult = new ArrayList<>();
        ArrayList<Alimento> expResultDos = new ArrayList<>();
        Alimento alimento=new Alimento();
        alimento.setNombre("nombre");
        expResultDos.add(alimento);
        aux.setComidasIngeridas(expResult);
        auxDos.setComidasIngeridas(expResultDos);
        boolean test = auxDos.equals(aux);
        assertFalse(test);
    }
    
    
    
    
    
   
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        aux = null;
        assert (instance.equals(aux));
    }
    
}
