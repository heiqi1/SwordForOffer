public class Singleton2{
    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private  Singleton2(){};
    private static Singleton2 instance=null;
    //静态工厂方法
    public static Singleton2 getInstance(){
        //Synchronized关键字同步代码块
        Synchronized(this){
            if(instance==null){
                instance=new Singleton2();
            }
        }
        return instance;
    }
}
