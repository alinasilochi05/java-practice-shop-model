package org.example.ShopBase;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShopBase {
    private final ArrayList<Client> clients = new ArrayList<>();
    private final ArrayList<Order> orders = new ArrayList<>();
    private final ArrayList<Product> stocks = new ArrayList<>();

    static Logger logger = Logger.getLogger(ShopBase.class.getName());

    //CLIENT SECTION

    //Add new client, only if the username is unique
    public void addNewClient(Client newClient) {
        for (Client client : clients) {
            if (Objects.equals(client.getUsername(), newClient.getUsername())) {
                logger.log(Level.SEVERE, String.format("Username [%s] already exists. Cannot add the client.", client.getUsername()));
                return;
            }
        }
        clients.add(newClient);
        logger.log(Level.INFO, String.format("Client with username [%s] has been added successfully.", newClient.getUsername()));

    }

    //Return clients list
    public ArrayList<Client> getClients() {
        return clients;
    }


   //Delete a client by username, only if the username already exists in clients list
    public void deleteClientByUsername(String username) {
        boolean clientDeleted = clients.removeIf(client -> {
            if (Objects.equals(client.getUsername(), username)) {
                logger.log(Level.INFO, String.format("Client with username [%s] has been deleted", username));
                return true;
            }
            return false;
        });
        if (!clientDeleted) {
            logger.log(Level.SEVERE, String.format("Client with username [%s] has not been found", username));
        }
    }

    // Edit client name by username, only if the username already exists in clients list
    public void editClientNameByUsername(String username, String newName) {
        Client client = clients.stream().filter(clientElement -> Objects.equals(clientElement.getUsername(), username)).findFirst().orElse(null);
        if (client == null) {
            logger.log(Level.INFO, "This username already exist");
            return;
        }
        client.setName(newName);
        logger.log(Level.INFO, String.format("Client with username [%s] has been changed to [%s]", username, newName));
    }

    public void editClientNameByUsernameV2(String username, String newName) {
        for (Client client : clients) {
            if (Objects.equals(username, client.getUsername())) {
                client.setName(newName);
                logger.log(Level.INFO, "The client name was successfully edited");
            }
        }
    }


    //PRODUCTS SECTION

    //Create a new product, only if the product name is unique
    public void addNewProductInStocks(Product newProduct) {
        for (Product productElement : stocks) {
            if (Objects.equals(newProduct.getName(), productElement.getName())) {
                logger.log(Level.SEVERE, "This product already exists, please try again");
            }
        }
        stocks.add(newProduct);
        logger.log(Level.INFO, String.format("The product [%s], has been successfully added", newProduct.getName()));

    }
    // Set product quantity only if the product name exists in stock
    public void setProductQuantity(String productName, int editedQuantity) {
        for (Product product : stocks) {
            if (Objects.equals(productName, product.getName())) {
                product.setQuantity(editedQuantity);
                logger.log(Level.INFO, String.format("Quantity successfully edited. Actual quantity for [%s] is [%s]", productName, editedQuantity));
                return;
            }
        }
        logger.log(Level.SEVERE, "The quantity couldn't be edited. Please try again");
    }

    //Return the stock list
    public ArrayList<Product> getStock() {
        return stocks;
    }


    //ORDER SECTION

    // Before a new order to be added, it needs to check some aspects:
    //1. a valid client username is registered
    public void checkIfClientExist(String username) throws Exception {
        Client isClientCreated = clients.stream().filter(clientElement -> Objects.equals(clientElement.getUsername(), username)).findFirst().orElse(null);
        if (isClientCreated == null) {
            throw new Exception("This username doesn't exists");
        }
    }

    //2. a valid product is available
    public void checkIfProductExist(String productName) throws Exception {
        Product isProductAvailable = stocks.stream()
                .filter(product -> Objects.equals(product.getName(), productName))
                .findFirst()
                .orElse(null);
        if (isProductAvailable == null) {
            throw new Exception("This product can't be found");
        }
    }

    //3. a valid quantity in selected (the product is in stock)

    public void checkIfProductIsInStock(String productName, int productQuantity) throws Exception {
        Product stockProduct = stocks.stream()
                .filter(product -> product.getQuantity() >= productQuantity &&
                        Objects.equals(product.getName(), productName))
                .findFirst()
                .orElse(null);
        if (stockProduct == null) {
            throw new Exception("This product is out of stock");
        }
        setProductQuantity(stockProduct.getName(), stockProduct.getQuantity() - productQuantity);
    }

    // Create an order checking that the above condition are fulfilled
    public void addOrder(Order newOrder) {
        try {
            checkIfClientExist(newOrder.getClientUsername());
            checkIfProductExist(newOrder.getProduct());
            checkIfProductIsInStock(newOrder.getProduct(), newOrder.getQuantity());
            orders.add(newOrder);
            logger.log(Level.INFO, "Your order has been sent");
        } catch (Exception error) {
            logger.log(Level.WARNING, error.getMessage());
            logger.log(Level.WARNING, "Your order couldn't be processed");
        }
    }

    public int[] calculatePricePerItem() {
        for (Product product : stocks) {
            int pricePerItem = product.getPrice() * product.getQuantity();
        }
        return new int[0];
    }

    public int calculateTotalPrice() {
        int[] eachItemPrice = calculatePricePerItem();
        int totalPrice = 0;
        for (int value : eachItemPrice) {
            totalPrice++;
        }
        return totalPrice;
    }


}

