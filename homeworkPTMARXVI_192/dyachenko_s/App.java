package ua.org.oa.homeworkPTMARXVI_192.dyachenko_s;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by serj27 on 30.05.2016.
 */
public class App {

    public static void main(String[] args) {


        FillFile.addBook("C:\\Users\\serj27\\IdeaProjects\\Practice\\Books.txt", new Book("How I spend my Holidays", "Ivan Pupkin", 2016));

        List<Book> myBookList = FillFile.readBooksFromFile("C:\\Users\\serj27\\IdeaProjects\\Practice\\Books.txt");
        System.out.println(myBookList.toString());

        File file = new File("C:\\Users\\serj27\\IdeaProjects\\Practice");
        System.out.println(Arrays.toString(file.list()));

        System.out.println(myBookList.toString());
    }
}