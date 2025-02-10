package programmingtheorem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterAlgorythmTest {

    @Test
    void testFilterAlgorythm_withEmptyArray() {
        // Arrange
        int[] numbers = {};
        int[] expected = {};
        // Act
        int[] actual = FilterAlgorythm.filter(numbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withNullArray() {
        // Arrange
        int[] numbers = null;
        int[] expected = null;
        // Act
        int[] actual = FilterAlgorythm.filter(numbers);
        // Assert
        assertArrayEquals (expected, actual);
    }

    @Test
    void testFilter_withNullArray2() {
        // Arrange
        int[] testNumbers = null;
        int[] expected = null;
        // Act
        int[] actual = FilterAlgorythm.filter(testNumbers);
        // Assert
        assertNull(actual);
    }
    @Test
    void testFilter_withOneOddElement() {
        // Arrange
        int[] testNumbers = {};
        int[] expected = {};
        // Act
        int[] actual = FilterAlgorythm.filter (testNumbers);
        // Assert
        assertArrayEquals (expected, actual);
    }

    @Test
    void testFilter_withOneElement() {
        // Arrange
        int[] testNumbers1 = {1};
        int[] testNumbers2 = {};
        int[] expected1 = {};
        int[] expected2 = {2};
        // Act
        int[] actual1 = FilterAlgorythm.filter(testNumbers1);
        int[] actual2 = FilterAlgorythm.filter(testNumbers2);
        // Assert
        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);

    }

    @Test
    void testFilter_withOnlyEvenElements() {
        // Arrange
        int[] testNumbers = {2, 4, 6, 8, 10};
        int[] expected = {2, 4, 6, 8, 10};
        // Act
        int[] actual = FilterAlgorythm.filter(testNumbers);
        // Assert
        assertArrayEquals (expected, actual);
    }

    @Test
    void testFilter_withMixedElements() {
        //Arrange
        int[] testNumbers = {1, 2, 3, 5, 11, 101, 6};
        int[] expected = {1, 2, 3, 5, 11, 101, 6};
       // Act
        int[] actual = FilterAlgorythm.filter(testNumbers);
        /*Array.sort(expected);
        Array.sort(actual); */
        // Assert
        assertArrayEquals (expected, actual);
    }

    @Test
    void testFilter_withMixedElementsIncludingZero() {
        int[] testNumbers = {1, 2, 3, 5, 11, 101, 6};
        int[] expected = {1, 2, 3, 5, 11, 101, 6};
        int[] actual = FilterAlgorythm.filter(testNumbers);
        assertArrayEquals (expected, actual);

    }
}