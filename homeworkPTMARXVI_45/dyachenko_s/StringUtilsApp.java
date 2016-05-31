package ua.org.oa.homeworkPTMARXVI_45.dyachenko_s;

/**
 * Created by serj27 on 03.05.2016.
 */
public class StringUtilsApp {

    public static void main(String[] args) {

        StringUtils.stringConversely(new String[]{"Hello world!"});
        System.out.println(StringUtils.stringPalindrome("А роза упала на лапу Азора"));
        StringUtils.stringLength("Starling City");
        System.out.println(StringUtils.stringReplace("The world must be in safe."));
        System.out.println(StringUtils.stringReplaceWords("The world must be in safe. Because people want to live forever."));
        System.out.println(StringUtils.stringAbcFind("abc"));
        System.out.println(StringUtils.stringIsDate("03.27.1985"));
        System.out.println(StringUtils.stringIsMail("serjdyach@gmail.com"));
        System.out.println(StringUtils.findPhones("+3(050)188-91-05 +3(097)783-35-19"));
        System.out.println(MarkdownParser.markdownParser("##Header line\n" +
                "\n" +
                "Simple line with em\n" +
                "\n" +
                "Simple *line* with strong\n" +
                "\n" +
                "Line with link [Link to google](https://www.google.com) in center\n" +
                "\n" +
                "Line *with* many *elements* and link [Link to FB](https://www.facebook.com)"));
    }
}
