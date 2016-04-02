package javatutorial42_enums;

// For enum, the immediate ancestor is java.lang.Enum
// - CAT, DOG, MOUSE are like object instance of Animal enum...
public enum Animal {
//	CAT, DOG, MOUSE;
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	// instance variable for enum
	private String name;
	
	// ctor:
	// - can't be public; private or package access ONLY...
	// - parameter can be passed into objects of enum
	Animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// overriding toString() method is allowed...
	@Override
	public String toString() {
		return "This animal is called: " + name;
	}
}
