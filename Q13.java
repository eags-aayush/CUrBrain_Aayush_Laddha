public class Q13 {
    public static boolean hasDivisiblePrefix(long[] arr, long k) {
        if (k == 0) {
            throw new IllegalArgumentException("k must be non-zero");
        }
        
        k = Math.abs(k);
        long remainder = 0;
        
        for (long value : arr) {
            remainder = (remainder + ((value % k) + k) % k) % k;
            
            if (remainder == 0) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        long[] arr;
        
        arr = new long[]{4, 2, 9};
        System.out.println(hasDivisiblePrefix(arr, 3));

        arr = new long[]{1, 2, 4};
        System.out.println(hasDivisiblePrefix(arr, 5));

        arr = new long[]{5};
        System.out.println(hasDivisiblePrefix(arr, 5));

        arr = new long[]{0, 1};
        System.out.println(hasDivisiblePrefix(arr, 7));

        arr = new long[]{-2, 2, 1};
        System.out.println(hasDivisiblePrefix(arr, 3));
    }
}
