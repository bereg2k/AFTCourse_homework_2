package sweets;

public class Jellybean extends Sweets {
    private String flavour; //вкус - клубника, малина, яблоко, банан, кола и т.д...

    public Jellybean(String name, double weight, double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Мармелад [" + super.toString() + ", вкус: " + flavour + "]";
    }
}
