package com.is2955.del2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class HouseTest {

	@Test
	public void testGetDercription() {
		Room r = mock(Room.class);
		when(r.getDescription()).thenReturn("TEST");
		Room[] rooms = new Room[1];
		rooms[0] = r;
		House h = new House(rooms);
		String result = h.getCurrentRoomInfo();
		assertEquals(result, "TEST");
	}
	//Test if GenerateRooms does generate unique rooms
	@Test
	public void testGenerateRooms() {
		House h = new House(1);
		Room[] rooms = h.generateRooms(3);		
		assertNotNull(rooms);
		Room[] rooms2 = h.generateRooms(3);
		assertNotEquals(rooms, rooms2);
	}
}