package PTA1009;

import java.util.Scanner;

/*
Hello World Here I Come
给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出

 */
public class Lrony2 {
    public static void myReverse(String str){
        String[] split=str.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=split.length-1;i>=1;i--){
            stringBuffer.append(split[i]);
            stringBuffer.append(" ");
        }
        stringBuffer.append(split[0]);

        System.out.print(stringBuffer);
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        myReverse(reader.nextLine());
    }
}
