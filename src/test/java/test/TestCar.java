package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class TestCar {
	
	Car testInstance = new Car(25, "Blue", "Vw");
	int speed = 30;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testVariable() {
		assertNotNull(speed);
	}
	
	@Test
	public void testAccerateCar() {
		testInstance.acclerateCar();
		assertEquals(speed,testInstance.getSpeed());
	}
	
	@Test
	public void testStopCar() {
		testInstance.stopCar();
		assertEquals(0,testInstance.getSpeed());
		
	}
	
	@Test
	public void testIsMoving() {
		testInstance.stopCar();
		assertFalse(testInstance.isMoving());
	}
	
	
}
