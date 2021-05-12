package Test_04_28;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2606 {
	static int arr[][];  //그래프배열
	static int chk[];	// 방문배열
	
	static void bfs(int start) {  //bfs 메소드
		Queue<Integer> q = new LinkedList<>();
		
		chk[start] = 1;
		q.offer(start);
		int cnt= 0;  // 감염된 컴퓨터 수 
		while(!q.isEmpty()) {
			int x = q.poll();
			
			for (int i = 0; i < arr.length; i++) { //
				if(arr[x][i]==1 && chk[i]!=1) {
					q.offer(i);
					chk[i]=1;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[n+1][n+1];
		chk = new int[n+1];
		
		 for (int i = 0; i < m; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			arr[c1][c2]=1;
			arr[c2][c1]=1;
		}
		 bfs(1);
	}

}
