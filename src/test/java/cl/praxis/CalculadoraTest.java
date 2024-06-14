package cl.praxis;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test clase calculadora")
public class CalculadoraTest {
    private static final Logger logger=
            Logger.getLogger("cl.praxis.CalculadoraTest");
    private int n1;
    private int n2;

    Calculadora calculadora= new Calculadora();

    @BeforeAll
    public static void init(){

    }

    @Test
    public void testConstructorVoid(){
        logger.info("info test constructor vacio");

        Calculadora calculadora1 = new Calculadora();
        assertTrue(calculadora1 instanceof Calculadora);

    }

    @Test
    public void testConstructorArgumentos(){
        logger.info("info test constructor argumentos");

        Calculadora calculadora1 = new Calculadora(n1,n2);
        assertTrue(calculadora1 instanceof Calculadora);
    }

    @Test
    public void testSumar(){
        logger.info("info test sumar");

        n1=6;
        n2=2;
        assertEquals(8, calculadora.sumar(n1,n2));

    }

    @Test
    public void testRestar(){
        logger.info("info test restar");
        n1=6;
        n2=2;
        assertEquals(4, calculadora.restar(n1,n2));
    }

    @Test
    public void testMultiplicar(){
        logger.info("info test multiplicar");
        n1=6;
        n2=2;
        assertEquals(12, calculadora.multiplicar(n1,n2));
    }

    @Test
    public void testDividir(){
        logger.info("info test dividir");
        n1=6;
        n2=2;
        assertEquals(3, calculadora.dividir(n1,n2));
    }


}
