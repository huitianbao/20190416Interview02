package PTA1002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：
每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10
​100
​​ 。

输出格式：
在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：
1234567890987654321123456789
输出样例：
yi san wu
 */
public class Sum01 {
    /*
    1.取出每个位数字，累加
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        turnToString(getSum(getDigits(input)));

    }

    //把数字换成拼音
    public static void turnToString(int x) {
        String stringx = x + "";
        StringBuilder answer = new StringBuilder();

        for (int j = 0; j < stringx.length(); j++) {
            switch (stringx.charAt(j)) {
                case '1':
                    answer.append("yi ");
                    break;
                case '2':
                    answer.append("er ");
                    break;
                case '3':
                    answer.append("san ");
                    break;
                case '4':
                    answer.append("si ");
                    break;
                case '5':
                    answer.append("wu ");
                    break;
                case '6':
                    answer.append("liu ");
                    break;
                case '7':
                    answer.append("qi ");
                    break;
                case '8':
                    answer.append("ba ");
                    break;
                case '9':
                    answer.append("jiu ");
                    break;
                case '0':
                    answer.append("ling ");
                    break;
            }
        }

        System.out.print(answer.toString().trim());
    }

    // 把每一位上的数字加起来
    public static int getSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);

        }
        return sum;
    }

    //获取到每一位上的数字，放到 list中
    public static List getDigits(int x) {
        List<Integer> list = new ArrayList();
        do {
            int temp = x % 10;
            list.add(temp);
            x = x / 10;
        } while (x >= 1);
        return list;
    }
}
