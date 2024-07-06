package oop_Interface;

public interface USMedical extends WHO {
	
	int min_fee = 10;	//by default static and final
	
	//no method body only method declaration = abstract method
	//can not create the object of interface in java
	//interface can not have constructor
	//all abstract methods are non static
	
	//public USMedical() {		}	//Error-interface can not have constructor
	
	//public static void hairServices();	//Error- all abstract methods are non static
	
	// 100% abstraction
	public void physioServices();
	
	public void oncologyServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	@Override
	public void covidVaccination();	
	
	//After JDK 1.8 : two mejor changes
	
	//1.Can have static method but with method body
	public static void billing() {
		//buss logic
		System.out.println("USM--Billing");
	}
	
	//2.Can have a default method with method body:non static
	
	default void RnD() {
		System.out.println("USM--RnD");
	}
	
}
