package test.methods;

// 懒汉模式 单例
public class LazyMan {
    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
    private volatile static LazyMan LAZYMAN;

    public static LazyMan getInstance(){
        if(LAZYMAN == null){
            synchronized (LazyMan.class){
                if(LAZYMAN == null){
                    LAZYMAN = new LazyMan();
                }
            }
        }
        return LAZYMAN;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }
}
