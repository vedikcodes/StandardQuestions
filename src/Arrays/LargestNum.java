/*Problem Statement:
A company is analyzing daily sales figures for a product over N days. The management wants to know the highest sales figure recorded in this period to assess peak demand.

Write a program to find the maximum sales figure from the given data.

Input Format:

The first line contains an integer N (1 ≤ N ≤ 1000), representing the number of days.
The second line contains N integers S[i] (0 ≤ S[i] ≤ 10^6), where S[i] represents the sales figure for day i.
Output Format:

Print the highest sales figure recorded.
Sample Input 1:
5
100 450 300 600 250

Sample Output 1:
600

Sample Input 2:

yaml
Copy
Edit
3
1200 1100 1350
Sample Output 2:

yaml
Copy
Edit
1350
Constraints:

1 ≤ N ≤ 1000
0 ≤ S[i] ≤ 10^6
*/
package Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0 ; i<N ;i++) {
            arr[i] = sc.nextInt();
        }

         int largest = arr[0];
        for(int i=1;i< N ; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.print(largest);
        }
    }

