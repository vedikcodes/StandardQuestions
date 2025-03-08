/*Problem Statement:
A sports academy is analyzing the performance scores of N athletes in a recent competition. The coach wants to identify both the second highest and second lowest scores to spot emerging talent — those just behind the top performer and just above the weakest performer.

Write a program to find the second smallest and second largest scores from the given data.

Input Format:

The first line contains an integer N (2 ≤ N ≤ 1000), representing the number of athletes.
The second line contains N integers S[i] (-10^6 ≤ S[i] ≤ 10^6), where S[i] represents the score of the i-th athlete.
Output Format:

Print two space-separated integers: the second smallest score and the second largest score.
Sample Input 1:

Copy
Edit
5
45 12 78 34 56
Sample Output 1:

Copy
Edit
34 56
Sample Input 2:

Copy
Edit
4
100 150 200 250
Sample Output 2:

Copy
Edit
150 200
Constraints:

2 ≤ N ≤ 1000
-10^6 ≤ S[i] ≤ 10^6
Scores may have duplicates, but there will always be at least two distinct scores.
Explanation:

In the first test case, the scores in sorted order are [12, 34, 45, 56, 78]. The second smallest is 34 and the second largest is 56.
In the second test case, the second smallest score is 150 and the second largest score is 200.*/



package Arrays ;
import java.util.*;

public class SecsmallestandSecLargest {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int [N];

        // all the arrays element
        for( int i =0 ; i< N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int secSmallest =-1;
        int secLargest =-1;
        for( int i=1; i< N ; i++) {
            if(arr[i] != arr[0]) {
                secSmallest = arr[i];
                break;
            }
        }

        for(int i= N-2; i>= 0 ;i--){
            if(arr[i] != arr[N-1]){
                secLargest = arr[i];
                break;
            }
        }

        System.out.println(secSmallest + " " + secLargest);
        sc.close();

    }
}
