package katas.katas.ShoppingKata;

public class FoodProduct extends Products {

    private String name;
    private double price;
    private Boolean hasDiscount = false;

    public FoodProduct(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }
    public Boolean hasDiscount(){
        return hasDiscount;}

    public double discount(){
        return this.discount();
    }
    public void applyDiscount() {this.hasDiscount =true;}

    @Override
    public double getPrice(){
        if (hasDiscount){
            return price - ((price/100)*discount());
        }return price;
    }
}
