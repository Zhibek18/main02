package kz.kakimzhanova.train.main;
import kz.kakimzhanova.train.entity.car.*;
import kz.kakimzhanova.train.entity.*;
import kz.kakimzhanova.train.report.TrainReport;
import kz.kakimzhanova.train.action.TrainAction;

public class Runner {
	public static void main(String[] args) {
		Train train = new Train();
		Car dinningCar = new DinningCar(10);
		Car seatingCar = new SeatingCar(90, 100, 100);
		Car openCar = new SleepingCar(96, 90, CompartmentType.OPEN);
		Car freightCar = new FreightCar(160, 1000);
		train.addCar(dinningCar);
		train.addCar(seatingCar);	
		train.addCar(openCar);
		train.addCar(freightCar);
		TrainAction trainAction = new TrainAction();
		Train sortedTrain = trainAction.sortCarsByComfort(train);

		TrainReport report = new TrainReport();
		report.printReport(train);
		report.printReport(sortedTrain);
	}
}