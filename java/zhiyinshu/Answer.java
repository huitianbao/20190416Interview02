package zhiyinshu;

public class Answer {
    public static void factor(int num) {
        System.out.print("分解的结果为：");
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + "*");
                num /= i;
                i--;
            }
        }
        System.out.println(num);
    }


    public static void factor2(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                System.out.print(i+"*");
                x=x/i;
                i--;
            }
        }
        System.out.print(x);
    }


    public static void main(String[] args) {
        factor(300);
        factor2(300);
    }
}
