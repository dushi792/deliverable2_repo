package com.is2955.del2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author zhaojun
 *
 */
public class CoffeeMakerTest {

	@Test
	public void testrRunArgs() {
		CoffeeMaker cm = new CoffeeMaker();
		int res = cm.runArgs("");
		assertEquals(res, 0);
	}

}
