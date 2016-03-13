package ua.org.oa.dyachenko_s;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StringUtils {
	 public static String stringWithoutFirstsSymbols(String string1, String string2) {
	        return string1.substring(1, string1.length()) + string2.substring(1, string2.length());
	    }

	    public static String findMidSymbols(String string) {     //need to add checking the input string
	        if (string.length() >= 3 && string.length() % 2 != 0)
	            return string.substring(string.length() / 2 - 1, string.length() / 2 + 2);
	        else
	            return "String should be at least 3 symbols or 5 or 7 and so on.";
	    }

	    public static String moveLastSymbolsToBegin(String string) {
	        String lastTwoSymbols = string.substring(string.length() - 2, string.length());
	        String restOfString = string.substring(0, string.length() - 2);
	        return lastTwoSymbols + restOfString;
	    }

	    public static void getStringEachSymbolDoubled(String string) {
	        for (int i = 0; i < string.length(); i++) {
	            System.out.print(string.substring(i, i + 1) + string.substring(i, i + 1));
	        }
	        System.out.println();
	    }

	    public static int countOccurrenceSymbolBetween(String string, char symbol) {
	        int count = 0;
	        for (int i = 0; i < string.length() - 2; i++) {
	            if (string.charAt(i) == symbol && string.charAt(i + 2) == symbol)
	                count++;
	        }
	        return count;
	    }

	    public static void removeSymbolsAroundAsterisk(String string) {
	        StringBuilder sb = new StringBuilder(string);
	        for (int i = 0; i < sb.length(); i++) {
	            if (sb.charAt(i) == '*' && sb.indexOf("*") == 0) {
	                sb.delete(i, i + 2);
	            } else if (sb.charAt(i) == '*' && sb.indexOf("*") > 0 && sb.indexOf("*") < sb.length() - 1) {
	                sb.delete(i - 1, i + 2);
	            } else if (sb.charAt(i) == '*' && sb.indexOf("*") == sb.length() - 1) {
	                sb.delete(i - 1, i + 1);
	            }
	        }
	        System.out.println(sb);
	    }

	    

	    public static void deleteSubstringFromString(String startString, String stringDeleted) {

	        String newString = startString.replace(stringDeleted, "");
	        System.out.println(newString);

	    }
}
