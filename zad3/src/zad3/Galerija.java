package zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Galerija {

	private Umetnik[] umetnici;

	public Galerija() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/zad3/umetnici.txt"));
		
		int brUmetnika = Integer.parseInt(br.readLine().trim());
		umetnici = new Umetnik[brUmetnika];
		for(int i =0; i < brUmetnika; i++) {
			String[] linija = br.readLine().trim().split(",");
			if(linija.length == 1) {
				umetnici[i] = new Slikar(linija[0]);
			}else {
				umetnici[i] = new Umetnik(linija[0].trim(), Integer.parseInt(linija[1].trim()));
			}
		}
		br.close();		
	}
	
	public void ucitajDela() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/zad3/dela.txt"));
	
		int brDela = Integer.parseInt(br.readLine().trim());
		
		for(int i =0; i < brDela;i++) {
			String umetnik = br.readLine().trim();
			String naziv = br.readLine().trim();
			int godinaNastanka = Integer.parseInt( br.readLine().trim());
			double cena = Double.parseDouble(br.readLine().trim());
						
			//Ovde bi bilo lepo imati neku proveru i ispisati ako nismo nista uradili
			for(int j = 0; j< umetnici.length; j++) {
				if(umetnici[j].getIme().equalsIgnoreCase(umetnik)) {
					umetnici[j].izlozi(new UmetnickoDelo(naziv, godinaNastanka, cena));
				}
			}			
		}		
	}
 	
	public Slikar slikarSaNajstarijimDelom() {
		Slikar s = null;
		UmetnickoDelo najstarijeDelo = null;
		for(Umetnik u : umetnici) {
			if(u instanceof Slikar) {
				UmetnickoDelo najstarijeDeloUmetnika = nadjiNajstarijeDelo(u);
				if (najstarijeDelo == null
						|| najstarijeDeloUmetnika.getGodinaNastanka() < najstarijeDelo.getGodinaNastanka()) {
					najstarijeDelo = najstarijeDeloUmetnika;
					s= (Slikar) u;
				}
			}
		}
		return s;
	}

	private UmetnickoDelo nadjiNajstarijeDelo(Umetnik u) {
		UmetnickoDelo najstarije = null;
		
		for(int i =0; i< u.getBrDela();i++) {
			if(najstarije == null || u.getDela()[i].getGodinaNastanka() < najstarije.getGodinaNastanka()) {
				najstarije = u.getDela()[i];
			}
		}
		return najstarije;
	}
	
	
}
