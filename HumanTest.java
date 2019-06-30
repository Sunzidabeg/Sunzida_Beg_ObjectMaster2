package com.codingdojo.ObjectMaster2;

public class HumanTest {
	public static void main(String[] args) {

		//create objects for all three classes of human's extension
		Ninja NJ = new Ninja();
		Wizard Wiz = new Wizard();
		Samurai Sam = new Samurai();

		Wiz.heal(Wiz);
		NJ.steal(Sam);
		NJ.runAway();
		Wiz.fireball(Sam);
		Sam.deathBlow(Wiz);
		Sam.meditate();


		//display the summary report of each human
		Wiz.displayHealth();
		NJ.displayHealth();
		Sam.displayHealth();


		Sam.howMany();

		//end    
		}
		}
	
	

