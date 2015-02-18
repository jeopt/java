package treballadors;

public class TempsParcial extends Treballador {

	private double preuHora;

	// ----------------------Getters-Setters----------------------

	public double getPreuhora() {
		return this.preuHora;
	}

	public void setPreuhora(double preu) {
		this.preuHora = preu;
	}

	public double quantitatAPagar(int hores) {
		return this.preuHora * hores;
	}

}
