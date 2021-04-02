package Test;
import java.util.Scanner;

public class Ex11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,K;
		
		N= sc.nextInt();
		K= sc.nextInt();
		
		int result, r1 =1,r2=1,r3=1;
		
		if(N<1 && N>10) {
			System.out.println("실행오류");
		}
		else {
	
			for(int i = N;i>0;i--) {
				 r1*=i;
			}
			for(int j = (N-K);j>1;j--) {
				r2 *=j;
			}
			for (int k = K;k>1;k--) {
				r3*=k;
			}
			
			result = r1/(r2*r3);
			
			System.out.println(result);
		}

	}

}
