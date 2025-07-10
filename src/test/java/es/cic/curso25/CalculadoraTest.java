package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);


        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        Calculadora cut = new Calculadora();

        cut.restar(3);

        double valorActual = cut.getTotal();
        assertEquals(-3.0d, valorActual, 0.000001);
    }

     @Test
    public void testMultiplicar() {
        Calculadora cut = new Calculadora();

        cut.multiplicar(3);

        double valorActual = cut.getTotal();
        assertEquals(0.0d, valorActual, 0.000001);
    }

     @Test
    public void testDividir() {
        Calculadora cut = new Calculadora();

        cut.dividir(3);

        double valorActual = cut.getTotal();
        assertEquals(0.0d, valorActual, 0.000001);
    }

     @Test
     void testLimpiar() {
        Calculadora cut = new Calculadora();
        cut.sumar(3);

        cut.limpiar();

        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
     }
}
