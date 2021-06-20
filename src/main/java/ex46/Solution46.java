package ex46;

import java.io.File;
import java.util.Scanner;

public class Solution46 {

    public static void main(String[] args) {
        //try in case file can't be opened
        try {
            //create file for in.txt
            File infile = new File("src/main/resources/exercise46_input.txt");
            //Scanner in from inFile
            Scanner in = new Scanner(infile);
            //create new words object
            Words words = new Words();
            //while loop as long as there is more to read from the text file
            while(in.hasNext())
                //add all words from text file to string array
                words.addToList(in.next());
            //Call generate list method
            words.generateWords();
            //organize words
            words.organizeWords();
            //print out histograms
            words.printHistograms();

        } catch(Exception e){
            //print error if file can't be opened.
            System.out.println("Error opening file. " + e);
        }
    }
}
