package treballadors;

public class TempsComplert extends Treballador {

	private double salariSetmanal;
	private double deduccioFiscal;
	
	// ----------------------Getters-Setters----------------------

	public void setSalari(double salari) {
		this.salariSetmanal = salari;
	}

	public double getSalari() {
		return this.salariSetmanal;
	}

	public void setDeduccio(double deduccio) {
		this.deduccioFiscal = deduccio;
	}

	public double getDeduccio() {
		return this.deduccioFiscal;
	}

	public double quantitatAPagar() {
		return this.salariSetmanal - this.deduccioFiscal;
	}

}
