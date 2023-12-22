public class Sqrt {

    public static class Compute {
        /*
            This is amazing problem for binary search. 
        */
        public static int root(int n) {
            int L = 0 ,R = n;

            if (n < 2) return n;

            while (L <= R) {

                int mid = L + (R - L) / 2;
                long square = (long) mid * mid;

                if (square == n) return mid;
                else if (square > n) R = mid - 1;
                else L = mid + 1;

            }

            return R;
        }

        Compute(int n) {
            int result = root(n);
            System.out.println("The square root of X is : " + result);
        }
    
    }
    

    public static void main(String[] args) {
        int x = 4;
        Compute object = new Compute(x);
        
    }   

}
