package javaproject;
import java.util.Scanner;
public class Studentmark {

public static void main(String[]args){ 
	Scanner scanner = new Scanner(System.in); 
	System.out.print("Enter Student Name: ");
	String name = scanner.nextLine();

			System.out.print("Enter Student Mark1: "); 
				int mark1 = scanner.nextInt();

				System.out.print("Enter Student Mark2: ");
				int mark2 = scanner.nextInt();

//formula

int total = mark1 + mark2;
double average = total/2.0;

//logic 
if(average >=90) {

System.out.println("grade A");

}

else if(average >=80) {
	 System.out.println("gardeB");

}
else if(average >=60) {

System.out.println("grade C");
}

//output
System.out.println("Name: "+name);

System.out.println("Mark1:"+mark1);

System.out.println("Mark2:"+mark2);

System.out.println("Total mark:"+total);

System.out.println("Total Average of Student:"+average);

}
}


