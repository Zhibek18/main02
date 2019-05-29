package main02.kakimzhanova.train.main;
import main02.kakimzhanova.train.entity.car.*;
import main02.kakimzhanova.train.entity.*;
import main02.kakimzhanova.train.report.TrainReport;

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
		TrainReport report = new TrainReport();
		report.printReport(train);
	}
}