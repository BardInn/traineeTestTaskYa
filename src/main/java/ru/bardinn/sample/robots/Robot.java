package ru.bardinn.sample.robots;


import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;


public abstract class Robot {

	protected MovingType movingType;      
	protected EnergyType energyType;

	public Integer getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(Integer fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	protected Integer fuelLevel;


	public Robot(MovingType movingType, EnergyType energyType) {
		this.movingType = movingType;
		this.energyType = energyType;
		this.fuelLevel = 100;
	}

	public abstract void refill(Fuel fuel);

	public abstract boolean makeAction(Action action);

	

}
