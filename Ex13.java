package homeEx1By10page;
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("��������� ������� ������ ������ ������� ������������ �� ���� ��� ��������");
		System.out.print ("������� ����� ������� a=");
		double a=sc.nextDouble();
		System.out.print ("������� ����� ������� b=");
		double b=sc.nextDouble();
		System.out.print ("������� ����� ������� c=");
		double c=sc.nextDouble();
		double p=(a+b+c)/2;
		double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.print ("S="+S);
	}

}
