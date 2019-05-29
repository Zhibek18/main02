package main02.kakimzhanova.train.entity.car;

public class Car{ 
	static private int id = 1;
	private int carId;

	public Car(){
		this.carId = id++;
	}

	public String toString(){
		StringBuffer s = new StringBuffer("");
		s.append("Car id: ");
		s.append(carId);
		s.append("\n");
		return s.toString();
	}
}