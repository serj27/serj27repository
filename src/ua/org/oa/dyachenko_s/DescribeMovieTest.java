package ua.org.oa.dyachenko_s;

public class DescribeMovieTest {

	public static void main(String[] args) {
		
		DescribeMovie movie = new DescribeMovie ();
		
		movie.nameMovie = "������";
		movie.tagLine = "������ ��������� ���� ���������";
		movie.genre = "�����, �����������, ������";
		movie.lengthMovie = 43;
		movie.aboutMovie = "����� 5 ���, ����������� �� �������, ������ ���� �������� � ��������-����"
				         + "� ����� �����: ������ ���� �����. �� ��� ����� �� ������ ����� ���-��"
				         + "������. �� ������ ����� ���-�� ������.";
		movie.directorMovie = "���� ������,  ����� �����,  ��� ������ ��";
		movie.scenario = "���� ����������, ���� ��������, ����� ���������";
		movie.cast = "������ �����, ���� �������, ����� �����, ����� �������, ����� ���� �������,"
				   + "��� ��������, ������� �������, ���� �������, ������ �����, ����� ����";
		movie.releaseDate = "10 ������� 2012 ���";
		movie.status = "���������";
		
		
		
		DescribeMovie.displayDescribeMovie();
		DescribeMovie.countNumberOfEpisodes();
		DescribeMovie.countRating();
		
		
		
	}

}
