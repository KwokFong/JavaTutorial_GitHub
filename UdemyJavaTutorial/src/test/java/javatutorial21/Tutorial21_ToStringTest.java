package javatutorial21;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javatutorial21.Frog;
import static org.assertj.core.api.Assertions.*;

public class Tutorial21_ToStringTest {
	
	private Frog frog1;
	private Frog frog2;
		
	@Before
	public void setUp(){
		frog1 = new Frog(7, "Freddy");
		frog2 = new Frog(5, "Roger");
	}

	@Test
	public void checkObjectsNotNull(){
		assertThat(frog1).isNotNull();
		assertThat(frog2).isNotNull();
	}
	
	@Test
	public void checkObjects_toString(){
		assertThat(frog1.toString()).as("Check frog1's toString() value").isEqualTo("7   : Freddy");
		assertThat(frog2.toString()).as("Check frog2's toString() value").isEqualTo("5   : Roger");
	}	
	
	@Test
	public void checkObjects_toString_startsWith_endsWith(){
		assertThat(frog1.toString()).startsWith("7");
		assertThat(frog2.toString()).startsWith("5");
		
		assertThat(frog1.toString()).endsWith("Freddy");
		assertThat(frog2.toString()).endsWith("Roger");
	}		
	
	@Test
	public void checkObjects_isNotEqualTo(){	
		assertThat(frog1).isNotEqualTo(frog2);
	}			
	
	@After
	public void tearDown(){
		frog1 = null;
		frog2 = null;
	}
}


