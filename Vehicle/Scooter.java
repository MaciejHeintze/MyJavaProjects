import javax.swing.JOptionPane;

public class Scooter extends Car implements Vehicle{
	
	private String id;
	private boolean engine;
	private double petrolLevel;
	private double petrolLevelMax;
	private boolean lights;
	private double fuelConsumption;
	
	
	public Scooter(String id, boolean engine,boolean lights,double petrolLevel, double petrolLevelMax, double fuelConsumption)
	{
		super(id,engine,lights,petrolLevel,petrolLevelMax,fuelConsumption);
		this.id=id;
		this.engine=engine;
		this.lights=lights;
		this.petrolLevel=petrolLevel;
		this.petrolLevelMax=petrolLevelMax;
		this.fuelConsumption=fuelConsumption;
		
	}
	
	
	public String toString(){
		String result = "Scooter details: "+"\n"+"ID:"+id+"\n"+"Engine: "+engine+"\n"+
	"Lights: "+lights+"\n"+"Currently petrol level: "+petrolLevel+"\n"+"Tank size: "+petrolLevelMax+"\n"+"Fuel consumption/100km: "+fuelConsumption;
		
		JOptionPane.showMessageDialog(null, result);
		
		return result;
	}
	
	

}

