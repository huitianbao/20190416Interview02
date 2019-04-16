package zhiyinshu;

import java.util.ArrayList;
import java.util.List;

public class Zys02 {
    //判断是否是质数
    public static Boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //构造质数表
    public static List generatePrimeTable(int x){
        List list=new ArrayList();
        for (int i=2;i<=x;i++){
            if (isPrime(i)){
                list.add(i);
            }
        }
        return list;

    }


    //分解
    public static List fenjie(int x){
        //用于存储质数表
        List list=new ArrayList();
        //用于存储质因数序列
        List temp=new ArrayList();

        list=generatePrimeTable(x);

        loop1:for (int i=0;i<list.size();i++){
//            if (x==1) break;
            if (x%(Integer.parseInt(list.get(i).toString()))==0){
                //该质数符合条件
//                temp.add(list.get(i));
                System.out.print(list.get(i));

                //更新x
                x /= Integer.parseInt(list.get(i).toString());

                fenjie(x);
                if(x==1){
                    break loop1;
                }

            }else {
                continue;
            }
        }

        return temp;
    }
    public static void main(String[] args) {
//        System.out.print(generatePrimeTable(1));
        System.out.print(fenjie(20));

    }
}
