package test.AbstractFactory;

public class XiaomiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("启动小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }
}
