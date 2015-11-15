package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import city.City;
import city.Inhabitant;
import letter.Letter;
import letter.PromissoryLetter;
import letter.SimpleLetter;
import letterDecorator.RegistredLetter;
import letterDecorator.UrgentLetter;

public class Main {
	
	public static void main (String[] args){
	    
		// Creation of the city
		City superCity = new City("Dallas");
		System.out.println("Creating Dallas city");

		// Creation of 100 inhabitant
		for(int i = 0 ; i < 100 ; i++){
			Inhabitant in = new Inhabitant("inhabitant-"+i, 5000, superCity);
			superCity.addInhabitant(in);
		}
		System.out.println("Creating 100 inhabitants");
		System.out.println("Mailing letters for 6 days");
		
		// Simulation of the 6 days
		ArrayList<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		
		for(int i = 0 ; i < 6 ; i++){
			System.out.println("********************************");
			System.out.println("Day " + i);

			// Distribution of letters
			superCity.distributeLetter();
			
			// Generation of the senders - receivers
			inhabitants = randomInhabitants(superCity.getInhabitants());

			// Generation of the send of letters
			for(int j = 0 ; j < inhabitants.size()/2 ; j++){
				superCity.sendLetter(randomLetter(inhabitants.get(j), inhabitants.get(j+6)));
			}
		}
	}
	
	public static ArrayList<Inhabitant> randomInhabitants(List<Inhabitant> inhabitants) {
		
		// Creation of the list where we will stocked 12 inhabitants (6 senders - 6 receivers) and others variables
		ArrayList<Inhabitant> list = new ArrayList<Inhabitant>();
		Random r = new Random();
		int value;
		Inhabitant in;
		
		for(int i = 0 ; i < 12 ; i++){
			
			// Generation of random number between 0 - 99
			value = 0 + r.nextInt(100 - 0);
			
			// Take inhabitant number "value"
			in = inhabitants.get(value);
			
			// When we generate the receivers
			if(i >= 6) {
				
				// Test if the receiver is not the sender
				// If it's the same inhabitant, we decrement "i"
				if(list.get(i-6) == in)
					i--;
				else 
					list.add(in);
				
			} else { // When we generate the senders 
				
				// Add the inhabitant in the list
				list.add(in);
				
			}
		}

		return list;
	}
	
	public static Letter randomLetter(Inhabitant sender, Inhabitant receiver) {
		
		// Variables
		Letter letter;
		int value;
		Random r = new Random();
		
		// Generation of random number between 0 - 7
		value = 0 + r.nextInt(8 - 0);
		
		switch(value){
		case 0: // Creation of a simple letter
			letter = new SimpleLetter("blablabla",sender, receiver);
		break;
		case 1: // Creation of a promissory letter
			value = 0 + r.nextInt(100 - 0);
			letter = new PromissoryLetter(value, sender, receiver);
		break;
		case 2: // Creation of a simple letter in a urgent letter
			letter = new SimpleLetter("blablabla",sender, receiver);
			letter = new UrgentLetter(letter);
		break;
		case 3: // Creation of a promissory letter in a urgent letter
			value = 0 + r.nextInt(100 - 0);
			letter = new PromissoryLetter(value,sender, receiver);
			letter = new UrgentLetter(letter);
		break; // Creation of a simple letter in a registred letter
		case 4:
			letter = new SimpleLetter("blablabla",sender, receiver);
			letter = new RegistredLetter(letter);
		break;
		case 5: // Creation of a promissory letter in a registred letter
			value = 0 + r.nextInt(100 - 0);
			letter = new PromissoryLetter(value,sender, receiver);
			letter = new RegistredLetter(letter);
		break;
		case 6: // Creation of a simple letter in a registred letter in a urgent letter
			letter = new SimpleLetter("blablabla",sender, receiver);
			letter = new RegistredLetter(letter);
			letter = new UrgentLetter(letter);
		break;
		default: // Creation of a promissory letter in a registred letter in a urgent letter
			value = 0 + r.nextInt(100 - 0);
			letter = new PromissoryLetter(value,sender, receiver);
			letter = new RegistredLetter(letter);
			letter = new UrgentLetter(letter);		
		}
		
		return letter;
	}
	
}
