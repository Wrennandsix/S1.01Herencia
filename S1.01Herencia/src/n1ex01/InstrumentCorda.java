package n1ex01;

public class InstrumentCorda extends Instrument {

	public InstrumentCorda(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonant un instrument de corda.");
		
	}
	@Override
	public String toString() {
		return "InstrumentCorda ====> Nom: " + nom + ", preu: " + preu +" Euros";
	}
}


