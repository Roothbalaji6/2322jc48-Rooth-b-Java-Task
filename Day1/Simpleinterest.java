package javaproject;
import java.util.Scanner;


import java.util.Scanner;
public class Simpleinterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter the Principle Amt:");

        double principle = scanner.nextDouble();



        System.out.println("Enter the Rate :");

        double rate = scanner.nextDouble();



        System.out.println("Enter the Time:");

        double time = scanner.nextDouble();



   

        double Si= (principle * rate * time) / 100;

            

            System.out.println("simple interest :"+Si);

              if(principle > 0 && rate>=0 && time>0) {

            System.out.println("program exist200");

        }

    }

}






