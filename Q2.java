class Q2{
    public static int reverseAndDouble(int n) {
        int reversed = 0;
        int temp = n;
        
        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        return reversed * 2;
    }

    public static void main(String[] args){
        System.out.print(reverseAndDouble(123));
        System.out.print(reverseAndDouble(-45));
        System.out.print(reverseAndDouble(0));
        System.out.print(reverseAndDouble(1200));
        System.out.print(reverseAndDouble(9));
    }
}