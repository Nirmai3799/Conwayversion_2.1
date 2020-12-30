package CGL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	@Test
	public void testBoard1() {
		int s[][]= {{1,2,3},{2,3,4}};
		Board b=new Board();
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(null,b.createBoard(-10,s));
		
	}
	@Test
	public void testBoard2(){
		Board b = new Board();
		//b.createBoard(10);
		int s[][]= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n",(cgl.generateNextGeneration(b.createBoard(10,s),1)));
	}
	@Test
	public void testBoard3() {
		Board b = new Board();
		//b.createBoard(10);
		int s[][]= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		
		System.out.println("======TEST THREE EXECUTED=======");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n...**.....\n....*.....\n..*.**....\n...***....\n....**....\n..........\n",(cgl.generateNextGeneration(b.createBoard(10,s),2)));
		
	}
	@Test
	public void testBoard4() {
		Board b = new Board();
		//b.createBoard(10);
		int s[][]= {{1,2,3},{2,3,4}};
		ConwayGameOfLife cgl = new ConwayGameOfLife();
		System.out.println("======TEST FOUR EXECUTED=======");
		Assertions.assertEquals("Iteration can't be performed.",(cgl.generateNextGeneration(b.createBoard(10,s),-3)));
	}
	
	
}
