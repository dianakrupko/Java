import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String name_book;
    private String author;
    private String publication;
    private int year;
    private float price;

    public Book(String name_book, String author, String publication, int year, float price) {
        this.name_book = name_book;
        this.author = author;
        this.publication = publication;
        this.year = year;
        this.price = price;
    }

    public int year() {
        return year;
    }

    public float price() {
        return price;
    }

    public String author() {
        return author;
    }


    @Override
    public String toString() {
        return name_book + "\t" + author + "\t" + publication + "\t" + year + "\t" + price;
    }
}
