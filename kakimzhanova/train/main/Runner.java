package main02.kakimzhanova.train.main;
import main02.kakimzhanova.train.entity.car.*;
import main02.kakimzhanova.train.entity.*;

public class Runner{
	public static void main(String[] args){
		Car car = new DinningCar(10);
		System.out.println(car);
	}
}