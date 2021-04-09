package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9506 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true) {
         int n = sc.nextInt();
         if (n == -1) {
            break;
         }
         int[] arr = new int[n];
         int sum = 0;
         int cnt = 0;
         for (int i = 1; i < n; i++) {
            if (n % i == 0) {
               arr[cnt++] = i;
               sum += i;
            }
         }
         if (sum != n) {
            System.out.println(n + " is NOT perfect.");
            continue;
         }
         System.out.print(n + " = ");
         Arrays.sort(arr);
         for (int j = arr.length - cnt; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j + 1 != cnt && j != arr.length - 1)
               System.out.print(" + ");
         }
         System.out.println();
      }
      sc.close();
   }
}
