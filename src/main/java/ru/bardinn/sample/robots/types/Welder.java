package ru.bardinn.sample.robots.types;

import ru.bardinn.sample.robots.enums.Action;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;


public class Welder extends Robot {
	public Welder(MovingType movingType, EnergyType energyType) {
		super(movingType, energyType);
	}


	@Override
	public boolean makeAction(Action action) {

		if (hasFuel() && action == Action.WELDING_PARTS) {
			this.fuel.use();
			return true;
		} else {
			throw new RuntimeException("Данный робот так не умеет или недостаточно топлива");
		}
	}
}
