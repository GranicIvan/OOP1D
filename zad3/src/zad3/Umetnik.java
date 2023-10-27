package zad3;

public class Umetnik {

	private String ime;
	private UmetnickoDelo[] dela;
	private int brDela = 0;
	
	public String getIme() {
		return ime;
	}
	
	public UmetnickoDelo[] getDela() {
		return dela;
	}
	
	public int getBrDela() {
		return brDela;
	}

	public Umetnik(String ime, int maxBrDela) {
		super();
		this.ime = ime;
		dela = new UmetnickoDelo[maxBrDela];
	}
	
	public boolean izlozi (UmetnickoDelo d) {		
		if(brDela >= dela.length) {
			System.out.println("nemamo mesta za novo delo");
			return false;
		}else {
			dela[brDela] = d;
			brDela++;
			return true;
		}
	} 
	
	public double vrednost() {
		double ukuonaVrednost =0;
		for(UmetnickoDelo d : dela) {
			ukuonaVrednost += d.getCena();
		}
		return ukuonaVrednost;			
	}
	
}
