package treballadors;

public class Treballador {

	private String nom;
	private String nomFeina;

	// ----------------------Constructors----------------------
	public Treballador() {
		this.nom = "Joan";
		this.nomFeina = "Currante";
	}

	public Treballador(String name, String feina) {
		this.nom = name;
		this.nomFeina = feina;
	}

	// ----------------------Getters-Setters----------------------

	public void setNom(String name) {
		this.nom = name;
	}

	public String getNom() {
		return this.nom;
	}

	public void setFeina(String feina) {
		this.nomFeina = feina;
	}

	public String getFeina() {
		return this.nomFeina;
	}

	public void pagaSenzilla(double quantitatPaga) {
		System.out.print("pagament a realitzar a " + this.nom);
		System.out.print(" " + this.nomFeina);
		System.out.print(" " + quantitatPaga);
		System.out.println(" €");
		
	}

}
