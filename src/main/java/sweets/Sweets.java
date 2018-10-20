package sweets;

public abstract class Sweets {
    private String name;
    private double weight;
    private double price;

    Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Наименование:  " + name + ", вес = " + weight + " г., цена = " + price + " руб.";
    }
}
