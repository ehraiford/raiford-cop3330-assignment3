package ex44;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args){
        //declare inventory array
        Inventory list = new Inventory();
        //try statement opening json file
        try{
            //create JSON parser
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(new FileReader("src/main/resources/exercise44_input.json"));
            JSONArray array = (JSONArray) obj.get("products");
            //  for loop for each item in the json array
            for(Object item : array){
                //cast item to json object
                JSONObject productJS = (JSONObject) item;
                //create new product
                Product sku = new Product();
                //take name from json and add it to product
                sku.setName((String) productJS.get("name"));
                //take price from json and add it to product
                sku.setPrice((double) productJS.get("price"));
                //take quantity from json and add it to product
                sku.setQuantity((Long) productJS.get("quantity"));
                //add product to inventory array
                list.addProduct(sku);
            }
            seekProduct(list);
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void seekProduct(Inventory list) {
        //new scanner for user input
        Scanner in = new Scanner(System.in);

        //set spot to -1
        int spot = -1;

        //while boolean is false
        while(spot == -1) {
            //ask user for product name
            System.out.println("What is the product name?");
            //take input as string
            String input = in.nextLine();
            //find index of item
            spot = findIndex(input, list.getIndex());
            //print message if item not found
            if (spot == -1) {
                System.out.println("Sorry, that product was not found in our inventory.");
            } else  // print item info
                printInfo(list.getIndex().get(spot));

        }
    }

    //findIndex is heart of the program. It searches through the index for the string
    //and returns a value telling the program what to do next.
    public static int findIndex(String input, ArrayList<Product> index) {
        //loop through list comparing name to input
        for (int ticker = 0; ticker < index.size(); ticker++) {
            //return spot if items match
            if(input.compareTo(index.get(ticker).getName()) == 0) {
               return ticker;
            }
        }
        //return -1 if item isn't in list
        return -1;
    }

    public static void printInfo(Product item) {
        System.out.println("Name: " + item.getName());
        System.out.printf("Price: %.2f\n", item.getPrice());
        System.out.println("Quantity: " + item.getQuantity());
    }
}
