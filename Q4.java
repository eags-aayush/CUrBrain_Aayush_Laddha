class Q4{
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(123));
        System.out.println(subtractProductAndSum(5));
        System.out.println(subtractProductAndSum(100));
        System.out.println(subtractProductAndSum(999));
    }
}