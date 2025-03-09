/* Problem Statement:
A delivery robot is programmed to visit N checkpoints in a city following a fixed route. However, due to a sudden change in traffic rules, the robot must reverse its path and start from the last checkpoint back to the first.

Write a program to reverse the order of the checkpoints given in the form of an array.

Input Format:

The first line contains an integer N (1 ≤ N ≤ 1000), representing the number of checkpoints.
The second line contains N integers A[i] (-10^6 ≤ A[i] ≤ 10^6), representing the checkpoint IDs in the order they were originally planned.
Output Format:

Print the reversed array of checkpoint IDs, space-separated.
Sample Input 1:

Copy
Edit
5
10 20 30 40 50
Sample Output 1:

Copy
Edit
50 40 30 20 10
Sample Input 2:

Copy
Edit
3
100 -50 200
Sample Output 2:

Copy
Edit
200 -50 100
Constraints:

1 ≤ N ≤ 1000
-10^6 ≤ A[i] ≤ 10^6
*/



package Arrays;
import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = N-1;

        while( left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

       for(int i=0;i<N; i++) {
           System.out.println(arr[i] + " ");
       }
    sc.close();
    }
}
