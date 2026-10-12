public class Q12 {
    public static long moduloPower(long base, long power, long mod) {
        if (mod <= 0 || power < 0) {
            throw new IllegalArgumentException("mod must be positive and power non-negative");
        }
        
        long result = 1 % mod;
        base = base % mod;
        
        for (long i = 0; i < power; i++) {
            result = (result * base) % mod;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(moduloPower(2, 10, 1000));
        System.out.println(moduloPower(7, 0, 13));
        System.out.println(moduloPower(9, 1, 7));
        System.out.println(moduloPower(3, 4, 1));
        System.out.println(moduloPower(0, 5, 11));
    }
}
