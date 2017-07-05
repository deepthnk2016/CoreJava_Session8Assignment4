package com.acadgild;

/**
 * 
 * Bus tickets booking application This class will be catering to booking
 * requests of three passengers parallely. The method reserveSeat of Reservation
 * class is responsible for doing the booking and is made synchronized.
 */
public class Session8Assignment4 {

	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		// Invoke booking of first passenger
		Passenger passenger1 = new Passenger(reserve, 5, "Deepak");
		passenger1.start();

		// Invoke booking of second passenger
		Passenger passenger2 = new Passenger(reserve, 4, "Sweta");
		passenger2.start();

		// Invoke booking of third passenger
		Passenger passenger3 = new Passenger(reserve, 2, "Yuv");
		passenger3.start();

	}

}
