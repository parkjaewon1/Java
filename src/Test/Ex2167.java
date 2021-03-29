package Test;

import java.util.Scanner;

public class Ex2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt() , m =sc.nextInt();
		int [][] arr= new int[n][m];	
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		int x1,x2,y1,y2;
		
		for (int i = 0; i < k; i++) {
			sum=0;
			x1= sc.nextInt();
			x2= sc.nextInt();
			y1= sc.nextInt();
			y2= sc.nextInt();
			for (int j = x1; j <= y1; j++) {
				for (int l = x2; l <= y2; l++) {
						sum +=arr[j-1][l-1];
					}
				}
			System.out.println(sum);
		} 

	}

}
