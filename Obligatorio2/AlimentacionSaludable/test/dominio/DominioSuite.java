package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({dominio.SistemaTest.class, dominio.PersonaTest.class, dominio.UsuarioTest.class, dominio.MensajeTest.class, dominio.PlanDeAlimentacionTest.class, dominio.AlimentoTest.class, dominio.ComidaPorDiaTest.class, dominio.ProfesionalTest.class})
public class DominioSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
