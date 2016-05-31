package ua.org.oa.practice5.dyachenko_s;

import java.io.*;

/**
 * Created by serj27 on 16.05.2016.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~Task1~~~~~~~~~~~~~~~");
        RandomNumber.WriteToFile("C:\\Users\\serj27\\IdeaProjects\\Practice\\WorkFile.txt","UTF-8");
        System.out.println("~~~~~~~~~~~~~~~Task2~~~~~~~~~~~~~~~");
        RandomNumber.getRateStudents("C:\\Users\\serj27\\IdeaProjects\\Practice\\StudentList.txt");
        System.out.println("~~~~~~~~~~~~~~~Task3~~~~~~~~~~~~~~~");
        RandomNumber.replaceWords("C:\\Users\\serj27\\IdeaProjects\\Practice\\ReplaceWords.txt");
        String path1 = "C:\\Users\\serj27\\IdeaProjects\\Practice\\Copy.txt";
        String path2 = "C:\\Users\\serj27\\IdeaProjects\\Practice\\Paste.txt";
        RandomNumber.copyFileBuffered(path1,path2);
        //System.out.println("~~~~~~~~~~~~~~~Task6~~~~~~~~~~~~~~~");


        try {
            FileOutputStream fos = new FileOutputStream("temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Group g = new Group();
            oos.writeObject(g);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp.out"));
            Group g = (Group)ois.readObject();
            System.out.println("Back object " + g.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

