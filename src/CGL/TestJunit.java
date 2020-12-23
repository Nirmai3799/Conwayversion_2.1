package CGL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	@Test
	public void testBoard(){
		Board b = new ConwayGameOfLife();
		System.out.println("======TEST ONE EXECUTED=======");
		 Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n",((ConwayGameOfLife) b).generateNextGeneration(b.createBoard(10)));
		
		
	}
	
	
	

}
