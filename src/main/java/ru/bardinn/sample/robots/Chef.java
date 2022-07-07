package ru.bardinn.sample.robots;

import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;

public class Chef extends Robot {

	public Chef(MovingType movingType, EnergyType energyType){
		super(movingType,energyType);
	}

	@Override
	public void refill(Fuel fuel) {              //инкапсуляция
		fuelLevel = fuel.fill(fuelLevel);
	}

	@Override
	public boolean makeAction(Action action) {
		if(action == Action.COOK ){
			   fuelLevel -= 10;
			   return true;
		}else {
			throw new RuntimeException("Данный робот так не умеет");
		}
	}
}
