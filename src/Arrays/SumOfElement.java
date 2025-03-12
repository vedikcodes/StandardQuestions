/*A company wants to calculate the total score of all employees from an array where each element represents an employee's score. Write a program to compute the sum of all elements in the array.

Input format:

The first line contains an integer N — the number of employee scores.
The second line contains N integers separated by space — the scores.
Output format:

Print a single integer — the sum of all elements in the array.
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
5
3 1 4 1 2
Sample Output 1:

Copy
Edit
11
Sample Input 2:

diff
Copy
Edit
3
-3 10 5
Sample Output 2:

Copy
Edit
12*/

package Arrays;
import java.util.*;

public class SumOfElement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<N;i++) {
            sum = arr[i]+sum;

        }
        System.out.println(sum);
    sc.close();
    }
}
