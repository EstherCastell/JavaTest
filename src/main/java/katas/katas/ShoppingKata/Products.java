package katas.katas.ShoppingKata;

abstract class Products {
    private String name;
    private double price;

    public Products(String name, double price) {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
