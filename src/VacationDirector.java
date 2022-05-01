package vacation;

public class VacationDirector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				OutdoorsVacationBuilder outdoorsyVacationBuilder = new OutdoorsVacationBuilder(); 
				Vacation outdoorsyVation = outdoorsyVacationBuilder
						.addAccommodation("Two Person tent", 2020, 7, 1, 5, 34)
						.addEvent("Beach")
						.addAccommodation("Two Person tent")
						.addEvent("Mountains")
						.getVacation();
				System.out.println(outdoorsyVation);
				
				CityVacationBuilder cityVacationBuilder = new CityVacationBuilder();
				Vacation cityVacation = cityVacationBuilder
						.addAccommodation("Grand Facadian", 2020, 8, 1, 5, 0)
						.addAccommodation("Hotel Commander", 2020, 8, 6, 2, 0)
					    .addEvent("Cirque du Soleil")
					    .getVacation();
				System.out.println(cityVacation);
				
	}

}
