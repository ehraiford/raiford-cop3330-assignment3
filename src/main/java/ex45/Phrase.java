package ex45;

public class Phrase extends SearchWord {
    private String originalPhrase = "";
    private String newPhrase;

    public String getNewPhrase() {
        return newPhrase;
    }
    //all of the "logic" for the program. Creates a new string where all instances of the original word are replaced with the new one.
    public void createReplacedPhrase() {
       this.newPhrase = this.originalPhrase.replace(this.getOriginal(), this.getReplacement());
    }

    public String getOriginalPhrase() {
        return originalPhrase;
    }

    public void setOriginalPhrase(String originalPhrase) {
        this.originalPhrase = originalPhrase;
    }


}
