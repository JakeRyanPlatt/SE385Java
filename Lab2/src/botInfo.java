// Make an array of "Rock, paper, Scissor" and randomly index to select

public class botInfo {
	public static String roller() {
		String choices[] = {"Rock", "Paper", "Scissors"};
		int result =(int)(Math.random() * choices.length);
		String randChoice = choices[result];
		System.out.println(randChoice);
		return randChoice;
		
	}

}
