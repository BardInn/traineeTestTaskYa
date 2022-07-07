package ru.bardinn.robotTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.bardinn.sample.robots.Robot;
import ru.bardinn.sample.robots.RobotFabric;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;

import static ru.bardinn.sample.robots.enums.Action.WELDING_PARTS;

public class NegativeRobotTests {
	@Test
	public void ChefRobotCantWeld () {
		Robot sushi = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.CHEF);
		RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
			sushi.makeAction(WELDING_PARTS);
		});

		Assertions.assertEquals("Данный робот так не умеет", thrown.getMessage());
		}
}
