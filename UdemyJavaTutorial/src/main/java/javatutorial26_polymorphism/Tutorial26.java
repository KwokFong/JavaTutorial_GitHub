package javatutorial26_polymorphism;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 26: Polymorphism
 */

public class Tutorial26 {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
//		Plant plant2 = plant1;
		Plant plant2 = tree;
		
		// 1st grow() is from Plant class; 2nd grow() is from Tree class
		plant1.grow();
		plant2.grow();
		
		tree.shedLeaves();
		
		// not work; Plant doesn't have shedLeaves() defined.
//		plant2.shedLeaves();
		
		System.out.println();
		doGrow(tree);

	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
