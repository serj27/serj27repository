package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class CountLettersUtils {
	
	static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
	static char[] consonants = new char[] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
	static ArrayList <Character> listCharVowels = new ArrayList <Character>(); //список для гласных
    static ArrayList <Character> listCharConsonants = new ArrayList <Character>(); //список для согласных
	
    public CountLettersUtils (char[] vowels, char [] consonants) {  // конструктор с аргументами
		CountLettersUtils.vowels = vowels;
		CountLettersUtils.consonants = consonants;
	}
	public static boolean isVowel(char v)
     {    
         v = Character.toLowerCase(v);  //приводим символ в нижний регистр - от заглавных к строчным буквам

         for (char d : vowels)   //ищем среди массива гласных
         {
             if (v == d)  
                 return true;
         }
         return false;
     }
	
	public static boolean isConsonants (char c)
	{
		c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
		
		for (char d : consonants)   // ищем среди массива согласных
		{
			if (c == d)
				return true;
		}
		return false;
	}  
	
	/* метод вычисления количества гласных и согласных
	 * букв. Вычисление разницы между гласными и созгласными буквами.
	 */
	public static void count (){        
		int countLettersVowels = 0;      // счетчик гласных
		int countLettersConsonants = 0;  // счетчик согласных 
		int sumLetters = 0;              // счетчик разницы
		for (char c : listCharVowels)
		{
				
			countLettersVowels++;           // подсчет количества гласных букв
			
		}  
		
		System.out.println("Количество гласных букв в тексте: " + countLettersVowels); // печать количества гласных букв
		    System.out.println();
		
		    for (char c : listCharConsonants ) 
		    {			 
			countLettersConsonants++;        // подсчет количества согласных букв
			}
		    
		    System.out.println("Количество согласных букв в тексте: " + countLettersConsonants); // печать количества согласных букв
		    System.out.println();
		 if (countLettersVowels < countLettersConsonants ){            // проверка выполнения условия 
		 sumLetters = countLettersConsonants - countLettersVowels;     // расчет "если согласных букв больше"
		 System.out.println("Согласных букв на " + sumLetters + " больше."); // вывод результата
		 } else 
		 {
			 sumLetters =  - countLettersVowels - countLettersConsonants;   // расчет "если гласных больше"
			 System.out.println("Гласных букв на " + sumLetters + " больше.");  // вывод результата
		 }
	}
	
	
}
	
