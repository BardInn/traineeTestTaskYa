package ru.bardinn.sample.robots.types;

import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;
import ru.bardinn.sample.robots.exceptions.NotImplementedException;
import ru.bardinn.sample.robots.types.BattleRobot;
import ru.bardinn.sample.robots.types.Chef;
import ru.bardinn.sample.robots.types.Robot;
import ru.bardinn.sample.robots.types.Welder;

public final class RobotFabric {

	//фабричный метод
	public static Robot makeRobot(MovingType movingType, EnergyType energyType, RobotType robotType) {
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
