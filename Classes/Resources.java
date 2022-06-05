package defaultPackage;

public class Resources {
	private int AmountOfPens;
	private int AmountOfNotePads;
	private String NameOfMedication;
	private int QuantityOfMedication;
	private int AmountOfLatexGloves;
	private int AmountOfSyringes;
	
	public Resources() {
		this.AmountOfPens = 0;
		this.AmountOfNotePads = 0;
		this.NameOfMedication = "";
		this.QuantityOfMedication = 0;
		this.AmountOfLatexGloves = 0;
		this.AmountOfSyringes = 0;
	}
	
	public Resources(int pens, int Notepads, String NOFmedication, int qntyOfmed, int latexGloves, int syringes) {
		this.AmountOfPens = pens;
		this.AmountOfNotePads = Notepads;
		this.NameOfMedication = NOFmedication;
		this.QuantityOfMedication = qntyOfmed;
		this.AmountOfLatexGloves = latexGloves;
		this.AmountOfSyringes = syringes;
	}
	
	public void setAmountOfPens() {
		this.AmountOfPens = AmountOfPens;
	}
	
	public void setAmountOfNotePads() {
		this.AmountOfNotePads = AmountOfNotePads;
		}
	
	public void setNameOfMedication() {
		this.NameOfMedication = NameOfMedication;
		}
	
	public void setQuantityOfMedication() {
		this.QuantityOfMedication = QuantityOfMedication;
		}
	
	public void setAmountOfLatexGloves() {
		this.AmountOfLatexGloves = AmountOfLatexGloves;
		}
	
	public void setAmountOfSyringes() {
		this.AmountOfSyringes = AmountOfSyringes;
		}
	
	public int getAmountOfPens() {
		return AmountOfPens;
	}
	
	public int getAmountOfNotePads() {
		return AmountOfNotePads;
	}
	
	public String getNameOfMedication() {
		return NameOfMedication;
	}
	
	public int getQuantityOfMedication() {
		return QuantityOfMedication;
	}
	
	public int getAmountOfLatexGloves() {
		return AmountOfLatexGloves;
	}
	
	public int getAmountOfSyringes() {
		return AmountOfSyringes;
	}

	@Override
	public String toString() {
		return "Resources [AmountOfPens=" + AmountOfPens + ", AmountOfNotePads=" + AmountOfNotePads
				+ ", NameOfMedication=" + NameOfMedication + ", QuantityOfMedication=" + QuantityOfMedication
				+ ", AmountOfLatexGloves=" + AmountOfLatexGloves + ", AmountOfSyringes=" + AmountOfSyringes + "]";
	}

}
