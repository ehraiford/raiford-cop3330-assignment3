package ex43;

import java.io.File;
import java.util.Scanner;

public class solution43 {
    public static void main(String[] args){
        //create scanner for user input
        Scanner in = new Scanner(System.in);

        //generate new website
        Website website = new Website();
        //create folder for overarching folder and add to list
        Folder websiteFolder = new Folder();
        website.setName("");
        websiteFolder.setPath("website");
        website.addFolder(websiteFolder);

        //prompt for name of site
        System.out.println("Site name:");
        //receive name as string
        website.setName(in.nextLine());
        //create folder for websitename and add to list
        Folder websiteName = new Folder();
        websiteName.setName(website.getName());
        websiteName.setPath("website/" + website.getName());
        website.addFolder(websiteName);

        //prompt for author name
        System.out.println("Author:");
        //set author name as received string
        website.setAuthor(in.nextLine());
        //prompt for javascript folder
        System.out.println("Do you want a folder for JavaScript?");
        //receive input
        String input = in.next();
        //generate js folder based on user input and add to list
        if(parseBoolean(input) == true){
            Folder js = new Folder();
            js.setName("js");
            js.setPath("website/" + website.getName() + "/js");
            website.addFolder(js);
        }
        //prompt for css folder
        System.out.println("Do you want a folder for CSS?");
        //receive input
        String cssInput = in.next();
        //generate css folder based on user input and add to list
        if(parseBoolean(cssInput) == true){
            Folder css = new Folder();
            css.setName("css");
            css.setPath("website/" + website.getName() + "/css");
            website.addFolder(css);
        }
        //create folders based on all input
        website.generateDirectories();
        //generate html file with proper info in metadata
        website.generateHTML();

    }

    public static Boolean parseBoolean(String input) {
        //compare input to variations of yes and return true if they match
        if(input.compareTo("y") == 0)
            return true;
        if(input.compareTo("YES") == 0)
            return true;
        if(input.compareTo("yes") == 0)
            return true;
        if(input.compareTo("Yes") == 0)
            return true;
        if(input.compareTo("Y") == 0)
            return true;
        //return false if input doesn't match possible yes variations
        return false;
    }
}
