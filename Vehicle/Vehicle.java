
public interface Vehicle {
	
	void turnLightsOn();
	void turnLightsOff();
	void engineOn();
	void turnToDriveMode();
	void driveBackwards();
	void turnToParkingMode();
	void engineOff();
	double fuleUp();
	double payForPetrol(double petrolPrice);
	void drive(double distance, boolean way);
	void getFullPetrolLevelRange(double range);
	void changeSpeed();
	void pressBreak(double speed);
	void pressGas(double speed);
	void checkPetrol();
	void moving();
	void end();
	
}
