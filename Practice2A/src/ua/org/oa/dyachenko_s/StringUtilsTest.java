package ua.org.oa.dyachenko_s;

public class StringUtilsTest {
	  public static void main(String[] args)  {

	        System.out.println("~~~~~Task 1~~~~~");
	        System.out.println(StringUtils.stringWithoutFirstsSymbols("Car", "agument"));
	        System.out.println("~~~~~Task 2~~~~~");
	        System.out.println(StringUtils.findMidSymbols("oracle"));
	        System.out.println("~~~~~Task 3~~~~~");
	        System.out.println(StringUtils.moveLastSymbolsToBegin("acleOr"));
	        System.out.println("~~~~~Task 4~~~~~");
	        StringUtils.getStringEachSymbolDoubled("Candy");
	        System.out.println("~~~~~Task 7~~~~~");
	        System.out.println(StringUtils.countOccurrenceSymbolBetween("standaloneinthedark", 'a'));
	        System.out.println("~~~~~Task 6~~~~~");
	        StringUtils.removeSymbolsAroundAsterisk("*th*is is sum*mer*");
	        System.out.println("~~~~~Task 9~~~~~");
	        StringUtils.deleteSubstringFromString("Would your bound  my pound tite?", "ou");
	    }
}