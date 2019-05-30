package kz.kakimzhanova.train.report;
import kz.kakimzhanova.train.action.TrainAction;
import kz.kakimzhanova.train.entity.Train;
public class TrainReport {
	public void printReport(Train train) {
		System.out.print(train);

		TrainAction trainAction = new TrainAction();
		System.out.println("Train passengers count: "
							+ trainAction.countPassengers(train));
		System.out.println("Train luggage count: " 
							+ trainAction.countLuggage(train));
		System.out.println("Cars witn passengers in range 91-100: \n"
							+ trainAction.findCarsPassengersRange(train, 91, 100));
	}
	
}