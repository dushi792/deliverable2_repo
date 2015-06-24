package com.is2955.del2;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {
	//Do something
	
	@Test
	public void testMoveNorth() {
		//Precondition
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p, h);
		//Execution step
		int result = g.doSomething("N");
		//Assertions
		verify(h).moveNorth();
		verify(h, never()).moveSouth();
		assertEquals(result, 0);
	}
	@Test
	public void testMoveSorth() {
		//Precondition
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p, h);
		//Execution step
		int result = g.doSomething("S");
		//Assertions
		verify(h).moveSouth();
		verify(h, never()).moveNorth();
		assertEquals(result, 0);
	}
	@Test
	public void testDrink1() {
		//Precondition
		Player p = mock(Player.class);
		when(p.drink()).thenReturn(true);
		House h = mock(House.class);
		Game g = new Game(p, h);
		//Execution step
		int result = g.doSomething("D");
		//Assertions
		verify(p).drink();
		assertEquals(result, 1);
	}
	
	@Test
	public void testDrink2() {
		//Precondition
		Player p = mock(Player.class);
		when(p.drink()).thenReturn(false);
		House h = mock(House.class);
		Game g = new Game(p, h);
		//Execution step
		int result = g.doSomething("D");
		//Assertions
		verify(p).drink();
		assertEquals(result, -1);
	}
	
	@Test
	public void testShowInventory() {
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p, h);
		int result = g.doSomething("I");

		verify(p).showInventory();
		assertEquals(result, 0);
	}
	
}