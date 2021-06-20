package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

    @Test
    void generateSpacing_returns_empty_for_long_word() {
        Employees emps = new Employees();
        StringBuilder actual = emps.generateSpacing("ThisStringisTooLong");

        assertTrue(actual.isEmpty());
    }

    @Test
    void generateSpacing_returns_proper_spaces() {
        Employees emps = new Employees();
        StringBuilder actual = emps.generateSpacing("Gary");

        assertTrue(actual.toString().compareTo("      ") == 0);
    }

    @Test
    void generateSpacing_returns_proper_spaces_smaller_word() {
        Employees emps = new Employees();
        StringBuilder actual = emps.generateSpacing("I");

        assertTrue(actual.toString().compareTo("         ") == 0);
    }

    @Test
    void generateSpacing_returns_empty_for_ten_character_word() {
        Employees emps = new Employees();
        StringBuilder actual = emps.generateSpacing("Characters");

        assertTrue(actual.isEmpty());
    }
}