package Test;

import java.util.Scanner;

public class Ex2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int card[] = new int[N];
		
		int result = 0;

		for (int i = 0; i < card.length; i++) {
			card[i]=sc.nextInt();
		}
		for (int i = 0; i< N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for (int k= j+1; k < N; k++) {
					int sum = card[i]+card[j]+card[k];
					if(sum <= M && M-sum < M - result) {
						result= sum;
					}
				}
			}
		}
		System.out.println(result);

	}

}
