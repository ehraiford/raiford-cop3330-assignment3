package ex42;

import ex41.People;
import ex41.Person;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class solution42 {
    public static void main(String[] args){

        try {
            //create file in for in.txt file.
            File inFile = new File("src/main/resources/exercise42_input.txt");
            PrintWriter out = new PrintWriter("exercise42_output.txt");
            //new scanner reading from file
            Scanner in = new Scanner(inFile);

            //create people object
            Employees group = new Employees();
            //while loop as long as the scanner has another thing  to read
            while(in.hasNext()) {
               //receive line from file
                String received = in.next();
                //generate new person
                Employee individual = new Employee();
                //pass string into function to separate into a person
                individual = parseInfo(received);
                //add person to group
                group.addEmployee(individual);
            }

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

    public static Employee parseInfo(String received) {
        //create new person
        Employee individual = new Employee();
        //split string into array using split with , as delimiter
        String[] info = received.split(",");
        //first input is last name
        individual.setLastName(info[0]);
        //second input is first name
        individual.setFirstName(info[1]);
        //third input is salary
        individual.setSalary(Integer.parseInt(info[2]));
        //return employee
        return individual;
    }
}
