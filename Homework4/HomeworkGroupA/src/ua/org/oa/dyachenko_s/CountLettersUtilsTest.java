package ua.org.oa.dyachenko_s;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

public class CountLettersUtilsTest {

	public static void main(String[] args) throws IOException {

		File text = new File("D:\\Users\\InfernoD.txt"); // ��������� ����� � �������� �����
		@SuppressWarnings("resource")
		FileReader reader = new FileReader(text);  // ������ ����� �� �����
		char[] buffer = new char[(int) (text.length())];  // �������� ����� � ������ char'a

		
		
		reader.read(buffer);

		System.out.println(buffer);   // ����� ������ �� �����

		for (int i = 0; i < buffer.length; i++) // ����� �� �������
		{
			if (CountLettersUtils.isVowel(buffer[i]))  // ��������� ������� ������� isVowel ���� ������� ������ �������
			{ 
										 
			CountLettersUtils.listCharVowels.add(buffer[i]); // ��������  ������� � ���� ������
																	
			}													
																	 
			 else  if (buffer[i] == ' ')    // ��������� ���� �� ������, � ���������� ���
			 {  			
				continue;  
			 }
			 else if (CountLettersUtils.isConsonants(buffer[i])) 
			 {
				CountLettersUtils.listCharConsonants.add(buffer[i]);
			 }
		}
			System.out.println();
			System.out.println("������� �����: ");
			
			for (char v : CountLettersUtils.listCharVowels)// ����� �� ������, �  ������� ��������  �������
			{
								
			}
			System.out.print(CountLettersUtils.listCharVowels + " "); // ������  ������  �� �����, c  �������� ����� ����																

			System.out.println();                       // ��������� ������ �� ������ �������
			System.out.println("�������� �����: ");

			for (char c : CountLettersUtils.listCharConsonants) // ����� �� ������ ���������
			{
							
			}
			System.out.print(CountLettersUtils.listCharConsonants + " "); // ������� �� ����� ���������, ����� ������
		
		System.out.println(); 
		System.out.println();// ��������� �������

		CountLettersUtils.count(); // ����� ������ �������� ���������� ���� � ������� ����� ����
	}
}
