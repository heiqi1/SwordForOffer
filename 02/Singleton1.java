//懒汉式单例模式，在第一次调用的时候实例化自己
public class Singleton1{
    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private Singleton1(){}
    private static Singleton1 instance=null;
    //静态工厂方法
    public static Singleton1 getInstance(){
        //只有在instance==null的时候才创建一个实例避免重复创建
        if(instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}
