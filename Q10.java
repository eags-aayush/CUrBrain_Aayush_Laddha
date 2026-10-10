public class Q10 {
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] isComposite = new boolean[n]; 
        int count = 0;
        
        for (int p = 2; p * p < n; p++) {
            if (!isComposite[p]) {
                    for (int i = p * p; i < n; i += p) {
                    isComposite[i] = true;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.print(countPrimes(10));
        System.out.print(countPrimes(2));
        System.out.print(countPrimes(0));
        System.out.print(countPrimes(3));
        System.out.print(countPrimes(30));
    }
}
