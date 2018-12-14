package railTicket;

import java.util.ArrayList;

public class Reservation {
	
	private ArrayList<Integer> reservations;
	
	public Reservation() {
		this.reservations = new ArrayList<Integer>();
	}
	
	public void book(int ticket) {
		reservations.add(ticket);
	}
	
	public void cancel(int ticket) {
		reservations.remove(ticket);
	}
	
	public void view() {
		System.out.println("Your ticket reservations are:");
		for (int i = 0; i < reservations.size(); i++) {
			System.out.println("Ticket Number: " + reservations.get(i));
		}
	}
	public static void main(String [] args) {
		int ticket1 = 1;
		int ticket2 = 2;
		
		Reservation myReservations = new Reservation();
		myReservations.book(ticket1);
		myReservations.book(ticket2);
		myReservations.view();
		myReservations.cancel(ticket1);
		myReservations.view();
	}
}
