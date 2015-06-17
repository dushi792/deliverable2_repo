package com.jun;

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
		verify(h, times(1)).moveNorth();
		verify(h, never()).moveSouth();
		assertEquals(result, 0);
	}

}
