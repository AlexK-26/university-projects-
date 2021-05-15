package onlesson;

import java.util.Scanner;

public class NODEvklid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Введи два числа: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=x, b=y;
		while (a!=b) {
			if (a>b) a-=b;
			else b-=a;
		}
		System.out.print("НОД("+x+";"+y+")= "+a);
	}

}
