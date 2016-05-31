package ua.org.oa.Practice2.dyachenko_s;

/**
 * Created by serj27 on 11.04.2016.
 */
public class Notebook {

    private String model;
    private String description;
    private int price;
    private String varranty;

    public Notebook(String model, String description, int price, String varranty) {
        this.model = model;
        this.description = description;
        this.price = price;
        this.varranty = varranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVarranty() {
        return varranty;
    }

    public void setVarranty(String varranty) {
        this.varranty = varranty;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "Model = " + model + '\'' +
                ", Description = " + description + '\'' +
                ", Price = " + price +
                ", Varranty = " + varranty +
                '}';
    }
}
