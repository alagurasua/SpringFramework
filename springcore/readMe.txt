Spring Core Sample – Dependency Injection (DI) & Inversion of Control (IoC):
------------------   ------------------------------------------------------


	Objective:
	----------
	- Design a simple Java application using Spring Core to demonstrate Inversion of Control (IoC) and Dependency Injection (DI).
	- The application simulates a real world use case where a user chooses a vehicle (Car or Bike) and then selects a model, and the application displays the selection.


	Requirement:
	-----------
	- A user has both cars and bikes.
	- Each day, the app should ask the user whether they want to use a bike or a car, and then allow them to select a vehicle model.
	- Finally, the app will display the selected vehicle type and model name.


	Design Components:
	-----------------

		1. Interfaces
		-------------
			- To enable loose coupling and achieve polymorphism, two interfaces are defined:
			
			1. Vehicle
				- Represents the abstraction for vehicle types (Car, Bike).
				- Method: void displayDetails(); – used to display selected model details.
			
			2. VehicleModel
				- Represents individual models for each vehicle type (like Tata Harrier, Yamaha R15).
				- Method: void displayModel(); – used to print the model name.
				
		2. Concrete Classes
		-------------------
			- Vehicle Implementations:
			--------------------------
				- Car implements Vehicle
				- Bike implements Vehicle
				- Each class depends on a VehicleModel implementation.
				- Dependency is injected using Spring DI.
				
			- Model Implementations (All implement VehicleModel):
			-----------------------
				- Car Models:
					- TataHarrier
					- ToyotaInnova

				- Bike Models:
					- YamahaR15
					- RoyalEnfield
					
			- These beans will be injected into Car or Bike based on the user’s selection.
			

	Spring Dependency Injection:
	----------------------------

		- To demonstrate different DI techniques, the application supports four approaches:
		
		1. XML-based DI
			- Traditional approach using <bean> tags
			- applicationContext.xml
		
		2. XML + Annotation
			- Use @Component classes and configure scanning in XML
			- @Component, <context:component-scan>
		
		3. Java-based Configuration
			- Pure annotation-based configuration using Java classes
			- @Configuration, @Bean, @ComponentScan, @Autowired
		
		4. Component Scanning Only
			- Minimalistic setup using only @Component and @Autowired
			- Requires @ComponentScan
			
			
	Execution Flow:
	---------------

		MainApp.java
		   ↓
		Ask user: Car or Bike?
		   ↓
		Based on input, retrieve corresponding Vehicle bean (Car or Bike)
		   ↓
		Within Car/Bike class, display available models
		   ↓
		Ask user to choose a model
		   ↓
		Inject corresponding model (e.g., TataHarrier) using DI
		   ↓
		Call vehicle.displayDetails() → internally calls model.displayModel()
		
	
	Design Pattern Highlighted:
	---------------------------

		- Strategy Pattern: The Vehicle class delegates model-specific behavior to a VehicleModel implementation.
		- Dependency Injection (DI): Concrete dependencies are injected by the Spring container.
		- Inversion of Control (IoC): Control over object creation is moved from the program to the Spring framework.