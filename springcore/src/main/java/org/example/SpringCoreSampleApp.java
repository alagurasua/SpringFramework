package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class SpringCoreSampleApp
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Vehicle you planned to use today (Car/Bike) :");
        String option = scanner.nextLine();

        Vehicle vehicle = null;

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        if(option.equalsIgnoreCase("Car")){
            vehicle = (Vehicle) context.getBean(Car.class);

        } else if (option.equalsIgnoreCase("Bike")) {
            vehicle = (Vehicle) context.getBean(Bike.class);
        }

        if(vehicle != null)
            vehicle.displayDetails();
        else
            System.out.println("Invalid choice");

        scanner.close();
    }
}
