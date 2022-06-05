package defaultPackage;

public class Patient {
	private String patientsFullName;
	private String patientsGender;
	private int patientsAge;
	private String patientsSymptoms;
	
	public void setpatientsFullName(String name) {
		this.patientsFullName = name;
	}

	public void setpatientsGender(String gender) {
		this.patientsGender = gender;
	}
	
	public void setpatientsAge(int age) {
		this.patientsAge = age;
	}
	
	public void setpatientsSymptoms(String symptoms) {
		this.patientsSymptoms = symptoms;
	}
	
	public String getsetpatientsFullName() {
		return patientsFullName;
	}
	
	public String getpatientsGender() {
		return patientsGender;
	}
	
	public int getpatientsAge() {
		return patientsAge;
	}
	
	public String getpatientsSymptoms() {
		return patientsSymptoms;
	}

	@Override
	public String toString() {
		return "Patient [patientsFullName=" + patientsFullName + ", patientsGender=" + patientsGender + ", patientsAge="
				+ patientsAge + ", patientsSymptoms=" + patientsSymptoms + "]";
	}
	
	
}
