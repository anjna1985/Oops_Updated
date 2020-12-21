package overridingPart1;

public class Sony extends Music {

	Sony() {
		System.out.println("Sony operations...");
	}

	@Override
	public void play() {
		System.out.println("Sony:: Playing music... ");
	}

} 
