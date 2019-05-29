package main02.kakimzhanova.train.entity.car;

public class SleepingCar extends PassengerCar{
	private CompartmentType type;

	public SleepingCar(int passengersQuantity, int handLuggageQuantity, 
						  CompartmentType type){
		super(passengersQuantity, handLuggageQuantity);
		this.type = type;
	}

	public String toString(){
		StringBuffer s = new StringBuffer(super.toString());
		s.append("Compartment type: ");
		s.append(type);	
		s.append("\n");
		return s.toString();
	}
}