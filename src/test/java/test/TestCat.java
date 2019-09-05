package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Cat;

public class TestCat {

	Cat fluffy = new Cat("fluffy", "black", true);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLitterBoxTrained() {
		assertTrue(fluffy.isLitterBoxTrained());
	}
	
	@Test
	public void testSpeak() {
		assertEquals("Meow!", fluffy.speak());
	}
	
	@Test
	public void testPetCatTooMuch() {
		assertEquals("Hiss!", fluffy.petCatTooMuch());
	}

}
