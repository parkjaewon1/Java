package Test;

import java.util.Scanner;
public class Ex1834 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long result= 0;
		
		
	if(N>2000000) {
		System.out.println("error");
	}
	else {
		for (long i = 1; i < N; i++) {
			result += (N+1)*i;
		}
	}
		
		System.out.println(result);

	}

}

