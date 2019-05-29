package main02.kakimzhanova.train.entity;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import main02.kakimzhanova.train.entity.car.*;
public class Train {//implements Cloneable{
	static private int id = 1;
	private int trainId;
	private List<Car> cars;

	public Train(){
		trainId = id++;
		cars = new ArrayList<>();
	}

	public Train(List<Car> cars){
		trainId = id++;
		this.cars = cars;
	}

	public List<Car> getCars(){
		return new ArrayList<Car>(cars);
	}
	public void addCar(Car car){
		cars.add(car);
	}

	public String toString(){
		StringBuffer s = new StringBuffer("");
		s.append("Train id: ");
		s.append(trainId);
		s.append("\n");
		for (Car car : cars){
			s.append(car);
			s.append("---------------------------\n");
		}
		return s.toString();
	}

	// public Train clone(){
	// 	Train copy = null;
	// 	try{
	// 		copy = (Train)super.clone();
	// 		copy.cars = ((List<Car>)((ArrayList)cars).clone());
	// 	}catch(CloneNotSupportedException e){
	// 		e.printStackTrace();
	// 	}
	// 	return copy;
	// }
}
