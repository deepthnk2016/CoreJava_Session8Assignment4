package com.acadgild;

class Reservation {

	static int availableSeats = 10;

	// synchronized reserveSeat method to book tickets.
	synchronized void reserveSeat(int requestedSeats) {

		System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
		//Book tickets if available seats are  greater that requested seats.
		if (availableSeats >= requestedSeats) {
			System.out.println("Seat Available. Reserve now");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeats + " seats booked.");
			availableSeats = availableSeats - requestedSeats;
		} else {
			System.out.println("Requested seats not available :-(");
		}

		System.out.println("----------------------------------------------");
	}
}