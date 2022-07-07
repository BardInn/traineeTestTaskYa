package ru.bardinn.robotTests;

import org.junit.jupiter.api.Test;
import ru.bardinn.sample.robots.Robot;
import ru.bardinn.sample.robots.RobotFabric;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.bardinn.sample.robots.enums.Action.*;

public class RobotTests {

	@Test
	public void ChefRobotWithNuclearFuelTest() {
		Robot pizza = RobotFabric.makeRobot(MovingType.WALK, EnergyType.NUCLEAR, RobotType.CHEF);
		assertTrue(pizza.makeAction(COOK));
	}

	@Test
	public void ChefRobotWithElectricFuelTest() {
		Robot sushi = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.CHEF);
		assertTrue(sushi.makeAction(COOK));
	}

	@Test
	public void ChefRobotWithGasolineFuelTest() {
		Robot burger = RobotFabric.makeRobot(MovingType.FLY, EnergyType.GASOLINE, RobotType.CHEF);
		assertTrue(burger.makeAction(COOK));
	}

	@Test
	public void BattleRobotWithNuclearFuelTest() {
		Robot soldier = RobotFabric.makeRobot(MovingType.WALK, EnergyType.NUCLEAR, RobotType.BATTLE);
		assertTrue(soldier.makeAction(BANG));
	}

	@Test
	public void BattleRobotWithElectricFuelTest() {
		Robot pilot = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.BATTLE);
		assertTrue(pilot.makeAction(BANG));
	}

	@Test
	public void BattleRobotWithGasolineFuelTest() {
		Robot sailor = RobotFabric.makeRobot(MovingType.FLY, EnergyType.GASOLINE, RobotType.BATTLE);
		assertTrue(sailor.makeAction(BANG));
	}

	@Test
	public void WelderRobotWithNuclearFuelTest() {
		Robot hard = RobotFabric.makeRobot(MovingType.WALK, EnergyType.NUCLEAR, RobotType.WELDER);
		assertTrue(hard.makeAction(WELDING_PARTS));
	}

	@Test
	public void WelderRobotWithElectricFuelTest() {
		Robot rock = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.WELDER);
		assertTrue(rock.makeAction(WELDING_PARTS));
	}

	@Test
	public void WelderRobotWithGasolineFuelTest() {
		Robot stranger = RobotFabric.makeRobot(MovingType.FLY, EnergyType.GASOLINE, RobotType.WELDER);
		assertTrue(stranger.makeAction(WELDING_PARTS));
	}

}
