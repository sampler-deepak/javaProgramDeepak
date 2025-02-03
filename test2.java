public class test2 {
    public static int sumOfDigits(int number){
                int Digit,sum = 0;
                while (number != 0) {
                   Digit=number%10;
                   sum=sum+Digit;
                   number=number/10;
                }
                return sum;
            }
        
    public static void main(String[]args){
       int result= sumOfDigits(4598);
       System.out.println("The sum of the digits is " + result);

    }
    
}
