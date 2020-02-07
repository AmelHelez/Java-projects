package ba.edu.ssst;

public class PrintBook extends Book {
    private final String publisher;
    private final int ISBN;

    public PrintBook(String title, int year, String author, String publisher,int ISBN) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPublisher: " + this.publisher + "\nISBN: " + this.ISBN;
    }
}
