/*Problem Description:
You are working as a data analyst for an e-commerce company. The company recently collected customer feedback, where each customer gave a rating from 1 to 5 for a particular product. Your task is to count the frequency of each rating and display the result.

Input Format:

The first line contains an integer N — the number of customer ratings (1 ≤ N ≤ 1000).
The second line contains N space-separated integers R[i] — the ratings given by customers (1 ≤ R[i] ≤ 5).
Output Format:

Print each rating and its count in the format:
Rating X: Y
Ratings should be displayed in ascending order from 1 to 5.
Constraints:

There will be at least one rating present in the input.
If a particular rating does not appear, do not print it.
Sample Input 1:
Copy
Edit
10
5 3 4 5 2 1 3 5 4 2
Sample Output 1:
yaml
Copy
Edit
Rating 1: 1
Rating 2: 2
Rating 3: 2
Rating 4: 2
Rating 5: 3
Sample Input 2:
Copy
Edit
6
2 2 2 4 4 5
Sample Output 2:
yaml
Copy
Edit
Rating 2: 3
Rating 4: 2
Rating 5: 1  */


package Arrays;
import java.util.*;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arrs[] = new int[N];
        for (int i = 0; i < N; i++) {
            arrs[i] = sc.nextInt();
        }

        // Count frequencies using HashMap (unordered)
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int arr : arrs) {
            frequencyMap.put(arr, frequencyMap.getOrDefault(arr, 0) + 1);
        }

        // Display frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
