import java.util.Arrays;

public class Q8 {
    public static int kthFactor(int n, int k) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        
        if (k > count) {
            return -1; 
        }
        
        int[] factors = new int[count];
        int index = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
                if (i != n / i) {
                    factors[index++] = n / i;
                }
            }
        }
        
        Arrays.sort(factors);
        
        return factors[k - 1];
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
        System.out.println(kthFactor(1, 1));
        System.out.println(kthFactor(12, 6));
        System.out.println(kthFactor(12, 7));
        System.out.println(kthFactor(36, 5));
    }
}