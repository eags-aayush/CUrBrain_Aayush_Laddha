class Q11{
    public static long modularAddition(long[] arr) {
        long mod = 1000000007L;
        long result = 0;
        
        for (long value : arr) {
            result = (result + (value % mod)) % mod;
        }
        
        return result;
    }

    public static void main(String[] args){
        long[] arr;
        
        arr = new long[]{1000000000, 1000000000, 1000000000};
        System.out.println(modularAddition(arr));

        arr = new long[]{1, 2, 3, 4};
        System.out.println(modularAddition(arr));
    
        arr = new long[]{};
        System.out.println(modularAddition(arr));
    
        arr = new long[]{1000000007};
        System.out.println(modularAddition(arr));
    
        arr = new long[]{0, 0, 0};
        System.out.println(modularAddition(arr));
    }
}