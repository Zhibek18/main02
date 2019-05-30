package kz.kakimzhanova.train.entity.car;

public abstract class PassengerCar extends Car {
	private int passengersQuantity;
	private int handLuggageQuantity;

	public PassengerCar(int passengersQuantity, int handLuggageQuantity) {
		this.passengersQuantity = passengersQuantity;
		this.handLuggageQuantity = handLuggageQuantity;
	}

	public String toString() {
		StringBuffer s = new StringBuffer(super.toString());
		s.append("Passengers car:");
		s.append("\nPassengers quantity: ");
		s.append(passengersQuantity);
		s.append("\nHand luggage quantity: ");
		s.append(handLuggageQuantity);
		s.append("\n");
		return s.toString();
	}

	public int getPassengersCount() { 
		return passengersQuantity;
	}

	public int getLuggageCount() {
		return handLuggageQuantity;
	}
}