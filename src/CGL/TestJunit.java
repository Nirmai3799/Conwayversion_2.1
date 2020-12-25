package CGL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	@Test
	public void testBoard1() {
		Board b=new Board();
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(null,b.createBoard(-10));
		
	}
	@Test
	public void testBoard2(){
		Board b = new Board();
		b.createBoard(10);
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n",(cgl.generateNextGeneration(b.createBoard(10),1)));
	}
	@Test
	public void testBoard3() {
		Board b = new Board();
		b.createBoard(10);
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		
		System.out.println("======TEST THREE EXECUTED=======");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n...**.....\n....*.....\n..*.**....\n...***....\n....**....\n..........\n",(cgl.generateNextGeneration(b.createBoard(10),2)));
		
	}
	@Test
	public void testBoard4() {
		Board b = new Board();
		b.createBoard(10);
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		System.out.println("======TEST FOUR EXECUTED=======");
		Assertions.assertEquals("Iteration can't be performed.",(cgl.generateNextGeneration(b.createBoard(10),-3)));
	}
	
	
}
