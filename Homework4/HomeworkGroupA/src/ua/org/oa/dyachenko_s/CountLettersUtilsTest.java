package ua.org.oa.dyachenko_s;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

public class CountLettersUtilsTest {

	public static void main(String[] args) throws IOException {

		File text = new File("D:\\Users\\InfernoD.txt"); // вытягиваю текст с жесткого диска
		@SuppressWarnings("resource")
		FileReader reader = new FileReader(text);  // читаем текст из файла
		char[] buffer = new char[(int) (text.length())];  // загоняем текст в массив char'a

		
		
		reader.read(buffer);

		System.out.println(buffer);   // вывод текста на экран

		for (int i = 0; i < buffer.length; i++) // бежим по массиву
		{
			if (CountLettersUtils.isVowel(buffer[i]))  // проверяем условие методом isVowel если текуший символ гласная
			{ 
										 
			CountLettersUtils.listCharVowels.add(buffer[i]); // помещаем  гласную в свой список
																	
			}													
																	 
			 else  if (buffer[i] == ' ')    // проверяем есть ли пробел, и пропускаем его
			 {  			
				continue;  
			 }
			 else if (CountLettersUtils.isConsonants(buffer[i])) 
			 {
				CountLettersUtils.listCharConsonants.add(buffer[i]);
			 }
		}
			System.out.println();
			System.out.println("Гласные буквы: ");
			
			for (char v : CountLettersUtils.listCharVowels)// бежим по списку, в  который положили  гласные
			{
								
			}
			System.out.print(CountLettersUtils.listCharVowels + " "); // выводи  гланые  на экран, c  пробелом между ними																

			System.out.println();                       // переводим курсор на другую строчку
			System.out.println("Соласные буквы: ");

			for (char c : CountLettersUtils.listCharConsonants) // бежим по списку согласных
			{
							
			}
			System.out.print(CountLettersUtils.listCharConsonants + " "); // выводим на экран согласные, через пробел
		
		System.out.println(); 
		System.out.println();// переводим каретку

		CountLettersUtils.count(); // вызов метода подсчета количества букв и разницы между ними
	}
}
