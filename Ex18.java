package homeEx1By10page;

import java.util.*;
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print ("������� ��������� ����� (*����* *������* *�������*):");
		int h1=sc.nextInt(); 
		int m1=sc.nextInt();
		int s1=sc.nextInt();
		System.out.print ("������� �������� ����� (*����* *������* *�������*):");
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int s2=sc.nextInt();
		//if (h1<=h2)
		int t1=(h1*3600)+(m1*60)+s1;
		int t2=(h2*3600)+(m2*60)+s2;
		int t3=t2-t1;
		double h3=t3/3600;
		double m3=t3%3600/60;
		double s3=t3%60;
		System.out.println ("���������� ������� �������� "+h3+" ����� "+m3+" ����� "+s3+" ������ ");
	}

}
