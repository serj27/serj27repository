package ua.org.oa.practice5.dyachenko_s;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by serj27 on 21.05.2016.
 */
public class Group implements Serializable {

    ArrayList<Student> students = new ArrayList<Student>(){

    Student stud1 = new Student("Ivan","Petrov",310);
    Student stud2 = new Student("Victor","Vickorov",311);
    Student stud3 = new Student("Yuri","Zaycev",312);
    Student stud4 = new Student("Petr","Butko",313);
    Student stud5 = new Student("Dima","Zemtsov",312);
    };

    }
