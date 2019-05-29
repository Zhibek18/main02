package main02.kakimzhanova.train.entity.car;
import main02.kakimzhanova.train.util.IdGenerator;

public abstract class Car implements Cloneable { 
	private long carId;

	public Car() {
		this.carId = IdGenerator.generateCarId();
	}

	public String toString() {
		StringBuffer s = new StringBuffer("");
		s.append("Car id: ");
		s.append(carId);
		s.append("\n");
		return s.toString();
	}
	public abstract int getPassengersCount();
	public abstract int getLuggageCount();

	public Car clone() {
		Car copy = null;
		try {
			copy = (Car)super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copy;
	}
}