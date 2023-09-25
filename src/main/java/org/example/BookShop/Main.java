package org.example.BookShop;
import org.example.ShopBase.Client;
import org.example.ShopBase.Order;
import org.example.ShopBase.Product;
import org.example.libs.ExperienceLevel;
import org.example.libs.City;


public class Main {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();

        //Inherited fields from ShopBase

        // Add a new client in Bookshop
        bookShop.addNewClient(new Client("Ana", "ana20"));
        bookShop.addNewClient(new Client("Lili", "lili20"));
        bookShop.addNewClient(new Client("Radu", "radu20"));

        //Edit Client by username
        bookShop.editClientNameByUsername("ana20", "Ana-Maria.");

        //Return the list of clients
        System.out.println(bookShop.getClients());

        //Add new product in BookShop
        bookShop.addNewProductInStocks(new Product("The Shining-2019", 4, 10));
        bookShop.addNewProductInStocks(new Product("Salem's Lot-v2019", 10, 20));


        //Edit product quantity
        bookShop.setProductQuantity("The Shining-2019", 100);

        //Return the stock list
        System.out.println(bookShop.getStock());

        //Create an order
        bookShop.addOrder(new Order("ana20", "The Shining-2019", 2));


        //SPECIFIC METHODS

        //Add a new writer
        bookShop.addWriter(new Writer("King", ExperienceLevel.HIGH, Publication.W1));

        //Return writers list
        System.out.println(bookShop.getWriters());




    }



}