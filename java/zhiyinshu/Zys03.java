package zhiyinshu;

import java.util.ArrayList;
import java.util.List;

public class Zys03 {
    //判断是否是质数
    public static Boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //构造质数表  质数表中是int 类型
    public static List generatePrimeTable(int x) {
        List list = new ArrayList();
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;

    }

    //  主要的判断逻辑
/*
       1.输入  x
       2.用 X 依次取余 质数表，如果余数为0 ，则符合条件，打印，并更新  X   ：   x=x/list[i]
                                       不为0 不符合条件  跳过
 */


    public static List<Integer> Print(int x) {
        //存储质数表
        List<Integer> table = new ArrayList<>();
        //存储符合条件的序列
        List<Integer> temp = new ArrayList<>();

        table = generatePrimeTable(x);

        for (Integer i : table
        ) {
            //符合条件的  质数
            if (x%i==0){
                temp.add(i);
//                System.out.println(i+"  ");
                x=x/i;
                if (x==1)break;


//                System.out.println("x    : "+ x);
            }else {
                continue;
            }

        }

        return temp;


//        System.out.print(getType(table.get(0)));


    }

    private static String getType(Object o) {
        return o.getClass().toString();
    }

    public static void main(String[] args) {
//        System.out.print(generatePrimeTable(1));
//        System.out.print(getType(generatePrimeTable(10).get(1)));
//        System.out.println(getType(Print(60)));
        System.out.print(Print(300));


    }


}
