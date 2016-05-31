package ua.org.oa.homeworkPTMARXVI_192.dyachenko_s;

/**
 * Created by serj27 on 30.05.2016.
 */
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book {" +
                "Title = " + title + '\'' +
                ", Author = " + author + '\'' +
                ", Year = " + year +
                '}' + '\n';
    }
}
