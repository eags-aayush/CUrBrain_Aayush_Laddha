public class Q9 {
    public static int nextPrime(int n) {
        if (n < 2) return 2;
        
        int candidate = n + 1;
        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.print(nextPrime(14));
        System.out.print(nextPrime(0));
        System.out.print(nextPrime(1));
        System.out.print(nextPrime(2));
        System.out.print(nextPrime(17));
    }
}
