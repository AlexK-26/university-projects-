package onlesson;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		System.out.print("����� � � :");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>0 & y>0) System.out.println("����� � I ��������");
		else
			if (x<0 & y>0) System.out.println("����� � II ��������");
			else
				if (x<0 & y<0) System.out.println("����� � III ��������");
				else 
					if (x>0 & y<0) System.out.println("����� � IV ��������");
					else
						if (x==0 & y==0) System.out.println("����� � ������ ���������");
						else System.out.println("��������� ������ �������");
		
	}
}