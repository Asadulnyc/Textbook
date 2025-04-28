
public class Textbook extends Book {
    private int edition;

    public Textbook(String bTitle, double bPrice, int num) {
        super(bTitle, bPrice);
        edition = num;
    }

    public boolean canSubstituteFor(Textbook b) {
        return (this.getTitle().equals(b.getTitle()) && this.getEdition()>=b.getEdition());
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + getEdition();
    }
}