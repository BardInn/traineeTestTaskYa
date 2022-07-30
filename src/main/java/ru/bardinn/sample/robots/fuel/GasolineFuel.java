package ru.bardinn.sample.robots.fuel;


public class GasolineFuel extends Fuel {      //наследование


	@Override
	public void fill() {
		this.fuelLevel = 100;
	}

	@Override
	public void use() {
		fuelLevel -= 5;
	}

	@Override
	public boolean hasFuel() {
		if (fuelLevel <= 5) {
			System.out.println("Пора заправится");
			return false;
		}
		return true;
	}
}
