package ru.bardinn.sample.robots.fuel;

public class ElectricPower extends Fuel {            //наследование

	@Override
	public void fill() {
		this.fuelLevel = 100;
	}

	@Override
	public void use() {
		fuelLevel -= 10;
	}

	@Override
	public boolean hasFuel() {
		if (fuelLevel < 20) {
			System.out.println("Пора зарядится");
			return false;
		}
		return true;
	}
}
