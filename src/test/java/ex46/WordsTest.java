package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WordsTest {

    @Test
    void createSpaces_returns_proper_spaces(){
        Words instance = new Words();

        assertTrue(instance.generateSpaces("FOUR").compareTo(":     ") == 0);
    }

    @Test
    void createSpaces_returns_colon_when_string_is_too_long(){
        Words instance = new Words();

        assertTrue(instance.generateSpaces("HoneyBadger").compareTo(":") == 0);
    }

    @Test
    void organizeWords_sorts_by_histogram() {
        Words instance = new Words();
        Word cashew = new Word("cashew");
        instance.addWord(cashew);
        Word peanut = new Word("peanut");
        peanut.incrementInstances();
        peanut.incrementInstances();
        instance.addWord(peanut);
        Word almond = new Word("almond");
        almond.incrementInstances();
        almond.incrementInstances();
        almond.incrementInstances();
        almond.incrementInstances();
        instance.addWord(almond);

        instance.organizeWords();

        assertTrue(instance.getWords().get(0).getWord().compareTo("almond") == 0);
        assertTrue(instance.getWords().get(1).getWord().compareTo("peanut") == 0);
        assertTrue(instance.getWords().get(2).getWord().compareTo("cashew") == 0);
    }

    @Test
    void generateWords_creates_words_list(){
        Words instance = new Words();
        instance.addToList("Container");
        instance.addToList("Box");
        instance.addToList("Crate");
        instance.addToList("Container");
        instance.addToList("Container");
        instance.addToList("Crate");
        instance.addToList("Container");
        instance.addToList("Bin");
        instance.generateWords();

        assertTrue(instance.getWords().get(0).getWord().compareTo("Container") == 0);
        assertTrue(instance.getWords().get(1).getWord().compareTo("Box") == 0);
        assertTrue(instance.getWords().get(2).getWord().compareTo("Crate") == 0);
        assertTrue(instance.getWords().get(3).getWord().compareTo("Bin") == 0);
        assertTrue(instance.getWords().get(0).getInstances().compareTo("****") == 0);
        assertTrue(instance.getWords().get(1).getInstances().compareTo("*") == 0);
        assertTrue(instance.getWords().get(2).getInstances().compareTo("**") == 0);
        assertTrue(instance.getWords().get(3).getInstances().compareTo("*") == 0);
    }
}