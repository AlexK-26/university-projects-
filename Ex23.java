package home;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Введи радиус R и сторону a (R a): ");
		double R=sc.nextDouble();
		double a=sc.nextDouble();
		if (R<=a/2) System.out.print ("Круг поместится в квадрат");
		else
			if (R>=a/Math.sqrt(2)) System.out.print ("Квадрат поместится в круг");
			else System.out.print ("Ничего не поместится");
	}

}
