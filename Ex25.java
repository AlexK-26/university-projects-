package onlesson;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Введи габариты посылки: ");
		int r=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		System.out.print("Введи габариты упаковки: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a*b*c>=r*s*t) {
			if  ((a<=r & b<=s & c<=t) | (a<=t & b<=s & c<=r) | (a<=s &  b<=t &  c<=r) | (a<=r &  b<=t &  c<=s) | (a<=t &  b<=r &  c<=s) | (a<=s &  b<=r &  c<=t)) System.out.print("Посылка войдёт в упаковку");
			else  System.out.print("Посылка не войдёт в упаковку");
		}
		else  System.out.print("Посылка не войдёт в упаковку");
		

	}

}
