package ereditarieta;

public class Gatto extends Animale{
	
	private int vite;
	private String colorePelo;
	
	public Gatto() {
		
	}
	
	public Gatto(String nome, int zampe, String habitat, int eta, double peso, int vite, String colorePelo) {
		super(nome, zampe, habitat, eta, peso);
		this.vite = vite;
		this.colorePelo = colorePelo;
	}
	
	@Override
	public void verso() {
		System.out.println("Miagola");
	}

	public int getVite() {
		return vite;
	}

	public void setVite(int vite) {
		this.vite = vite;
	}

	public String getColorePelo() {
		return colorePelo;
	}

	public void setColorePelo(String colorePelo) {
		this.colorePelo = colorePelo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Numero vite: " + vite + "\n"
								+ "Colore pelo: " + colorePelo;
	}

}
