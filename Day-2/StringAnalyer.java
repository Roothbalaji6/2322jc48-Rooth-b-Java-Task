package task;
import java.util.Scanner;
	public class StringAnalyer {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = sc.nextLine();

	        String[] words = input.split("\\s+");
	        int wordCount = words.length;
	        int charCount = input.replace(" ", "").length();
	        String reversed = new StringBuilder(input).reverse().toString();

	        String longest = "";
	        for (String w : words)
	            if (w.length() > longest.length()) longest = w;

	        System.out.println("Word count: " + wordCount);
	        System.out.println("Character count (no spaces): " + charCount);
	        System.out.println("Reversed: " + reversed);
	        System.out.println("Longest word: " + longest);
	    }
	}



