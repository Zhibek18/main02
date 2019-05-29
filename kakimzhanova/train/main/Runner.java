package main02.kakimzhanova.train.main;
import main02.kakimzhanova.train.entity.car.*;
import main02.kakimzhanova.train.entity.*;

public class Runner{
	public static void main(String[] args){
		Train train = new Train();
		Car dinningCar = new DinningCar(10);
		Car luxCar = new PassengerCar(90, 100, CompartmentType.LUX);
		Car openCar = new PassengerCar(96, 90, CompartmentType.OPEN);
		Car freightCar = new FreightCar(160, 1000);
		train.addCar(dinningCar);
		train.addCar(luxCar);
		train.addCar(openCar);
		train.addCar(freightCar);
		System.out.print(train);
	}
}