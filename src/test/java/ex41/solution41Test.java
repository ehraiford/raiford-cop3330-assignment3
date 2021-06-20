package ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution41Test {

    @Test
    void replaceComma_removes_comma(){
        solution41 instance = new solution41();
        String actual = solution41.replaceComma("Gary,");
        assertEquals("Gary", actual.toString() );
    }

    @Test
    void replaceComma_removes_multiple_commas(){
        solution41 instance = new solution41();
        String actual = solution41.replaceComma(",,,Tub,,,,man,");
        assertEquals("Tubman", actual.toString() );
    }

    @Test
    void replaceComma_does_not_affect_commaless_strings(){
        solution41 instance = new solution41();
        String actual = solution41.replaceComma("This string has no commas");
        assertEquals("This string has no commas", actual.toString() );
    }
}