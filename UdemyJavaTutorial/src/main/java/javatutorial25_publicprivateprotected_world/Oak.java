package javatutorial25_publicprivateprotected_world;

public class Oak extends Plant {
	
	public Oak(){
		// won't work -- type is private
		//type = "tree";
		
		// size is protected and Oak is subclass of plant.
		this.size = "large";
		
		// No access specifier; works because Oak and Plant in same package.
		this.height = 10;
	}

}
