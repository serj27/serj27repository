package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_1;

/**
 * Created by serj27 on 15.05.2016.
 */
public class Car {

    private String name;
    private String model;
    private int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name ='" + name + '\'' +
                ", Model = '" + model + '\'' +
                ", Price =" + price +
                '}';
    }
}
