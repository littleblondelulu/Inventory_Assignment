package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main throws Exception {
    public Categories(String name, int quantity, String category) {
        this.name = name;
        this.quantity
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Inventory> items = new ArrayList<>();

    public static storeInventory() {
        String option = scanner.nextLine();

        if (option.equals("1")){
            System.out.println("1. Create a new item.");
        }
        else if(option.equals("2")){
            System.out.println("2. Remove an item by its number.");
            //read in a number that indicates the item
            int idx = Integer.valueOf(scanner.nextLine());

            Inventory currentItem = items.get(idx);

            currentItem.remove(idx);

        }
        else if(option.equals("3")) {

            //CREATE VARIABLES [] WITH INV NUM FOR EA ITEM
            System.out.println("3. Update the quantity of that item");

        Inventory.createItem();

            for (int i = 0; i < items.size(); i++) {
                Inventory currentItem = items.get(i);
                int numberOfItems = items.get(i);
                //FINISH THIS CODE

            }
        }
        else {
            System.out.println("Invalid selection. Please try again!");
        }}
    }
}

