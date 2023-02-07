package ereditarieta;

public class Uccello extends Animale{
	
	private String colorePiume;
	private int becco;
	
	public Uccello() {
		
	}
	
	public Uccello(String nome, int zampe, String habitat, int eta, double peso, String colorePiume, int becco) {
		super (nome, zampe, habitat, eta, peso);
		this.colorePiume = colorePiume;
		this.becco = becco;
	}
	
	@Override
	public void verso() {
		System.out.println("Cinguetta");
	}

	public String getColorePiume() {
		return colorePiume;
	}

	public void setColorePiume(String colorePiume) {
		this.colorePiume = colorePiume;
	}

	public int getbecco() {
		return becco;
	}

	public void setbecco(int becco) {
		this.becco = becco;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Colore delle piume: " + colorePiume + "\n"
								+ "Lunghezza del becco: " + becco;
	}
}
