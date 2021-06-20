package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution43Test {
    @Test
    void parseBoolean_returns_true_for_y(){
        assertTrue(solution43.parseBoolean("y"));
    }

    @Test
    void parseBoolean_returns_true_for_Y(){
        assertTrue(solution43.parseBoolean("Y"));
    }

    @Test
    void parseBoolean_returns_true_for_yes(){
        assertTrue(solution43.parseBoolean("yes"));
    }
    @Test
    void parseBoolean_returns_true_for_YES(){
        assertTrue(solution43.parseBoolean("YES"));
    }

    @Test
    void parseBoolean_returns_true_for_Yes(){
        assertTrue(solution43.parseBoolean("Yes"));
    }

    @Test
    void parseBoolean_returns_false_for_no_input(){
        assertFalse(solution43.parseBoolean(""));
    }

    @Test
    void parseBoolean_returns_false_for_no(){
        assertFalse(solution43.parseBoolean("no"));
    }

    @Test
    void parseBoolean_returns_false_for_non_yes_no_input(){
        assertFalse(solution43.parseBoolean("computerScience"));
    }


}
