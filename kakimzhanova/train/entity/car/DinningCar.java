package main02.kakimzhanova.train.entity.car;

public class DinningCar extends Car{
	private int places;

	public DinningCar(int places){
		this.places = places;
	}

	public String toString(){
		StringBuffer s = new StringBuffer(super.toString());
		s.append("Dinning places: ");
		s.append(places);
		s.append("\n");
		return s.toString();
	}
}