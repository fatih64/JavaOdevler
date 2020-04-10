package Hafta4;

import java.util.Arrays;

public class Order {
    double totalPriceOfOrder=0;
    private Item[] orderItems = {};


    public Order(Item[] orderItems) {
        this.orderItems = orderItems;
    }
    public double getPrice(){
        for(int i=0; i<orderItems.length; i++){
            totalPriceOfOrder+=orderItems[i].getPrice();
            }
        return totalPriceOfOrder;
    }
    public double printOrderItems(){
        for(int i=0; i<orderItems.length; i++){
            System.out.println("Order Item" + (i+1));
            orderItems[i].print();
        }
        System.out.println(orderItems.length);
        return totalPriceOfOrder;
    }

    public static void main(String[] args){

        ProductItem product1= new ProductItem(5, 2, "süt-2lt");
        ProductItem product2= new ProductItem(2, 27, "Waschmittel-5 lt");
        ServiceItem service1=new ServiceItem(500,"Tamirat");
        ServiceItem service2=new ServiceItem(150,"Temizlik");
        Order order1=new Order(new Item[]{product1, product2, service1, service2});

        System.out.println(order1.getPrice());
        System.out.println(order1.printOrderItems());


    }
}