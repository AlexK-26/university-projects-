package onlesson;

import java.util.Scanner;

public class Zadacha2Password {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x;
		int s=0;
		int p=1234;
		do {
			s++;
			System.out.print("����� ������: ");
			x=sc.nextInt();
			/*if (p==x) System.out.print("OK!");
			else System.out.println ("������ ��������. �������� �������:"+(5-s));*/
		} while (s<5 & p!=x); // |p==x
		if (x==p) System.out.print("������ ������");
		else System.out.print("������ ��������. ������� �����������");

	}

}
