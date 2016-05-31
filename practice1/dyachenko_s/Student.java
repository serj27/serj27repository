package ua.org.oa.practice1.dyachenko_s;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serj27 on 16.05.2016.
 */
public class Student {
    private String firstName;
    private String lastName;
    private Group studentsGroup;
    public ArrayList<Exam> examList;

    Student(String firstName, String lastName, Group studentsGroup, ArrayList<Exam> examList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentsGroup = studentsGroup;
        this.examList = examList;
    }

    Student(String firstName, String lastName, Group studentsGroup) {
        this(firstName, lastName, studentsGroup, new ArrayList<>());
    }


    public static int maxRate(Lecture lecture, List<Student> studentList) {
        int maxRate = 0;
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.get(i).examList.size(); j++) {
                if (studentList.get(i).examList.get(j).lecture == lecture && studentList.get(i).examList.get(j).rate > maxRate) {
                    maxRate = studentList.get(i).examList.get(j).rate;
                }
            }
        }
        return maxRate;
    }


    public void addExamRate(Exam exam) {
        if (!examList.contains(exam)) {
            examList.add(exam);
        } else {
            throw new IllegalArgumentException("List actually contains this Exam");
        }

    }


    public void deleteExamRate(Exam exam) {
        if (examList.contains(exam)) {
            examList.remove(exam);
        } else {
            throw new IllegalArgumentException("This student didn't pass exam");
        }
    }


    public int examQuantity(int rate) {
        int examQuantity = 0;
        for (int i = 0; i < examList.size(); i++) {
            if (examList.get(i).rate == rate) {
                examQuantity++;
            }
        }
        return examQuantity;
    }


    public double averageRateForSemester(int year, Semester semester) {
        int examQuantity = 0;
        int sumRate = 0;
        for (int i = 0; i < examList.size(); i++) {
            if (examList.get(i).year == year && examList.get(i).semester == semester) {
                examQuantity++;
                sumRate += examList.get(i).rate;
            }
        }
        if (examQuantity != 0) {
            return Math.round((double)sumRate/examQuantity * 100)/100.0;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " (" + studentsGroup + ") " + '\n' +
                ", Exam List = " + examList;
    }
}
