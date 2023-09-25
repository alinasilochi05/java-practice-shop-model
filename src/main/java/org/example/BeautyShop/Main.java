package org.example.BeautyShop;
import org.example.ShopBase.Client;
import org.example.ShopBase.Order;
import org.example.ShopBase.Product;


public class Main {
    public static void main(String[] args) {
        BeautyShop beautyShop = new BeautyShop();


        //Inherited fields from ShopBase

        // Add a new client in Bookshop
        beautyShop.addNewClient(new Client("Xpert-Beauty", "expert20"));
        beautyShop.addNewClient(new Client("Sephora", "sephora20"));
        beautyShop.addNewClient(new Client("Mac", "mac20"));

        //Edit Client by username
        beautyShop.editClientNameByUsername("Xpert-Beauty", "Expert-Beauty");

        //Return the list of clients
        System.out.println(beautyShop.getClients());

        //Add new product in BookShop
        beautyShop.addNewProductInStocks(new Product("Rimmel-RL", 4, 10));
        beautyShop.addNewProductInStocks(new Product("Gloss-Elf", 10, 20));


        //Edit product quantity
        beautyShop.setProductQuantity("Gloss-Elf", 100);

        //Create an order
        beautyShop.addOrder(new Order("sephora20", "Rimmel-RL", 2));

        //Return the stock list
        System.out.println(beautyShop.getStock());



    }



}