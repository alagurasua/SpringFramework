package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Scanner;

public class Bike implements Vehicle{

    private final Map<String, VehicleModel> modelMap;

    @Autowired
    public Bike(Map<String, VehicleModel> modelMap) {
        this.modelMap = modelMap;
    }

    private VehicleModel vehicleModel;

    public void displayDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Bike Models:");
        System.out.println("1. Yamaha R15");
        System.out.println("2. Royal Enfield");
        System.out.println("Select the available options:");
        int option = scanner.nextInt();

        if(option == 1){
            vehicleModel = modelMap.get("MyYamahaR15");
        } else if (option == 2) {
            vehicleModel = modelMap.get("MyRoyalEnfield");
        } else {
            System.out.println("Invalid Option");
        }
        if (vehicleModel != null) {
            System.out.println("Today Bike Selected");
            vehicleModel.displayModel();
        }
    }
}
