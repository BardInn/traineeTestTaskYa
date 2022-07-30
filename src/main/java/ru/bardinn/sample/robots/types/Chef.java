package ru.bardinn.sample.robots.types;

import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.types.Robot;

public class Chef extends Robot {

	public Chef(MovingType movingType, EnergyType energyType) {
		super(movingType, energyType);
	}


	@Override
	public boolean makeAction(Action action) {
		if (hasFuel() && action == Action.COOK) {
			this.fuel.use();
			return true;
		} else {
			throw new RuntimeException("Данный робот так не умеет или недостаточно топлива");
		}
	}
}
