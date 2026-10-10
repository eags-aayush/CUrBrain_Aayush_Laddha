class Q3{
    public static int palindromeOrSum(int n) {
        int reversed = 0;
        int temp = n;

        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        if (n >= 0 && n == reversed) {
            return n;
        }
        
        return n + reversed;
    }

    public static void main(String[] args){
        System.out.print(palindromeOrSum(121));
        System.out.print(palindromeOrSum(123));
        System.out.print(palindromeOrSum(0));
        System.out.print(palindromeOrSum(-45));
        System.out.print(palindromeOrSum(120));
    }
}