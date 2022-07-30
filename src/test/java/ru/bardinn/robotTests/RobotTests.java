package ru.bardinn.robotTests;

import org.junit.jupiter.api.Test;
import ru.bardinn.sample.robots.fuel.GasolineFuel;
import ru.bardinn.sample.robots.fuel.NuclearFuel;
import ru.bardinn.sample.robots.types.Robot;
import ru.bardinn.sample.robots.types.RobotFabric;
import ru.bardinn.sample.robots.enums.EnergyType;
import ru.bardinn.sample.robots.enums.MovingType;
import ru.bardinn.sample.robots.enums.RobotType;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

	@Test
	public void RefillGasolineRobotTest() {
		int fullTank = 100;
		Robot still = RobotFabric.makeRobot(MovingType.WALK, EnergyType.GASOLINE, RobotType.WELDER);
		while(still.hasFuel()){
			still.makeAction(WELDING_PARTS);
		}
		still.fill(EnergyType.GASOLINE);
		assertEquals(fullTank, still.getFuelLevel());
	}

	@Test
	public void RefillNuclearRobotTest() {
		int yearsOfUse = 0;
		Robot power = RobotFabric.makeRobot(MovingType.FLY, EnergyType.NUCLEAR, RobotType.BATTLE);
		while(power.hasFuel()){
			power.makeAction(BANG);
		}
		power.fill(EnergyType.NUCLEAR);
		assertEquals(yearsOfUse, ((NuclearFuel)power.getFuel()).getYearFromFilling());
	}

	@Test
	public void RefillElectricPowerTest() {
		int fullTank = 100;
		Robot thunder = RobotFabric.makeRobot(MovingType.RIDE, EnergyType.ELECTRIC, RobotType.CHEF);
		while(thunder.hasFuel()){
			thunder.makeAction(COOK);
		}
		thunder.fill(EnergyType.ELECTRIC);
		assertEquals(fullTank, thunder.getFuelLevel());
	}

}
