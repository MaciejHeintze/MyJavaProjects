import javax.swing.JOptionPane;

public class Car implements Vehicle, Runnable{
	
	private String id;
	private boolean engine;
	private double petrolLevel;
	private double petrolLevelMax;
	private boolean lights;
	private boolean way;
	private double fuelConsumption;
	private double petrolRange;
	private double speed = 0;
	private double distance;
	
	
	public Car(String id, boolean engine,boolean lights,double petrolLevel, double petrolLevelMax, double fuelConsumption)
	{
		this.id=id;
		this.engine=engine;
		this.lights=lights;
		this.petrolLevel=petrolLevel;
		this.petrolLevelMax=petrolLevelMax;
		this.fuelConsumption=fuelConsumption;
	}
	
	
	public void run(){
		try{
			Thread.sleep(10000);
		}catch (InterruptedException e){
			System.out.println("Blad");
		}
		
		
	}

	public void changeSpeed(){
		try{
		String speed1 = JOptionPane.showInputDialog("Change speed to: ");
		double x = Double.parseDouble(speed1);
		
		if(x<speed){
		
			for(double i=speed;i>x;i--){
			
				try{Thread.sleep(500);
			
				}catch (InterruptedException e){
				}
		System.out.println("Braking "+speed--+" km/h");
		}
		System.out.println();
		}else{
			
		String tab="";
		
		for(double i=speed;i<=x;i++){
			
			try{
				Thread.sleep(500);
				
			}catch (InterruptedException e){
			}
		
			tab = "Pressing gas: "+i+" km/h";
			
			System.out.println(tab);
	}
		System.out.println();
	}
		speed = x;
		
	}catch(Exception e){
		
		JOptionPane.showMessageDialog(null, "Type speed again");
		changeSpeed();
	}
	}
	
	
	public void pressBreak(double value){
		
		for(double i=speed;i>value;i--){
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
			}
		System.out.println("Braking "+speed--+" km/h");
		}
	}
	
	
	public void pressGas(double value){
		
		String tab="";
		
		for(double i=speed;i<=value;i++){
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				
			}
		tab = "Pressing gas: "+i+" km/h";
			
			System.out.println(tab);
			
			
	}
		speed = value;
	}
	
	
	public void turnLightsOn(){
		if(lights==true){
			JOptionPane.showMessageDialog(null, "Lights are ON");
		}else{
			lights=true;
			JOptionPane.showMessageDialog(null, "Turning lights ON");
			
		}
	}
	
	public void turnLightsOff(){
		if(lights==true){
			
			lights=false;
			JOptionPane.showMessageDialog(null, "Turning lights OFF");
		}else{
			JOptionPane.showMessageDialog(null,"Lights are OFF" );
			
		}
	}
	
	public void engineOn(){
		if(engine==true){
			JOptionPane.showMessageDialog(null, "Engine is ON");
		}else{
			engine=true;
			JOptionPane.showMessageDialog(null,"Turning engine ON" );
		}
	}
	
	public void turnToDriveMode(){
		
		if(way==true){
			JOptionPane.showMessageDialog(null,"Driving forward is ON" );
			
		}else{
			way=true;
			JOptionPane.showMessageDialog(null, "Driving forward is ON");
			
			}
	}
	
	public void turnToParkingMode(){
		
		if(way==true){
			way=false;
			JOptionPane.showMessageDialog(null, "Turning to parking mode");
		}else{
			JOptionPane.showMessageDialog(null, "Parking mode is already ON");
		}
	}
	
	public void driveBackwards(){
		JOptionPane.showMessageDialog(null, "Turning to R mode");
		
	}
	
	public void engineOff(){
		
		if(engine==true){
			engine=false;
			JOptionPane.showMessageDialog(null,"Turning engine OFF" );
			
		}else{
			JOptionPane.showMessageDialog(null, "Engine is already OFF");
			
		}
	}
	
	public double fuleUp(){
		double petrol = petrolLevelMax - petrolLevel;
		return petrol;
	}
	
	public double payForPetrol(double petrolPrice){
		
		double value = petrolPrice*fuleUp();
		String x = "Cost of the petrol refill: "+value+" PLN";
		JOptionPane.showMessageDialog(null, x);
		
		return value;
	}
	public void getFullPetrolLevelRange(double range){
		this.petrolRange=range;
	}
	
	public void checkPetrol(){
		if(petrolLevel<=5){
			JOptionPane.showMessageDialog(null, "Petrol station stop");
			
			fuleUp();
			payForPetrol(4.75);
			String result = "Petrol level: "+petrolLevelMax+" L.";
			
			JOptionPane.showMessageDialog(null, result);
		}
		petrolLevel=petrolLevelMax;
	}
	
	public void moving(){
		for(int i=0; i<=distance;i++){
			
			if(i==100 || i==200 || i==300 || i==400 || i==500){
				petrolLevel-=fuelConsumption;
				String p = "Petrol level: "+petrolLevel;
				
			JOptionPane.showMessageDialog(null, p);
			}
			
		}
	}
	public void drive(double distance, boolean way){
		
		
		if(way==true){
			String r = "Driving forward -> distance to destination: "+distance+" km.";
			int button = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(null, r, "Warning", button);
			if(result == JOptionPane.YES_OPTION){
				moving();
				checkPetrol();
			}else{
				JOptionPane.showMessageDialog(null, "Closing program");
				System.exit(0);
			}
			
			
			
			
		}else{
			String result ="Driving backwards "+distance+" km.";
			JOptionPane.showMessageDialog(null, result);
		
		}
		
		this.distance = distance;
		
	}
	
	
	
	public String toString(){
		String result = "CAR DETAILS: "+"\n"+"ID:"+id+"\n"+"Engine: "+engine+"\n"+"Lights: "+lights+"\n"+ 
	"Currently petrol level: "+petrolLevel+"\n"+"Tank size: "+petrolLevelMax+"\n"+"Fuel consumption/100km: "+fuelConsumption;

		JOptionPane.showMessageDialog(null,result);
		return result;
	}
	
	public void end(){
		JOptionPane.showMessageDialog(null, "END");
	}
	
	

}
