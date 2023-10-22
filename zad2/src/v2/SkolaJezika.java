package v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkolaJezika {

	private Kurs[] kursevi;

	public SkolaJezika(String fajl) throws NumberFormatException, IOException {		

		BufferedReader in = new BufferedReader(new FileReader(fajl)); 
		//BufferedReader in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fajl)));
		int brKurseva = Integer.parseInt( in.readLine().trim());
		kursevi = new Kurs[brKurseva];
		for(int i = 0 ; i< brKurseva; i++) {
			String[] linija = in.readLine().trim().split(",");
			
			kursevi[i] = new Kurs(linija[0].trim(), linija[1].trim(), Integer.parseInt(linija[2].trim())  );
		}
		in.close();
	}
	
//	public SkolaJezika(String fajl) throws IOException {
//		BufferedReader in = new BufferedReader(new FileReader(fajl));
//		int brojKurseva = Integer.parseInt(in.readLine().trim());
//		kursevi = new Kurs[brojKurseva];
//		for (int i = 0; i < brojKurseva; i++) {
//			String[] elementiLinije = in.readLine().split(",");
//			kursevi[i] = new Kurs(elementiLinije[0].trim(), elementiLinije[1].trim(),
//					Integer.parseInt(elementiLinije[2].trim()));
//		}
//		in.close();
//	}
	
	String najnaprednijiJezik() {
		Kurs najnapr = kursevi[0];
		for(Kurs k: kursevi) {
			if(k.getNivo().equals("napredni") && k.getBrPolaznika()>najnapr.getBrPolaznika())
				najnapr = k;
		}
		return najnapr.toString();
	}
	
	void unaprediGrupu(String jezik, String nivo) {
		Kurs trazeni;
		boolean promena = false;
		for(int i = 0; i < kursevi.length; i++) {
			if(kursevi[i].getJezik().equals(jezik) && kursevi[i].getNivo().equals(nivo)) {
				if (kursevi[i].getNivo().equals("osnovni")) {
					kursevi[i].setNivo("srednji");
					promena = true;
				}else if(kursevi[i].getNivo().equals("srednji")) {
					kursevi[i].setNivo("napredni");
					promena = true;
				}
			}
		}
		
		if(promena) {
			int trazeniKurs=0;
			for(int i = 0; i < kursevi.length; i++) {
				
			}
			if(trazeniKurs > 1) {
				System.out.println("Imamo dva kursa za "+ jezik + " jezik istog nivoa: " + nivo);
			}
		}else {
			System.out.println("Nismo imali promenu");
		}		
	}
	
	@Override
	public String toString() {
		String rez = "";
		for(Kurs k : kursevi) {
			rez += k.toString() + "\n";
		}
		return rez;
	}
	
}



