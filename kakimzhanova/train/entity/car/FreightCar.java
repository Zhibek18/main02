package main02.kakimzhanova.train.entity.car;

public class FreightCar extends Car{
	private int luggageQuantity;
	private double luggageWeight;

	public FreightCar(int luggageQuantity, double luggageWeight){
		this.luggageQuantity = luggageQuantity;
		this.luggageWeight = luggageWeight;
	}

	public String toString(){
		StringBuffer s = new StringBuffer(super.toString());
		s.append("Luggage quantity: ");
		s.append(luggageQuantity);
		s.append("\nLuggage weight: ");
		s.append(luggageWeight);
		s.append("\n");
		return s.toString();
	}
}