package ua.org.oa.practice5.dyachenko_s;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serj27 on 16.05.2016.
 */
public class RandomNumber {


    public static void sort(int M[]) {
        int t[];
        int i;
        int j;
        t = new int[M.length];
        for ( i = 0; i < M.length; i++) {
            for ( j = M.length - 1; j > i; j--) {
                if (M[j - 1] > M[j]) {
                    t[j] = M[j - 1];
                    M[j - 1] = M[j];
                    M[j] = t[j];
                }
            }
        }
    }

   public static void WriteToFile (String path, String charSet ){
       int[] text = null;
       try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), charSet))) {

           Random r = new Random();
           int num = 50;
           int text1 = 0;

           for (int i = 0; i<num;i++) {
               text1 = r.nextInt(num);
               text = new int [] {text1};

               RandomNumber.sort(text);
               bw.write(Arrays.hashCode(text) + " " + '\n');
           }
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public static void getRateStudents (String path){
        String str;
        int averageRate = 90;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((str=br.readLine())!= null) {
                Pattern p = Pattern.compile("([A-Z]+[a-z]+\\s[A-Z]+[a-z]+\\W+)" + "(\\d+)");
                Matcher m = p.matcher(str);
                while (m.find()) {
                    String str1 = String.valueOf(m.group(1));
                    int i = Integer.valueOf(m.group(2));
                     if (  i >= averageRate){
                        System.out.println(str1 + " " + i);
                    }
                }
            }

                br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceWords (String path){
        String str;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((str=br.readLine()) != null){
                String reg = "(\\b[a-zA-Z0-9_]+)(.*?\\s)(\\b[a-zA-Z0-9_]+)(\\.)";
                Pattern pattern = Pattern.compile(reg);
                Matcher matcher = pattern.matcher(str);
                if (!matcher.find()) {
                    throw new IllegalArgumentException("Text should contain at least 2 words and a dot: " + str);
                } else {
                    String newString = matcher.replaceAll("$3$2$1$4");
                    System.out.println(newString);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileBuffered (String path1, String path2){
        String str;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path1));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path2)));
            while ((str=br.readLine()) != null){

            bw.write(str + '\n');
            }bw.flush();
            br.close(); bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
