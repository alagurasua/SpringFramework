package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Scanner;

@Component
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
            vehicleModel = modelMap.get("getYamahaR15");
        } else if (option == 2) {
            vehicleModel = modelMap.get("getRoyalEnfield");
        } else {
            System.out.println("Invalid Option");
        }
        if (vehicleModel != null) {
            System.out.println("Today Bike Selected");
            vehicleModel.displayModel();
        }
    }
}
