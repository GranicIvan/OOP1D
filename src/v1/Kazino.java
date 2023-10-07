package v1;

public class Kazino {

	Kladionicar[] kladionicari;
		
	public Kazino(Kladionicar[] kladionicari) {
		this.kladionicari = kladionicari;
	}
	
	
	@Override
	public String toString() {
		String toString = "";
		for (int i = 0; i < kladionicari.length; i++) {
			toString += kladionicari[i].toString() + "\n";
		}
		return toString;
	}
	
	
	String najprofitnijaIgra() {
		int poker = 0;
		int ajnc = 0;
		int rulet = 0;
		
		for(int i = 0; i < kladionicari.length; i++) {
			if(kladionicari[i].getStanje() < 0) {
				if(kladionicari[i].getTrenutnaIra().equals("ajnc")) {
					ajnc++;
				}else if(kladionicari[i].getTrenutnaIra().equals("rulet")) {
					rulet++;
				}else {
					poker++;
				}
			}
		}
		
		if(poker > ajnc) {
			if(poker > rulet) {
				return "poker";
			}else return "rulet";
		}else if(ajnc > rulet) {
			return "ajnc";
		}else return "rulet";	
	}
	
	
	
}


