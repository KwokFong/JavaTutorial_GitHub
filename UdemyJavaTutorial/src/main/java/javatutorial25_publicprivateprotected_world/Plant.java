package javatutorial25_publicprivateprotected_world;

public class Plant {
	// Bad practice
	public String name;
	
	// Acceptable practice
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	// package level access
	int height;
	
	public Plant(){
		this.name = "Freddy";
		this.type = "plant";
		
		this.size = "medium";
		this.height = 8;
	}
}
