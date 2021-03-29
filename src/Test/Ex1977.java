package Test;
import java.util.Scanner;

public class Ex1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		
		int NN = (int)Math.sqrt(N)+1;
		int MM = (int)Math.sqrt(M);
		
		if(NN-1==Math.sqrt(N)) {
			NN= NN-1;
		}
		
		for (int i = NN; i <= MM; i++) {
			sum +=Math.pow(i,2);
		}
		
		if(N>10000||M>10000||sum==0)
			System.out.println(-1);
		else {
		System.out.println(sum);
		System.out.println((int)Math.pow(NN, 2));
		}

	}

}
