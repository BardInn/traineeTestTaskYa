package ru.bardinn.sample.robots;

class NuclearFuel extends Fuel {                     //наследование
	int lifetime = 50;

	@Override
	public Integer fill(Integer fuelLevel) {
		if(fuelLevel < lifetime){
			System.out.println("Пора поменять стержни");
		}
		return fuelLevel;
		}
	}

