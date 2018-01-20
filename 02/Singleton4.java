public class Singleton4{
    //私有化的构造方法，保证外部的类不能通过构造器来实例化
    private  Singleton4(){};
    private static class SingletonHolder{
        private staic final Singleton4 instance=new Singleton4();
    }
    public static final Singleton4(){
        return SingletonHolder.instance;
    }
}
