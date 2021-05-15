package onlesson;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("¬веди число: ");
		int a=sc.nextInt();
        for (int i=1;i<11;i++) {
        	System.out.println(a+"*"+i+" = "+(a*i));
        }
        
	}

}
