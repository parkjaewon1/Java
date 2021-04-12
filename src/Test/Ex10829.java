package Test;
import java.util.*;

public class Ex10829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = n;
		int cnt = 0; 
		
		while(n>=1) {
			if(n%2==0) {
				cnt++;
				n=n/2;
			}else {
				cnt++;
				n=n/2;
			}
		
		}
		
		String result = "";
		
		while(cnt>0) {
			if(m%2==0) {
				result += "0";
				cnt--;
				m=m/2;
			}else {
				result += "1";
				cnt--;
				m=m/2;
			}

		
		}
		for (int i = result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }

	}

}
