package nextlesson;

import java.util.Scanner;

public class Ex319 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¬веди диапазон чисел ");
		int i = sc.nextInt();
		int a = sc.nextInt();
		int d=0;
		boolean p=false;
		for ( ; i<=a ; i++) {
			p=isPrime(i,d, p);
			if (p==true || i==2) System.out.print(i+", "); 
				
		}
		
}


public static boolean isPrime(int i, int d, boolean p) {
	if (i % 2 == 0 || i==1) return p=false;  
    d = 3;
    while (d * d <= i && i % d != 0) {
        d += 2;
    }
    if (d*d>i)	return p=true;
    else return p=false;
}
}
