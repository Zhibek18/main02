package main02.kakimzhanova.train.report;
import main02.kakimzhanova.train.action.TrainAction;
import main02.kakimzhanova.train.entity.Train;
public class TrainReport {
	public void printReport(Train train) {
		System.out.print(train);

		TrainAction trainAction = new TrainAction();
		System.out.println("Train passengers count: "
							+ trainAction.countPassengers(train));
		System.out.println("Train luggage count: " 
							+ trainAction.countLuggage(train));
		System.out.println("Cars witn passengers in range 80-100: \n"
							+ trainAction.findCarsWithPassengersNumberRange(train,
																			80, 
																			100));
	}
	
}