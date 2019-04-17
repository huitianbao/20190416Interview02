package Singleton01;
//饥汉模式
public class Singleton2 {
    private Singleton2 singleton2;

    public Singleton2 getInstance(){
        if (singleton2==null){
            return new Singleton2();
        }else{
            return singleton2;
        }
    }
}
