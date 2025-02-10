package programmingtheorem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionAlgorithmTest {
    @Test
    public void testDecideIfNumIsEven_withEvenNumbers() {
        // Arrange
        int[] numbers = {2, 3, 6, 1};
        boolean expected = true;

        // Act
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);

        // Assert
        assertEquals (expected, actual);
    }

    @Test
    public void testDecideIfNumIsEven_withEvenNumbers() {
        // Arrange
        int[] numbers = {2,3,6,1};
        boolean expected = true;

        // Act
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDecideIfNumIsOdd_withOddNumbersOnly() {
        int[] numbers = {1,3,5};
        boolean expected = true;
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);
        assertEquals (expected, actual);
    }

    @Test
    public void testDecideIfNumIsEven_withMixNumbers() {
        int[] numbers = {1,2};
        boolean expected = true;
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);
        assertEquals (expected, actual);
    }

    @Test
    public void testDecideIfNumIsOdd_withOneNumbers() {
        int[] numbers = {1};
        boolean expected = true;
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);
        assertEquals (expected, actual);

    }

    @Test
    public void testIfNumEven_withEvenNumbers() {
        int[] numbers = {2,3,6,1};
        boolean expected = true;
        boolean actual = DecisionAlgorithm.deideIfnumIsEven (numbers);
        assertEquals (expected, actual);

    }

}