public class PrimeNumber {

     public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int count=0;
        for (int i =2; i <= num; i++) {
            if (num%i==0) {
                count++;
            }
        }
       if(count>2){
        return false;
       }
       else{
        return true;
       }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 7, 11, 15, 19, 23};

        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
