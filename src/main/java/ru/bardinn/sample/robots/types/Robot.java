package ru.bardinn.sample.robots.types;


import ru.bardinn.sample.robots.fuel.ElectricPower;
import ru.bardinn.sample.robots.fuel.Fuel;
import ru.bardinn.sample.robots.fuel.GasolineFuel;
import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.exceptions.NotImplementedException;
import ru.bardinn.sample.robots.fuel.NuclearFuel;


public abstract class Robot {

	private MovingType movingType;
	private EnergyType energyType;

	public Fuel getFuel() {
		return fuel;
	}

	protected Fuel fuel;

	public Robot(MovingType movingType, EnergyType energyType) {
		this.movingType = movingType;
		this.energyType = energyType;
		switch (this.energyType) {
			case NUCLEAR:
				this.fuel = new NuclearFuel();
				break;
			case ELECTRIC:
				this.fuel = new ElectricPower();
				break;
			case GASOLINE:
				this.fuel = new GasolineFuel();
				break;
			default:
				throw new NotImplementedException("Неизвестный вид топлива");
		}
	}

	public void fill(EnergyType energyType) {
		if(energyType!=this.energyType){
			throw new RuntimeException("Неверный вид топлива");
		}

		fuel.fill();
	}

	public boolean hasFuel() {
		return fuel.hasFuel();
	}

	public abstract boolean makeAction(Action action);

	public Integer getFuelLevel() {
		return fuel.getFuelLevel();
	}


}
