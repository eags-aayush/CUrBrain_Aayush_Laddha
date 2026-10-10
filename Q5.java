public class Q5 {
    public static int[] replaceEvenWithZero(int n) {
        if (n <= 0) return new int[]{}; 

        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            int digit = n % 10; 
            if (digit % 2 == 0) {
                result[i] = 0;
            } else {
                result[i] = digit;
            }
            n /= 10;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] result;
        
        result = replaceEvenWithZero(258);
        for (int num : result) {
            System.out.print(num + " ");
        }

        result = replaceEvenWithZero(12345);
        for (int num : result) {
            System.out.print(num + " ");
        }

        result = replaceEvenWithZero(2468);
        for (int num : result) {
            System.out.print(num + " ");
        }

        result = replaceEvenWithZero(13579);
        for (int num : result) {
            System.out.print(num + " ");
        }

        result = replaceEvenWithZero(1002);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}