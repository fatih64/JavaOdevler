package Hafta4;

public class ProductItem extends Item {
    int amount = 0;
    double pricePerUnit = 0;
    double priceOfItem=0;


    public ProductItem(int amount, double pricePerUnit, String description) {
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
        this.description = description;
    }

    public double getPrice() {
        priceOfItem = amount * pricePerUnit;
        return priceOfItem;
    }
    public void print(){
        System.out.println("Item: " + description);
        System.out.println("Unit Price= " + pricePerUnit);
        System.out.println("Amount= " + amount);
        System.out.println("Total Price= " + this.getPrice());
    }
}
