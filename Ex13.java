package homeEx1By10page;
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("»спользу€ формулу √ерона найдем площадь треугольника по трем его сторонам");
		System.out.print ("¬ведите длину стороны a=");
		double a=sc.nextDouble();
		System.out.print ("¬ведите длину стороны b=");
		double b=sc.nextDouble();
		System.out.print ("¬ведите длину стороны c=");
		double c=sc.nextDouble();
		double p=(a+b+c)/2;
		double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.print ("S="+S);
	}

}
