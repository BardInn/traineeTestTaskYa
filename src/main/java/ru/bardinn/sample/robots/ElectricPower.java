package ru.bardinn.sample.robots;

public class ElectricPower extends Fuel{            //наследование

	@Override
	public Integer fill(Integer fuelLevel) {
		if(fuelLevel < 20){
			 System.out.println("Пора зарядится");
		}
		return fuelLevel;
	}
}
