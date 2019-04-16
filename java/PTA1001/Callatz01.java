package PTA1001;

/*
对任何一个正整数 n，如果它是偶数，那么把它砍掉一半；
如果它是奇数，那么把 (3n+1) 砍掉一半。这样一直反复砍下去，最后一定在某一步得到 n=1。


对给定的任一不超过 1000 的正整数 n，简单地数一下，需要多少步（砍几下）才能得到 n=1？
 */
public class Callatz01 {
    public static int getStep(int x) {
        //记录步数
        int count = 0;

        do {
            //偶数
            if (x % 2 == 0) {
                x = x / 2;
                count++;
            } else {
                x = (3 * x + 1) / 2;
                count++;
            }
        } while (x != 1);
        return count;
    }

    public static void main(String[] args) {
        System.out.print(getStep(5));
    }

}
