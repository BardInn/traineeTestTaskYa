package ru.bardinn.sample.robots.fuel;

public abstract class Fuel {
	public Fuel() {
		this.fuelLevel = 100;
	}

	public abstract void fill();

	public abstract void use();

	public abstract boolean hasFuel();

	public Integer getFuelLevel() {
		return fuelLevel;
	}

	protected Integer fuelLevel;


}

