package ua.org.oa.dyachenko_s;

public class DescribeMovieTest {

	public static void main(String[] args) {
		
		DescribeMovie movie = new DescribeMovie ();
		
		movie.nameMovie = "СТРЕЛА";
		movie.tagLine = "Судьба оставляет свой отпечаток";
		movie.genre = "Драма, приключения, боевик";
		movie.lengthMovie = 43;
		movie.aboutMovie = "После 5 лет, проведенных на острове, Оливер Куин вернулся в Старлинг-Сити"
				         + "с одной целью: Спасти свой город. Но для этого он должен стать кем-то"
				         + "другим. Он должен стать чем-то другим.";
		movie.directorMovie = "Джон Беринг,  Майкл Шульц,  Гай Норман Би";
		movie.scenario = "Марк Гуггенхайм, Грег Берланти, Эндрю Крейсберг";
		movie.cast = "Стивен Амелл, Кэти Кэссиди, Дэвид Рэмси, Уилла Холланд, Эмили Бетт Рикардс,"
				   + "Пол Блекторн, Сюзанна Томпсон, Ману Беннетт, Колтон Хэйнс, Кейти Лотц";
		movie.releaseDate = "10 октября 2012 год";
		movie.status = "Снимается";
		
		
		
		DescribeMovie.displayDescribeMovie();
		DescribeMovie.countNumberOfEpisodes();
		DescribeMovie.countRating();
		
		
		
	}

}
