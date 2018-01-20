public class Singleton3{
    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private  Singleton3(){};
    private static Singleton3 instance=null;
    //静态工厂方法，实现双重加锁检查
    public static Singleton3 getInstance(){
        //第一次判断
        if(instance==null){
            //Synchronized关键字同步代码块
            Synchronized(this){
                //第二次判断
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
