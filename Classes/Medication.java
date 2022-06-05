package defaultPackage;

public class Medication {
	private String Name;
	private float Price;
	private String routeTaken;
	private String Frequency;
	private float amountDispensed;
	
	public Medication() {
		this.Name = "";
		this.Price = 0;
		this.routeTaken = "";
		this.Frequency = "";
		this.amountDispensed = 0;
	}
	
	public Medication(String nme, float prce, String rutTkn, String Frq, float amntDispnsd) {
		this.Name = nme;
		this.Price = prce;
		this.routeTaken = rutTkn;
		this.Frequency = Frq;
		this.amountDispensed = amntDispnsd;
	}
	
	public String getName() {
		return Name;
	}
	
	public float getPrice() {
		return Price;
	}
	
	public String getrouteTaken() {
		return routeTaken;
	}
	
	public String getFrequency() {
		return Frequency;
	}
	
	public float getamountDispensed() {
		return amountDispensed;
	}
	
	public void setFrequency(String Frequency) {
		this.Frequency = Frequency;
	}
	
	public void getTotalPrice(int amountDispensed, float Price) {
		int Total = (int) (this.amountDispensed * this.Price);
	}

}
