package ua.org.oa.practice1.dyachenko_s;

/**
 * Created by serj27 on 16.05.2016.
 */
public class Exam {
    Lecture lecture;
    int year;
    int rate;
    Semester semester;

    Exam(Lecture lecture, int year, int rate, Semester semester) {

        if ((rate > 1 && rate < 13) && (year > 2000 && year < 2020)) {
            this.lecture = lecture;
            this.rate = rate;
            this.year = year;
            this.semester = semester;
        } else {
            throw new IllegalArgumentException("Your arguments are wrong. Rate had to be more or equal than 1 " +
                    "and less than or equal to 13: " + rate +
                    '\n' + "Year had to been between 2000 and 2020. " + year);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam = (Exam) o;

        if (year != exam.year) return false;
        if (lecture != exam.lecture) return false;
        return semester == exam.semester;

    }

    @Override
    public int hashCode() {
        int result = lecture.hashCode();
        result = 31 * result + year;
        result = 31 * result + semester.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return lecture.toString() + ", In " + year + " year, " + semester + " Semester, Rate - " + rate + '\n';
    }
}
