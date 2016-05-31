package ua.org.oa.homeworkPTMARXVI_192.dyachenko_s;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serj27 on 30.05.2016.
 */
public class FillFile {
    public static List<Book> readBooksFromFile(String path) {
        StringBuilder stringBuilder = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));) {
            stringBuilder = new StringBuilder();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append("\n");
            }
            string = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String beforeRegex = stringBuilder.toString();
        List<Book> bookList = new ArrayList<>();

        String regularExpr = "\\n{0,1}(\\W*);(\\W*\\d*);(-{0,1}\\d{1,4})";
        Pattern pattern = Pattern.compile(regularExpr);
        Matcher matcher = pattern.matcher(beforeRegex);
        while (matcher.find()) {
            bookList.add(new Book(matcher.group(2), matcher.group(1), Integer.valueOf(matcher.group(3))));
        }
        return bookList;

    }


    public static void addBook(String path, Book book) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(book.getAuthor()).append(';').append(book.getTitle()).append(';').append(book.getYear());
        String temp = stringBuilder.toString();

        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true), "UTF-8"));){
            br.newLine();
            br.write(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
