public class Q7 {
    public static int arrayGCD(int[] arr) {
        int result = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) break;
        }

        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr;
        
        arr = new int[]{24, 36, 48};
        System.out.println(arrayGCD(arr));

        arr = new int[]{33, 44, 55, 66};
        System.out.println(arrayGCD(arr));

        arr = new int[]{17};
        System.out.println(arrayGCD(arr));

        arr = new int[]{12, 18, 24, 30};
        System.out.println(arrayGCD(arr));

        arr = new int[]{1, 7, 14, 28};
        System.out.println(arrayGCD(arr));
    }
}
