
import java.util.*;
public class candy {
    public int candyy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int ans = 0;
        for (int c : candies) {
            ans += c;
        }
        return ans;
    }
    public static void main(String[] args) {
        candy obj = new candy();
        int[] ratings = {1, 0, 2};
        System.out.println(obj.candyy(ratings)); // Output: 5
    }
}
