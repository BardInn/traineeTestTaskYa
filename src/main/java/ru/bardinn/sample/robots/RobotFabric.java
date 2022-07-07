package ru.bardinn.sample.robots;

import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;
import ru.bardinn.sample.robots.exceptions.NotImplementedException;

public final class RobotFabric {

	public static Robot makeRobot(MovingType movingType, EnergyType energyType, RobotType robotType) {   //полиморфизм
		switch (robotType) {
			case CHEF:
				return new Chef(movingType, energyType);
			case WELDER:
				return new Welder(movingType, energyType);
			case BATTLE:
				return new BattleRobot(movingType, energyType);
			default:
				throw new NotImplementedException("Неизвестный тип робота");
		}
	}

}
