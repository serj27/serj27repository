package ua.org.oa.dyachenko_s;

public class DescribeMovie {

	static String nameMovie;   
	static String tagLine;
	static String genre;
	static int lengthMovie;
	static String aboutMovie;
	static String directorMovie;           // ���� � �����������
	static String scenario;
	static String cast;
	static String releaseDate;
	static String status;
	static int numberOfEpisodes;
	static double rating; 


public DescribeMovie () {            // �����������
	
}

public static void countRating() {
	
	DescribeMovie.rating = 0.0;                     // ���������� ��������
	double quantityOfWatching = 17453.0;            // ���������� ����������
	double quantityOfPositive = 16835.0;            // ���������� ������������� ������
	double quantityNegative = quantityOfWatching - quantityOfPositive;   // ���������� ������������� ������
	double constType = 10.0;   // ������������ ��� ��������
	
	rating = ((quantityOfPositive - quantityNegative) / quantityOfWatching) *  constType;  // ������ ��������
	
	System.out.println("������� ������: " + rating + " �� " + constType);  // ����� � �������
	
}

public static void countNumberOfEpisodes () {
	
	DescribeMovie.numberOfEpisodes = 0;    // ���������� ���������� ��������
	int countSeasons = 4;                  // ���������� �������
	int quantitySeriesOnSeason = 23;       // ���������� ����� � ����� ������
	  
	numberOfEpisodes = countSeasons * quantitySeriesOnSeason; // ����� ���������� ����� 
	
	System.out.println("���������� ��������: " + numberOfEpisodes);  // ����� � �������
}

public static void displayDescribeMovie () {
	
	System.out.println("�������� ������: " + nameMovie);
	System.out.println("������: " + tagLine);
	System.out.println("����: " + genre);
	System.out.println("����������������� ������ �������: " + lengthMovie + " ������");
	System.out.println("������� �������� ������: " + aboutMovie);
	System.out.println("����������: " + scenario);
	System.out.println("������ ������: " + directorMovie);                                // ����� � �������
	System.out.println("� ������� �����: " + cast);
	System.out.println("���� ������ �� ������: " + releaseDate);
	System.out.println("������: " + status);
	
}

}