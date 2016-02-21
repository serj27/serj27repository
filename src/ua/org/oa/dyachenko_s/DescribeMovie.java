package ua.org.oa.dyachenko_s;

public class DescribeMovie {

	static String nameMovie;
	static String tagLine;
	static String genre;
	static int lengthMovie;
	static String aboutMovie;
	static String directorMovie;
	static String scenario;
	static String cast;
	static String releaseDate;
	static String status;
	static int numberOfEpisodes;
	static double rating; 


public DescribeMovie () {
	
}

public static void countRating() {
	
	DescribeMovie.rating = 0.0;
	double quantityOfWatching = 17453.0;
	double quantityOfPositive = 16835.0;
	double quantityNegative = quantityOfWatching - quantityOfPositive;
	double constType = 10.0;
	
	rating = ((quantityOfPositive - quantityNegative) / quantityOfWatching) *  constType;
	
	System.out.println("Рейтинг фильма: " + rating + " из " + constType);
	
}

public static void countNumberOfEpisodes () {
	
	DescribeMovie.numberOfEpisodes = 0;
	int countSeasons = 4;
	int quantitySeriesOnSeason = 23;
	
	numberOfEpisodes = countSeasons * quantitySeriesOnSeason;
	
	System.out.println("Количество эпизодов: " + numberOfEpisodes);
}

public static void displayDescribeMovie () {
	
	System.out.println("Название фильма: " + nameMovie);
	System.out.println("Слоган: " + tagLine);
	System.out.println("Жанр: " + genre);
	System.out.println("Продолжительность одного эпизода: " + lengthMovie + " минуты");
	System.out.println("Краткое описание фильма: " + aboutMovie);
	System.out.println("Сценаристы: " + scenario);
	System.out.println("Режисёр фильма: " + directorMovie);
	System.out.println("В главных ролях: " + cast);
	System.out.println("Дата выхода на экраны: " + releaseDate);
	System.out.println("Статус: " + status);
	
}

}