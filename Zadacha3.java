package onlesson;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("�������� ������� �����������");
		System.out.print ("������� ����� ������ a b c :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if ((a!=b)&(a!=c)&(c!=b)) System.out.print ("�������������");
		else if (a==b & b==c) System.out.print ("��������������");
		else if (a==b | b==c | c==a) System.out.print ("��������������");
			
	}

}
