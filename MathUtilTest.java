import org.example.MathUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
      "-5,0",
      "5,0"
    })


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

    @Test
    void mdcP4() {
        final int m = 3, a = 2, b = 4;
        final int esperado = MathUtil.mdc(m*a, m*b);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP12PrimosIguais(){
        final int p=7, a = p;
        final int esperado = p;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP12PrimosDiferentes(){
        final int p=1, a = 3;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcCasoGeral(){
        final int a=30, b = 12, c = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcTresValores(){
        final int a=30, b = 12, c = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcNenhumValor(){

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                MathUtil::mdc();
        );
        /*
        try{
            MathUtil.mdc();
            //fail("Era esperado ua exceção, mas não ocorreu");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tudo certo");
        } */
    }
}
