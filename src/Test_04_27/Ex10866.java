package Test_04_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			case "push_front": {
				deque.addFirst(Integer.parseInt(str[1]));
				break;
			}
			case "push_back": {
				deque.addLast(Integer.parseInt(str[1]));
				break;
			}
			case "pop_front": {
				System.out.println(deque.isEmpty()?-1:deque.pollFirst());
				break;
			}
			case "pop_back": {
				System.out.println(deque.isEmpty()?-1:deque.pollLast());
				break;
			}
			case "size": {
				System.out.println(deque.size());
				break;
			}
			case "empty": {
				if (deque.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			}
			case "front": {
				if (deque.size() < 1) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekFirst());
				}
				break;
			}
			case "back": {
				if (deque.size() < 1) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
				break;
			}
			
			}

		}
	}

}
