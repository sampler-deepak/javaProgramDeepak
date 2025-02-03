public class test {
    public class PrimeSum {
        public static boolean isPrime(int num) {
            if (num <= 1) 
            return false;
            for (int i = 2; i <=10; i++) {
                if (num % i == 0)
                 return false;
            }
            return true;
        }
    
    public static int sumOfPrimes(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 1, end = 10;
        int sum = sumOfPrimes(start, end);
        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + sum);
    }
}

}