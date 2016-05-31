package ua.org.oa.practice4.dyachenko_s;

/**
 * Created by serj27 on 25.04.2016.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int courseNumber;

    public Student(String firstName, String lastName, int courseNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setCourseNumber(courseNumber);
    }

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "First Name = " + firstName + '\'' +
                ", Last Name = " + lastName + '\'' +
                ", Course Number = " + courseNumber +
                '}';
    }
}
