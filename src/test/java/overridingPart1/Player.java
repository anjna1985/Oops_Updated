package overridingPart1;

public class Player {

	public static void main(String[] args) {

		System.out.println("Sony :: ");
		Sony s = new Sony();
		s.play();

		System.out.println("\nPanasonic :: ");
		Panasonic p = new Panasonic();
		p.play();

	}

}
