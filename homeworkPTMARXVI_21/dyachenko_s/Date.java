package ua.org.oa.homeworkPTMARXVI_21.dyachenko_s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import static java.util.Calendar.*;


/**
 * Created by serj27 on 10.04.2016.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){

    }

    public DayOfWeek getDayOfWeek() {

        return DayOfWeek.of(5);
    }

    public int getDayOfYear() {
        Calendar calendar = Calendar.getInstance();
        int year = 2016;
        int month = FEBRUARY;
        int date = 23;
        calendar.set(year, month, date);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Number of Days: " + days);
        return year;
    }


    public void daysBetween(Date date) throws IOException {

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String firstInput = reader.readLine();
        final String secondInput = reader.readLine();
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days between dates: " + days);


}
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public class Year {
        public boolean getLeapYear ( int year) {
            boolean leapYear;
            if ((year % 4) != 0) {
                leapYear = true;
            } else if ((year % 400) == 0) {
                leapYear = true;
            } else if ((year % 100) != 0) {
                leapYear = true;
            } else leapYear = false;
            return leapYear;
        }
    }

    public class Month {

        public int getQuantityDays (int monthNumber, boolean leapYear){
            if (monthNumber == APRIL || monthNumber == JUNE || monthNumber == SEPTEMBER || monthNumber == NOVEMBER)
                return 30;
            else if (monthNumber == FEBRUARY && leapYear == false)
                return 28;
            else  if (monthNumber == FEBRUARY && leapYear == true)
                return 29;
            else return 31;
        }
        }





    public static class Car {
        private String name;
        private int price;
        private char color;

        public Car(String name, int price, char color) {
            this.name = name;
            this.price = price;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public char getColor() {
            return color;
        }


        public void setColor(char color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", color=" + color +
                    '}';
        }
    }

    public static void main(String[] args) {
      Date date = new Date(23,1,2016);
        date.getDayOfYear();
        Date.Year year = date.new Year();
        System.out.println("Leap year: " + year.getLeapYear(2016));
        Date.Month month = date.new Month();
        System.out.println("Days quantity in month: " + month.getQuantityDays(1,true));
       Date date1 = new Date();
        try {
            date1.daysBetween(new Date(23,1,2016));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Day of week: " + date.getDayOfWeek().name());

        Car car1 = new Car("Жигуль",10000,'e'){

             @Override
             public String toString() {
                 return  "Car 1{" +
                         "Name = " + getName() + '\'' +
                         ", Price = " + getPrice() + '}' ;
             }
         };
        System.out.println(car1);

       Car car2 = new Car("Таврия",6000,'r'){

            @Override
            public String toString() {
                return  "Car 2{" +
                        "Name = " + getName() + '\'' +
                        ", Color = " + getColor() + '}' ;
            }
        };
        System.out.println(car2);

    }

}
