package org.example.BookShop;

import org.example.ShopBase.ShopBase;

import java.util.ArrayList;

public class BookShop extends ShopBase {

    public String name = "Book Shop";
    private ArrayList<Writer> writers = new ArrayList<>();
   private  ArrayList<Bookster> booksters=  new ArrayList<>();
    public BookShop(){
        super();
    }

    public void addWriter(Writer writer){
        writers.add(writer);
    }

    public ArrayList<Writer> getWriters(){
        return writers;
    }

    public void addNewBooksterPackage(Bookster bookster){
        booksters.add(bookster);
    }


}

