package ru.bardinn.sample.robots;

import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;


class BattleRobot extends Robot {     //наследование

	public BattleRobot(MovingType movingType, EnergyType energyType) {
		super(movingType, energyType);
	}

	@Override
	public void refill(Fuel fuel) {          //инкапсуляция
		fuelLevel = fuel.fill(fuelLevel);
	}

	@Override
	public boolean makeAction(Action action) {
		if(action == Action.BANG ){
			fuelLevel -=20;
			return true;
		}else {
			throw new RuntimeException("Данный робот так не умеет");
		}
	}
}

