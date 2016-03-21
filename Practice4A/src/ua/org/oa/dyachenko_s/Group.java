package ua.org.oa.dyachenko_s;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Group {

	private Student[] groupMembers = null;
	
	public Group (int groupSize){
		groupMembers = new Student [groupSize];
		createStudent();
	}
	
	private  void createStudent(){
		@SuppressWarnings("resource")
		Scanner bs = new Scanner (System.in);
		String nameStudent = null;
		int age = 0;
		double averageRating = 0;
		for (int i = 0; i < groupMembers.length; i++) {
			try {
			
				System.out.println("Введите имя студента #" + (i+1));
			    nameStudent = bs.nextLine();
			
						
				System.out.println("Введите возраст студента #" + (i+1));
				age = bs.nextInt();
				
				System.out.println("Введите средний балл студента #" + (i+1));
				averageRating = bs.nextDouble();
				
			} catch (InputMismatchException e){
				System.out.println("Данные введены неверно!");
				bs.nextLine();
				continue;
			}
			try {
				groupMembers[i] = new Student(nameStudent, age, averageRating);
				bs.nextLine();
			}catch (StudentException e){
				System.out.println(e.getMessage());
				continue;
			}
		}
		System.out.println("Состав группы: ");
		int i=1;
		for(Student st :groupMembers){
		
			System.out.println(i + " студент " + st);
			i++;
		}
		
	}
}
