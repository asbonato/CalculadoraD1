package br.saojudas.sdm21_1.calculadorad1.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

import br.saojudas.sdm21_1.calculadorad1.model.Calculadora;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setup(){
        calculadora = new Calculadora();
    }

    @Test
    public void testaSoma(){
       calculadora.setValor1("1");
       calculadora.setValor2("2");
       calculadora.setOperador("+");
       calculadora.calculo();
       assertEquals("3", calculadora.getResultado());
       calculadora.setValor1("2");
       calculadora.setValor2("1");
       calculadora.setOperador("+");
       calculadora.calculo();
       assertEquals("3", calculadora.getResultado());
    }

    @Test
    public void testaSubtracao(){
        calculadora.setValor1("1");
        calculadora.setValor2("2");
        calculadora.setOperador("-");
        calculadora.calculo();
        assertEquals("-1", calculadora.getResultado());
        calculadora.setValor1("2");
        calculadora.setValor2("1");
        calculadora.setOperador("-");
        calculadora.calculo();
        assertEquals("1", calculadora.getResultado());
    }

    @Test
    public void testaMultiplicacao(){
        calculadora.setValor1("1");
        calculadora.setValor2("2");
        calculadora.setOperador("*");
        calculadora.calculo();
        assertEquals("2", calculadora.getResultado());
        calculadora.setValor1("2");
        calculadora.setValor2("1");
        calculadora.setOperador("*");
        calculadora.calculo();
        assertEquals("2", calculadora.getResultado());
    }

    @Test
    public void testaMultiplicacaoPorZero(){
        calculadora.setValor1("0");
        calculadora.setValor2("2");
        calculadora.setOperador("*");
        calculadora.calculo();
        assertEquals("0", calculadora.getResultado());
        calculadora.setValor1("2");
        calculadora.setValor2("0");
        calculadora.setOperador("*");
        calculadora.calculo();
        assertEquals("0", calculadora.getResultado());
    }

    @Test
    public void testaDivisao(){
        calculadora.setValor1("1");
        calculadora.setValor2("2");
        calculadora.setOperador("/");
        calculadora.calculo();
        assertEquals("0", calculadora.getResultado());
        calculadora.setValor1("2");
        calculadora.setValor2("1");
        calculadora.setOperador("/");
        calculadora.calculo();
        assertEquals("2", calculadora.getResultado());
    }


    //@Test(expected = java.lang.ArithmeticException.class)
    @Test
    public void testaDivisaoPorZero(){
        calculadora.setValor1("2");
        calculadora.setValor2("0");
        calculadora.setOperador("/");
        calculadora.calculo();
        assertEquals("ERRO", calculadora.getResultado());
    }

    @Test
    public void testaDivisaoDeZero(){
        calculadora.setValor1("0");
        calculadora.setValor2("2");
        calculadora.setOperador("/");
        calculadora.calculo();
        assertEquals("0", calculadora.getResultado());
    }

    @Test
    public void testaErro(){
        calculadora.setValor1("1");
        calculadora.setValor2("2");
        calculadora.setOperador("");
        calculadora.calculo();
        assertEquals("ERRO", calculadora.getResultado());
        calculadora.setValor1("2");
        calculadora.setValor2("1");
        calculadora.setOperador("#");
        calculadora.calculo();
        assertEquals("ERRO", calculadora.getResultado());
    }

    @Test
    public void testaLetras(){
        calculadora.setValor1("A");
        calculadora.setValor2("B");
        calculadora.setOperador("+");
        calculadora.calculo();
        assertEquals("ERRO", calculadora.getResultado());
    }

    @Test
    public void testaNumeroGrande(){
        calculadora.setValor1("99999999999999999999999999999999999999999999999999999999999999999999");
        calculadora.setValor2("99999999999999999999999999999999999999999999999999999999999999999999");
        calculadora.setOperador("*");
        calculadora.calculo();
        assertEquals("ERRO", calculadora.getResultado());
    }

    @After
    public void tearDown(){
        calculadora = null;
    }

}
