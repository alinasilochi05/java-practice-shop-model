package org.example.BeautyShop;
import org.example.libs.City;

public class Event {
    private String name;
    private int budget;
    private City location;
   private String organizer;

    public Event(String name, int budget, City location, String organizer) {
        this.name = name;
        this.budget = budget;
        this.location = location;
        this.organizer = organizer;
    }

    public String toString(){
        return String.format("Name : %s, Budget: %d, Location: %s, Organizer: %s", this.name, this.budget, this.location, this.organizer);
    }

}
