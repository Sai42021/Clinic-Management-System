package defaultPackage;

public class HeadNurse {
	private String HeadNurseName;
	private int HeadNurseID;
	
	public HeadNurse() {
		this.HeadNurseName = "";
		this.HeadNurseID = 0;
	}
	public HeadNurse(String name, int id) {
		this.HeadNurseName = name;
		this.HeadNurseID = id;
	}
	
	public String getHeadNurseName() {
		return HeadNurseName;
	}
	
	public int getHeadNurseID() {
		return HeadNurseID;
	}
	
	public void setHeadNurseName() {
		this.HeadNurseName = HeadNurseName;
	}

}
