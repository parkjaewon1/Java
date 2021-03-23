package Test;
import java.util.Iterator;
import java.util.Scanner;

class avg_score {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score;
		int avg = 0;
		
		for(int i=0;i<5;i++) {
			score = sc.nextInt();
			
			if(score <40) {
				score=40;
				avg += score;
			}
			else if (score < 101) 
				avg +=score;
		}
	
		System.out.println(avg/5);
		
		

	}

}
