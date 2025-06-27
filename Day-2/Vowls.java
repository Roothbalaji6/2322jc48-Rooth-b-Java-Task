package task;
import java.util.Scanner;

public class Vowls {
	public static void main(String[] args) {
	    Scanner sn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String ss = sn.nextLine().toLowerCase();

        int vowelCount = ss.length() - ss.replaceAll("[aeiou]", "").length();
        System.out.println("Vowels count: " + vowelCount);
    }
}
			