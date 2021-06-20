package ex43;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Website {
    private String name;
    private String author;
    private ArrayList<Folder>  folders = new ArrayList<>();

    public void generateDirectories() {
        //generate folder for every object in folder list
        for (int ticker = 0; ticker < folders.size(); ticker++) {
            File generated = new File(folders.get(ticker).getPath());
            generated.mkdir();
        }
    }
    public void generateHTML() {
        try {
            //create html index file within website's folder
            PrintWriter html = new PrintWriter("website/" + name +"/index.html");
            //fill file with template information along with name and author from main
            html.println("<html lang=\"en\">\n<head>\nmeta charset=\"utf-8\">");
            html.println("<title>" + name + "</title>");
            html.println("<meta name= \"author\" content=\"" + author + "\">\n");
            html.println(" <link rel=\"stylesheet\" href=\"css/styles.css?v=1.0\">\n\n");
            html.println("</head>\n\n<body>\n  <script src=\"js/scripts.js\"></script>\n");
            html.println("</body>\n</html>");
            //print error if index cannot be created.
        } catch (IOException e) {
            System.out.println("Failed to create index file.\n" + e);
        }
    }
    public void addFolder(Folder added){
        folders.add(added);
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
