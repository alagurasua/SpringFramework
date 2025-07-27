package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public Car getCar(Map<String, VehicleModel> modelMap){
        return new Car(modelMap);
    }

    @Bean
    public Bike getBike(Map<String, VehicleModel> modelMap){
        return new Bike(modelMap);
    }

    @Bean
    public TataHarrier getTataHarrier(){
        return new TataHarrier();
    }

    @Bean
    public ToyotaInnova getToyotaInnova(){
        return new ToyotaInnova();
    }

    @Bean
    public YamahaR15 getYamahaR15(){
        return new YamahaR15();
    }

    @Bean
    public RoyalEnfield getRoyalEnfield(){
        return new RoyalEnfield();
    }
}
