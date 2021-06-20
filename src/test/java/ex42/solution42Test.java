package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution42Test {

    @Test
    void parseInfo_returns_person_from_string(){
        Employee john = solution42.parseInfo("Williams,John,120000");
        assertEquals("Williams", john.getLastName());
        assertEquals("John", john.getFirstName());
        assertEquals(120000, john.getSalary());

    }

}