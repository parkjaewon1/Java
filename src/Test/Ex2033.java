package Test;

import java.util.Scanner;

public class Ex2033 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=10;

		while(n>num)
		{
					
			if( n%num <num/2)
				n=n-n%num;
			else if(n%num >=num/2)
				{
					n=n-n%num;
					n+=num;
				}
			num*=10;	
		}
		System.out.print(n);

	}

}
