package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {

	@Test
	public void rollThreeAndrollFiveShouldPointEight(){
		Game g = new Game();
		int result;
		g.roll(3);
		g.roll(5);
		result = g.score();
		
		assertEquals(8,result);
	}
	
	@Test
	public void rollThreeFiveSevenTwoShouldPointSeventeen(){
		Game g = new Game();
		int result;
		g.roll(3);
		g.roll(5);
		g.roll(7);
		g.roll(2);
		
		result = g.score();
		
		assertEquals(17,result);
	}
	
	@Test
	public void ThreeRollsThreeStrikesShouldScoreSixty(){
		Game g = new Game();
		int result;
		g.roll(10);
		g.roll(10);
		g.roll(10);
		
		result = g.score();
		
		assertEquals(60,result);
		
	}
	
	@Test
	public void realGame(){
		Game g = new Game();
		int result;
		g.roll(3);
		g.roll(5);
		g.roll(10);
		g.roll(3);
		g.roll(7);
		g.roll(8);
		g.roll(10);
		g.roll(10);
		g.roll(6);
		g.roll(2);
		g.roll(5);
		g.roll(4);
		g.roll(7);
		g.roll(3);
		g.roll(10);
		g.roll(6);
		g.roll(3);
		
		result = g.score();
		
		assertEquals(155, result);
		
	}
}