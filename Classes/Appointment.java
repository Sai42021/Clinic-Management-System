package defaultPackage;

public class Appointment {
	private String doctorsName;
	private int doctorsID;
	private String nursesName;
	private int nursesID;
	private float time;
	private float date; 
	private String DOW;
	
	public Appointment() {
		this.doctorsName = "";
		this.doctorsID = 0;
		this.nursesName = "";
		this.nursesID = 0;
		this.time = 0;
		this.date = 0;
		this.DOW = "";
	}
	
	public Appointment(String drsName, int drsID, String nrsesName, int nrsesID, float tme, float dte, String DayOW) {
		this.doctorsName = drsName;
		this.doctorsID = drsID;
		this.nursesName = nrsesName;
		this.nursesID = nrsesID;
		this.time = tme;
		this.date = dte;
		this.DOW = DayOW;
	}
	
	public String getdoctorsName() {
		return doctorsName;
	}
	
	public int getdoctorsID() {
		return doctorsID;
	}
	
	public String getnursesName() {
		return nursesName;
	}
	
	public int getnursesID() {
		return nursesID;
	}
	
	public float gettime() {
		return time;
	}
	
	public float date() {
		return date;
	}
	
	public String DOW() {
		return DOW;
	}
	
	public void setdate(float date) {
		this.date = date;
	}
	
	public void settime(float time) {
		this.time = time;
	}
}

