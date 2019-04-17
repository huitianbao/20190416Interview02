package PTA1009;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出
Hello World Here I Come



测试
Hello World Here I Come
emoC I ereH dlroW olleH

不太对，不能直接反转


 */
public class Lrony {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        StringBuffer stringBuffer = new StringBuffer(reader.nextLine());
        System.out.print(stringBuffer.reverse());

    }


}
