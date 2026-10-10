class Q6{
    public static int digitFrequencyDifference(int n, int a, int b) {
        int countA = 0;
        int countB = 0;
        
        if (n == 0) {
            if (a == 0) countA++;
            if (b == 0) countB++;
        } else {
            while (n > 0) {
                int digit = n % 10;
                if (digit == a) countA++;
                if (digit == b) countB++;
                n /= 10;
            }
        }
        
        return Math.abs(countA - countB);
    }

    public static void main(String[] args){
        System.out.print(digitFrequencyDifference(112231, 1, 2));
        System.out.print(digitFrequencyDifference(55555, 5, 2));
        System.out.println(digitFrequencyDifference(123456, 3, 6));
        System.out.println(digitFrequencyDifference(0, 0, 5));
        System.out.println(digitFrequencyDifference(1002001, 0, 1));
    }
}