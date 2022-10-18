// Saurab has two vehicles, one is honda accord car and another is Ducati Bike.
// Honda accord car runs on fuel called diesel.
// Ducati runs on fuel called petrol.
// Ducati is used and importerd vehicle.
// Honda accord is new and made in india.


// 1: Abstraction
// 2: Encapsulation
// 3: Polymorphism
// 4: Inheritance
// 5: Association
// 6: Aggregation
// 7: Composition

// USE CASE

import java.util.*;
// import java.io.*;

class Person  //person class for an individual person and defining its attributes
{
	private String name;
	private int noOfVehicles;
	private Car car;
	private Bike bike;

	public Person(String name, int noOfVehicles, Car car, Bike bike) 
	{
		this.name = name;
		this.noOfVehicles = noOfVehicles;
		this.bike = bike;
		this.car = car;
	}

	public int getNoOfVehicles() //Encapulation is being performed here using get and set Method
	{
		return noOfVehicles; // return vehicle count;
	}

	public String name()
	{
		return name; //return person name
	}

	public Car getCar()
	{
		return car; //Car name
	}

	public Bike getBike()
	{
		return bike; // bike name
	}

	@Override//Polymorphism(runtime)
	public String toString()//returns a string representation of the object.returns a string that "textually represents" this object

	{
		return name;
	} 

	public void driveCar() //for getting the position of the vehicle
	{	
		car.run();
	}

	public void driveBike() 
	{
		bike.run();
	}
}



abstract class Vehicle //vehicle class considering as base class (abstract class)
{	
	private String name;
	private String fuel;
	private String origin;
	private String status;



	public Vehicle(String name, String fuel, String origin, String status)
	{
        //Associated variables
		this.name = name;
		this.fuel = fuel; //
		this.origin = origin;
		this.status = status;
	}

	public String getName(){
		return name;
	}

	public String getFuel(){
		return fuel;
	}

	public String getOrigin(){
		return origin;
	}

	public String getStatus(){
		return status;
	}
	// public void setStatus(String status) {
	// 	this.status = status;
	// }

	@Override
	public String toString() {
		return name;
	} 

	abstract void run();
}



class Car extends Vehicle //for car attributes(Inheritance)
{

	public Car(String name, String fuel, String origin, String status) 
	{
		super(name, fuel, origin, status);
	}

	@Override
	public void run() 
	{
		System.out.println("Car is moving");
	}
}


class Bike extends Vehicle //for bike  attributes(Inheritance)
{
	public Bike(String name, String fuel, String origin, String status) 
	{
		super(name, fuel, origin, status);
	}

	@Override
	public void run() 
	{
		System.out.println("Bike is also moving");
	}
}


public class Vehicles_variety
{
	public static void main(String[] args) {

		Person person = new Person(
			"Saurabh", 2, 
			new Car("Honda Accord", "Diesel", "Made in India","New"), 
			new Bike("Ducati", "Petrol", "Imported","Used")
			);

		System.out.println("Person-Name :" + person);
		System.out.println("Number of vehicles :" +person.getNoOfVehicles());
		// System.out.println();

		System.out.println("Car-Name :" +person.getCar());
		System.out.println("Bike-Name :"+ person.getBike());
		System.out.println();

		
		
		System.out.println("Status of the Car :" + person.getCar().getStatus()); //for car status
		System.out.println("Fuel type of the Car :"+ person.getCar().getFuel());
		System.out.println("Origin of the Car :"+ person.getCar().getOrigin());
		System.out.println();

		System.out.println("Status of the Bike :"+person.getBike().getStatus()); // for bike status
		System.out.println("Fuel type of the Bike :"+ person.getBike().getFuel());
		System.out.println("Origin OF the Bike :"+ person.getBike().getOrigin());
		System.out.println();

		person.driveCar();
		person.driveBike();
	}
}