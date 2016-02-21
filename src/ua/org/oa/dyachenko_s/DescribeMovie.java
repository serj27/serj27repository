package ua.org.oa.dyachenko_s;

public class DescribeMovie {

	static String nameMovie;   
	static String tagLine;
	static String genre;
	static int lengthMovie;
	static String aboutMovie;
	static String directorMovie;           // поле с переменными
	static String scenario;
	static String cast;
	static String releaseDate;
	static String status;
	static int numberOfEpisodes;
	static double rating; 


public DescribeMovie () {            // конструктор
	
}

public static void countRating() {
	
	DescribeMovie.rating = 0.0;                     // накопление рейтинга
	double quantityOfWatching = 17453.0;            // количество просмотров
	double quantityOfPositive = 16835.0;            // количество положительных оценок
	double quantityNegative = quantityOfWatching - quantityOfPositive;   // количество отрицательных оценок
	double constType = 10.0;   // максимальный бал рейтинга
	
	rating = ((quantityOfPositive - quantityNegative) / quantityOfWatching) *  constType;  // расчет рейтинга
	
	System.out.println("Рейтинг фильма: " + rating + " из " + constType);  // вывод в консоль
	
}

public static void countNumberOfEpisodes () {
	
	DescribeMovie.numberOfEpisodes = 0;    // накопление количества эпизодов
	int countSeasons = 4;                  // количество сезонов
	int quantitySeriesOnSeason = 23;       // количество серий в одном сезоне
	  
	numberOfEpisodes = countSeasons * quantitySeriesOnSeason; // общее количество серий 
	
	System.out.println("Количество эпизодов: " + numberOfEpisodes);  // вывод в консоль
}

public static void displayDescribeMovie () {
	
	System.out.println("Название фильма: " + nameMovie);
	System.out.println("Слоган: " + tagLine);
	System.out.println("Жанр: " + genre);
	System.out.println("Продолжительность одного эпизода: " + lengthMovie + " минуты");
	System.out.println("Краткое описание фильма: " + aboutMovie);
	System.out.println("Сценаристы: " + scenario);
	System.out.println("Режисёр фильма: " + directorMovie);                                // вывод в консоль
	System.out.println("В главных ролях: " + cast);
	System.out.println("Дата выхода на экраны: " + releaseDate);
	System.out.println("Статус: " + status);
	
}

}