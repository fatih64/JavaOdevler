package Hafta4;

public class ServiceItem extends Item {
    private double flatPrice=0;
   private  double priceOfItem=0;

    public ServiceItem(double flatPrice, String description) {
        this.flatPrice = flatPrice;
        this.description = description;
    }

    public double getPrice(){
        double priceOfItem=flatPrice;
        return priceOfItem;
    }
    public void print(){
        System.out.println("Service: " + description);
        System.out.println("Total Price= " + this.getPrice());
    }
}
