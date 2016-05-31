package ua.org.oa.homeworkPTMARXVI_245.dyachenko_s;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by serj27 on 30.05.2016.
 */
public class ThreadDate extends Thread {




    private boolean terminated = false;

    public void terminate()
    {
        terminated = true;
        interrupt();
    }

    @Override
    public void run() {
        while (!terminated) {
            Date currentDate = new Date();
            System.out.println(DateFormat.getTimeInstance().format(currentDate));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
    }
