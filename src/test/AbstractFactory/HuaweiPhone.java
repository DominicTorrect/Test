package test.AbstractFactory;

public class HuaweiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("启动华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }
}
