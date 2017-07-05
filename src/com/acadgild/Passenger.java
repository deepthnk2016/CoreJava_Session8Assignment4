package com.acadgild;

/**
 * 
 * Passenger Class
 *
 */
class Passenger extends Thread {

	Reservation reserve;
	int requestedSeats;
	String passengerName;

	public Passenger(Reservation reserve, int requestedSeats, String passengerName) {
		this.reserve = reserve;
		this.requestedSeats = requestedSeats;
	}

	@Override
	// Invoke the reservation method
	public void run() // LINE C
	{
		reserve.reserveSeat(requestedSeats);
	}
}
