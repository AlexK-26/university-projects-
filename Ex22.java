package onlesson;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		System.out.print("¬веди a b c :");
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double D=(Math.pow(b, 2)-(4*a*c));
		if (D>0) {
			double x1=((-b+Math.sqrt(D))/(2*a));
			double x2=((-b-Math.sqrt(D))/(2*a));
			System.out.println("x1 = "+x1+"    x2 = "+x2);
		}	
		else
			if (D==0) {
			double x1=(-b)/(2*a);
			System.out.println("x1 = "+x1);
		    }
			else System.out.println("нет корней");
		
		}

	}


