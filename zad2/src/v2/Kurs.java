package v2;

public class Kurs {
	private String jezik;
	private String nivo;
	private int brPolaznika;
	
	public Kurs(String jezik, String nivo, int brPolaznika) {
		super();
		this.jezik = jezik;
		this.nivo = nivo;
		this.brPolaznika = brPolaznika;
	}

	public String getJezik() {
		return jezik;
	}

	public void setJezik(String jezik) {
		this.jezik = jezik;
	}

	public String getNivo() {
		return nivo;
	}

	public void setNivo(String nivo) {
		if(nivo.equals("osnovni") || nivo.equals("srednji") || nivo.equals("napredni")) {
			this.nivo = nivo;
		}else {
			this.nivo = "osnovni";
		}					
	}

	public int getBrPolaznika() {
		return brPolaznika;
	}

	public void setBrPolaznika(int brPolaznika) {
		if(brPolaznika > 0) {
			this.brPolaznika = brPolaznika;
		}else {
			this.brPolaznika = 0;
		}		
	}

	@Override
	public String toString() {
		return  jezik + ", nivoa=" + nivo + ", brPolaznika=" + brPolaznika ;
	}
	
	
	
	
}
