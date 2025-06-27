package task;
import java.util.Scanner;
public class Splitwords {
	
		public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String:");
		String sentence = sc.nextLine();

		String[] words = sentence.split("\\s+");

	for (String word: words)

		System.out.println(word);

		}

		}


