package treballadors;

public class AlumneDual extends TempsParcial {

	public double quantitatAPagar(int hores) {
		if (hores <= 40){
			return getPreuhora() * hores;
		}else {
			return getPreuhora() * 40 + getPreuhora() * 2 * (hores - 40);
		}
	}

}
