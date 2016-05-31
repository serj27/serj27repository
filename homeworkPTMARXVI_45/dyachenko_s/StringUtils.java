package ua.org.oa.homeworkPTMARXVI_45.dyachenko_s;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by serj27 on 03.05.2016.
 */
public class StringUtils {



    public static String stringConversely (String [] s){
        StringBuilder sb = new StringBuilder();
        for ( String word : s ) {
            sb.append((new StringBuilder(" " + word)).reverse());
        }
        System.out.println(sb);
        return sb.toString().trim();
    }




    public static Boolean stringPalindrome (String palindrome){
        return palindrome.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(palindrome.replaceAll("\\W",""))
                        .reverse().toString());
    }

    public static void stringLength (String str){
       StringBuilder sb = new StringBuilder(str);
        int count = str.length()-1;
        int num = 11;
        if (count < num) {
            str = sb.delete(6,str.length()).toString();
            System.out.println("New String: " +  str );
        }
        else if (count > num){
            str = sb.replace(7,13,"ooooooo").toString();
            System.out.println("New String: " + str);
        }
    }

    public static String stringReplace (String str){
        String reg = "(\\b[a-zA-Z0-9_]+)(.*?\\s)(\\b[a-zA-Z0-9_]+)(\\.)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Text should contain at least 2 words: " + str);
        } else {
            String newString = matcher.replaceAll("$3$2$1$4");
            return newString;
        }
    }

    public static String stringReplaceWords (String str){
        String reg = "(\\b[a-zA-Z0-9_]+)(.*?\\s)(\\b[a-zA-Z0-9_]+)(\\.)"; //(\b\w*)(.*\s)(\b\w*)
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Text should contain at least 2 words and a dot: " + str);
        } else {
            String newString = matcher.replaceAll("$3$2$1$4");
            return newString;
        }
    }

    public static boolean stringAbcFind (String str){
        String reg = "\\A[abc]*\\Z";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean stringIsDate(String str) {

            String reg = "\\A(((0?[123456789])|(1[012]))\\.((3[01])|([12]\\d)|(0?[1-9]))\\.((19|20)\\d\\d))\\Z";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(str);
            return matcher.matches();
        }

    public static boolean stringIsMail(String str) {

            String reg = "\\A[A-Za-z][A-Za-z0-9.-]+@[A-z0-9][A-z0-9-]*\\.[A-z]{2,4}\\Z";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(str);
            return matcher.matches();
        }

    public static String[] findPhones(String str) {

            String reg = "\\b(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})\\b";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(str);
            List<String> phoneNumbers = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            while (matcher.find()) {
                sb.append("+");
                sb.append(matcher.group(1));
                sb.append("(");
                sb.append(matcher.group(2));
                sb.append(")");
                sb.append(matcher.group(3));
                sb.append("-");
                sb.append(matcher.group(4));
                sb.append("-");
                sb.append(matcher.group(5));
                String newString = sb.toString();
                sb.delete(0, sb.length());
                phoneNumbers.add(newString);
            }
            String[] arrayPhoneNumbers = {};
            arrayPhoneNumbers = phoneNumbers.toArray(new String[phoneNumbers.size()]);
            return arrayPhoneNumbers;
        }
}
