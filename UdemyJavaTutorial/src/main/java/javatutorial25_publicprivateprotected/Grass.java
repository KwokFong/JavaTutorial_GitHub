package javatutorial25_publicprivateprotected;

import javatutorial25_publicprivateprotected_world.Plant;

public class Grass extends Plant{
	
	public Grass(){
		
		// won't work; Grass not in same package as Plant, even though it's a subclass
//		System.out.println(this.height);
	}
}
