package defaultPackage;

public class Main {

	public static void main(String[] args) {
		Patient newPatient = new Patient(name: "Dave", gender: "Male", age: 30, symptoms: "Chest pains");
		Patient Dave = new Patient(newPatient);
		dave.setName("Johny Depp");
		
		System.out.println(Dave);
	}

}
