package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseTest {

    @Test
    void CreateReplacedPhrase_replaces_instances_of_word_in_quotations() {
        Phrase instance = new Phrase();
        instance.setOriginalPhrase("This phrase has \"word\" in  quotations.");
        instance.setOriginal("word");
        instance.setReplacement("string");

        instance.createReplacedPhrase();

        assertTrue(instance.getNewPhrase().compareTo("This phrase has \"string\" in  quotations.") == 0);
    }

    @Test
    void CreateReplacedPhrase_replaces_instances_of_word_within_other_words() {
        Phrase instance = new Phrase();
        instance.setOriginalPhrase("Swords and sorcery");
        instance.setOriginal("word");
        instance.setReplacement("nail");

        instance.createReplacedPhrase();

        assertTrue(instance.getNewPhrase().compareTo("Snails and sorcery") == 0);
    }

    @Test
    void CreateReplacedPhrase_replaces_all_instances_of_word() {
        Phrase instance = new Phrase();
        instance.setOriginalPhrase("I want to go to Disney to see all of the ducks.");
        instance.setOriginal("to");
        instance.setReplacement("to never");

        instance.createReplacedPhrase();

        assertTrue(instance.getNewPhrase().compareTo("I want to never go to never Disney to never see all of the ducks.") == 0);
    }
}
