package zhiyinshu;

public class IsPrime {
    public static Boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(6));
//        System.out.println(isPrime(7));


        System.out.print(3%3);


    }
}
