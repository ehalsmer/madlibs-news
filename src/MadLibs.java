import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] prompts = {"Verb past tense", "Adjective", "Adjective", "Verb base form", "Adjective", "Noun plural", "Adverb", "Adjective", "Verb base form"};
		String[] words = new String[9];
		System.out.println("Let's play MadLibs News! Input 9 words as prompted:");
		for (int i=0; i<9; i++) {
			System.out.println(prompts[i] + ": ");
			words[i] = scan.next();
		}
		System.out.println("All done! Here is your news story:");
		System.out.print("Apple has acknowledged what many iPhone owners long suspected : It has " + words[0] + " older phones.\r\n" + 
				"The tech giant issued a rare statement of explanation on Thursday, saying that it has " + words[0] + " older iPhones that may have " + words[1] + " issues that would cause them to turn off suddenly.\r\n" + 
				"\r\n" + 
				"Tech analysts and " + words[2] + " customers have reported in recent days that operating system updates had caused older iPhones to " + words[3] + " considerably, with some suggesting that Apple could be using the tactic to encourage fans to buy " + words[4] + " " + words[5] + ".\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Apple " + words[6] + " insists the updates were made with a different goal in mind: It said the performance of " + words[7] + " batteries degrades over time, which can sometimes cause phones to suddenly " + words[8] + " in order to protect their components.");
	}
}

/*
Verb Past Tense, words[0]
Adjective
Adjective
Verb Base Form
Adjective
Noun Plural
Adverb
Adjective
Verb Base Form
*/