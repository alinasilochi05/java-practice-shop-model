package org.example.BookShop;

public class Bookster {
   private String companyName;
   private SubscriptionLevel subscription;

    public Bookster(String companyName, SubscriptionLevel subscription) {
        this.companyName = companyName;
        this.subscription = subscription;
    }

    public String toString() {
        return String.format("Company Name : %s, Subscription Level: %s,", this.companyName, this.subscription);
    }

}
