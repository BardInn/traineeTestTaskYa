package ru.bardinn.sample.robots;

public class GasolineFuel extends Fuel{      //наследование
	int fullTank;

	@Override
	public Integer fill(Integer fuelLevel) {
		if(fuelLevel <= 5){
			System.out.println("Пора заправится");
			fuelLevel = fullTank;
		}
		return fuelLevel;
	}
}
