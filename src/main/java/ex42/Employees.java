package ex42;

import java.util.ArrayList;

public class Employees {
    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee individual){
        this.list.add(individual);
    }

    public Employee getEmployee(int i){
        return this.list.get(i);
    }


    public StringBuilder generateOutput() {
        //new stringbuilder with overall info
        StringBuilder output = new StringBuilder("Last      First     Salary\n");
        output.append("--------------------------\n");
        //for loop adding every employee to stringbuilder
        for(int ticker = 0; ticker < this.list.size(); ticker++){
            //add last name and spacing
            output.append(this.list.get(ticker).getLastName());
            output.append(generateSpacing(this.list.get(ticker).getLastName()));
            //add first name and spacing
            output.append(this.list.get(ticker).getFirstName());
            output.append(generateSpacing(this.list.get(ticker).getFirstName()));
            //add salary
            output.append(this.list.get(ticker).getSalary() + "\n");
        }
        //return output
        return output;
    }

    public StringBuilder generateSpacing(String word) {
        //generate new stringbuilder
        StringBuilder spaces = new StringBuilder();
        //return empty stringbuilder if word already is at or over length
        if(word.length() >= 10)
            return spaces;
        //add on a space until word + spaces = 10
        for(int ticker = word.length(); ticker < 10; ticker++)
            spaces.append(" ");
        //return stringbuilder
        return spaces;
    }
}
