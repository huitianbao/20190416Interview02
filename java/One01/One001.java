package One01;

import java.util.ArrayList;

public class One001 {
    public One001() {
    }


    //只有合数才可以质因数分解
    //先判断是否是质数   否  进入下一步
    public boolean isPrime(int a){
        boolean f=true;//假设一开始是质数

        if (a==1){
            f=false;
        }else if (a==2){
            f=true;
        }else {
            for (int i=2;i<a;i++){
                if (a%i==0){
                    f=false;  //不是质数

                }
            }
        }

        return f;

    }


    // 分解
    //  1.  根据输入的数字 s 构造一张质数表
    //eg:  取出 100 之内的所有质数  放到一个  int[] 中
    //  2.  s 依次 % 质数表，结果为 0 表示 该质数符合（放到一个 ArrayList   list 中），除以该质数更新 s
    //   终止的条件 是    s==1



    //1  质数表
    public ArrayList getPrimeTable(int a){
        ArrayList list=null;
        for (int i=2;i<a;i++){
            if (isPrime(i)){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args){

    }
}
