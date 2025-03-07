/*Problem Statement:
Write a program to find the smallest number in an array.

Input Format:

The first line contains an integer N (1 ≤ N ≤ 1000), the size of the array.
The second line contains N integers A[i] (-10^6 ≤ A[i] ≤ 10^6), the elements of the array.
Output Format:

Print the smallest number in the array.
Sample Input 1:

Copy
Edit
5
3 -2 7 1 -8
Sample Output 1:

diff
Copy
Edit
-8
Sample Input 2:

Copy
Edit
3
100 50 200
Sample Output 2:

Copy
Edit
50  */




package Arrays;
import java.sql.SQLOutput;
import java.util.*;


public class SmallestNum {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int arr[] = new int[N];

      for(int i=0 ; i<N ;i++){
          arr[i] = sc.nextInt();

      }

      int smallest_no = arr[0];
      for( int  i=1; i<N; i++) {
          if(arr[i] < smallest_no){
              smallest_no =arr[i];
          }
      }
      System.out.println(smallest_no);
      }


}
