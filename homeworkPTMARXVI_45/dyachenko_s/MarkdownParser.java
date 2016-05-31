package ua.org.oa.homeworkPTMARXVI_45.dyachenko_s;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serj27 on 15.05.2016.
 */
public class MarkdownParser {

    public static String markdownParser (String text) {

        String header6 = "#{6}(.*)";
        String header5 = "#{5}(.*)";
        String header4 = "#{4}(.*)";
        String header3 = "#{3}(.*)";
        String header2 = "#{2}(.*)";
        String header1 = "#{1}(.*)";
        String links = "\\[([^\\[]+)\\]\\(([^\\)]+)\\)";
        String bold =   "(\\*\\*|__)(.*?)\\1";
        String emphas = "(\\*|_)(.*?)\\1";
        String mainText = "(^|\\n)([^#].+)";


        Pattern pattern_main = Pattern.compile(mainText);
        Pattern pattern_header6 = Pattern.compile(header6);
        Pattern pattern_header5 = Pattern.compile(header5);
        Pattern pattern_header4 = Pattern.compile(header4);
        Pattern pattern_header3 = Pattern.compile(header3);
        Pattern pattern_header2 = Pattern.compile(header2);
        Pattern pattern_header1 = Pattern.compile(header1);
        Pattern pattern_links = Pattern.compile(links);
        Pattern pattern_bold = Pattern.compile(bold);
        Pattern pattern_emphas = Pattern.compile(emphas);


        String workString = text;
        Matcher matcher_main = pattern_main.matcher(workString);
        workString = matcher_main.replaceAll("\n<p>$2</p>");
        Matcher matcher_header6 = pattern_header6.matcher(workString);
        workString = matcher_header6.replaceAll("<h6>$1</h6>");
        Matcher matcher_header5 = pattern_header5.matcher(workString);
        workString = matcher_header5.replaceAll("<h5>$1</h5>");
        Matcher matcher_header4 = pattern_header4.matcher(workString);
        workString = matcher_header4.replaceAll("<h4>$1</h4>");
        Matcher matcher_header3 = pattern_header3.matcher(workString);
        workString = matcher_header3.replaceAll("<h3>$1</h3>");
        Matcher matcher_header2 = pattern_header2.matcher(workString);
        workString = matcher_header2.replaceAll("<h2>$1</h2>");
        Matcher matcher_header1 = pattern_header1.matcher(workString);
        workString = matcher_header1.replaceAll("<h1>$1</h1>");
        Matcher matcher_links = pattern_links.matcher(workString);
        workString = matcher_links.replaceAll("<a href=\"$2\">$1</a>");
        Matcher matcher_bold = pattern_bold.matcher(workString);
        workString = matcher_bold.replaceAll("<strong>$2</strong>");
        Matcher matcher_emphas = pattern_emphas.matcher(workString);
        workString = matcher_emphas.replaceAll("<em>$2</em>");

        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n");
        sb.append("<body>\n");
        sb.append(workString);
        sb.append("</body>\n");
        sb.append("</html>\n");
        return workString;
    }
}
