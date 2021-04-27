package Test_04_27;

import java.util.Scanner;

public class Ex14501 { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t= new int[n+2];
		//cost 
		int[] p = new int[n+2];
		//value 
		int[] d = new int[n+2];
		for(int i = 1; i<=n; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			} 
		for(int i = n; i > 0; i--) { 
			int cost = i+t[i];
			if(cost > n+1) {
				d[i] = d[i+1];
				} else {
			d[i] = Math.max(d[i+1], d[cost]+p[i]);
			}
		} 
		System.out.println(d[1]);
		} 
}
	
