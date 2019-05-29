package main02.kakimzhanova.train.entity;
import java.util.ArrayList;
import main02.kakimzhanova.train.entity.car.*;
public class Train{
	private ArrayList<Car> cars;

	public Train(){
		cars = new ArrayList<>();
	}

	public void addCar(Car car){
		cars.add(car);
	}

	public String toString(){
		StringBuffer s = new StringBuffer("");
		for (Car car : cars){
			s.append(car);
		}
		return s.toString();
	}
}
