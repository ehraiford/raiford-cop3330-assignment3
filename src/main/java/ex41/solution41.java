package ex41;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class solution41 {
    public static void main(String[] args){
        //try in case file can't be opened
        try {
            //create file in for in.txt file.
            File inFile = new File("src/main/resources/exercise41_input.txt");
            //create output for text
            PrintWriter out = new PrintWriter("exercise41_output.txt");
            //new scanner reading from file
            Scanner in = new Scanner(inFile);

            //create people object
            People group = new People();
            //while loop as long as the scanner has another thing  to read
            while(in.hasNext()) {
                //create person
                Person individual = new Person();
                //take input from file for last name
                individual.setLastName(in.next());
                //replace comma
                individual.setLastName((individual.getLastName()).replace("," , ""));
                //take input from file for first name
                individual.setFirstName(in.next());
                //add a person
                group.addPerson(individual);
            }

            //call sort function for list
            group.sortPeople();

            //generate String from info
            StringBuilder output = new StringBuilder();
            output = group.generateOutput();

            //write output to file
            out.println(output.toString());
            //close output file
            out.close();

        //catch for if file can't be read
        }catch(IOException e){
            System.out.println("Error reading txt file. " + e);
        }
    }

    public static String replaceComma(String lastName) {
        lastName = lastName.replace("," , "");
        return lastName;
    }

}
