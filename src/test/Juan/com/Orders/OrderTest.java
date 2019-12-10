package test.Juan.com.Orders;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Juan.com.Orders.Order;

class OrderTest {
	Order testOrder = new Order("AAAI");
	@Test
	void testGetInstructionsFromPseudoMockedOrer() {
		assertEquals("AAAI", testOrder.getInstructions());
	}

}
