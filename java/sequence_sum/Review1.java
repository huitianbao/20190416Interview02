package sequence_sum;

public class Review1 {
    public static void fun1(int x){
        for (int i=2;i<=Math.sqrt(x);i++){
            if (x%i==0){
                System.out.print(i+"*");
                x=x/i;
                i--;

            }
        }
        System.out.print(x);

    }
    public static void main(String[] args){
        fun1(100);
    }
}
