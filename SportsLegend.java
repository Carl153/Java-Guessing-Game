package Task9;

public class SportsLegend {
	private String name;
	private int bornYear;
	private String bio;
	//Constructor for SportsLegend class
	public SportsLegend(String name, int bornYear, String bio) {
		this.setName(name);
		this.setBornYear(bornYear);
		this.setBio(bio);

	}
	//Generates public getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBornYear() {
		return bornYear;
	}
	public void setBornYear(int bornYear) {
		this.bornYear = bornYear;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
}
