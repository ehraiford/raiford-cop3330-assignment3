package ex41;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class People {
    private ArrayList<Person> list = new ArrayList<>();

    public void addPerson(Person individual){
        this.list.add(individual);
    }

    public Person getPerson(int i){
        return this.list.get(i);
    }

   public void sortPeople(){
        //nested for loop to compare each last name to every other last name
       for(int ticker = 0; ticker < this.list.size(); ticker++){
           for(int ticker2 = 0; ticker2< this.list.size(); ticker2++){
               //if second last name is higher alphabetically than first, swap them.
               if(this.list.get(ticker2).getLastName().compareTo(this.list.get(ticker).getLastName()) > 0)
                   Collections.swap(this.list, ticker, ticker2);
               //if last name is the name compare first name instead
               if(this.list.get(ticker2).getLastName().compareTo(this.list.get(ticker).getLastName()) == 0)
                   if(this.list.get(ticker2).getFirstName().compareTo(this.list.get(ticker).getFirstName()) > 0)
                       Collections.swap(this.list, ticker, ticker2);
           }
       }
   }

    public StringBuilder generateOutput() {
        //new stringbuilder with overall info
        StringBuilder output = new StringBuilder("Total of " + this.list.size() + " names\n");
        output.append("----------------\n");
        //for loop adding every person to stringbuilder
        for(int ticker = 0; ticker < this.list.size(); ticker++){
            output.append(this.list.get(ticker).getLastName() + ", ");
            output.append(this.list.get(ticker).getFirstName() + "\n");
        }
        //return output
        return output;
    }
}
