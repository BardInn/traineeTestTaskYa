package ru.bardinn.sample.robots.fuel;

public class NuclearFuel extends Fuel {                     //наследование
	final static int lifetime = 50;

	public int getYearFromFilling() {
		return yearFromFilling;
	}

	private int yearFromFilling = 0;

	@Override
	public void fill() {
		this.fuelLevel = 100;
		this.yearFromFilling = 0;
	}

	@Override
	public void use() {
		yearFromFilling++;
	}

	@Override
	public boolean hasFuel() {
		if (yearFromFilling >= lifetime) {
			System.out.println("Пора поменять стержни");
			return false;
		}
		return true;
	}
}

