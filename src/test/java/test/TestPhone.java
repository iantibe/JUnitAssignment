package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Phone;

public class TestPhone {

	Phone testPhone = new Phone("Android", 80, 5);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testChargeBattery() {
		testPhone.chargeBattery();
		assertEquals(85, testPhone.getBatteryLevel());
	}
	
	@Test
	public void testAddApp() {
		testPhone.addApp();
		assertEquals(6,testPhone.getNumberOfAppsInstalled());
	}

}
