package v1;

public class Kladionicar {

	//polja klase
	private String ime;
	private String trenutnaIgra;
	private int stanjeNaRacunu;
	
	//Konstruktor 
	void Kladionicar(String ime, String trenutnaIgra, int stanjeNaRacunu) {
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
	
	
	
	
}




