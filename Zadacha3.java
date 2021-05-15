package onlesson;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("ВВедитие стороны треуголника");
		System.out.print ("Введите длины сторон a b c :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if ((a!=b)&(a!=c)&(c!=b)) System.out.print ("разностронний");
		else if (a==b & b==c) System.out.print ("Равносторонний");
		else if (a==b | b==c | c==a) System.out.print ("равнобедренный");
			
	}

}
