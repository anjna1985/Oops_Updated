package loopClass;

public class NestedLoopClass {

	public static void main(String[] args) {

		// While - > 3
		// for --> 4
		// d-while --> 5
		// Complete loop will run for 60 times ->

		int i = 1;
		int count = 1;

		while (i <= 3) {
			for (int j = 1; j <= 4; j++) {
				int k = 1;
				do {
					System.out.println("i--->" + i + "j--->" + j + "k--->" + k);
					k++;
					System.out.println("Time run iteration: " + count);
					count++;
				} while (k <= 5);
			}
			i++;

		}

	}

}