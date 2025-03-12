/*A company wants to analyze employee performance scores in a unique way — they want to rearrange the scores such that:

The first half of the array is sorted in increasing order.
The second half is sorted in decreasing order.
Write a program to rearrange the array accordingly.

Input format:

The first line contains an integer N — the number of employee scores.
The second line contains N integers separated by spaces — the scores.
Output format:

Print the rearranged array where the first half is in increasing order and the second half is in decreasing order.
Constraints:

1
≤
𝑁
≤
10
3
1≤N≤10
3

−
10
5
≤
score
≤
10
5
−10
5
 ≤score≤10
5

Sample Input 1:

Copy
Edit
6
3 1 4 1 5 9
Sample Output 1:

Copy
Edit
1 1 3 9 5 4
Sample Input 2:

Copy
Edit
7
10 20 30 40 50 60 70
Sample Output 2:

Copy
Edit
10 20 30 70 60 50 40*/



package Arrays;
import java.util.*;

public class Inc_Dec_order {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

      for(int i=0; i<N;i++){
        arr[i] = sc.nextInt();}

      int mid =N/2;
   for(int i=0; i<mid;i++) {
       System.out.println(arr[i] + " ");
   }

   for(int i= N-1 ;i>=mid;i--){
       System.out.println(arr[i] + " ");
   }
   sc.close();
    }
}
