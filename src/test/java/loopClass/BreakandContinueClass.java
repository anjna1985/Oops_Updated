package loopClass;

public class BreakandContinueClass {

	public void go() {
		System.out.println("Firs*t");
		// break; -> break cannot be used outside of a loop or a switch
		// continue; -> continue cannot be used outside of a loop
		System.out.println("Last");
	}

	public static void main(String[] args) {

		/*
		 * BreakandContinueClass BCC = new BreakandContinueClass(); BCC.go();
		 */

		for (int i = 0; i <= 10; i++) {
			/*
			 * if (i==5) break; System.out.println(i);
			 */

			//if (i >= 5)
				if (i>=5 && i<=7)
				continue; // continue to next cycle, to skip the iterations
				System.out.println(i);

		}

		System.out.println("Outside the loop");
	}

}
