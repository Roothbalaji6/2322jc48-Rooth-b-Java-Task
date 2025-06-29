package javaproject;
import java.util.Scanner;
public class Menudrive {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter num1:");

int num1 = scanner.nextInt();

System.out.print("Enter num2:");

int num2 = scanner.nextInt();

System.out.println("1.add\n 2.subtract\n 3. Multiply\n 4.div\n ");

System.out.print("Enter your choice: ");

int ans;

int choice=scanner.nextInt();

switch (choice){

case 1:

ans=num1+num2;

System.out.println("Answer:"+ans);

break;

case 2:

ans=num1-num2;

System.out.println("Answer:"+ans);

break;

case 3:

ans=num1*num2;

System.out.println("Answer."+ans);

break;

case 4:

ans=num1/num2;
System.out.println("Answer"+ans);
break;
default:
System.out.println(" dose not Exits...");
}
}
}


