package com.is2955.del2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class RoomTest {

	@Test
	public void testHasItem() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.hasItem();
		assertEquals(result, true);
	}
	
	@Test
	public void testHasCream() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.hasCream();
		assertEquals(result, false);
	}
	
	@Test
	public void testHasCoffee() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.hasCoffee();
		assertEquals(result, true);
	}
	
	@Test
	public void testHasSugar() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.hasSugar();
		assertEquals(result, false);
	}
	
	@Test
	public void testNorthExit() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.northExit();
		assertEquals(result, true);
	}
	
	@Test
	public void testSouthExit() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.southExit();
		assertEquals(result, false);
	}
	
	@Test
	public void testGetDescription() {
		Room r = new Room(true, false, false, true, false);
		boolean result = r.getDescription()!=null;
		assertEquals(result, true);
	}
}
