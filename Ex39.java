package nextlesson;
import java.util.Scanner;
import java.text.*;
public class Ex39 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumIntegerDigits(2);
		Scanner sc=new Scanner (System.in);
		System.out.print("����� ������ ���(HH MM) ");
		int h=sc.nextInt();
		int m=sc.nextInt();
		System.out.print ("������� ����������������� ������� ");
		int zm = sc.nextInt();
		System.out.print ("������� ����������������� ������ �� �������� �������� ");
		int pm = sc.nextInt();
		int mm=h*60+m;
		int o, t;
		while(mm+zm<1440) {
		o=mm/60;
		t=mm%60;
		System.out.print(nf.format(o)+":"+nf.format(t)+" � ");
		mm=mm+zm;
		o=mm/60;
		t=mm%60;
		mm+=pm;
		System.out.println(nf.format(o)+":"+nf.format(t));
		}
		
		}

	}


