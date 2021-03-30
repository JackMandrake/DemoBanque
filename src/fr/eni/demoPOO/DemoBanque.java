package fr.eni.demoPOO;

import fr.eni.demoDePoo.*;

public class DemoBanque {

	public static void main(String[] args) {
		
		Banque banque = new Banque();
	
		fr.eni.demoDePoo.Banque banqueBnp = new Banque("BNP","Quimper","un truc chelou",2);
		
//		banqueBnp.nom = "BNP";
//		banqueBnp.ville = "Quimper";
//		banqueBnp.logo = "un truc chelou";
//		banqueBnp.valeurEnBourse = 2;

		Banque banqueLcl = new Banque("LCL","Lyon","pourrave",1);
		
//		System.out.println(banqueBnp.getInfo());
//		System.out.println(banqueLcl.getInfo());
//		
//		banqueLcl.setVille("Brest");
//		
		System.out.println(banqueLcl.toString());
		System.out.println(banqueLcl.getNom());
		
		System.out.println(Banque.getPays());
	}

}
