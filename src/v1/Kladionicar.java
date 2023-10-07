package v1;

public class Kladionicar {

	//polja klase
	private String ime;
	private String trenutnaIgra;
	private int stanjeNaRacunu;
	
	//Konstruktor 
	public Kladionicar(String ime, String trenutnaIgra, int stanjeNaRacunu) {
		this.ime = ime;
		setTrenutnaIgra(trenutnaIgra);
		this.stanjeNaRacunu = stanjeNaRacunu;
	}
	

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getIme(){
		return ime;
	}	
	
	
	public void setTrenutnaIgra(String igra) {
		if(igra.equals("poker") ||  igra.equals("ajnc") || igra.equals("rulet")) {
			trenutnaIgra = igra;
		}else {
			trenutnaIgra = "poker";
		}	
	}
	
	public String getTrenutnaIra() {
		return trenutnaIgra;
	}
	
	public void setStanjeNaRacunu(int stanje) {
		this.stanjeNaRacunu = stanje;
	}
	
	public int getStanje() {
		return stanjeNaRacunu;
	}
	
	// ovo ce se ispisati kada pozovemo println
	@Override
	public String toString() {
		return ime + " igra " + trenutnaIgra + " i ima " + stanjeNaRacunu + " na racunu";
	}	
}




