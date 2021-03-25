package Test;

import java.util.*;

public class Ex2010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int MultiTab;
		int N = sc.nextInt();
		for (int j = 0; j < N; j++) {
			MultiTab = sc.nextInt();
			r+=MultiTab;
		}
		System.out.println(r-(N-1));
	}
}
