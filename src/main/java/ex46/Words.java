package ex46;

import java.util.ArrayList;
import java.util.Collections;

public class Words {
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<Word> words = new ArrayList<>();

    public void generateWords() {
        //add first list word to words
        Word firstWord = new Word(this.list.get(0));
        this.words.add(firstWord);
        //for loop going through every word in list
        for(int ticker = 1; ticker < list.size(); ticker++){
            //set found to false
            boolean found = false;
            //loop comparing each list word to words arraylist
            for(int ticker2 = 0; ticker2 < words.size(); ticker2++) {
                //if word is already on list, increment count by one, set found to true
                if (this.words.get(ticker2).getWord().compareTo(this.list.get(ticker)) == 0) {
                    this.words.get(ticker2).incrementInstances();
                    found = true;
                }
            }
            //if not, generate a new word for it and add it to words
                if(found == false){
                    Word wordFromList = new Word(this.list.get(ticker));
                    this.words.add(wordFromList);
                }
        }
    }
    public void organizeWords() {
        //nested for loop comparing instances of each word to every other
        for (int ticker = 0; ticker < this.words.size(); ticker++) {
            for (int ticker2 = 0; ticker2 < this.words.size(); ticker2++) {
                //swap words if second has more instances than the first
                if (this.words.get(ticker2).getInstances().compareTo(this.words.get(ticker).getInstances()) < 0)
                    Collections.swap(this.words, ticker, ticker2);
            }
        }
    }
    public void printHistograms() {
        String spaces;
        //for loop printing the name of the item properly spaced from its histogram
        for (int ticker = 0; ticker < this.words.size(); ticker++) {
            spaces = generateSpaces(this.words.get(ticker).getWord());
            System.out.println(this.words.get(ticker).getWord() + spaces + this.words.get(ticker).getInstances());
        }
    }

    public String generateSpaces(String word) {
        String spaces = ":";
        //if word is too long just return :
        if(word.length() >= 9)
            return spaces;
        //find number of spaces needed
        int num = 9 - word.length();
        //add another space for each space needed
        for(int ticker = 0; ticker < num; ticker++)
            spaces = spaces + " ";
        //return spaces
        return spaces;
    }

    public ArrayList<String> getList(){
        return list;
    }
    public void addToList(String string) {
       this.list.add(string);
    }

    public ArrayList<Word> getWords() {
        return words;
    }
    public void addWord(Word word) {
        this.words.add(word);
    }
}
