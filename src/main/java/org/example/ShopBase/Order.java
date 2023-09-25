package org.example.ShopBase;
import java.util.UUID;

public class Order {
  private  UUID number;
   private String clientUsername;
   private String product;
   private  int quantity;

    public Order(String clientUsername, String product, int quantity) {
        this.number = UUID.randomUUID();
        this.clientUsername = clientUsername;
        this.product = product;
        this.quantity = quantity;
    }

    public UUID getNumber() {
        return number;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
