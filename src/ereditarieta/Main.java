package ereditarieta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animale a = new Animale();
		System.out.print("L'animale ");
		a.verso();
		System.out.println("--------------------------");

		Gatto g = new Gatto("Alma", 4, "Casa", 5, 4.12, 7, "Grigio");
		
		System.out.println(g.toString());
		System.out.println("--------------------------");
		System.out.print(g.getNome() + " ");
		g.verso();
		System.out.print(g.getNome() + " ");
		g.mangia();
		System.out.println("--------------------------");
		
		Uccello u = new Uccello("Pio", 2, "Ovunque", 8, 0.11, "Verde e rosso", 3);
		
		System.out.println(u.toString());
		System.out.println("--------------------------");
		System.out.print(u.getNome() + " ");
		u.verso();
		System.out.print(u.getNome() + " ");
		u.mangia();
		System.out.println("--------------------------");
	}

}
