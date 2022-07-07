package ru.bardinn.sample.robots;

import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;

public class Welder extends Robot {
	public Welder(MovingType movingType, EnergyType energyType) {
		super(movingType, energyType);
	}

	@Override
	public void refill(Fuel fuel) {                         //инкапсуляция
		fuelLevel = fuel.fill(fuelLevel);
	}

	@Override
	public boolean makeAction(Action action) {
		if(action == Action.WELDING_PARTS ){
			fuelLevel -= 30;
			return true;
		}else {
			throw new RuntimeException("Данный робот так не умеет");
		}
	}
}
