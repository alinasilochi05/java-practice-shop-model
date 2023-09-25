package org.example.BeautyShop;

import org.example.ShopBase.ShopBase;

import java.util.ArrayList;

public class BeautyShop extends ShopBase {

    public String name = "Beauty Shop";
    private ArrayList<MakeupArtist> makeupArtists = new ArrayList<>();
    private ArrayList<Event> events = new ArrayList<>();
    public BeautyShop(){
        super();
    }

    public void addNewEvent(Event event){
        events.add(event);
    }

    public ArrayList<Event> getEvents(){
        return events;
    }

    public void createNewMakeupArtist(MakeupArtist makeupArtist){
        makeupArtists.add(makeupArtist);
    }

    public ArrayList<MakeupArtist> getMakeupArtists(){
        return  makeupArtists;
    }
}
