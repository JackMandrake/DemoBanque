package fr.eni.demoPOO;

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private int numCompte;

	public Client(String nom, String prenom, String adresse, int numComp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numCompte = numComp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumComp() {
		return numCompte;
	}

	public void setNumComp(int numComp) {
		this.numCompte = numComp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", numComp=");
		builder.append(numCompte);
		builder.append("]");
		return builder.toString();
	}

}
