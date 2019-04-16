package sequence_sum;

public class Test2 {
    public static void printSequence(int x){
        int[] temp;
        for(int i=1;i<=x;i++){
            for (int j=1;j<=x;j++){
                temp=fun(i,j);
                if (temp[0]==x){
                    myPrint(temp);
                }
            }
        }
    }
    //   从start  这个数开始，加 n 此，返回
    //sum 是加的总和，n 是加的次数  start 是开始加的  数   count-1  是最后加上的那一个数
    public static int[] fun(int start,int n){
        // n   是加的次数
//        int[] a;
        int sum=0;
        int count=start;
        for(int i=1;i<=n+1;i++){
            sum=sum+count;
            count++;
        }
//        a[0]=sum;  a[1]=n;  a[2]=start;
        int[] a={sum,n,start,count-1};
        //sum 是加的总和，n 是加的次数  start 是开始加的  数   count-1  是最后加上的那一个数
        return a;

    }

    public static void myPrint(int[] x){
                 //start n
        for (int i=x[2];i<=x[1];i++){
            System.out.print(i+" + ");

        }
        System.out.println(x[3]);


    }
    public static void main(String[] args) {
//        System.out.print(fun(1,2)[0]);

//        System.out.println(fun(1,2)[0]);

//        myPrint(fun(1,2));
//        System.out.print("xxxxxxxxxx");
//        System.out.print("xxxxxxxxxx");

        printSequence(5000);
//        System.out.print("xxxxxxxxxx");


    }
}
