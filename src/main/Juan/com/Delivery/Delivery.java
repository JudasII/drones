package main.Juan.com.Delivery;

import main.Juan.com.Drones.Drone;
import main.Juan.com.Orders.Order;

public class Delivery {
	private String indicateDirection(char heading) {
		switch(heading) {
		case 'n':
			return "direcci�n Norte";
		case 's':
			return "direcci�n Sur";
		case 'e':
			return "direcci�n Oriente";
		case 'w':
			return "direcci�n Occidente";
		}
		return null;
	}

	public String doDelivery(Drone dron, Order order) {

		char direction = dron.getDirection();
		String instructions = order.getInstructions();
		dron.executeMovement(instructions);
		int [] coords = dron.getCoords();
		direction = dron.getDirection();
		String orderDelivery = "("+ Integer.toString(coords[0])+", "+
				Integer.toString(coords[1])+") "+indicateDirection(direction);

		return orderDelivery;
		}
	}
