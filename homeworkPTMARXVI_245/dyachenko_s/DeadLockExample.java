package ua.org.oa.homeworkPTMARXVI_245.dyachenko_s;

/**
 * Created by serj27 on 30.05.2016.
 */
public class DeadLockExample extends Thread{
    private Thread otherThead;

    public void setOtherThread(Thread otherThead)
    {
        this.otherThead = otherThead;
    }

    @Override
    public void run() {
        try {
            otherThead.join();
        } catch (InterruptedException ex) {

        }
    }
}



