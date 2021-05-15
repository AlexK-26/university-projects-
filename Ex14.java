package homeEx1By10page;
import java.util.*;
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("»спользу€ формулу √ерона найдем площадь треугольника зна€ координаты точек A, B, C");
		System.out.print("¬ведите координаты точки A (x y): ");
		int Ax=sc.nextInt();
		int Ay=sc.nextInt();
		System.out.print("¬ведите координаты точки B (x y): ");
		int Bx=sc.nextInt();
		int By=sc.nextInt();
		System.out.print("¬ведите координаты точки C (x y): ");
		int Cx=sc.nextInt();
		int Cy=sc.nextInt();
		System.out.println("ƒлины сторон равны: ");
		double A=Math.abs(Math.sqrt(Math.pow(Cx-Bx, 2)+Math.pow(Cy-By, 2)));
		System.out.println("A="+A);
		double B=Math.abs(Math.sqrt(Math.pow(Ax-Cx, 2)+Math.pow(Ay-Cy, 2)));
		System.out.println("B="+B);
		double C=Math.abs(Math.sqrt(Math.pow(Bx-Ax, 2)+Math.pow(By-Ay, 2)));
		System.out.println("C="+C);
		double p=(A+B+C)/2;
		double S=Math.sqrt(p*(p-A)*(p-B)*(p-C));
		System.out.print ("S="+S);
	}

}
