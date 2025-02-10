package programmingtheorem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    // Triple A módszer tesztelése
    @Test
    void testCountOdd() {
        // arrange: felállítunk egy bemenő paraméterként egy inputot, valamint definiáljuk az elvárt outputot
        int [] testNumbers = new int []{1, 2, 3,4, 5};
        int expected = 3;
        //act: ahol meghyvjuk a metódust
        int actual = Counting.countOdd(testNumbers);
        // assert: ellenőrizzük,hogy az elvárt és az aktuális megegyezik-e
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given epmty array, when calling count odd, then return stb. ")
    void givenEmptyArray_whenCallingCountOdd_theReturnNoSuchElementException() {
        // Given
        // When
        // Then
    }

}