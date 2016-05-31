package ua.org.oa.practice4.dyachenko_s;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by serj27 on 25.04.2016.
 */
public class StudentUtils {

    public static Map<String, Student> createMapFromList (List<Student> students){
         Map<String,Student> map = new HashMap<String,Student>();
        return map;
    }

    public static int printStudents(Map<String,Student>students, int course){
        Iterator<Map.Entry<String, Student>> iterator = students.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            if(iterator.next().getValue().equals(course))
                count++;
        }
        return count;
    }}

//    public static void sortStudents ( ){
//        List<Student> sortStudent = new List<Student>();
//
//}
