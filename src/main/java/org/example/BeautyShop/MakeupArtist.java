package org.example.BeautyShop;

import org.example.libs.ExperienceLevel;
import org.example.libs.City;

public class MakeupArtist {
    private String name;
    private final ExperienceLevel experienceLevel;
    private City city;

    public MakeupArtist(String name, ExperienceLevel experienceLevel,City city) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.city = city;
    }

    public String toString() {
        return String.format("Name : %s, Experience Level: %s, City: %s", this.name, this.experienceLevel, this.city);
    }
}
