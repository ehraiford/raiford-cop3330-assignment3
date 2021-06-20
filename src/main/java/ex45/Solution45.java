package ex45;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        //try in case file can't be opened
        try {
            //create file for in.txt
            File inFile = new File("src/main/resources/exercise45_input.txt");
            //Scanner in from inFile
            Scanner in = new Scanner(inFile);
            //create output for text
            PrintWriter out = new PrintWriter("exercise45_output.txt");
            //create phrase object
            Phrase info = new Phrase();
            //set original word to utilize
            info.setOriginal("utilize");
            //set replacement to use
            info.setReplacement("use");

            //while loop as long as there is more to read from the text file
            while(in.hasNext())
                    //add line to info phrase
                    info.setOriginalPhrase(info.getOriginalPhrase() + in.nextLine() + "\n");

            //call replacing method
            info.createReplacedPhrase();
            //print new phrase to output
            out.println(info.getNewPhrase());
            //close output
            out.close();

        } catch (Exception e) {
            //print error if file can't be opened.
            System.out.println("Error opening file. " + e);
        }
    }
}
