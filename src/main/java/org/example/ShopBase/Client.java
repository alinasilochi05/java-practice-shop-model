package org.example.ShopBase;

public class Client {
    private String name;
    private String username;

    public Client(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString(){
        return String.format("Name : %s, Username: %s", this.name, this.username);
    }

}
