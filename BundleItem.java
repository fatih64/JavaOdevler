package Hafta4;

import java.util.Arrays;

public class BundleItem extends Item{
    float discountRate= 0f;
    double totalPriceOfBundle=0;
    double discountedPriceOfBundle=0;
    Item[] bundleItems= {};

    public BundleItem(float discountRate, String description, Item[] bundleItems) {
        this.discountRate = discountRate;
        this.description=description;
        this.bundleItems=bundleItems;
    }

    public double getPrice(){
        for(int i=0; i<bundleItems.length; i++){
            totalPriceOfBundle+=bundleItems[i].getPrice();
            discountedPriceOfBundle=totalPriceOfBundle*(1-discountRate);
        }
        return discountedPriceOfBundle;
    }
    public void print(){
        System.out.println("Item Description: " + description);
        System.out.println("Discount Rate of Bundle: " + discountRate);
        System.out.println("Discounted Price of Bundle: " + this.getPrice());
        System.out.println("Bundle items are: " + Arrays.toString(bundleItems));
    }

    public static void main(String[] args){
        BundleItem bundle1=new BundleItem(0.20f, "hediye Paketi",
               new Item[]{new ProductItem(5, 1.80, "milk"),
                new ProductItem(3, 1.80, "Milk"),
                new ProductItem(2, 1.80, "Milk"),
                new ServiceItem(25, "Delivery")});

        BundleItem bundle2=new BundleItem(0.30f, "dugun Paketi",
                new Item[]{new ProductItem(5, 1.80, "milk"),
                new ProductItem(3, 1.80, "Milk"),
                bundle1,
                new ServiceItem(25, "Delivery")});

        bundle2.print();
    }
}
