class Q1{
    public static boolean hasEvenNumberOfDigits(int n) {
        if (n == 0) return false; 
        int count = 0;
        
        while (n != 0) {
            count++;
            n /= 10;
        }

        return count % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasEvenNumberOfDigits(1234));
        System.out.println(hasEvenNumberOfDigits(12345));
        System.out.println(hasEvenNumberOfDigits(0));
        System.out.println(hasEvenNumberOfDigits(-100000));
        System.out.println(hasEvenNumberOfDigits(-7));
    }
}