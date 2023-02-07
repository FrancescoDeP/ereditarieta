package ereditarieta;

public class Animale {
	
	private String nome;
	private int zampe;
	private String habitat;
	private int eta;
	private double peso;
	
	public Animale() {
		
	}
	
	public Animale(String nome, int zampe, String habitat, int eta, double peso) {
		this.nome = nome;
		this.zampe = zampe;
		this.habitat = habitat;
		this.eta = eta;
		this.peso = peso;
	}
	
	public void mangia() {
		System.out.println("Sta mangiando");
	}
	
	public void dorme() {
		System.out.println("Sta dormendo");
	}
	
	public void cresce() {
		System.out.println("Sta crescendo");
	}
	
	public void verso() {
		System.out.println("Sta emettendo un verso");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
				+ "Numero zampe: " + zampe + "\n"
				+ "Habitat: " + habitat + "\n"
				+ "Età: " + eta + "\n"
				+ "Peso: " + peso + "\n";
	}

}
