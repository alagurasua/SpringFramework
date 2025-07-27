package org.example;

import org.springframework.stereotype.Component;

@Component
public class RoyalEnfield implements VehicleModel{
    public void displayModel() {
        System.out.println("Royal Enfield");
    }
}
