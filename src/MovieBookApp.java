//Thread Safety in java
//MovieBook application

//class:- features+methods

class BookTheaterSeat {
	int total_seats = 10; //features

	synchronized void bookSeat(int seats) {
		if (total_seats >= seats) { 
			System.out.println(seats + " seats booked successfully"); //7 seats booked succesfully
			total_seats = total_seats - seats; //10 - 6 =4 - 7 =-3
			System.out.println("Seats Left: "+total_seats);//Seats Left: 3
		}
		else
		{
			System.out.println("Sorry seats cannot be booked....!");
			System.out.println("Seats Left: "+total_seats);
		}
	}
}

public class MovieBookApp extends Thread
{
	static BookTheaterSeat b;
	int seats;
	
	public void run() { //parallely run with different objects
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) {
		b=new BookTheaterSeat();
		
		MovieBookApp manbir=new MovieBookApp();
		manbir.seats=7;
		manbir.start();//invoke run() method
		
		MovieBookApp neha=new MovieBookApp();
		neha.seats=6;
		neha.start();//invoke run() method	
	}
}
