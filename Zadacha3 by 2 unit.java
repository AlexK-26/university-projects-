package onlesson;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("ÂÂåäèòèå ñòîðîíû òðåóãîëíèêà");
		System.out.print ("Ââåäèòå äëèíû ñòîðîí a b c :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if ((a!=b)&(a!=c)&(c!=b)) System.out.print ("ðàçíîñòðîííèé");
		else if (a==b & b==c) System.out.print ("Ðàâíîñòîðîííèé");
		else if (a==b | b==c | c==a) System.out.print ("ðàâíîáåäðåííûé");
			
	}

}
