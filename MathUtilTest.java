package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*  Testa as propriedades do MDC
    https://pt.wikipedia.org/wiki/M%C3%A1ximo_divisor_comum
*/

class MathUtilTest {

    @Test
    void mdcP1Pares(){
        final int a = 6, b=2;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP1Impar(){
        final int a = 12, b=3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP2(){
        ///implementar

    }


    @Test
    void mdcP3Negativo(){
        final int a = -5, b=0;
        final int esperado = 5;
        final int obtido = MathUtil.mdc(a, b);
        System.out.println("Esperado: "+ esperado + " Obtido: "+obtido);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP3Positivo(){
        final int a = 5, b=0;
        final int esperado = 5;
        final int obtido = MathUtil.mdc(a, b);
        System.out.println("Esperado: "+ esperado + " Obtido: "+obtido);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP6Positivo(){
        final int a = 2, b=6;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, b);
        System.out.println("Esperado: "+ esperado + " Obtido: "+obtido);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP8Par() {
        final int a = 10;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP8MaiorInteiroPossivel() {
        final int a = Integer.MAX_VALUE;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }


}
