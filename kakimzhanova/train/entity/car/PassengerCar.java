package main02.kakimzhanova.train.entity.car;

public class PassengerCar extends Car{
	private int passengersQuantity;
	private int handLuggageQuantity;
	private CompartmentType type;

	public PassengerCar(int passengersQuantity, int handLuggageQuantity, 
						CompartmentType type){
		this.passengersQuantity = passengersQuantity;
		this.handLuggageQuantity = handLuggageQuantity;
		this.type = type;
	}

	public String toString(){
		StringBuffer s = new StringBuffer(super.toString());
		s.append("Passengers car:");
		s.append("\nPassengers quantity: ");
		s.append(passengersQuantity);
		s.append("\nHand luggage quantity: ");
		s.append(handLuggageQuantity);
		s.append("\nCompartment type: ");
		s.append(type);
		s.append("\n\n");
		return s.toString();
	}
}