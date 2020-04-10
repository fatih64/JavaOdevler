package Hafta4;

public class Item {
    String description=new String();
    double priceOfItem=0;
    public double getPrice(){
        return priceOfItem;
         }
    public void print(){
        System.out.println("Item Description: " + description);
    }
}
