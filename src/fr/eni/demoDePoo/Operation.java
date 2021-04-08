package fr.eni.demoDePoo;

public class Operation {

	private String retrait;
	private String depot;
	private String decouvert;
	private String virement;
  private int montant;

	public Operation(String retrait, String depot, String decouvert, String virement) {
		super();
		this.retrait = retrait;
		this.depot = depot;
		this.decouvert = decouvert;
		this.virement = virement;
	}

	public String getRetrait() {
		return retrait;
	}

	public void setRetrait(String retrait) {
		this.retrait = retrait;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public String getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(String decouvert) {
		this.decouvert = decouvert;
	}

	public String getVirement() {
		return virement;
	}

	public void setVirement(String virement) {
		this.virement = virement;
	}
  
  public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operation [retrait=");
		builder.append(retrait);
		builder.append(", depot=");
		builder.append(depot);
		builder.append(", decouvert=");
		builder.append(decouvert);
		builder.append(", virement=");
		builder.append(virement);
		builder.append("]");
		return builder.toString();
	}


}
