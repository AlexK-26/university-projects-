package onlesson;
import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� a � b ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.print("������� �����: ");
		if (a==b) System.out.print("�����");
		else if (a>b) System.out.print("������� �����: "+a);
		else System.out.print("������� �����: "+b);
	}

}
