package home;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("����� ������ R � ������� a (R a): ");
		double R=sc.nextDouble();
		double a=sc.nextDouble();
		if (R<=a/2) System.out.print ("���� ���������� � �������");
		else
			if (R>=a/Math.sqrt(2)) System.out.print ("������� ���������� � ����");
			else System.out.print ("������ �� ����������");
	}

}
