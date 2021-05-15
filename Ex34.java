package nextlesson;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("¬веди число  ");
		double x=sc.nextDouble();
		System.out.print("¬веди точность  ");
		double t=sc.nextDouble();
		double R1=Math.cos(x);
		System.out.println("cos(x) =  "+R1);
		double R2=1, c, f=1;
		int n=0, z=1;
		do {
			n+=2; z=-z;
			f=f*(n-1)*n;
			c=z*Math.pow(x, n)/ f;
			//System.out.println("c ("+n+") =  "+c);
			R2+=c;
		} while (Math.abs(c)>t);
		System.out.println("cos(x) =  "+R2);
		System.out.println("членов тейлора =  "+(n/2+1));
		

	}

}
