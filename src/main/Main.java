package main;

import city.City;
import city.Inhabitant;

public class Main {

	public static void main (String[] args){
	    
		City superCity = new City("Dallas");
		System.out.println("Creating Dallas city");

		for(int i = 0 ; i < 100 ; i++){
			Inhabitant in = new Inhabitant("inhabitant-"+i, 5000, superCity);
			superCity.addInhabitant(in);
		}
		System.out.println("Creating 100 inhabitants");
		System.out.println("Mailing letters for 6 days");
		
		for(int i = 0 ; i < 6 ; i++){
			System.out.println("********************************");
			System.out.println("Day " + i);
		}

	}
	
}
