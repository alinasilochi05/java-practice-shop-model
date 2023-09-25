package org.example.ShopBase;
import java.util.UUID;

public class Product {
   private final String name;
   private final UUID id;
   private int quantity;
   private int price;

   public Product(String name, int quantity, int price) {
      this.name = name;
      this.id = UUID.randomUUID();
      this.quantity = quantity;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
   public String toString(){
      return String.format("Name : %s, id: %s, Quantity: %d, Price: %d", this.name, this.id, this.quantity, this.price);
   }

   public int getPrice() {
      return price;
   }
}
