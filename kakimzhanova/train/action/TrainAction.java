package main02.kakimzhanova.train.action;
import main02.kakimzhanova.train.entity.Train;
import java.util.List;
import java.util.ArrayList;
import main02.kakimzhanova.train.entity.car.*;
public class TrainAction{
	public int countPassengers(Train train){
		int count = 0;
		for (Car car : train.getCars()){
			count += car.getPassengersCount();
		}
		return count;
	}
	public int countLuggage(Train train){
		int count = 0;
		for (Car car : train.getCars()){
			count += car.getLuggageCount();
		}
		return count;
	}
	 public Train sortCarsByComfort(Train train){
	 	List<Car> sortedCars = train.getCars();

	 	return new Train(sortedCars);

	}

	public Train findCarsWithPassengersNumberRange(Train train, int min, int max){
		Train newTrain = new Train();
		int count;
		for (Car car : train.getCars()){
			count = car.getPassengersCount();
			if (( count >= min)&&(count <= max)){
				newTrain.addCar(car);
			}
		}
		return newTrain;
	}
}