package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {
    
    public ComidaPorDiaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> expResult = new ArrayList<Alimento>();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }

    
    
}
