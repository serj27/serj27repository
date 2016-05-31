package ua.org.oa.homeworkPTMARXVI_245.dyachenko_s;

import java.io.IOException;

/**
 * Created by serj27 on 30.05.2016.
 */
public class App {
    public static void main(String[] args) {

        ThreadDate td = new ThreadDate();
        td.start();
        try {
            System.in.read();
        } catch (IOException ex) {

        }
        td.terminate();

//````````````````````````````````````````````````````````````````````````````````
        DeadLockExample t1 = new DeadLockExample();
        DeadLockExample t2 = new DeadLockExample();

        t1.setOtherThread(t2);
        t2.setOtherThread(t1);

        t1.start();
        t2.start();

        System.out.println("Threads are running, waiting...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {

        }

        System.out.format("After 5 seconds threads are: %s, %s\n", t1.getState(), t2.getState());
        t1.interrupt();
        t2.interrupt();
    }
}
