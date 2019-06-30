package com.codingdojo.ObjectMaster2;

public class Ninja extends Human {
	public Ninja () {
		this.stealth= 10;    //Set default stealth to 10

		}


		public void steal (Human NinjaMethod) {
		NinjaMethod.health -= stealth;    //remove stealth from Ninja
		this.health += stealth;    //add health to Ninja

		}



		//Add a method runAway() that decreases their health by 10
		public void runAway() {
		this.health -= 10;
		}


		//method to display the summary report 
		public void displayHealth() {
		System.out.println("Updated Health Status: "+health);
		}


		}

