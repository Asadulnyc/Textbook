public class Book {
    private String title;

    private double price;

    public Book(String bookTitle, double bookPrice) {
        titel = bookTitle;
        price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getBookInfo() {
        return title + "-" + price;
    }
}

public class Textbook extends Book {
    private int edition;

    public Textbook(String bTitle, double bPrice, int num) {
        super(bTitle, bPrice);
        edition = num;
    }

    public boolean canSubstituteFor(Textbook b) {
        return (this.getTitle.equals(b.getTitle) && this.getEdition==b.getEdition);
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + edition;
    }
}