package ex45;

import java.io.File;

public class Solution45 {
    public static void main(String[] args) {
        //try in case file can't be opened
        try {
            //create file for in.txt
            File inFile = new File("src/main/resources/exercise45_input.txt");
        } catch (Exception e) {
            System.out.println("Error opening file. " + e);
        }
    }
}
