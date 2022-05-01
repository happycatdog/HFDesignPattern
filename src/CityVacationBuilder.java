package vacation;

public class CityVacationBuilder extends VacationBuilder {

			public CityVacationBuilder() {
				this.name = "City Vacation Builder";
			}
			
			@Override
			public VacationBuilder addAccommodation() {
				// TODO Auto-generated method stub
				this.accommodations.add(new Hotel());
				return this;
			}
		
			@Override
			public VacationBuilder addAccommodation(String name) {
				// TODO Auto-generated method stub
				this.accommodations.add(new Hotel(name));
				return this;
			}
		
			@Override
			public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
				// TODO Auto-generated method stub
				Reservation reservation = new Reservation();
				reservation.setArrivalDate(year, month, day);
				reservation.setNights(nights);
				
				Hotel hotel = new Hotel(name);
				hotel.setReservation(reservation);
				hotel.setRoomNumber(location);
				this.accommodations.add(hotel);
				return this;
			}
		
			@Override
			public VacationBuilder addEvent(String event) {
				// TODO Auto-generated method stub
				this.events.add("See the " + event + " show");
				return this;
			}

}
