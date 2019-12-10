package test.Juan.com.Drone;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Juan.com.Drones.Drone;
import main.Juan.com.Orders.Order;

class DroneTest {
	Drone testDrone= new Drone();

	@Test
	void testGetCoordsOfANewDroneMustBeOrigin() {

		assertEquals(0,testDrone.getCoords()[0]);
		assertEquals(0,testDrone.getCoords()[1]);
	}

	@Test
	void testGetDirectionOfANewDroneMustBeNorth() {
		assertEquals('n',testDrone.getDirection());
	}
	@Test
	void testExecuteMovement() {
		testDrone.executeMovement("AIDDAIDDAIDDAIDD");
		assertEquals('n',testDrone.getDirection());
		assertEquals(0,testDrone.getCoords()[0]);
		assertEquals(0,testDrone.getCoords()[1]);		
	}
	void testExecuteMovementFromExample() {
		//this instructions are from the challenge example, according to them, the final result should be '(-4, 2) dirección Oriente'
		// however according to this code the final result is '(0, 0) dirección Occidente'
		testDrone.executeMovement("AAAAIAADDDAIADAAIADAD");
		assertEquals('w',testDrone.getDirection());
		assertEquals(0,testDrone.getCoords()[0]);
		assertEquals(0,testDrone.getCoords()[1]);		
	}
	

}
