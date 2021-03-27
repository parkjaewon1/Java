package Test;

import java.util.*;

public class Ex5585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = 1000 - n;
		int h,t,o;
		int result=0;
		
			h=(r-(r-r/100*100))/100;
			t=(((r-r/100*100)-((r-r/100*100)%10))/10);
			o=(r-r/100*100)-((((r-r/100*100)-((r-r/100*100)%10))/10)*10);
			
			if (h>=5) {
				h = h-5;
				result +=1;
			}
			if(t>=5) {
				t = t-5;
				result +=1;
			}
			if(o>=5) {
				o = o-5;
				result +=1;
			}
			result += h+t+o;
			System.out.println(result);
	}

}
/* 			모범답안.		
 * 
 * Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = {500, 100, 50, 10, 5, 1};
		int r = 1000 - n;
		int cnt=0;
		
		for(int i=0; i < arr.length; i++){
			while(r > arr[i]){
				r -= arr[i];
				cnt ++;
			}
		}
		System.out.println(cnt);

 * 
 */
