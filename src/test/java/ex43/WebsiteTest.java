package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    void generateHTML_creates_folder_under_proper_directory(){
        Website website = new Website();
        website.setName("generic");
        website.setAuthor("name");
        Folder web = new Folder();
        web.setPath("website");
        website.addFolder(web);
        Folder site = new Folder();
        site.setPath("website/generic");
        website.addFolder(site);
        website.generateDirectories();
        website.generateHTML();

        File file = new File("website/generic/index.html");

        assertTrue(file.exists());
    }

    @Test
    void generateDirectories_builds_all_folders(){
        Website website = new Website();
        website.setName("generic");
        website.setAuthor("name");
        Folder web = new Folder();
        web.setPath("website");
        website.addFolder(web);
        Folder site = new Folder();
        site.setPath("website/generic");
        website.addFolder(site);
        Folder other = new Folder();
        other.setPath("website/other");
        website.addFolder(other);
        Folder deep = new Folder();
        deep.setPath("website/generic/deep");
        website.addFolder(deep);
        website.generateDirectories();

        File webF = new File("website");
        File siteF = new File("website/generic");
        File otherF = new File("website/other");
        File deepF = new File("website/generic/deep");
        assertTrue(webF.exists());
        assertTrue(siteF.exists());
        assertTrue(otherF.exists());
        assertTrue(deepF.exists());
    }
}