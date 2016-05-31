package ua.org.oa.practice5.dyachenko_s;

import java.io.Serializable;

/**
 * Created by serj27 on 21.05.2016.
 */
public class Student implements Serializable{
    private String firstName;
    private String lastName;
    private int group;

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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Group = " + group +
                '}';
    }

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;


    }
    public Student (){

    }
}
