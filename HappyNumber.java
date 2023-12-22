public class HappyNumber {

    public static int square(int num) {

        int ans = 0;

        while (num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 19;

        /* 

            This is two pointer approach and also known as FLOYD'S WARSHALL ALGORITHM 
            
        */

        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        System.out.println(slow == 1);
    }
}