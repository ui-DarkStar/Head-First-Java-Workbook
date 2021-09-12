
public class Player {
	int number = 0;
	public void guess() {
		number = (int) (Math.random() * 10 + 1);
		System.out.println("I'm guessing " + number);
		
	}
}