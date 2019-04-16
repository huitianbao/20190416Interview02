package sequence_sum;

public class Test01 {
    //输入一个正数n，输出所有和为n的连续正数序列
     public static int fun1(int i,int n){
         //从i  开始  加到  n
         int sum=0;
         for (int j=i;j<=n;j++){
             sum=j+sum;
         }

         return sum;
     }

     public static void fun2(int n){



         }

    public static void main(String[] args) {

         System.out.print(fun1(1,4));

    }
}
