package home;
import java.text.NumberFormat;
import java.util.*;
public class Ex33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(10);
		int c = 0;
		double a;
		double sint=0;
		System.out.print("Введи число ");
		a=sc.nextDouble();
		//a=(a*Math.PI/180);
		System.out.print("Введи погрешность ");
		double p=sc.nextDouble();
		int k=1;
		double chisl=a;
		double znam=1;
		int znak=1;
		do {
		c++;
		sint=sint+znak*chisl/znam;
		chisl=chisl*a*a;
		znak=-znak;
		znam=znam*(k+1)*(k+2);
		k=k+2;
		}while (Math.abs(chisl/znam)>p);
		System.out.println("sin x найденный через ряд Тейлора = "+nf.format(sint));
		//System.out.println("sin x найденный через ряд Тейлора              = "+sint);
		System.out.println("sin x найденный через встроенную функцию языка = "+nf.format(Math.sin(a)));
		System.out.print("Точность подсчёта достигнута с итерации "+c);
		}

		

	}


