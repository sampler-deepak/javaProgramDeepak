 class SumOfFactors {
    public static int summ(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                sum = sum +i;  
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       int n=5; 
        int result = summ(n);
        System.out.println("The sum of factors of " + n + " is: " + result);
    }
}
