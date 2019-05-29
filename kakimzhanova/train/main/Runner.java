package main02.kakimzhanova.train.main;
import main02.kakimzhanova.train.entity.car.*;
import main02.kakimzhanova.train.entity.*;
import main02.kakimzhanova.train.action.TrainAction;

public class Runner{
	public static void main(String[] args){
		Train train = new Train();
		Car dinningCar = new DinningCar(10);
		Car passengerCar = new SeatingCar(90, 100, 100);
		Car openCar = new CompartmentCar(96, 90, CompartmentType.OPEN);
		Car freightCar = new FreightCar(160, 1000);
		train.addCar(dinningCar);
		train.addCar(passengerCar);
		train.addCar(openCar);
		train.addCar(freightCar);
		System.out.print(train);

		TrainAction trainAction = new TrainAction();
		System.out.println("Train passengers count: "
							+ trainAction.countPassengers(train));
		System.out.println("Train luggage count: " 
							+ trainAction.countLuggage(train));
		System.out.println("Cars witn passengers in range 80-100: \n"
							+ trainAction.findCarsWithPassengersNumberRange(train, 80, 100));

	}
}