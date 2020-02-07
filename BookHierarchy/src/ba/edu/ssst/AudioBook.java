package ba.edu.ssst;

public class AudioBook extends Book {
    private final int size;
    private final int length;
    private final String artistName;

    public AudioBook(String title, int year, String author, int size, int length, String artistName) {
        super(title, year, author);
        this.size = size;
        this.length = length;
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBook size(in MB): " + this.size
                + "\nBook play length: " + this.length
                + "\nPlayback artist's name: " + this.artistName;
    }
}
