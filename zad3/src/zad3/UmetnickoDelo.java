package zad3;

public class UmetnickoDelo {

	private String naziv;
	private int godinaNastanka;
	private double cena; // u evrima
	
	@Override
	public String toString() {		 
		String rez = String.format("naziv= %s , godinaNastanka= %d, cena= %.2f " , naziv, godinaNastanka, cena ) ;
		return rez; 
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getGodinaNastanka() {
		return godinaNastanka;
	}
	
	public void setGodinaNastanka(int godinaNastanka) {
		this.godinaNastanka = godinaNastanka;
	}
	
	public double getCena() {
		return cena;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}

	public UmetnickoDelo(String naziv, int godinaNastanka, double cena) {
		super();
		this.naziv = naziv;
		this.godinaNastanka = godinaNastanka;
		this.cena = cena;
	}
	
	
	
	
	
	
	
}
