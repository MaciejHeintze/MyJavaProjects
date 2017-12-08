
public class Main {

	public static void main(String[] args) {

		Vehicle car = new Car("WD0001", false, false, 10.5, 30, 7);
		car.toString();
		car.getFullPetrolLevelRange(30);
		car.engineOn();
		car.turnLightsOn();
		car.driveBackwards();
		
		car.drive(0.05, false); //leaving car park
		car.pressGas(5);
		car.pressBreak(0);
		car.turnToDriveMode();
		car.drive(120, true);
		car.pressGas(30);
		car.changeSpeed();
		car.pressBreak(0);
		car.moving();
		car.checkPetrol();
		car.turnToParkingMode();
		car.turnLightsOff();
		car.engineOff();
		car.end();
	
		Vehicle scooter = new Scooter("WZ1001",false,false,3,15,4);
		scooter.toString();
		scooter.getFullPetrolLevelRange(15);
		scooter.engineOn();
		scooter.turnLightsOn();
		scooter.driveBackwards();
		
		scooter.drive(0.02, false); //leaving car park
		scooter.pressGas(3);
		scooter.pressBreak(0);
		scooter.turnToDriveMode();
		scooter.drive(30, true);
		scooter.pressGas(23);
		scooter.changeSpeed();
		scooter.pressBreak(0);
		scooter.moving();
		scooter.checkPetrol();
		scooter.turnToParkingMode();
		scooter.turnLightsOff();
		scooter.engineOff();
        scooter.end();		
		
	}

}
