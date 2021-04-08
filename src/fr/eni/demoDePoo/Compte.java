package fr.eni.demoDePoo;

public class Compte {

	private int numCompte;
	private String titulaire;

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public String getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public Compte(int numCompte, String titulaire) {
		super();
		this.numCompte = numCompte;
		this.titulaire = titulaire;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [numCompte=");
		builder.append(numCompte);
		builder.append(", titulaire=");
		builder.append(titulaire);
		builder.append("]");
		return builder.toString();
	}

}
