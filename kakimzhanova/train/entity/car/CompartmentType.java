package main02.kakimzhanova.train.entity.car;

public enum CompartmentType{
	LUX("lux", 4, 2), BUSINESS("business", 3, 2), 
	ECONOM("econom", 2, 4), OPEN("open compartment", 1, 6);

	String name;
	int comfort;
	int seatsNumber;
	
	CompartmentType(int name, int comfort, seatsNumber) {
		this.name = name;
		this.comfort = comfort;
		this.seatsNumber = seatsNumber;
	}

	public String toString(){
		StringBuffer s = new StringBuffer("");
		s.append(name);
		return s.toString();
	}
}