package org.example.BookShop;

import org.example.libs.ExperienceLevel;

public class Writer {
   private String name;
   private ExperienceLevel level;
   private Publication publication;

    public Writer(String name, ExperienceLevel level, Publication publication) {
        this.name = name;
        this.level = level;
        this.publication = publication;
    }

    public String getName() {
        return name;
    }

    public ExperienceLevel getLevel() {
        return level;
    }

    public Publication getPublication() {
        return publication;
    }

    public String toString() {
        return String.format("Name : %s, Experience Level: %s, Publication: %s", this.name, this.level, this.publication);
    }

}
