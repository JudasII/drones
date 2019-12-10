package main.Juan.com.app;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import main.Juan.com.Delivery.Delivery;
import main.Juan.com.Drones.Drone;
import main.Juan.com.Orders.Order;


public class App {

	public static void main(String[] args) throws IOException {
		File in = new File("../deliveryDrones/src/Utils/in.txt");
        FileWriter out=new FileWriter("../deliveryDrones/src/Utils/out.txt");
		out.write("== Reporte de entregas ==\n");
		Scanner input = new Scanner(in);
		Drone dron1 = new Drone();
    	int orders =0;
	    while (input.hasNextLine()) {
			if(orders%3 == 0)
				 dron1 = new Drone();
			String inputString = input.nextLine();
			Order orden1 = new Order(inputString);
			Delivery action1= new Delivery();
			String fin=action1.doDelivery(dron1, orden1);
	        out.write(fin + "\n");    
			orders++;

	    }
        out.close();
	}

}
