package com.codingdojo.ObjectMaster2;

public class Samurai extends Human {
	public int NumberOfSamurai=0;    //this is variable to add one Samurai for each attack and count number of Samuraies at the end


	//Override the health by 200
	public Samurai() {
	this.health=200;
	}



	public void deathBlow(Human SamMethod) {
	SamMethod.health = 0;
	this.health = (this.health/2);
	NumberOfSamurai += 1; //add one Samurai after each attack
	}



	//Add a method meditate() that heals the Samurai for half of their current health
	public void meditate() {
	this.health += (this.health/2);
	NumberOfSamurai += 1; //add one Samurai after each attack    
	}


	//Add a method howMany() that returns the total current number of Samurai
	public  void howMany() {
	System.out.println("\nTotal current number of Samurai is: "+NumberOfSamurai);
	}


	//method to display the summary report 
	public void displayHealth() {

	System.out.println("Updated Health Status: "+health);

	}


	}

