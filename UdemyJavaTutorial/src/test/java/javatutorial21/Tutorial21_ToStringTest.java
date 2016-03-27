package javatutorial21;

import org.junit.Before;
import org.junit.Test;
import javatutorial21.Frog;
import static org.assertj.core.api.Assertions.*;

public class Tutorial21_ToStringTest {
	
	public Frog frog1;
	public Frog frog2;
	
	@Before
	public void setup(){

	}

	@Test
	public void checkObjectsNotNull(){
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		
		assertThat(frog1).isNotNull();
		assertThat(frog2).isNotNull();
	}
	
	@Test
	public void checkObjects_toString(){
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		
		assertThat(frog1.toString()).as("Check frog1's toString() value").isEqualTo("7   : Freddy");
		assertThat(frog2.toString()).as("Check frog2's toString() value").isEqualTo("5   : Roger");
		
		assertThat(frog1.toString()).startsWith("7");
		assertThat(frog2.toString()).startsWith("5");
		
		assertThat(frog1.toString()).endsWith("Freddy");
		assertThat(frog2.toString()).endsWith("Roger");
		
		assertThat(frog1).isNotEqualTo(frog2);
	}	
	
	@Test
	public void checkObjects_toString_startsWith_endsWith(){
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		
		assertThat(frog1.toString()).startsWith("7");
		assertThat(frog2.toString()).startsWith("5");
		
		assertThat(frog1.toString()).endsWith("Freddy");
		assertThat(frog2.toString()).endsWith("Roger");
		
		assertThat(frog1).isNotEqualTo(frog2);
	}		
	
	@Test
	public void checkObjects_isNotEqualTo(){	
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		
		assertThat(frog1).isNotEqualTo(frog2);
	}			
}


