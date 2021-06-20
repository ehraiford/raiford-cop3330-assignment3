package ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void sort_people_reorders_alphabetically(){
        People instance = new People();
        Person gary = new Person();
        gary.setLastName("Zedson");
        gary.setFirstName("Gary");
        instance.addPerson(gary);
        Person larry = new Person();
        larry.setFirstName("Larry");
        larry.setLastName("Albertson");
        instance.addPerson(larry);
        Person jerry = new Person();
        jerry.setLastName("Monroe");
        jerry.setFirstName("Jerry");
        instance.addPerson(jerry);

        instance.sortPeople();

        assertTrue(instance.getPerson(0) == larry);
        assertTrue(instance.getPerson(1) == jerry);
        assertTrue(instance.getPerson(2) == gary);

    }

    @Test
    void generateoutput_builds_string_from_given_names(){
        People instance = new People();
        Person gary = new Person();
        gary.setLastName("Zedson");
        gary.setFirstName("Gary");
        instance.addPerson(gary);
        Person larry = new Person();
        larry.setFirstName("Larry");
        larry.setLastName("Albertson");
        instance.addPerson(larry);
        Person jerry = new Person();
        jerry.setLastName("Monroe");
        jerry.setFirstName("Jerry");
        instance.addPerson(jerry);

        StringBuilder string = instance.generateOutput();

        assertEquals("Total of 3 names\n----------------\nZedson, Gary\nAlbertson, Larry\nMonroe, Jerry\n", string.toString());
    }
}