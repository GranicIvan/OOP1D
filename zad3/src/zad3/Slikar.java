package zad3;

public class Slikar extends Umetnik{

	public Slikar(String ime) {
		super(ime,5);		
	}
	
	
	@Override
	public double vrednost() {
		double ukuonaVrednost =0;
		for(UmetnickoDelo d : getDela()) {
			ukuonaVrednost += ukuonaVrednost + d.getCena() *(1.0 + (0.15*(2023-d.getGodinaNastanka())));
		}
		return ukuonaVrednost;
	}

}
