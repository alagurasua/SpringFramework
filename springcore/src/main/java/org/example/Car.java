package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Scanner;

@Component
public class Car implements Vehicle{

    private final Map<String, VehicleModel> modelMap;

    @Autowired
    public Car(Map<String, VehicleModel> modelMap) {
        this.modelMap = modelMap;
    }

    private VehicleModel vehicleModel;

    public void displayDetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Car Models:");
        System.out.println("1. Tata Harrier");
        System.out.println("2. Toyota Innova");
        System.out.println("Select the available options:");
        int option = scanner.nextInt();

        if(option == 1){
            vehicleModel = modelMap.get("tataHarrier");
        } else if (option == 2) {
            vehicleModel = modelMap.get("toyotaInnova");
        } else {
            System.out.println("Invalid Option");
        }
        if (vehicleModel != null) {
            System.out.println("Today Car Selected");
            vehicleModel.displayModel();
        }
    }
}
