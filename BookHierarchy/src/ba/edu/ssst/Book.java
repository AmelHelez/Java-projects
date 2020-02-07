package ba.edu.ssst;

public class Book {
    private final String title;
    private final int year;
    private final String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book title: " + this.title + "\nYear of production: " + this.year
                + "\nAuthor name: " + this.author;
    }
}
