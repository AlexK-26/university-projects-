package home;
import java.util.*;
public class Ex37 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a, i, s, x , truex=0, falsex=0;
			System.out.print("����� �����: ");
			a=sc.nextInt();
			for (i=1;i<10;i++) {
			s=3;
			do {
			s--;
			System.out.print(a+"*"+i+" = ");
			x=sc.nextInt();
			} while (s>0 & x!=(a*i));
			if (x==a*i) truex++;
			else {falsex++; System.out.println("���������� ����� "+(a*i));}
			x=0;
			s=0;
			}
			System.out.println("���������� �������: "+truex);
			System.out.println("������������ �������: "+falsex);
			}

			}

	

