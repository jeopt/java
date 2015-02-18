package programanomines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import treballadors.AlumneDual;
import treballadors.TempsComplert;
import treballadors.TempsParcial;
import treballadors.Treballador;

public class PagarunaNomina {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		AlumneDual estudiant = new AlumneDual();
		
		System.out.println("prova git");
		System.out.println("prova git02");

		File ruta = new File("fitxers");
		File arxiu = new File(ruta, "nomines.txt");

		FileReader fr = new FileReader(arxiu);
		BufferedReader br = new BufferedReader(fr);
		String linia = "";
		int a = 0;
		while ((linia = br.readLine()) != null) {
			if (a == 0) {
				estudiant.setNom(linia);
			}
			if (a == 1) {
				estudiant.setFeina(linia);
			}
			if (a == 2) {
				double preu = Double.parseDouble(linia);
				estudiant.setPreuhora(preu);
			}
			if (a == 3) {
				int hores = Integer.parseInt(linia);
				double quantitat = estudiant.quantitatAPagar(hores);
				System.out.println(estudiant.getNom()+"  -  "+estudiant.getFeina());
				System.out.println("-----------------");
				System.out.println("Quantitat a pagar: "+quantitat);
				System.out.println(); System.out.println(); System.out.println();
				a = -1;
			}
			a++;
		}
		br.close();

	}
}
