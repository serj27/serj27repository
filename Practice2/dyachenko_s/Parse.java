package ua.org.oa.Practice2.dyachenko_s;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serj27 on 11.04.2016.
 */
public class Parse {



    static String getData(String source)  {
        File file = new File(source);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
            try {
                String s;
                while ((s = br.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                br.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
        return sb.toString();
    }

     static String encodingFile(String source, String encoding) {
        File file = new File(source);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(source),encoding));
            String s;
            while ((s = br.readLine()) != null) {
                sb.append(s).append(System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }




    static void solutionTask(String source, String encoding) {
        String regularExpression =
                "class=\"item_name\".*?title=\"(.*?)\">" +
                "<p class=\"description\">(.*?\\s*.*?)<br \\/>" +
                "<span class=\"price cost\">(\\d{4,5}).*?<\\/span>" +
                "Гарантия:<\\/a>\\s*(.*?)<\\/p>";

        String textFile = Parse.encodingFile(source,encoding);
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(textFile);
        List<Notebook> notebooks = new ArrayList<>();

        while (matcher.find()) {
            int price = Integer.valueOf(matcher.group(3));
            notebooks.add(new Notebook(matcher.group(1), matcher.group(2), price, matcher.group(4)));
        }
        System.out.println("List of Notebooks: " + notebooks);

          }
  }

