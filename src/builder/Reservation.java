package vacation;

import java.time.LocalDate;

public class Reservation {
		LocalDate arrivaldate;
		int nights;
		
		public void setArrivalDate(int year, int month, int day) {
			this.arrivaldate = LocalDate.of(year, month, day);
		}

		public LocalDate getArrivalDate() {
			return this.arrivaldate;
		}
		
		public void setNights(int nights) {
			this.nights = nights;
		}
		
		public int getNights() {
			return this.nights;
		}
		
}
