package javaconcepts;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a= sc.nextInt();
		b=sc.nextInt();
		char operation;
		operation=sc.next().charAt(0);
		if(operation=='+') {
		System.out.println(a+b);
		} else if((operation=='-')) {
			System.out.println(a-b);
		} else if((operation=='*')) {
			System.out.println(a*b);
		} else if((operation== '/' )) {
			try {
				System.out.println(a/b);}
			catch(ArithmeticException e) {
				System.out.println("can not divide by o");
				
			}
		}
	}

}
