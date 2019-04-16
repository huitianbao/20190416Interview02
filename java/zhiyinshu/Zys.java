package zhiyinshu;

public class Zys {

    public static void myPrint(int x){
        for (int i=2;i<=x;i++){
            if (x%i==0){
                System.out.print(i+"*");
                x=x/i;
            }
            else{
                break;
            }
            System.out.print(x+"*");
        }
    }
    public static void main(String[] args){

        myPrint(90);
    }
}
