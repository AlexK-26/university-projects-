package onlesson;
import java.util.Random;
import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a=r.nextInt(100);
		int b=r.nextInt(100);
		System.out.println("�������� ������ ������� ���������");
		System.out.print("������ ������ "+a+"*"+b+" = ");
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		if (c==a*b) System.out.print("���!");
		else {System.out.print("�������: ");
			System.out.print("������ ������ �������� "+a+"*"+b+" = ");
			c=sc.nextInt();}
		if (c==a*b) System.out.print("���!");
		else System.out.print("����� �������: "+a+"*"+b+" = "+(a*b));
	}

}
