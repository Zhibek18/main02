package main02.kakimzhanova.train.entity.car;

public enum CompartmentType{
	LUX("lux", 4, 2), BUSINESS("business", 3, 2), 
	ECONOM("econom", 2, 4), OPEN("open", 1, 6);

	private String name;
	private int comfort;
	private int placesNumber;
	
	CompartmentType(String name, int comfort, int placesNumber) {
		this.name = name;
		this.comfort = comfort;
		this.placesNumber = placesNumber;
	}

	public String toString(){
		StringBuffer s = new StringBuffer("");
		s.append(name);
		s.append("\n");
		s.append("Number of places in compartment: ");
		s.append(placesNumber);
		return s.toString();
	}
}