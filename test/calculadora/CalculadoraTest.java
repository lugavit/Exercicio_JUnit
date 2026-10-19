package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void somaAddsTwoIntegers() {
        assertEquals(9, calculadora.soma(4, 5));
    }

    @Test
    void subtracaoSubtractsTheSecondIntegerFromTheFirst() {
        assertEquals(5, calculadora.subtracao(8, 3));
    }

    @Test
    void multiplicacaoMultipliesTwoIntegers() {
        assertEquals(24, calculadora.multiplicacao(6, 4));
    }

    @Test
    void divisaoDividesTwoIntegers() {
        assertEquals(3, calculadora.divisao(12, 4));
    }

    @Test
    void divisaoByZeroThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(8, 0));
    }

    @Test
    void somatoriaAddsFromZeroThroughTheGivenNumber() {
        assertEquals(0, calculadora.somatoria(0));
        assertEquals(6, calculadora.somatoria(3));
    }

    @Test
    void somatoriaOfNegativeInputIsZero() {
        assertEquals(0, calculadora.somatoria(-1));
    }

    @Test
    void ehPositivoIncludesZeroAndPositiveNumbers() {
        assertTrue(calculadora.ehPositivo(0));
        assertTrue(calculadora.ehPositivo(5));
    }

    @Test
    void ehPositivoRejectsNegativeNumbers() {
        assertFalse(calculadora.ehPositivo(-1));
    }

    @Test
    void comparaReturnsZeroWhenNumbersAreEqual() {
        assertEquals(0, calculadora.compara(4, 4));
    }

    @Test
    void comparaReturnsOneWhenTheFirstNumberIsGreater() {
        assertEquals(1, calculadora.compara(5, 4));
    }

    @Test
    void comparaReturnsMinusOneWhenTheFirstNumberIsSmaller() {
        assertEquals(-1, calculadora.compara(3, 4));
    }
}
