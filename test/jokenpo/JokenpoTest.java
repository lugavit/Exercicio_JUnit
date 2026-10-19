package jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokenpoTest {

    private Jokenpo jokenpo;

    @BeforeEach
    void setUp() {
        jokenpo = new Jokenpo();
    }

    @Test
    void returnsDrawWhenBothPlayersChooseTheSameOption() {
        assertEquals(0, jokenpo.jogar(1, 1));
        assertEquals(0, jokenpo.jogar(2, 2));
        assertEquals(0, jokenpo.jogar(3, 3));
    }

    @Test
    void returnsPlayerOneAsWinnerForEachWinningCombination() {
        assertEquals(1, jokenpo.jogar(1, 2));
        assertEquals(1, jokenpo.jogar(2, 3));
        assertEquals(1, jokenpo.jogar(3, 1));
    }

    @Test
    void acceptsZeroAsPlayerOnesChoiceInTheCurrentImplementation() {
        assertEquals(1, jokenpo.jogar(0, 1));
    }

    @Test
    void returnsPlayerTwoAsWinnerForEachWinningCombination() {
        assertEquals(2, jokenpo.jogar(2, 1));
        assertEquals(2, jokenpo.jogar(3, 2));
        assertEquals(2, jokenpo.jogar(1, 3));
    }

    @Test
    void returnsMinusOneWhenEitherOptionIsOutsideTheSupportedRange() {
        assertEquals(-1, jokenpo.jogar(-1, 1));
        assertEquals(-1, jokenpo.jogar(4, 1));
        assertEquals(-1, jokenpo.jogar(1, 0));
        assertEquals(-1, jokenpo.jogar(1, 4));
    }
}
