package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class CountLettersUtils {
	
	static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
	static char[] consonants = new char[] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
	static ArrayList <Character> listCharVowels = new ArrayList <Character>(); //������ ��� �������
    static ArrayList <Character> listCharConsonants = new ArrayList <Character>(); //������ ��� ���������
	
    public CountLettersUtils (char[] vowels, char [] consonants) {  // ����������� � �����������
		CountLettersUtils.vowels = vowels;
		CountLettersUtils.consonants = consonants;
	}
	public static boolean isVowel(char v)
     {    
         v = Character.toLowerCase(v);  //�������� ������ � ������ ������� - �� ��������� � �������� ������

         for (char d : vowels)   //���� ����� ������� �������
         {
             if (v == d)  
                 return true;
         }
         return false;
     }
	
	public static boolean isConsonants (char c)
	{
		c = Character.toLowerCase(c);  // �������� ������ � ������ ������� - �� ��������� � �������� ������
		
		for (char d : consonants)   // ���� ����� ������� ���������
		{
			if (c == d)
				return true;
		}
		return false;
	}  
	
	/* ����� ���������� ���������� ������� � ���������
	 * ����. ���������� ������� ����� �������� � ����������� �������.
	 */
	public static void count (){        
		int countLettersVowels = 0;      // ������� �������
		int countLettersConsonants = 0;  // ������� ��������� 
		int sumLetters = 0;              // ������� �������
		for (char c : listCharVowels)
		{
				
			countLettersVowels++;           // ������� ���������� ������� ����
			
		}  
		
		System.out.println("���������� ������� ���� � ������: " + countLettersVowels); // ������ ���������� ������� ����
		    System.out.println();
		
		    for (char c : listCharConsonants ) 
		    {			 
			countLettersConsonants++;        // ������� ���������� ��������� ����
			}
		    
		    System.out.println("���������� ��������� ���� � ������: " + countLettersConsonants); // ������ ���������� ��������� ����
		    System.out.println();
		 if (countLettersVowels < countLettersConsonants ){            // �������� ���������� ������� 
		 sumLetters = countLettersConsonants - countLettersVowels;     // ������ "���� ��������� ���� ������"
		 System.out.println("��������� ���� �� " + sumLetters + " ������."); // ����� ����������
		 } else 
		 {
			 sumLetters =  - countLettersVowels - countLettersConsonants;   // ������ "���� ������� ������"
			 System.out.println("������� ���� �� " + sumLetters + " ������.");  // ����� ����������
		 }
	}
	
	
}
	
