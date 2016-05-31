package ua.org.oa.practice1.dyachenko_s;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by serj27 on 16.05.2016.
 */
public class StudentTest {
    Group groupSAU = new Group(1, Faculty.SAU);
    Group groupASU = new Group(2, Faculty.ASU);

    Exam reExamGalakhvastov = new Exam(Lecture.ENGLISH, 2014, 8, Semester.FIRST);
    Exam invalidExam = new Exam(Lecture.SPORTS, 2014, 9, Semester.FIRST);

    Exam forAverageRate1 = new Exam(Lecture.MECHANICS, 2014, 8, Semester.FIRST);
    Exam forAverageRate2 = new Exam(Lecture.PHYSICS, 2014, 8, Semester.FIRST);

    Student student1 = new Student("Svirid", "Galakhvastov", groupSAU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.LAW, 2014, 7, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 11, Semester.SECOND),
            new Exam(Lecture.MECHANICS, 2015, 9, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 10, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 11, Semester.FIRST)
    )));

    Student student2 = new Student("Dobrinya", "Nikitich", groupSAU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.ENGLISH, 2014, 5, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 4, Semester.SECOND),
            new Exam(Lecture.SPORTS, 2015, 7, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 4, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 6, Semester.FIRST)
    )));

    Student student3 = new Student("Illya", "Murometz", groupASU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.MECHANICS, 2014, 8, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 10, Semester.SECOND),
            new Exam(Lecture.ENGLISH, 2015, 5, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 11, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 9, Semester.FIRST)
    )));

    Student student4 = new Student("Alesha", "Popovich", groupASU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.SPORTS, 2014, 10, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 11, Semester.SECOND),
            new Exam(Lecture.LAW, 2015, 6, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 5, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 9, Semester.FIRST)
    )));

    Student student5 = new Student("Scarlett", "Johanson", groupSAU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.MECHANICS, 2014, 11, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 11, Semester.SECOND),
            new Exam(Lecture.LAW, 2015, 5, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 10, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 9, Semester.FIRST)
    )));

    Student student6 = new Student("Woopie", "Goldberg", groupASU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.SPORTS, 2014, 6, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 8, Semester.SECOND),
            new Exam(Lecture.MECHANICS, 2015, 7, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 5, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 4, Semester.FIRST)
    )));

    Student student7 = new Student("Nickolas", "Cage", groupSAU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.ENGLISH, 2014, 8, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 9, Semester.SECOND),
            new Exam(Lecture.PROGRAMMING, 2015, 10, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 11, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 5, Semester.FIRST)
    )));

    Student student8 = new Student("Liu", "Kang", groupASU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.ENGLISH, 2014, 8, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 9, Semester.SECOND),
            new Exam(Lecture.PROGRAMMING, 2015, 10, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 11, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 6, Semester.FIRST)
    )));

    Student student9 = new Student("Iron", "Man", groupSAU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.ENGLISH, 2014, 6, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 8, Semester.SECOND),
            new Exam(Lecture.PROGRAMMING, 2015, 9, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 5, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 10, Semester.FIRST)
    )));

    Student student10 = new Student("Steve", "Rogers", groupASU, new ArrayList<Exam>(Arrays.asList(
            new Exam(Lecture.ENGLISH, 2014, 8, Semester.FIRST),
            new Exam(Lecture.ECONOMY, 2014, 9, Semester.SECOND),
            new Exam(Lecture.PROGRAMMING, 2015, 10, Semester.FIRST),
            new Exam(Lecture.MATH, 2015, 11, Semester.SECOND),
            new Exam(Lecture.PHYSICS, 2016, 7, Semester.FIRST)
    )));

    List<Student> studentList = new ArrayList<>(Arrays.asList(
            student1, student2, student3, student4, student5, student6, student7, student8, student9, student10
    ));


    @Test
    public void testMaxRate() throws Exception {
        int actual = Student.maxRate(Lecture.PHYSICS, studentList);
        int expected = 11;
        Assert.assertEquals("return wrong max mark from students lists", expected, actual);
    }

    @Test
    public void testAddExamRate() throws Exception {
        student1.addExamRate(reExamGalakhvastov);
        Assert.assertTrue(student1.examList.contains(reExamGalakhvastov));
    }

    @Test
    public void testDeleteExamRate() throws Exception {
        student1.addExamRate(reExamGalakhvastov);
        Assert.assertTrue(student1.examList.contains(reExamGalakhvastov));
        student1.deleteExamRate(reExamGalakhvastov);
        Assert.assertFalse(student1.examList.contains(reExamGalakhvastov));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDeleteExamMarkException() throws Exception {
        student1.deleteExamRate(invalidExam);
        Assert.assertFalse(student1.examList.contains(reExamGalakhvastov));
    }

    @Test
    public void testExamQuantity() throws Exception {
        int actual1 = student1.examQuantity(11);
        int actual2 = student1.examQuantity(4);
        int expected1 = 2;
        int expected2 = 0;
        Assert.assertEquals("Wrong quantitiy of exam with some rate", expected1, actual1);
        Assert.assertEquals("Wrong quantitiy of exam with some rate", expected2, actual2);
    }

    @Test
    public void testAverageMarkForSemester() throws Exception {
        student1.addExamRate(forAverageRate1);
        student1.addExamRate(forAverageRate2);
        double actual = student1.averageRateForSemester(2014, Semester.FIRST);
        double expected = 7.67;
        Assert.assertEquals("Wrong average rate", expected, actual, 0.001);
    }

}