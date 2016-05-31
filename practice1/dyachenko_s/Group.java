package ua.org.oa.practice1.dyachenko_s;

/**
 * Created by serj27 on 16.05.2016.
 */
public class Group {
    int course;
    Faculty faculty;

    Group(int course, Faculty faculty) {
        if (course >= 1 || course <= 6) {
            this.course = course;
            this.faculty = faculty;
        } else {
            throw new IllegalArgumentException("Wrong curse: " + course);
        }
    }

    @Override
    public String toString() {
        return faculty + "-" + course;
    }
}
