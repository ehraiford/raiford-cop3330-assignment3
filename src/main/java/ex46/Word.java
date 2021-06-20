package ex46;

public class Word {
    private String word;
    private String instances;

    public Word(String word) {
        this.word = word;
        this.instances = "*";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getInstances() {
        return instances;
    }

    public void incrementInstances() {
       this.instances = this.instances + "*";
    }
}
