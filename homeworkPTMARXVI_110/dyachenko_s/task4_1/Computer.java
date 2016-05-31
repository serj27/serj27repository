package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_1;

/**
 * Created by serj27 on 15.05.2016.
 */
public class Computer implements Comparable<Computer> {

    private String processor;
    private String videoCard;
    private int price;

    public Computer(String processor, String videoCard, int price) {
        this.processor = processor;
        this.videoCard = videoCard;
        this.price = price;
    }

    @Override
    public int compareTo(Computer o) {
        Computer entry = (Computer) o;

        int result = processor.compareTo(entry.processor);
        if(result != 0) {
            return result;
        }

        result = price - entry.price;
        if(result != 0) {
            return (int) result / Math.abs( result );
        }
        return 0;
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Processor = '" + processor + '\'' +
                ", Video Card = '" + videoCard + '\'' +
                ", Price = " + price +
                '}';
    }


}
