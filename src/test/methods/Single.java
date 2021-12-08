package test.methods;

// 饿汉模式
public class Single {
    private Single(){
        System.out.println(Thread.currentThread().getName()+"ok!");
    }

    private static Single SINGLE = new Single();

    public static Single getInstance(){
        return SINGLE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Single.getInstance();
            }).start();
        }
    }
}
