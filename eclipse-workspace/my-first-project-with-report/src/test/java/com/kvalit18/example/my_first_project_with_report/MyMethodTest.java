package com.kvalit18.example.my_first_project_with_report;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMethodTest {
	Mymethod ma = new Mymethod();
	
	@Test
	public void test() {
		assertEquals(ma.myAdd1(1), 2);
		assertTrue(ma.myAdd1(1) == 2);
	}

}
