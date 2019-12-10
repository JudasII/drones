package test.Juan.com.Delivery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Juan.com.Delivery.Delivery;
import main.Juan.com.Drones.Drone;
import main.Juan.com.Orders.Order;

class DeliveryTest {
	Drone testDrone= new Drone();
	Order testOrder = new Order("AAAAIAADDDAIADAAIADAD");
	Delivery testDelivery = new Delivery();

	@Test
	void testDoDeliveryShouldExecuteAdelivery() {
		String testLocation =testDelivery.doDelivery(testDrone, testOrder);
		assertEquals("(0, 0) dirección Occidente",testLocation);
	}

}
