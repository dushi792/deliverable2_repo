package com.is2955.del2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testHasAllItems1() {
		//Test in condition a player has no sugar, cream or coffee
		Player p1 = new Player();
		boolean res = p1.hasAllItems();
		assertEquals(res, false);
	}
	@Test
	public void testHasAllItems2() {		
		//Test in condition a player has sugar, cream and coffee
		Player p2 = new Player(true, true, true);
		boolean res = p2.hasAllItems();
		assertEquals(res, true);
	}
	@Test
	public void testDrink1() {
		//Test in condition a player has no sugar, cream or coffee
		Player p1 = new Player();
		boolean res = p1.drink();
		assertEquals(res, false);
	}
	@Test
	public void testDrink2() {
		//Test in condition a player has sugar, cream and coffee
		Player p2 = new Player(true, true, true);
		boolean res = p2.drink();
		assertEquals(res, true);
	}
}
