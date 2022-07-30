package ru.bardinn.robotTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.bardinn.sample.robots.types.Robot;
import ru.bardinn.sample.robots.types.RobotFabric;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.bardinn.sample.robots.enums.Action.COOK;
import static ru.bardinn.sample.robots.enums.Action.WELDING_PARTS;

public class NegativeRobotTests {
	@Test
	public void ChefRobotCantWeld() {
		Robot sushi = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.CHEF);
		RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
			sushi.makeAction(WELDING_PARTS);
		});

		Assertions.assertEquals("Данный робот так не умеет или недостаточно топлива", thrown.getMessage());
	}

	@Test
	public void RefillWrongFuelTest() {
		Robot thunder = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.CHEF);
		while(thunder.hasFuel()){
			thunder.makeAction(COOK);
		}

		RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
			thunder.fill(EnergyType.GASOLINE);
		});

		assertEquals("Неверный вид топлива", thrown.getMessage());
	}

}
