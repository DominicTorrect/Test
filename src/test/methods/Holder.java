package test.methods;

public class Holder {
    private Holder(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }
    private static class InnerClass{
        private static final Holder HOLDER= new Holder();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Holder.getInstance();
            }).start();
        }
    }
}
