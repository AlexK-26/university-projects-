package home;
import java.util.*;
//import java.text.NumberFormat;
public class Ex32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("����� ���� �������������� ���������� ");
        double b=sc.nextDouble();
        double q=0.3;
        //int c=b;
        System.out.print("�������� ������ �������������� ���������� "+b);
        while (b>=1) {
        	b=b*q;
        	if (b > 1) System.out.print("; "+b);
        }

	}

}
