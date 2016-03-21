package ua.org.oa.dyachenko_s;

public class Student {

	private static final int MIN_AGE = 16;
	private static final int MAX_AGE = 50;
	private static final double MIN_RATE = 1;
	private static final double MAX_RATE = 13;
	private String nameStudent = null;
	private int age = 0;
	private double averageRating = 0;
	
	public Student(String nameStudent, int age, double averageRating)
			throws StudentException {
		setNameStudent(nameStudent);
		setAge(age);
		setAverageRating(averageRating);
	}

	public String getNameStudent() {
		return nameStudent;
	}

	
	public void setNameStudent(String NameStudent) throws StudentException {
		if (NameStudent.isEmpty()) {
			throw new StudentException("Wrong Name Student");
		} else {
			nameStudent = NameStudent;}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws StudentException  {
		if (age > MIN_AGE && age < MAX_AGE){
		this.age = age;}
		else {
			throw new StudentException("Wrong Age");
		}
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) throws StudentException  {
		if (averageRating > MIN_RATE && averageRating < MAX_RATE){
		this.averageRating = averageRating;}
		else {
			throw new StudentException("Wrong Average Rating");
		}
	}
	

	@Override
	public String toString() {
		return "Student [Name Student = " + nameStudent + ", Age Student = " + age + ", Average Rating = " + averageRating + "]";
	}
	
}
