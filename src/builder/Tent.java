package vacation;

public class Tent extends Accommodation{

	int siteNumber;
	public Tent() {
		this.name = "Tent";
	}
	public Tent(String name) {
		this.name = name;
	}
	
	public int getSiteNumber() {
		return siteNumber;
	}
	public void setSiteNumber(int siteNumber) {
		this.siteNumber = siteNumber;
	}
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		if (siteNumber == 0) return "";
		else return "Site Number " + this.siteNumber;
	}

}
