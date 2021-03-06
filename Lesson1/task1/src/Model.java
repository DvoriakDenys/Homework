public class Model {

    private String firstWord;
    private String secondWord;

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    @Override
    public String toString() {
        return String.format("'%s %s!'", this.getFirstWord(), this.getSecondWord());
    }
}
