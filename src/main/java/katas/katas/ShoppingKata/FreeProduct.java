package katas.katas.ShoppingKata;

public class FreeProduct extends Products {

    private String name;
    private double price;

    public FreeProduct(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        return price;
    }
}
